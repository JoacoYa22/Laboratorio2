import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo de número (1: Integer, 2: Double): ");
        int tipo = scanner.nextInt();

        System.out.print("Ingrese el primer número: ");
        if (tipo == 1) {
            int num = scanner.nextInt();
            OperacionesMatBInteger op = new OperacionesMatBInteger(num);
            ejecutarOperaciones(scanner, op);
        } else {
            double num = scanner.nextDouble();
            OperacionesMatDouble op = new OperacionesMatDouble(num);
            ejecutarOperaciones(scanner, op);
        }
        scanner.close();
    }

    private static <T extends Number & Comparable<T>> void ejecutarOperaciones(Scanner scanner, Operable<T> op) {
        int opcion = 0;
        while (opcion != 8) {
            System.out.println("\nMenú de Operaciones:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Producto");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz Cuadrada");
            System.out.println("7. Raíz Cúbica");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Ingrese otro número: ");
                T otro;
                if (op instanceof OperacionesMatBInteger) {
                    otro = (T) Integer.valueOf(scanner.nextInt());
                } else {
                    otro = (T) Double.valueOf(scanner.nextDouble());
                }
                if (opcion == 1) System.out.println(op.suma(otro));
                else if (opcion == 2) System.out.println(op.resta(otro));
                else if (opcion == 3) System.out.println(op.producto(otro));
                else if (opcion == 4) System.out.println(op.division(otro));
                else {
                    System.out.print("Ingrese el exponente: ");
                    int exponente = scanner.nextInt();
                    System.out.println(op.potencia(exponente));
                }
            } else if (opcion == 6) {
                System.out.println(op.raizCuadrada());
            } else if (opcion == 7) {
                System.out.println(op.raizCubica());
            }
        }
    }
}
