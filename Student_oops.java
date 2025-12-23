class Student{
    String name;
    int age;
    int rollNo;

    public void Info(){ //function to print student info
        System.out.println("My name is " + this.name);
        System.out.println("My age is " + this.age);
        System.out.println("My roll number is " + this.rollNo);
    }
}

public class Student_oops{

    public static void main(String[]args){

        Student student1 = new Student(); // creating an object
        student1.name = "Alice";
        student1.age = 20;
        student1.rollNo = 101;

        student1.Info(); // method call

    }
}