package comp.comp152;

public class SalariedEmployee extends Employee{
    private double yearlySalary;

    public SalariedEmployee(double salary){
        yearlySalary = salary;
    }

    @Override
    public double calculateBiWeeklyPay() {
        return yearlySalary/26;
    }
}
