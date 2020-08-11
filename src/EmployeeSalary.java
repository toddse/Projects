import java.util.*;
public class EmployeeSalary {
    public static void main(String[] args) {
        String name = null;
        int age = 0;
        double annualPay = 0.0;

        Scanner employee = new Scanner(System.in);

        System.out.print("What is your name? ");
        name = employee.nextLine();

        System.out.print("How old are you? ");
        age = employee.nextInt();

        System.out.print("How much do you get paid a year? ");
        annualPay = employee.nextDouble();

        StringBuilder str = new StringBuilder();
        str.append("This is " + name + ". ");
        str.append("He is " + age + " years old ");
        str.append("and he earns $" + annualPay + " a year.");
        System.out.println(str);
    }
}
