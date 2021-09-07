package _15_exception.bai_tap;

import java.util.Scanner;

public class Triangle {
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) throws IllegalTriangleException {
        this.a = a;
        this.b = b;
        this.c = c;

        if (a > 0 && b > 0 && c > 0){
            if ((a + b) > c && (a+c) > b && ( c+b) > a){
                System.out.println("initialization successful!");
            }else {
                throw new IllegalTriangleException("The sum of any two sides must be GREATER than the other side ");
            }
        }else {
            throw new IllegalTriangleException("Side of triangle must be GREATER than 0");
        }
    }

    public static void main(String[] args) {
        boolean check = false;
        Scanner scanner = new Scanner(System.in);

        while (!check){
            System.out.println("enter side a: ");
            float a = Float.parseFloat(scanner.nextLine());
            System.out.println("enter side b: ");
            float b = Float.parseFloat(scanner.nextLine());
            System.out.println("enter side c: ");
            float c = Float.parseFloat(scanner.nextLine());
            try {
                Triangle myTriangle = new Triangle(a,b,c);
                check = true;
            }catch (IllegalTriangleException ex){
                System.err.println("Exception: " + ex + ". Please try again: ");
            }
        }
    }
}
