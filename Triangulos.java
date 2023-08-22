package triangulos;

import java.util.Scanner;

public class Triangulos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el lado a: ");
        double a = sc.nextDouble();
        System.out.print("Ingrese el lado b: ");
        double b = sc.nextDouble();
        System.out.print("Ingrese el lado c: ");
        double c = sc.nextDouble();

        if (a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("El triángulo es inválido");
        } else if (a == b && b == c) {
            System.out.println("El triángulo es equilátero");
        } else if (a == b || a == c || b == c) {
            System.out.println("El triángulo es isósceles");
        } else {
            System.out.println("El triángulo es escaleno");
        }
    }

}
