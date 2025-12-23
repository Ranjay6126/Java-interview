
class Pen { // blueprint

    String color;
    String type; // ballpoint OR gel pen

    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
        System.out.println(this.type);
    }

}

public class OOPs{ 

    public static void main(String[] args){ // main function

    Pen pen1 = new Pen(); // creating an object
    pen1.color = "blue";
    pen1.type = "gel pen";
    pen1.write(); // calling method
    pen1.printColor(); 

    Pen Pen2 = new Pen(); // creating another object
    Pen2.color = "black";
    Pen2.type = "ballpoint";
    Pen2.printColor();

    }

}