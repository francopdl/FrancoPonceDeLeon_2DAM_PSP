import java.util.Scanner;

public class Ejercicio02_ColaClientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cola cola = new Cola();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- GESTIÓN DE COLA DE CLIENTES ---");
            System.out.println("1) Llegada de cliente");
            System.out.println("2) Atender cliente");
            System.out.println("3) Mostrar cola");
            System.out.println("4) Salir");
            System.out.print("Opción: ");
            String op = sc.nextLine();

            switch (op) {
                case "1":
                    System.out.print("Nombre del cliente: ");
                    String nombre = sc.nextLine();
                    cola.enqueue(nombre);
                    System.out.println("Cliente '" + nombre + "' agregado a la cola.");
                    break;
                case "2":
                    if (cola.isEmpty()) {
                        System.out.println("No hay clientes para atender.");
                    } else {
                        System.out.println("Atendiendo a: " + cola.dequeue());
                    }
                    break;
                case "3":
                    System.out.println("Cola actual: " + cola.mostrar());
                    break;
                case "4":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
                    
             sc.close();
            }
        }
    }

   
}
