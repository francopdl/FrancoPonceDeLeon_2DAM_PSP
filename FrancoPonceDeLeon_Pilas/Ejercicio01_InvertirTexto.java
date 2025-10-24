import java.util.Scanner;

public class Ejercicio01_InvertirTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();

        System.out.print("Ingrese un texto: ");
        String texto = sc.nextLine();

        // Apilar cada carácter
        for (int i = 0; i < texto.length(); i++) {
            pila.push(texto.charAt(i));
        }

        // Desapilar para invertir
        String invertido = "";
        while (!pila.isEmpty()) {
            invertido += pila.pop();
        }

        System.out.println("Texto invertido: " + invertido);
         sc.close();
    }
}
