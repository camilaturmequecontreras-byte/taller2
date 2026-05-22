public class Main {
    public static void main(String[] args) {
        ArbolBST arbol = new ArbolBST();

        // Inserción de fincas (orden exacto de FEDEGÁN) [cite: 48, 50]
        arbol.insertar(50, "Hato La Aurora", "Hato Corozal");
        arbol.insertar(30, "Finca El Encanto", "Yopal");
        arbol.insertar(70, "Hacienda La Esperanza", "Aguazul");
        arbol.insertar(20, "Finca San Isidro", "Nunchía");
        arbol.insertar(40, "Hato Caribayona", "Paz de Ariporo");
        arbol.insertar(60, "Finca Las Brisas", "Tauramena");
        arbol.insertar(80, "Hacienda La Palma", "Maní");
        arbol.insertar(10, "Finca El Porvenir", "Pore");
        arbol.insertar(25, "Finca Las Garzas", "Trinidad");
        arbol.insertar(35, "Hato La Cabaña", "Orocué");
        arbol.insertar(45, "Finca Buenavista", "Monterrey");

        System.out.println("Recorrido PreOrden:");
        arbol.preOrden(); // [cite: 71, 74]

        System.out.println("\nRecorrido InOrden:");
        arbol.inOrden(); // [cite: 72, 74]

        System.out.println("\nRecorrido PostOrden:");
        arbol.postOrden(); // [cite: 73, 74]
    }
}
