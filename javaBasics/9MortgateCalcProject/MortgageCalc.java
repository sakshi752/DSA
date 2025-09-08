import java.util.Scanner;

public class MortgageCalc {
    public static void main(String[] args) {

        final byte months = 12;
        final byte percent = 100;
        int principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;
        // principal, annual interest rate, period
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter principal : ");
            principal = sc.nextInt();
            if (principal >= 1000 && principal <= 1_000_000) {
                break;
            }
            System.out.println("Enter a val between 1000 and 1 million");
        }

        while (true) {
            System.out.println("Enter annual interest rate : ");
            float annualInterest = sc.nextFloat();
            if (annualInterest > 0 && annualInterest <= 30) {
                monthlyInterest = annualInterest / percent / months;
                break;
            }
            System.out.println("enter a val between 1 and 30");
        }

        while (true) {
            System.out.println("Enter period(years) : ");
            byte years = sc.nextByte();
            if (years > 0 && years <= 30) {
                numberOfPayments = years * months;
                break;
            }

            System.out.println("enter val between 1  and 30");

        }

        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        System.out.println("mortgage " + mortgage);
    }
}
