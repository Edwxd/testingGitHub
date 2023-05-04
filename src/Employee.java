public abstract class Employee {
    //Create an abstract class called employee that will be the parent class of all the other employee class created
    //It forms the skeleton of the other employee classes

    //Create a private String variable that will hold the name of the employee
    private String name;

    //Create a private String variable that will hold the id of the employee
    private String ID;

    //Create a private double variable that will hold the salary of the employee
    private double salary;

    //Create a constructor to be able to initialise the variable created
    public Employee(String name, String ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    //Create a getName method to be able to access the name variable
    public String getName() {
        return this.name;
    }

    //Create a getID method to be able to access the ID variable
    public String getID() {
        return this.ID;
    }

    //Create a getSalary method to be able to access the salary variable
    public double getSalary() {
        return this.salary;
    }

    //Create an abstract method called calculateSalary that will be overridden in the other
    // employee classes and will be used to calculate the salary of the employees


    @Override
    public abstract String toString();

    public abstract double calculateSalary();
}
