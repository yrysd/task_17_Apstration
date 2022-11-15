import Task_17_Abstraction.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Write height: ");
        int skan = scanner.nextInt();
        System.out.println("Write radius: ");
        int number = scanner.nextInt();
        Shape cylinder = new Cylinder();
        cylinder.getPerimeter(skan,number,6);

        Shape circle = new Circle();
        System.out.println("Radius circle: ");
        int scan = scanner.nextInt();
        circle.getPerimeter(4,scan,6);

        Shape triangle = new Triangle();
        System.out.println("Write height:");
        int num = scanner.nextInt();
        System.out.println("Write height:");
        int numb = scanner.nextInt();
        triangle.getPerimeter(num,2,numb);

        Shape square = new Square();
        System.out.println("Write height: ");
        int number1 = scanner.nextInt();
        square.getPerimeter(number1,2,4);

        Shape rectangle = new Rectangle();
        System.out.println("Write height: ");
        int numbs = scanner.nextInt();
        rectangle.getPerimeter(numbs,1,2);





    }


}



