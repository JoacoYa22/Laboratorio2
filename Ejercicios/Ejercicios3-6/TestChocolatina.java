public class TestChocolatina {
    public static void main(String[] args) {
        Cajoneria<Chocolatina> cajoneria = new Cajoneria<>();

        cajoneria.Agregar(new Caja<>("Rojo", new Chocolatina("Nestle") ));
        cajoneria.Agregar(new Caja<>("Azul", new Chocolatina("Milka") ));
        cajoneria.Agregar(new Caja<>("Dorado", new Chocolatina("Ferrero")));
        cajoneria.Agregar(new Caja<>("Marrón", new Chocolatina("Hershey")));
        cajoneria.Agregar(new Caja<>("Amarillo", new Chocolatina("Toblerone")));

        System.out.println("Contenido de la Cajoneria:");
        System.out.println(cajoneria);

        Chocolatina buscada1 = new Chocolatina("Milka");
        System.out.println("Buscando " + buscada1.getMarca() + "...");
        System.out.println(cajoneria.search(buscada1));

        Chocolatina buscada2 = new Chocolatina("Snickers");
        System.out.println("Buscando " + buscada2.getMarca() + "...");
        System.out.println(cajoneria.search(buscada2));

        Chocolatina eliminada = cajoneria.delete(new Chocolatina("Ferrero"));
        System.out.println("Chocolatina eliminada: " + (eliminada != null ? eliminada.getMarca() : "No encontrada"));

        System.out.println("Contenido de la Cajoneria tras la eliminación:");
        System.out.println(cajoneria);
    }
}