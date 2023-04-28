import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public enum Alumnos {
    A1001("David", "Alfonso", "Martin", "609251201", "david@java.eoi.es"),
    A1002("Hugo José", "Alonso", "García", "609251202", "hugojose@java.eoi.es"),
    A1003("Daniel", "Bilbao", "Fornell", "609251203", "daniel@java.eoi.es"),
    A1004("Manuel", "Bonilla", "Alvarado", "609251204", "manuel@java.eoi.es"),
    A1005("Sandra", "Checa", "Ruiz", "609251205", "sandra@java.eoi.es"),
    A1006("Melchor", "Díaz", "Reyes", "609251206", "melchor@java.eoi.es"),
    A1007("Antonio", "García", "Ramírez", "609251207", "antonio@java.eoi.es"),
    A1008("Alejandro", "Gómez", "Gómez", "609251208", "alejandro@java.eoi.es"),
    A1009("Santiago", "Gómez", "Penagos", "609251209", "santiago@java.eoi.es"),
    A1010("Lorena", "Jiménez", "Morán", "609251210", "lorena@java.eoi.es"),
    A1011("Pablo", "Laz", "Ruiz", "609251211", "pablo@java.eoi.es"),
    A1012("Marta", "Lima", "Rojas", "609251212", "marta@java.eoi.es"),
    A1013("Iván", "Mañas", "Gutiérrez", "609251213", "ivan@java.eoi.es"),
    A1014("Adrián", "Martel", "Cortijo", "609251214", "adrian@java.eoi.es"),
    A1015("Alexander", "Martinez", "Moron", "609251215", "alexander@java.eoi.es"),
    A1016("Laura", "Molero", "Molina", "609251216", "laura@java.eoi.es"),
    A1017("Diego", "Ortega", "De", "609251217", "diego@java.eoi.es"),
    A1018("Salvador", "Pérez", "Ranchal", "609251218", "salvador@java.eoi.es"),
    A1019("David", "Pinto", "Pajares", "609251219", "david@java.eoi.es"),
    A1020("Juan José", "Romero", "Palacios", "609251220", "juanjose@java.eoi.es"),
    A1021("Alejandro", "Saponi", "Carmona", "609251221", "alejandro@java.eoi.es"),
    A1022("Santiago", "Tasset", "González", "609251222", "santiago@java.eoi.es"),
    A1023("Alba", "Valverde", "Marcos", "609251223", "alba@java.eoi.es");

    // Atributos y métodos
    private final String nombre;
    private final String apellido1;
    private final String apellido2;
    private final String telefono;
    private final String email;
    static String identificador = "";
    static String observaciones = "";


    static Scanner scan = new Scanner(System.in);



    Alumnos(String nombre, String apellido1, String apellido2, String telefono, String email) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                        ", apellido1='" + apellido1 + '\'' +
                        ", apellido2='" + apellido2 + '\'' +
                        ", telefono='" + telefono + '\'' +
                        ", email='" + email + '\'';
    }


    // Introducir Id de Alumno
    public static String idAlumno() {
        Scanner sc = new Scanner(System.in);

        boolean encontrado = false;

        do {
            System.out.println("Introduce el identificador del alumno:");
            identificador = sc.nextLine();

            for (Alumnos alumno : Alumnos.values()) {
                if (alumno.name().equals(identificador)) {
                    //System.out.println("Alumno encontrado: " + alumno.toString());
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("El identificador introducido no es válido.");
            }

        } while (!encontrado);
        return identificador;
    }

    public static void imprimirDatosAlumno(String identificador) {

        for (Alumnos alumno : Alumnos.values()) {
            if (alumno.name().equals(identificador)) {
                System.out.println("Alumno número: " + identificador);
                System.out.println("\t" +alumno.getNombre()+ " "
                 + alumno.getApellido1() + " " + alumno.getApellido2());
                System.out.println("\t" + alumno.getEmail());
                System.out.println("\tTeléfono: " + alumno.getTelefono()+"\n");
                return;
            }
        }
    }

    // Imprimir Fecha con formato
    public static void fecha(){
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        String fechaImpresa = fechaActual.format(formatoFecha);
         System.out.println(fechaImpresa + "\n");
    }

    // Crea el id de boletin
    public static void idBoletin() {
        int longitud = 10;
        StringBuilder sb = new StringBuilder(longitud);
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        for (int i = 0; i < longitud; i++) {
            int indice = (int) (caracteres.length() * Math.random());
            sb.append(caracteres.charAt(indice));
        }

        String id = sb.toString();
        System.out.println("Id. Boletín: " + id + "\n");
    }

    //Mostrar Id, nombre y apellidos
    public static void mostrarDatosAlumnos() {
        for (Alumnos datos : Alumnos.values()) {
            System.out.println(datos.name() + " : " + datos.getNombre() + " " + datos.getApellido1() + " "+ datos.getApellido2());

        }
    }

    // Introducir datos
    public static String introduceDato (String mensaje, Scanner sc){
        System.out.println(mensaje);
        return sc.nextLine();
    }

    //Introducir notas
    public static void ingresarNotas(String[] materias){
        double[] notas = new double[materias.length];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < materias.length; i++) {
            System.out.print(materias[i] + ": ");
            notas[i] = scanner.nextDouble();
        }
        // Sacar pro pantalla las notas con las materias
        /*for (int i = 0; i < cursos.length; i++) {
            System.out.println(cursos[i] + ": " + notas[i]);
        }*/
    }

    //Calcular Nota media
    public static void calcularNotaMedia (String[]materias,double[] notas){
        double notaMedia = 0;
        for (int i = 0; i < materias.length; i++) {
            System.out.printf(materias[i] + "\t\t");
            if (notas[i] >= 0 && notas[i] < 5) {
                System.out.println(notas[i] + "   Suspenso ");
            } else if (notas[i] >= 5 && notas[i] < 7) {
                System.out.println(notas[i] + "   Aprobado ");
            } else if (notas[i] >= 7 && notas[i] < 9) {
                System.out.println(notas[i] + "   Notable ");
            } else if (notas[i] >= 9 && notas[i] < 10) {
                System.out.println(notas[i] + "   Sobresaliente ");
            } else if (notas[i] == 10) {
                System.out.println(notas[i] + "   Matrícula ");
            }
            notaMedia += notas[i];
        }
        System.out.println("\n");
        notaMedia /= notas.length;
        System.out.printf("Calificación final:\t\t\t\t\t %.2f    \t\t", notaMedia);
        if (notaMedia >= 0 && notaMedia < 5) {
            System.out.println("Suspenso");
        } else if (notaMedia >= 5 && notaMedia < 7) {
            System.out.println("Aprobado");
        } else if (notaMedia >= 7 && notaMedia < 9) {
            System.out.println("Notable");
        } else if (notaMedia >= 9 && notaMedia < 10) {
            System.out.println("Sobresaliente");
        } else if (notaMedia == 10) {
            System.out.println("Matrícula");
        }

    }

    // Introducir observaciones
    public static String observaciones(){
        System.out.println("Introduzca observación: ");
        observaciones = scan.nextLine();
        return observaciones;
    }
}
