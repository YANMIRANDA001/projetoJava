package projetoJava;

import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite as notas do aluno:");
        
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();
        
        double peso1 = 2;
        double peso2 = 3;
        double peso3 = 5;
        
        double mediaFinal = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        
        System.out.println("A média final do aluno é: " + mediaFinal);
        
        scanner.close();
    }
}
