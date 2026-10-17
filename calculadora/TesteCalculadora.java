package calculadora;

/**
 * Classe responsável por testar as operações da Calculadora.
 * Valida os casos de sucesso e tratamento de erros.
 * 
 * @author Enzo Monteiroteiro
 * @version 1.0
 */
public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("=== INÍCIO DOS TESTES DA CALCULADORA ===\n");

        // 1. Teste de Soma
        testarOperacao(calc, 10, 5, "+", 15.0, "Soma simples");

        // 2. Teste de Subtração
        testarOperacao(calc, 10, 4, "-", 6.0, "Subtração simples");

        // 3. Teste de Multiplicação
        testarOperacao(calc, 5, 3, "*", 15.0, "Multiplicação simples");

        // 4. Teste de Divisão
        testarOperacao(calc, 20, 4, "/", 5.0, "Divisão exata");

        // 5. Teste de Divisão por Zero (Caso de Erro)
        testarOperacao(calc, 10, 0, "/", 0.0, "Divisão por zero");

        // 6. Teste de Operação Inválida (Caso de Erro)
        testarOperacao(calc, 10, 2, "x", 0.0, "Operação inválida");

        System.out.println("\n=== FIM DOS TESTES ===");
    }

    /**
     * Método auxiliar para executar cada teste e exibir os resultados.
     */
    private static void testarOperacao(Calculadora calc, int a, int b, String op, double esperado, String descricao) {
        System.out.println("Teste: " + descricao);
        System.out.println("Entradas: a = " + a + ", b = " + b + ", op = '" + op + "'");
        
        double obtido = calc.calc(a, b, op);
        
        System.out.println("Resultado Esperado: " + esperado);
        System.out.println("Resultado Obtido:   " + obtido);

        if (obtido == esperado) {
            System.out.println("Status: [PASSOU]");
        } else {
            System.out.println("Status: [FALHOU]");
        }
        System.out.println("----------------------------------------");
    }
}