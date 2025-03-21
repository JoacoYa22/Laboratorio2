
class OperacionesMatBInteger implements Operable<Integer> {
    private Integer valor;

    public OperacionesMatBInteger(Integer valor) {
        this.valor = valor;
    }

    public Integer suma(Integer otro) {
        return valor + otro;
    }

    public Integer resta(Integer otro) {
        return valor - otro;
    }

    public Integer producto(Integer otro) {
        return valor * otro;
    }

    public Integer division(Integer otro) {
        if (otro == 0) throw new ArithmeticException("No se puede dividir entre cero");
        return valor / otro;
    }

    public Integer potencia(int exponente) {
        return (int) Math.pow(valor, exponente);
    }

    public Integer raizCuadrada() {
        return (int) Math.sqrt(valor);
    }

    public Integer raizCubica() {
        return (int) Math.cbrt(valor);
    }
}