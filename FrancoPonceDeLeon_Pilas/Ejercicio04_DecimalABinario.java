import java.util.Scanner;

public class Ejercicio04_DecimalABinario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();

        System.out.print("Ingrese un número entero positivo: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Binario: 0");
            sc.close();
            return;

        }

        int original = n;
        while (n > 0) {
            pila.push(n % 2);
            n = n / 2;
        }

        String binario = "";
        while (!pila.isEmpty()) {
            binario += pila.pop();
        }

        System.out.println("Decimal: " + original + " → Binario: " + binario);
    
        sc.close();
    }
}
