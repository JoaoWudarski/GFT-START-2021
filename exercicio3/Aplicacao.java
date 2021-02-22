package exercicio3;

import java.util.Scanner;

public class Aplicacao {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um numero: ");
        int num = Integer.parseInt(scanner.nextLine());
        scanner.close();

       System.out.println("Divisível por ");
        for(int i = 3; i <= 7; i++){
            if(i == 3 || i == 6 || i == 7){
                if(num % i == 0)
                    System.out.println(i + ",");
            }
        }

    }
}
