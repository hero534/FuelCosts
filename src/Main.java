import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gasNum = 0.00;
        double fuelEff = 0.00;
        double gasPrice = 0.00;
        double endNum = 0.00;
        double end = 0.00;
        do {
            System.out.println("Enter the number of gallons of gas in the tank: ");
            gasNum = in.nextDouble();
        }while(gasNum <= 0);
        do {
            System.out.println("Enter the fuel efficiency of your car: ");
            fuelEff = in.nextDouble();
        }while(fuelEff <= 0);
        do {
            System.out.println("Enter the price of a gallon of gas: ");
            gasPrice = in.nextDouble();
        }while(gasPrice <= 0);
        endNum = 100 / gasPrice;
        System.out.println("The cost to drive 100 miles is : " + endNum);
        end = gasNum / fuelEff;
        System.out.println("The car can go " + end + " miles with a full tank of gas");
    }
}