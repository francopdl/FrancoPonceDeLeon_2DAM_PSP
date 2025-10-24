class NodoCola {
    Object dato;
    NodoCola siguiente;

    public NodoCola(Object dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class Cola {
    private NodoCola frente;
    private NodoCola fin;

    public Cola() {
        frente = fin = null;
    }

    public void enqueue(Object valor) {
        NodoCola nuevo = new NodoCola(valor);
        if (isEmpty()) {
            frente = fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    public Object dequeue() {
        if (isEmpty()) throw new RuntimeException("La cola está vacía.");
        Object valor = frente.dato;
        frente = frente.siguiente;
        if (frente == null) fin = null;
        return valor;
    }

    public boolean isEmpty() {
        return frente == null;
    }

    public String mostrar() {
        if (isEmpty()) return "(vacía)";
        StringBuilder sb = new StringBuilder();
        NodoCola aux = frente;
        while (aux != null) {
            sb.append(aux.dato);
            if (aux.siguiente != null) sb.append(" <- ");
            aux = aux.siguiente;
        }
        return sb.toString();
    }
}
