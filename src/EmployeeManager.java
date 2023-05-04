import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {

    //Create an
    private ArrayList<Employee> employees;


    public EmployeeManager(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Employee> employeeArrayList(){

        return employees;
    }


    public void addToEmployeeList(Employee employee){


        this.employees.add(employee);

    }


    public void getEmployees() {

       for(int i =0; i< this.employees.size(); i++) {

           System.out.println("\n" + this.employees.get(i).toString());

           }
       }
    }

