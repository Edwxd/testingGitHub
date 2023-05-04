public class FullTimeEmployee extends Employee implements ProjectBonus{
    //Create a class called FullTimeEmployee that will be a subclass/ child class of Employee
    //This class will also implement the ProjectBonus interface



    //Call the super constructor
    public FullTimeEmployee(String name, String ID, double salary) {
        super(name, ID, salary);

    }


    //Create a toString method that will return the name, id, salary, and salary with bonus.
    @Override
    public String toString() {
        return "Full Time Employee: " +
                "\n" + "Name:" + getName() +
                "\n" + "ID:" + getID() +
                "\n" + "Base salary:" + getSalary() +
                "\n" + "Salary With project bonus:" + calculateSalary();
    }


    //Call the calculateSalary method that will be overridden to be accessible
    @Override
    public double calculateSalary() {
        return (getSalary() + calculateProjectBonus());
    }

    //Call the calculateProjectBonus method that will be overridden to be accessible
    @Override
    public double calculateProjectBonus() {
        return 5000;
    }
}
