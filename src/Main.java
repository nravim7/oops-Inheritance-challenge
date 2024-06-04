public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/2000",  "01/01/2024");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());
    }
}
