import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class HighPaidEmployee extends EmployeeManager {


    public HighPaidEmployee(ArrayList<Employee> employees) {
        super(employees);
    }


    private Queue HighFullTimeEmployee = new LinkedList();

    private Queue HighPartTimeEmployee = new LinkedList();





    public void getHighPaidFullTime(){

        for(int i =0 ; i < employeeArrayList().size(); i++)

        if(employeeArrayList().get(i).getSalary() >= 40000 ){

            if(employeeArrayList().get(i).getSalary() >= 750000){



                this.HighFullTimeEmployee.offer(employeeArrayList().get(i));

            }

        }

    }

    public void printHighPaidFullTime(){

        for (int i = 0 ; i < HighFullTimeEmployee.size(); i++){

            System.out.println(HighFullTimeEmployee.remove());
        }

    }



    public void getHighPaidPartTimeTime(){

        for(int i = 0 ; i < employeeArrayList().size(); i++) {
            if (employeeArrayList().get(i).getSalary() <= 2000) {

                if (employeeArrayList().get(i).getSalary() > 800) {

                    this.HighPartTimeEmployee.offer(employeeArrayList().get(i));

                }

            }

        }

    }

    public void printHighPaidPartTime(){

        for (int i = 0 ; i < HighPartTimeEmployee.size(); i++){

            System.out.println(HighPartTimeEmployee.element());
        }
    }






}
