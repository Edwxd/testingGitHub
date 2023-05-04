import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //Create a employeeManager object
        EmployeeManager employeeManager = new EmployeeManager(new ArrayList<>());

        //Create a HighPaidEmployee object to be able to pass the methods from the classes
        HighPaidEmployee highPaidEmployee = new HighPaidEmployee(new ArrayList<>());

        //Create LowPaidEmployee to be able to pass the method from the classes
        LowPaidEmployee lowPaidEmployee = new LowPaidEmployee(new ArrayList<>());



        //Using polymorphism, we create a FullTimeEmployee object
        Employee employee = new FullTimeEmployee("Dave","345", 90000);

        //Using polymorphism, we create a FullTimeEmployee object
        Employee employee1 = new FullTimeEmployee("Carl","345", 80000);

        //Using polymorphism, we create a PartTimeEmployee object
        Employee employee2 = new PartTimeEmployee("Ed", "654", 0, 22.5, 40);




       //pass the addToEmployeeList method to add the objects created in the main to the arrayList
        employeeManager.addToEmployeeList(employee);
        employeeManager.addToEmployeeList(employee1);
        employeeManager.addToEmployeeList(employee2);



        //Print the Employee Information
        employeeManager.getEmployees();


        //Pass the getHighPaidFullTime method to be able to add the high paid full time employees to the HighFullTimeEmployee queue
        highPaidEmployee.getHighPaidFullTime();
        //Print the queue in which we added the high paid full time employee
        highPaidEmployee.printHighPaidFullTime();
        //Pass the getHighPaidFullTime method to be able to add the high paid part-time employees to the HighPartTimeEmployee queue
        highPaidEmployee.getHighPaidPartTimeTime();
        //Print the queue in which we added the high paid part-time employee
        highPaidEmployee.printHighPaidPartTime();




        //Pass the getLowPaidFullTime method to be able to add the low paid full time employees to the LowFullTimeEmployee stack
        lowPaidEmployee.getLowPaidFullTime();
        //Print the stack in which we added the low paid full time employee
        lowPaidEmployee.printHighPaidFullTime();
        //Pass the getHighPaidPartTimeTime method to be able to add the low paid part-time employees to the LowPartTimeEmployee stack
        lowPaidEmployee.getHighPaidPartTimeTime();
        //Print the stack in which we added the low paid full time employee
        lowPaidEmployee.printHighPaidPartTime();





    }
}