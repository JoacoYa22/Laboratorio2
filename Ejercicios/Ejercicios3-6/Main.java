public class Main {
    public static void main(String[] args) {
        Cajoneria c = new Cajoneria();
        Chocolatina c1 = new Chocolatina("Chocolatina 1");
        Caja e1 = new Caja("Verde", 1);
        Caja e3 = new Caja("Vermelho", 3);
        Golosina g1 = new Golosina("Vermelho", 1);
        Caja e4 = new Caja("Vermelho", g1);
        Caja e5 = new Caja("Vermelho", c1);
        c.Agregar(e1);
        c.Agregar(e4);
        for(int j = 0; j < 3; j++){
            System.out.println(c);
        }


        System.out.println(c.search(c1));
        System.out.println(c.search(g1));
    }
}
