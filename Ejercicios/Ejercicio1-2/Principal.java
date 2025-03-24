public class Principal {
    public static void main(String[] args) {
        Bolsa<Chocolatina> bolsaCho = new Bolsa<Chocolatina>(5);
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("milka");
        Chocolatina c3 = new Chocolatina("ferrero");
        bolsaCho.add(c1);
        bolsaCho.add(c2);
        bolsaCho.add(c3);
        for (Chocolatina chocolatina: bolsaCho) {
            System.out.println(chocolatina.getMarca());
        }
        Bolsa <Golosina> bolsaGol = new Bolsa<Golosina>(6);
        Golosina g1 = new Golosina("Bombones",0.3);
        Golosina g2 = new Golosina("Masmelo",0.5);
        Golosina g3 = new Golosina("Halls",0.2);
        bolsaGol.add(g1);
        bolsaGol.add(g2);
        bolsaGol.add(g3);
        for (Golosina golosina: bolsaGol) {
            System.out.println(golosina.getNombre()+"\t"+"peso:"+golosina.getPeso());
        }
        System.out.println("¿Existe Halls de 0.2? " + bolsaGol.exist(new Golosina("Halls", 0.2)));
        System.out.println("¿Existe Chicle de 0.1? " + bolsaGol.exist(new Golosina("Chicle", 0.1)));
    }
}
