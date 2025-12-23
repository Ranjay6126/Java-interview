//Single level Inheritance Example: 

class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape {

    public void area(int l, int h) {
        double area = 0.5 * l * h; 
        System.out.println(area);
    }
}
// if we further extend Triangle class then this multip le level inheritance will be demonstrated
class EquilateralTriangle extends Triangle {
    public void area(int a) {
        System.out.println((Math.sqrt(3) / 4) * a * a);
    }
}


public class Inheritance {
    public static void main(String[] args) {

        Triangle t = new Triangle();
        t.area();                            // calls Shape's method
        t.area(10, 5);                      // calls Triangle's method
        EquilateralTriangle et = new EquilateralTriangle();
        et.area(6);                         // calls EquilateralTriangle's method
        
    }
}


// Hierarchical Inheritance Example:

// //// Parent class
// class Shape {
//     public void area() {
//         System.out.println("Displays area");
//     }
// }

// // Child class 1
// class Triangle extends Shape {
//     public void area(int l, int h) {
//         double area = 0.5 * l * h;
//         System.out.println("Triangle area: " + area);
//     }
// }

// // Child class 2
// class Circle extends Shape {
//     public void area(int r) {
//         double area = 3.14 * r * r;
//         System.out.println("Circle area: " + area);
//     }
// }

// // Main class
// public class OOPS {
//     public static void main(String[] args) {

//         Triangle t = new Triangle();
//         t.area();          // Shape method
//         t.area(10, 5);     // Triangle method

//         Circle c = new Circle();
//         c.area();          // Shape method
//         c.area(7);         // Circle method
//     }
// }
