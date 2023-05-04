public class PartTimeEmployee extends Employee{
    //Create a  class called PartTimeEmployee that also extends from employee

    private double hourlyRate;

    private int hoursWorked;

    private double totalSalary;

    //--------------->>>If we give an hourly rate and a number of hours worked, do de we add a fixed salary.

    //Call the super constructor
    public PartTimeEmployee(String name, String ID, double salary, double hourlyRate, int hoursWorked) {
        super(name, ID,salary);

        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.totalSalary = salary;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public String toString() {
        return "Part Time Employee: " +
                "\n" + "Name:" + getName() +
                "\n" + "ID:" + getID() +
                "\n" + "Total Salary:" + calculateSalary() +
                "\n" + "Hourly pay Rate:" + getHourlyRate() +
                "\n" + "Hours worked:" + getHoursWorked();
    }

    //Call the calculateSalary method that will be overridden to be accessible
    @Override
    public double calculateSalary() {

        //Open a try block to be able to catch any exceptions passed
        try {

            this.totalSalary = this.hourlyRate * this.hoursWorked;



            //If the number of hours worked is smaller than 0 or bigger than 168 then throw this exception
            if(this.hoursWorked < 0 || this.hoursWorked > 168){

                throw new InvalidHoursException("This number of hours worked is invalid");

            }

            //Catch the exception
        }catch (InvalidHoursException e){

            e.getMessage();
        }




        return this.totalSalary;
    }


}
