//  Create a program by using method overloading to find out volume of cube,cuboid,cylinder,cone,sphere,hemisphere

import java.util.Scanner;

class VolumeCalculator {

    // Volume of Cube
    double volume(double side) {
        return side * side * side;
    }

    // Volume of Cuboid
    double volume(double length, double breadth, double height) {
        return length * breadth * height;
    }

    // Volume of Cylinder
    double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Volume of Cone
    double volume(double radius, double height, boolean isCone) {
        return (1.0/3.0) * Math.PI * radius * radius * height;
    }

    // Volume of Sphere
    double volume(double radius, boolean isSphere) {
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }

    // Volume of Hemisphere
    double volume(double radius, int isHemisphere) {
        return (2.0/3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VolumeCalculator obj = new VolumeCalculator();

        System.out.println("Enter side of cube:");
        double side = sc.nextDouble();
        System.out.println("Volume of Cube = " + obj.volume(side));

        System.out.println("\nEnter length, breadth and height of cuboid:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        System.out.println("Volume of Cuboid = " + obj.volume(l, b, h));

        System.out.println("\nEnter radius and height of cylinder:");
        double r1 = sc.nextDouble();
        double h1 = sc.nextDouble();
        System.out.println("Volume of Cylinder = " + obj.volume(r1, h1));

        System.out.println("\nEnter radius and height of cone:");
        double r2 = sc.nextDouble();
        double h2 = sc.nextDouble();
        System.out.println("Volume of Cone = " + obj.volume(r2, h2, true));

        System.out.println("\nEnter radius of sphere:");
        double r3 = sc.nextDouble();
        System.out.println("Volume of Sphere = " + obj.volume(r3, true));

        System.out.println("\nEnter radius of hemisphere:");
        double r4 = sc.nextDouble();
        System.out.println("Volume of Hemisphere = " + obj.volume(r4, 1));

        sc.close();
    }
}
