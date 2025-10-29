//  Constants 
// A constant is a variable in Java which has a ﬁxed value i.e. it cannot be assigned 
// a different value once assigned. 

public class constants {
    public static void main(String[] args) {
        final int myConstant = 10; // Declare a constant using the 'final' keyword
        System.out.println("The value of the constant is: " + myConstant);

        // Uncommenting the next line will cause a compilation error
        // myConstant = 20; // Error: cannot assign a value to final variable myConstant
    }
}
