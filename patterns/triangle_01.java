public class triangle_01 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for 0-1 Triangle

        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= i; j++) { // Loop through each column in the row
                // Print 1 if the sum of row and column indices is even, else print 0
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}