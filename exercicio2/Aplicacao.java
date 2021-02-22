package exercicio2;

import java.util.Scanner;

public class Aplicacao {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o intervalo inicial: ");
        int intervaloInicial = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite o intervalo final: ");
        int intervaloFinal = Integer.parseInt(scanner.nextLine());

        scanner.close();
        
        if(intervaloFinal - intervaloInicial <= 15){
            for(int i = intervaloInicial; i <= intervaloFinal; i++)
                System.out.println("Cubo de " + i + ": " + i*i*i);
        }
        else
            System.out.println("Intervalo inválido");
    }
}
