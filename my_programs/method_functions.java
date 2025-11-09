public class method_functions {
    // A method/function is a block of code that performs a specific task.
    // It is a way to organize and reuse code in a program.
    // Methods can take input parameters, perform operations, and return output values.

    // Method declaration
    static int add(int a, int b) {
        return a + b; // Return the sum of a and b
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!"); // Print a greeting message
    }

    public static void main(String[] args) {
        // Method invocation
        int sum = add(5, 10); // Call the add method with arguments 5 and 10
        System.out.println("Sum: " + sum); // Output: Sum: 15

        greet("Alice"); // Call the greet method with argument "Alice"
        // Output: Hello, Alice!
        greet("Pulkit");
        greet("Ankit");
    }
}
