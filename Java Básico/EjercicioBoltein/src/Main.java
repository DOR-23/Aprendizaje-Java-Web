// Diego Ortega de la Rosa

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] materias = {"Java Básico - Introducción a Java",
                "Programación Orientada a Objetos",
                "Java Intermedio - Avanzando en Java",
                "Frontend: HTML - CSS - Bootstrap",
                "Java Avanzado - Spring - Microservicios",
                "Soft Skills - Desarrollo de habilidades",
                "Empleo - En busca del puesto adecuado",
                "Presentaciones eficaces"};

        Alumnos.mostrarDatosAlumnos();

        Alumnos.idAlumno();

        // Poner nota a las materias
            double[] notas = new double[materias.length];
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < materias.length; i++) {
                System.out.print(materias[i] + ": ");
                notas[i] = scanner.nextDouble();
            }


        Alumnos.observaciones();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\tEOI - Curso de Programador Java\n \t\t\t\t\t   Boletín de calificaciones\n\n\n");
        Alumnos.imprimirDatosAlumno(Alumnos.identificador);
        Alumnos.idBoletin();
        Alumnos.fecha();
        System.out.println("Materia \t\t\t\t\t\t\t Nota  \t\tCalificación");

        Alumnos.calcularNotaMedia(materias,notas);
        System.out.println("Observaciones y recomendaciones: ");
        System.out.println(Alumnos.observaciones);
        System.out.println("---------------------------------------------------------------------------------");
    }

}


