import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi there! This is a pizza ordering system.\n");

        // Create customer
        System.out.println("Enter your name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter your phone number: ");
        String customerPhoneNumber = scanner.nextLine();
        Customer customer = new Customer(customerName, customerPhoneNumber);

        // Order pizza
        System.out.println("Pizza type choices: ");
        System.out.println("1. Margherita");
        System.out.println("2. Pepperoni");
        System.out.println("Welcome " + customer.getName() + "! Your phone number is " + customer.getPhoneNumber());
        scanner.close();
    }
}


