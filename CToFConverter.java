import java.util.Scanner;

public class CToFConverter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double celsius;
        double fahrenheit;

            System.out.print("Enter temperature in Celsius: ");
            while (!in.hasNextDouble()) {
                System.out.println("Invalid input! Please input a number.");
                System.out.println("Enter temperature in Celsius: ");
                in.next();
            }
            celsius = in.nextDouble();

            fahrenheit = ((celsius * 9 / 5) + 32);
            System.out.println(celsius + " degrees celsius is equivalent to " + fahrenheit + " degrees fahrenheit.");

            in.close();
    }
}