import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //test
        double price;

        Scanner s = new Scanner(System.in);
        double tax = .05;
        System.out.println("Please enter a price: ");
        price = s.nextDouble();
        System.out.println("Your tax is " + price*tax + " and your total is: " + (price + price*tax));

    }
}