import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double usdToEurRate = 0.85;
        double usdToGbpRate = 0.75;
        
        System.out.print("Enter amount in USD: ");
        double usdAmount = scanner.nextDouble();
        
        System.out.println("Choose currency to convert to:");
        System.out.println("1. EUR");
        System.out.println("2. GBP");
        int choice = scanner.nextInt();
        
        double convertedAmount = 0.0;
        String currencySymbol = "";
        
        switch (choice) {
            case 1:
                convertedAmount = usdAmount * usdToEurRate;
                currencySymbol = "€";
                break;
            case 2:
                convertedAmount = usdAmount * usdToGbpRate;
                currencySymbol = "£";
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(1);
        }
        
        System.out.println("Converted amount: " + currencySymbol + convertedAmount);
        
        scanner.close();
    }
}
