public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/2000",  "01/01/2024");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Tim", "11/11/2000",  "01/01/2024", 35000);
        System.out.println(joe);
        System.out.println("Joe's paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "11/11/2000",  "01/01/2024", 15);
        System.out.println(mary);
        System.out.println("Mary paycheck = $" + mary.collectPay());
        System.out.println("Mary holiday pay = $" + mary.doublePay());
    }
}
