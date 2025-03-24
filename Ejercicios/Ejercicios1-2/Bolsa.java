import java.util.ArrayList;
import java.util.Iterator;
public class Bolsa < T > implements Iterable < T > {
    private ArrayList < T > lista = new ArrayList < T > ();
    private int tope;
    public Bolsa(int tope){
        this.tope = tope;
    }
    public void add(T objeto) {
        if(lista.size() < this.tope){
            lista.add(objeto);
        }else {
            throw new RuntimeException("no cabe mas");
        }
    }
    public boolean exist(T elemento){
        for(T item:lista){
            if (item.equals(elemento)){
                return true;
            }
        }
        return false;
    }
    public Iterator < T > iterator() {
        return lista.iterator();
    }
}