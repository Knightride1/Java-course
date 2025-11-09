// Arrays in Java are like a list of elements of the same type i.e. a list of integers, a 
// list of booleans etc.  
// a.  Creating an Array (method 1) - with new keyword 
// int[] marks = new int[3]; 
// marks[0] = 97; 
// marks[1] = 98; 
// marks[2] = 95; 
 
// b.  Creating an Array (method 2) 
//   int[] marks = {98, 97, 95};

// public class arrays {
//     public static void main(String[] args) {
//         // Creating an Array (method 1) - with new keyword 
//         int[] marks1 = new int[3]; 
//         marks1[0] = 97; 
//         marks1[1] = 98; 
//         marks1[2] = 95; 

//         System.out.println("Marks from array method 1:");
//         System.out.println(marks1[0]);
//         System.out.println(marks1[1]);
//         System.out.println(marks1[2]);

//         // Creating an Array (method 2) 
//         int[] marks2 = {98, 97, 95,99 , 100, 150};

//         System.out.println("Marks from array method 2:");
//         System.out.println(marks2[0]);
//         System.out.println(marks2[1]);
//         System.out.println(marks2[2]);
//         System.out.println(marks2[3]);
//         System.out.println(marks2[4]);
//         System.out.println(marks2[5]);
//     }
// }

public class arrays {
    public static void main(String[] args) {
        // Declare an array of integers
        int[] myNumbers = {10, 20, 30, 40, 50};

        // Access and print each element in the array
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Element at index " + i + ": " + myNumbers[i]);
        }

        // Modify an element in the array
        myNumbers[2] = 99;
        System.out.println("After modification, element at index 2: " + myNumbers[2]);
        // {10, 20, 99, 40, 50}
    }
}
