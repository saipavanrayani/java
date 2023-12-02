import java.util.Scanner;

public class IncomeTaxCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the income: ");
        double income = scanner.nextDouble();

        double taxableIncome = calculateTaxableIncome(income);
        double tax = calculateTax(taxableIncome);

        System.out.println("Taxable Income: " + taxableIncome);
        System.out.println("Tax = " + tax);

        scanner.close();
    }

    public static double calculateTaxableIncome(double income) {
        if (income <= 250000) {
            return 0;
        } else if (income <= 500000) {
            return income - 250000;
        } else if (income <= 1000000) {
            return income - 500000;
        } else {
            return income - 1000000;
        }
    }

    public static double calculateTax(double taxableIncome) {
        if (taxableIncome <= 0) {
            return 0;
        } else if (taxableIncome <= 250000) {
            return taxableIncome * 0.1;
        } else if (taxableIncome <= 500000) {
            return 25000 + (taxableIncome - 250000) * 0.2;
        } else {
            return 75000 + (taxableIncome - 500000) * 0.3;
        }
    }
}
OUTPUT:

C:\Users\VAISHNAVI.R\OneDrive\Documents>javac IncomeTaxCalculator.java

C:\Users\VAISHNAVI.R\OneDrive\Documents>java IncomeTaxCalculator
Enter the income: 400700
Taxable Income: 150700.0
Tax = 15070.0

C:\Users\VAISHNAVI.R\OneDrive\Documents>java IncomeTaxCalculator
Enter the income: 2789239
Taxable Income: 1789239.0
Tax = 461771.7

C:\Users\VAISHNAVI.R\OneDrive\Documents>java IncomeTaxCalculator
Enter the income: 150000
Taxable Income: 0.0
Tax = 0.0
