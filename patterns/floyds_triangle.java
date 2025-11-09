public class floyds_triangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for Floyd's Triangle
        int number = 1; // Starting number

        for (int i = 1; i <= rows; i++) { // Loop through each row
            for (int j = 1; j <= i; j++) { // Loop through each column in the row
                System.out.print(number + " "); // Print the current number
                number++; // Increment the number
            }
            System.out.println(); // Move to the next line after each row
        }
    }   
}
