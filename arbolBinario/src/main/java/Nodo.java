public class Nodo {
    int valor;
    Nodo izquierdo, derecho;

    public Nodo(int valor) {
        this.valor = valor;
        izquierdo = derecho = null;
    }


    public void insertar(int nuevoValor) {
        if (nuevoValor < this.valor) {
            if (izquierdo == null) {
                izquierdo = new Nodo(nuevoValor);
            } else {
                izquierdo.insertar(nuevoValor);
            }
        } else if (nuevoValor > this.valor) {
            if (derecho == null) {
                derecho = new Nodo(nuevoValor);
            } else {
                derecho.insertar(nuevoValor);
            }
        }
    }


    public boolean buscar(int valorBuscado) {
        if (valorBuscado == this.valor) return true;
        if (valorBuscado < this.valor && izquierdo != null) return izquierdo.buscar(valorBuscado);
        if (valorBuscado > this.valor && derecho != null) return derecho.buscar(valorBuscado);
        return false;
    }
}
