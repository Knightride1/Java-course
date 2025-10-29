class pen{
    String color; // black, blue, red, etc.
    String type; //ballpoint, gel, fountain, etc.
    
    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

}

class Student{
    String name;
    int age;
    int grade;

    public void printInfo(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Grade: " + this.grade);
    }

    public void study(){
        System.out.println("studying");
    }
}



public class hello {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 20;
        s1.grade = 3;
        s1.printInfo();
        s1.study();
    }
}
