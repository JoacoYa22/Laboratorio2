interface Operable<E> {
    E suma(E otro);
    E resta(E otro);
    E producto(E otro);
    E division(E otro);
    E potencia(int exponente);
    E raizCuadrada();
    E raizCubica();
}