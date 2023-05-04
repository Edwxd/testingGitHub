import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LowPaidEmployee extends EmployeeManager{



    public LowPaidEmployee(ArrayList<Employee> employees) {
        super(employees);
    }


    private Stack LowFullTimeEmployee = new Stack();

    private Stack LowPartTimeEmployee = new Stack();





    public void getLowPaidFullTime(){

        for(int i =0 ; i < employeeArrayList().size(); i++)

            if(employeeArrayList().get(i).getSalary() >= 30000 ){

                if(employeeArrayList().get(i).getSalary() <= 59000){



                    this.LowFullTimeEmployee.push(employeeArrayList().get(i));

                }

            }

    }

    public void printHighPaidFullTime(){

        for (int i = 0 ; i < LowFullTimeEmployee.size(); i++){

            System.out.println(LowFullTimeEmployee.pop());
        }

    }



    public void getHighPaidPartTimeTime(){

        for(int i = 0 ; i < employeeArrayList().size(); i++) {
            if (employeeArrayList().get(i).getSalary() <= 2000) {

                if (employeeArrayList().get(i).getSalary() <= 500) {

                    this.LowPartTimeEmployee.push(employeeArrayList().get(i));

                }

            }

        }

    }

    public void printHighPaidPartTime(){

        for (int i = 0 ; i < LowPartTimeEmployee.size(); i++){

            System.out.println(LowPartTimeEmployee.pop());
        }
    }

}
