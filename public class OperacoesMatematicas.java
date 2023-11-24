public class OperacoesMatematicas {

    // Método para calcular o fatorial de um número
    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("O fatorial é indefinido para números negativos.");
        }

        long resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método para verificar se um número é primo
    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Exemplo de uso dos métodos
        int numeroFatorial = 5;
        long resultadoFatorial = calcularFatorial(numeroFatorial);
        System.out.println("O fatorial de " + numeroFatorial + " é: " + resultadoFatorial);

        int numeroPrimo = 11;
        boolean ehPrimo = verificarPrimo(numeroPrimo);
        System.out.println(numeroPrimo + " é primo? " + (ehPrimo ? "Sim" : "Não"));
    }
}
