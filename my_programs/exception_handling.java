public class exception_handling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        
        // difference in between error and exception is that error is not handled by program but exception is handled by program.
        try {
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds!");
        } finally {
            System.out.println("Execution completed.");
        }
        System.out.println("End of the program.");
    }
}
