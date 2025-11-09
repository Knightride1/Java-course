// a program showing all operators in Java.
// 1. arithmetic operators
// 2. assignment operators
// 3. comparison operators
// 4. logical operators
public class operators {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        // 2. Assignment Operators
        int c = 20;
        System.out.println("\nAssignment Operators:");
        c += 5; // c = c + 5
        System.out.println("c after += 5: " + c); // 25
        c -= 3; // c = c - 3
        System.out.println("c after -= 3: " + c); // 22
        c *= 2; // c = c * 2
        System.out.println("c after *= 2: " + c); // 44
        c /= 4; // c = c / 4
        System.out.println("c after /= 4: " + c); // 11

        // 3. Comparison Operators
        System.out.println("\nComparison Operators:");
        System.out.println("a == b: " + (a == b)); // false
        System.out.println("a != b: " + (a != b)); // true
        System.out.println("a > b: " + (a > b)); // true
        System.out.println("a < b: " + (a < b)); // false
        System.out.println("a >= b: " + (a >= b)); // true
        System.out.println("a <= b: " + (a <= b)); // false

        // 4. Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y)); // false (and operator)
        System.out.println("x || y: " + (x || y)); // true (or operator)
        System.out.println("!x: " + (!x)); // false (not operator)
    }
}
