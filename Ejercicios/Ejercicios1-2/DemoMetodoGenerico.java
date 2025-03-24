public class DemoMetodoGenerico {
    static <T extends Comparable<T>> boolean igualArrays(T[] x, T[] y) {
        if (x.length != y.length)
            return false;
        for (int i = 0; i < x.length; i++)
            if (!x[i].equals(y[i]))
                return false; //arrays diferentes
        return true; // Contenido de arrays son equivalente
    }

    public <T extends Comparable<T>> boolean exist(T[] x, T elemento){
        for (int i=0; i<x.length;i++){
            if(x[i].compareTo(elemento) ==0){
                return true;
            }
        }
        return false;
    }
}