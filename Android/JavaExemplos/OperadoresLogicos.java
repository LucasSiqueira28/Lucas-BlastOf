public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean resultado;
        if (10 == 20 && 10 < 20) {
            resultado = true;
        } else {
            resultado = false;
        }
        System.out.println(resultado);

        if (10 == 20 || 10 < 20) {
            resultado = true;
        } else {
            resultado = false;
        }
        System.out.println(resultado);
    }
}
