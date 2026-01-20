public class Week2Activity1 {
    public static void main(String[] args) {
        // Progressive Activity: From 1D to 2D Arrays
        // Part 1: Managing a Single Row (1D Array)
        System.out.println("Part 1: Managing a Single Row (1D Array)");

        // 1. Declare and initialize a 1D integer array named
        // theaterRow with a size of 8
        int[] theaterRow = new int[8];

        // 2. Write code to book the seat at index 3.
        theaterRow[2] = 1;

        // 3. Write a loop to print the status of all seats in the row.
        int seat = 1;
        for (int i = 0; i < theaterRow.length; i++) {
        System.out.printf("Seat %d Status: %d\n", seat++, theaterRow[i]);
        }

        // 4. Calculate and print how many seats are still available.
        int availableSeats = 8;
        for (int j = 0; j < theaterRow.length; j++) {
        if (theaterRow[j] == 1) {
        availableSeats--;
        }
        }
        System.out.printf("There are %d %s available", availableSeats, availableSeats
        == 1 ? "seat" : "seats");

        System.out.println("\n\nPart 2: The Problem with Multiple Rows");
        // Part 2: The Problem with Multiple Rows

        // 2D Array Version of a 5 rows and 8 seats theater
        int[][] rows = new int[5][8];

        // Booking a seat at row 3, seat 5
        rows[2][4] = 1;

        for (int[] row : rows) {
            for (int cell : row) {
                if (cell == 1) {
                    System.out.print("|xx|  ");
                } else {
                    System.out.print("|__|  ");
                }
            }
            System.out.println();
        }
    }
}
