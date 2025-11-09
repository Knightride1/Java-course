public class casting {
    public static void main(String[] args) {
        // casting means converting a variable from one data type to another data type
        // 2 types of casting in Java
        // Implicit Casting (automatically) - converting a smaller type to a larger type size
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        // Explicit Casting (manually) - converting a larger type to a smaller size type
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9
    }
}