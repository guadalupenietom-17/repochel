package Vista;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {

        int opcion;  // Se crea la variable

        do {
            opcion = menup();    //Le asignamos el valor a la opción.
            switch (opcion) {
                case 1:
                    System.out.println("\n");
                    System.out.println("\tIngrese el Medio de Alojamiento que desea implementar : ");

                    break;
                case 2:
                    System.out.println("\n");
                    System.out.println("\tEl Medio de Alojamiento seleccionado :   ");


                   break;
                case 3:
                    System.out.println("\t\n########################## DATOS DEL CLIENTE##########################");
                    System.out.println("\n");
                    System.out.println("\t\n Ingrese su  Nombre Completo:  ");
                    System.out.println("\t\n Ingresar Rut: ");
                    break;
                case 4:
                    System.out.println("\n");
                    System.out.println("\tTotal Adicional :   ");
                    break;
                case 5:
                    System.out.println("\n");
                    System.out.println("\tTotal Bono Descuento:  ");
                    break;
                case 6:
                    System.out.println("\n");
                    System.out.println("\tCantidad del Medios de Alojamiento : ");
                    break;
                case 7:
                    System.out.println("\n");
                    System.out.println("\tValor a Cancelar :  ");
                    break;
                case 8:
                    System.out.println("\n");
                    System.out.println("\tIncremento valor base : ");
                    break;
                case 9:
                    System.out.println("\n");
                    System.out.println("\t//////////  HASTA LUEGO  \\\\\\\\\\");
                    break;
                default:
                    System.out.println("\n");
                    System.out.println("\tOpción inválida, intente de nuevo");
                    break;
            }
        } while (opcion != 9); // Si ingresa la opcion 9 se sale el menú
    }

    public static int menup() {
        System.out.println("\t\n\n\n####################  EMPRESA TURISMO- MENÚ PRINCIPAL  #################### ");
        System.out.println("1). \tIngresar medio de alojamiento");
        System.out.println("2). \tMostrar medios de alojamiento");
        System.out.println("3). \tDatos de un cliente");
        System.out.println("4). \tTotal adicional");
        System.out.println("5). \tTotal bono descuento");
        System.out.println("6). \tCantidad de medios de alojamiento");
        System.out.println("7). \tValor a cancelar");
        System.out.println("8). \tIncrementar valor base");
        System.out.println("9). \tSalir");
        System.out.print("Ingrese una opcion:  ...     ");
        return Leer.datoInt();
    }

    public static String PedirmedioAlojamiento() {
        return Leer.dato();
    }

    private static class Leer {
        public static String dato() {
            Scanner scan = new Scanner(System.in);
            return scan.nextLine();
        }

        public static int datoInt() {
            Scanner scan = new Scanner(System.in);
            return scan.nextInt();
        }
    }
}

