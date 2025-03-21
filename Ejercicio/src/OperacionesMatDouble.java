class OperacionesMatDouble implements Operable<Double> {
    private Double valor;

    public OperacionesMatDouble(Double valor) {
        this.valor = valor;
    }

    public Double suma(Double otro) {
        return valor + otro;
    }

    public Double resta(Double otro) {
        return valor - otro;
    }

    public Double producto(Double otro) {
        return valor * otro;
    }

    public Double division(Double otro) {
        if (otro == 0) throw new ArithmeticException("No se puede dividir entre cero");
        return valor / otro;
    }

    public Double potencia(int exponente) {
        return Math.pow(valor, exponente);
    }

    public Double raizCuadrada() {
        return Math.sqrt(valor);
    }

    public Double raizCubica() {
        return Math.cbrt(valor);
    }
}
