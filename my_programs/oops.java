public class oops {
    static int add(int a, int b) {
        return a + b; // Return the sum of a and b
    }
    
    public static void main(String[] args) {
        int sum = add(5, 10); // Call the add method with arguments 5 and 10
        System.out.println("Sum: " + sum); // Output: Sum: 15
        int sum1 = add(15, 10); // Call the add method with arguments 5 and 10
        System.out.println("Sum: " + sum1); 
        int sum2 = add(25, 10); // Call the add method with arguments 5 and 10
        System.out.println("Sum: " + sum2);
    }
}
