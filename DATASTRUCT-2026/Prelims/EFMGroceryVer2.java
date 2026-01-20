import java.util.Scanner;

public class EFMGroceryVer2 {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declare Key Variables
        String strProdName = "";
        String strAnotherP;

        String strCustomer = "";

        char cCustomer = ' ';
        char cAnotherP = ' ';

        double dQty = 0;
        double dBill;
        double dPrice = 0;

        double dTotal;
        double dPay;
        double dChange = 0;

        do {
            header();
            strProdName = getProductName(strProdName);

            dPrice = getProductPrice(dPrice);

            dQty = getQuantity(dQty);
            input.nextLine();

            dTotal = dQty * dPrice;
            System.out.println("Total: " + dTotal);
            dBill = dTotal + dChange;

        } while (cAnotherP == 'y');

    }

    public static void header() {
        System.out.printf("""
                === E F M ===
                G R O C E R Y
                ^^^^^^^^^^^^^
                """);
    }

    public static String getProductName(String product) {
        System.out.print("Input product name: ");
        return product = input.nextLine();
    }

    public static double getProductPrice(double price) {
        System.out.print("Input product prize: ");
        return price = input.nextDouble();
    }

    public static double getQuantity(double quantity) {
        System.out.print("Quantity: ");
        return quantity = input.nextDouble();
    }

}