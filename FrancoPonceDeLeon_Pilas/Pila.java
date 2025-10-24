class NodoPila {
    Object dato;
    NodoPila siguiente;

    public NodoPila(Object dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class Pila {
    private NodoPila tope;

    public Pila() {
        tope = null;
    }

    public void push(Object valor) {
        NodoPila nuevo = new NodoPila(valor);
        nuevo.siguiente = tope;
        tope = nuevo;
    }

    public Object pop() {
        if (isEmpty()) throw new RuntimeException("La pila está vacía.");
        Object valor = tope.dato;
        tope = tope.siguiente;
        return valor;
    }

    public boolean isEmpty() {
        return tope == null;
    }
}
