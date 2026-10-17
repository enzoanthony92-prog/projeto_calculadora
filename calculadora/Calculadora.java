package calculadora;

/**
 * Classe responsável por realizar cálculos matemáticos básicos
 * para o aplicativo FinançApp. (Código Refatorado)
 * 
 * @author Enzo Monteiro
 * @version 2.0
 */
public class Calculadora {

    /**
     * Executa operações matemáticas básicas de forma limpa e otimizada.
     * 
     * @param a Primeiro operando inteiro
     * @param b Segundo operando inteiro
     * @param op Operador matemático desejado (+, -, *, /)
     * @return O resultado da operação em formato double
     */
    public double calc(int a, int b, String op) {
        return switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> dividir(a, b);
            default -> {
                System.out.println("Erro: Operação inválida informada!");
                yield 0.0;
            }
        };
    }

    /**
     * Método auxiliar privado para tratar a divisão e evitar divisão por zero.
     * 
     * @param a Numerador
     * @param b Denominador
     * @return Resultado da divisão ou 0 em caso de erro
     */
    private double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Erro: Não é possível dividir por zero.");
            return 0.0;
        }
        return (double) a / b;
    }
}