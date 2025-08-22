public class Operadores {
""
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Operadores Aritméticos
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        // Operadores Relacionais
        System.out.println("Igual: " + (a == b));
        System.out.println("Diferente: " + (a != b));
        System.out.println("Maior: " + (a > b));
        System.out.println("Menor: " + (a < b));
        System.out.println("Maior ou Igual: " + (a >= b));
        System.out.println("Menor ou Igual: " + (a <= b));

        // Operadores Lógicos
        boolean x = true;
        boolean y = false;
        System.out.println("E: " + (x && y));
        System.out.println("Ou: " + (x || y));
        System.out.println("Não: " + (!x));
    }
}