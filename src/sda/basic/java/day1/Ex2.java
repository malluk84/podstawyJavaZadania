package sda.basic.java.day1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {

    private final static float PI = 3.14f;

    public static void main (String[] args) {
        float diameter = getDiameterFromUser();
        float circumference = calculateCircumefernce(diameter);
        System.out.println("Circumeference Of a Circle: " + circumference);

        float area = calculateOfArea(diameter);
        System.out.println("Area Of a Circle: " + area);

        float aera = calculateOfArea(diameter);
    }

    private static float getDiameterFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert dimeter: ");

        return scanner.nextFloat();

    }

    private static float calculateCircumefernce(float diameter) {
        return PI * diameter;

    }

    private static float calculateOfArea(float diameter) {
        float radius = diameter / 2;
        return PI * (float)Math.pow(radius, 2);


    }
}
