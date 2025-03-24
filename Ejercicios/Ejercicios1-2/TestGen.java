public class TestGen {
    public static void main(String[] args) {
        DemoMetodoGenerico demo = new DemoMetodoGenerico();
        String[] v = {"Perez","Sanchez","Rodriguez"};
        Integer[] w = {12,34,56};
        System.out.println(demo.exist(v,"Sanchez"));
        System.out.println(demo.exist(w,34));
        System.out.println(demo.exist(w,”Salas”)); //Error
    }
}
