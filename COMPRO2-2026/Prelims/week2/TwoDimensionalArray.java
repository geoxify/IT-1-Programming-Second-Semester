public class TwoDimensionalArray {
    public static void main(String[] args) {

        // // Label
        // String[] clothType = {"shirts", "pants"};

        // First Method
        // Used when data is not known initially
        // You manually assign values per index position

        // Second Method
        // Used when data is known initially
        String[][] clothColor = {
                { "red", "blue", "green" },
                { "orange", "yellow", "violet" }
        };

        // Loop for reading array elements
        for (int i = 0; i < clothColor.length; i++) { // loop for row
            // System.out.print(clothType[i]); // print label
            for (int j = 0; j < clothColor[i].length; j++) { // loop for collumn
                // System.out.print(clothColor[i][j] + " ");

                System.out.printf("%-8s", clothColor[i][j]); // formatted version
            }
            System.out.println(); // new line after each row
        }
    }
}
