package indicedemasacorporal;

import java.util.Scanner;

public class IndiceDeMasaCorporal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su estatura en metros: ");
        double estatura = sc.nextDouble();
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = sc.nextDouble();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        double imc = peso / Math.pow(estatura, 2);

        if (edad < 45) {
            if (imc < 22.0) {
                System.out.println("Su condición de riesgo es baja");
            } else if (imc < 27.0) {
                System.out.println("Su condición de riesgo es moderada");
            } else {
                System.out.println("Su condición de riesgo es alta");
            }
        } else {
            if (imc < 22.0) {
                System.out.println("Su condición de riesgo es moderada");
            } else if (imc < 27.0) {
                System.out.println("Su condición de riesgo es alta");
            } else {
                System.out.println("Su condición de riesgo es muy alta");
            }
        }

    }

}
