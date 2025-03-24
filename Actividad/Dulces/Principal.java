public class Principal {
    public static void main(String[] args) {
        Bolsa<Chocolatina> bolsaCho = new Bolsa<Chocolatina>(5);
        Chocolatina c = new Chocolatina("milka");
        Chocolatina c1 = new Chocolatina("milka");
        Chocolatina c2 = new Chocolatina("ferrero");
        bolsaCho.add(c);
        bolsaCho.add(c1);
        bolsaCho.add(c2);
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
    }
}
