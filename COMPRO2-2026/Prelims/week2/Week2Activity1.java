public class Week2Activity1 {
    public static void main(String[] args) {

        // Declare 1d array
        int[] theaterRow = new int[8];

        // Book Seat
        theaterRow[3] = 1;

        // Print Seat Status
        for (int i = 0; i < theaterRow.length; i++) {
            System.out.printf("Seat %d Status: %d\n", i, theaterRow[i]);
        }

        // Seats Available
        int availableSeats = 8;
        for (int j = 0; j < theaterRow.length; j++) {
            if (theaterRow[j] == 1) {
                availableSeats--;
            }
        }
        System.out.printf("There are %d %s available", availableSeats, availableSeats == 1 ? "seat" : "seats");

    }
}
