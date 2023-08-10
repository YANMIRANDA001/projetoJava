package projetoJava2;

import java.util.Scanner;

public class IdadeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade em dias: ");
        int idadeDias = scanner.nextInt();
        
        int anos = idadeDias / 365;
        int meses = (idadeDias % 365) / 30;
        int dias = (idadeDias % 365) % 30;
        
        System.out.println("A idade é: " + anos + " anos, " + meses + " meses e " + dias + " dias.");
        
        scanner.close();
    }
}
