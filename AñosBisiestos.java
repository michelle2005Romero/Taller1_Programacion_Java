package añosbisiestos;

import java.time.Year;
import java.util.Scanner;

public class AñosBisiestos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio = sc.nextInt();
        if (Year.of(anio).isLeap()) {
            System.out.println("El anio " + anio + " es bisiesto");
        } else {
            System.out.println("El anio " + anio + " no es bisiesto");
        }
    }

}
