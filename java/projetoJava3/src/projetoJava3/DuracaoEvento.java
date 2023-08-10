package projetoJava3;
import java.util.Scanner;

public class DuracaoEvento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a duração do evento em segundos: ");
        int duracaoSegundos = scanner.nextInt();
        
        int horas = duracaoSegundos / 3600;
        int minutos = (duracaoSegundos % 3600) / 60;
        int segundos = duracaoSegundos % 60;
        
        System.out.println("A duração do evento é: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
        
        scanner.close();
    }
}
