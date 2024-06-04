public class HourlyEmployee extends Employee{
    private double hourlyPay;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPay) {
        super(name, birthDate, hireDate);
        this.hourlyPay = hourlyPay;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPay;
    }

    public double doublePay() {
        return 2 * collectPay();
    }
}
