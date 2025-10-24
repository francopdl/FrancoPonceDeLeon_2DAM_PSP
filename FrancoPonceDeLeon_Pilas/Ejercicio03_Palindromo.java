import java.util.Scanner;

public class Ejercicio03_Palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();
        Cola cola = new Cola();

        System.out.print("Ingrese una palabra o frase: ");
        String texto = sc.nextLine().toLowerCase().replace(" ", "");

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            pila.push(c);
            cola.enqueue(c);
        }

        boolean palindromo = true;
        while (!pila.isEmpty() && !cola.isEmpty()) {
            if ((char)pila.pop() != (char)cola.dequeue()) {
                palindromo = false;
                break;
            }
        }

        if (palindromo) {
            System.out.println("La frase es palíndroma.");
        } else {
            System.out.println("La frase NO es palíndroma.");
        }
    
        sc.close();
    }
}
        