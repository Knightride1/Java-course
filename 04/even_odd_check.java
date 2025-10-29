public class even_odd_check {
    public static void main(String[] args) {
        int number = 7; // You can change this value to test with different numbers

        // Check if the number is even or odd using modulus operator
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}
