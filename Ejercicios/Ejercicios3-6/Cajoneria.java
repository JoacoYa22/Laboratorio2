
import java.util.ArrayList;
import java.util.Iterator;


public class Cajoneria < T > implements Iterable < T > {
    private ArrayList < Caja<T> > lista = new ArrayList < Caja<T> > ();
    private int tope;

    public Cajoneria(){
        System.out.println("Cajoneria Creada");
    }
    public void Agregar(Caja <T> caja) {
        lista.add(caja);
    }
    public String search(T elemento) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getObjeto() != null && lista.get(i).getObjeto().equals(elemento)) {
                return "Posicion: " + (i + 1) + "\t" + "Color: " + lista.get(i).getColor();
            }
        }
        return "Objeto no encontrado";
    }

    public T delete(T elemento) {
        for (Caja<T> caja : lista) {
            if (caja.getObjeto() != null && caja.getObjeto().equals(elemento)) {
                T eliminado = caja.getObjeto();
                caja.setObjeto(null);
                return eliminado;
            }
        }
        return null;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Posicion\tColor Caja\tObjeto\n");
        sb.append("-----------------------------------------------------------\n");
        for(int i=0;i<lista.size();i++){
            sb.append((i+1)+"\t"+lista.get(i).getColor()+"\t"+lista.get(i).getObjeto()+"\n");
        }
        return sb.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}