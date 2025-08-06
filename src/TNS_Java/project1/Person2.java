package TNS_Java.project1;
import java.util.Scanner;

public class Person2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name:");
        String firstName = sc.nextLine();
        System.out.println("Enter Last Name:");
        String LastName = sc.nextLine();
        System.out.println("Enter Age:");
        int age = sc.nextInt();
        System.out.println("Enter Gender:");
        String gender = sc.next();
        System.out.println("Enter Income:");
        int income = sc.nextInt();

        Person person=new Person("Veda","Srinivas",21,"female",30000);
        TaxCalculation calc=new TaxCalculation();
        calc.calculateTax(person);
        System.out.println("Before TaxCalculation");
        System.out.println(person);
        System.out.println("After TaxCalculation");
        System.out.println(person);


    }
}
