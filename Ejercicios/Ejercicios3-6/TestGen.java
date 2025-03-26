public class TestGen {
    public static void main(String[] args) {
        Cajoneria<Golosina> cajoneria = new Cajoneria<>();

        cajoneria.Agregar(new Caja<>("Rojo", new Golosina("Chocolate", 50.5)));
        cajoneria.Agregar(new Caja<>("Azul", new Golosina("Caramelo", 30.0)));
        cajoneria.Agregar(new Caja<>("Verde", new Golosina("Gomita", 20.5)));
        cajoneria.Agregar(new Caja<>("Amarillo", new Golosina("Chicle", 10.0)));
        cajoneria.Agregar(new Caja<>("Rosa", new Golosina("Malvavisco", 40.0)));

        System.out.println("Contenido de la Cajoneria:");
        System.out.println(cajoneria);

        Golosina buscada1 = new Golosina("Caramelo", 30.0);
        System.out.println("Buscando " + buscada1.getNombre() + "...");
        System.out.println(cajoneria.search(buscada1));

        Golosina buscada2 = new Golosina("Chocolate", 50.5);
        System.out.println("Buscando " + buscada2.getNombre() + "...");
        System.out.println(cajoneria.search(buscada2));

        Golosina eliminada = cajoneria.delete(new Golosina("Gomita", 20.5));
        System.out.println("Golosina eliminada: " + (eliminada != null ? eliminada.getNombre() : "No encontrada"));

        System.out.println("Contenido de la Cajoneria tras la eliminación:");
        System.out.println(cajoneria);
    }
}