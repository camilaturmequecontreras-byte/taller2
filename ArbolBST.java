public class ArbolBST {
    NodoBST raiz;

    public ArbolBST() {
        this.raiz = null;
    }

    // Método insertar [cite: 69]
    public void insertar(int codigo, String nombre, String municipio) {
        raiz = insertarRecursivo(raiz, codigo, nombre, municipio);
    }

    private NodoBST insertarRecursivo(NodoBST nodo, int codigo, String nombre, String municipio) {
        if (nodo == null) {
            return new NodoBST(codigo, nombre, municipio);
        }
        if (codigo < nodo.codigo) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, codigo, nombre, municipio);
        } else if (codigo > nodo.codigo) {
            nodo.derecho = insertarRecursivo(nodo.derecho, codigo, nombre, municipio);
        }
        return nodo;
    }

    // Método buscar [cite: 70]
    public NodoBST buscar(int codigo) {
        return buscarRecursivo(raiz, codigo);
    }

    private NodoBST buscarRecursivo(NodoBST nodo, int codigo) {
        if (nodo == null || nodo.codigo == codigo) {
            return nodo;
        }
        if (codigo < nodo.codigo) {
            return buscarRecursivo(nodo.izquierdo, codigo);
        }
        return buscarRecursivo(nodo.derecho, codigo);
    }

    // Método preOrden [cite: 71]
    public void preOrden() {
        preOrdenRecursivo(raiz);
        System.out.println();
    }

    private void preOrdenRecursivo(NodoBST nodo) {
        if (nodo != null) {
            System.out.print(nodo.codigo + " ");
            preOrdenRecursivo(nodo.izquierdo);
            preOrdenRecursivo(nodo.derecho);
        }
    }

    // Método inOrden [cite: 72]
    public void inOrden() {
        inOrdenRecursivo(raiz);
        System.out.println();
    }

    private void inOrdenRecursivo(NodoBST nodo) {
        if (nodo != null) {
            inOrdenRecursivo(nodo.izquierdo);
            System.out.print(nodo.codigo + " ");
            inOrdenRecursivo(nodo.derecho);
        }
    }

    // Método postOrden [cite: 73]
    public void postOrden() {
        postOrdenRecursivo(raiz);
        System.out.println();
    }

    private void postOrdenRecursivo(NodoBST nodo) {
        if (nodo != null) {
            postOrdenRecursivo(nodo.izquierdo);
            postOrdenRecursivo(nodo.derecho);
            System.out.print(nodo.codigo + " ");
        }
    }
}