
import java.util.Scanner;

public class ArrayCalificaciones {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int calificaciones[][] = new int[5][3];
        int f;
        int c;
        System.out.println("Introduce las 3 calificaciones de 5 estiduantes");

        for (f = 0; f < 5; f++) {
            System.out.println("Alumno " + (f + 1));
            for (c = 0; c < 3; c++) {
                System.out.println(" Asignatura " + (c + 1) + ": ");
                calificaciones[f][c] = input.nextInt();

            }

        }
//        Mostrar las calificaciones. Visualizando tipo matriz
        System.out.println("Calificaciones");
        for (f = 0; f < 5; f++) {
            System.out.print("Alumno " + (f + 1) + ": ");
            for (c = 0; c < 3; c++) {
                System.out.print(calificaciones[f][c] + ", ");
            }
            System.out.println("");

        }

    }
}
