package projetoJava4;
import java.util.Scanner;

public class CalculadoraDistancia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite as coordenadas do primeiro ponto (x1 y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        
        System.out.print("Digite as coordenadas do segundo ponto (x2 y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        
        double distancia = calcularDistancia(x1, y1, x2, y2);
        
        System.out.println("A distância entre os dois pontos é: " + distancia);
        
        scanner.close();
    }
    //P(x1, y1) e P(x2 , p2) //2.0
    
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double deltaX = x2 - x1;
        double deltaY = y2 - y1;
        double distancia = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        return distancia;
    }
}
