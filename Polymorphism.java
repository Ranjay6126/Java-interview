class Student {

    String name;
    int age;
    String course;

    public void printinfo(String name) {
        System.out.println("My name is " + this.name);
    }

    public void printinfo(int age) {
        System.out.println("My age is " + this.age);
    }

    public void printinfo(String name, String course) {
        System.out.println("My course is " + this.course);
    }
}

public class Polymorphism {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Johan";
        s1.age = 21;
        s1.course = "Computer Science";

        s1.printinfo(s1.name);
        s1.printinfo(s1.age);
        s1.printinfo(s1.name, s1.course); 
    }
}
