import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempC = 0.00;
        double tempF = 0.00;
        String trash = "";
        boolean done = false;
        do {
            System.out.println("Enter the temperature in Celsius: ");
            if (in.hasNextDouble()) {
                tempC = in.nextDouble();
                tempF = tempC * 1.8 + 32;
                done = true;
                System.out.println("Given " + tempC + "your temperature in Fahrenheit is: " + tempF);
            }
            else {
                trash = in.nextLine();
                System.out.println("\nYou said your temperature was: " + trash);
            }
        }while(!done);
    }
}