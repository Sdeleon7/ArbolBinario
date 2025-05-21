public class ArbolBinarioBusqueda {
    private Nodo raiz;

    public void insertar(int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
        } else {
            raiz.insertar(valor);
        }
    }

    public boolean buscar(int valor) {
        return (raiz != null) && raiz.buscar(valor);
    }
}
