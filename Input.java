import java.util.Scanner;

public class Input{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name and age: ");
        String name = sc.nextLine();
        int age = sc.nextInt();
        System.out.println("Your name is " + name + " and your age is " + age);
    }
}