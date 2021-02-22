package exercicio4;

import java.util.Scanner;

public class Aplicacao {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Icms icms = new Icms();
        Ipi ipi = new Ipi();
        Cofins cofins = new Cofins();

        System.out.println("Digite um valor: ");
        double valor = Double.parseDouble(scanner.nextLine());
        scanner.close();


        System.out.println("ICMS: " + icms.calculaImposto(valor));
        System.out.println("IPI: " + ipi.calculaImposto(valor));
        System.out.println("COFINS: " + cofins.calculaImposto(valor));
        
        double valorFinal = valor + icms.calculaImposto(valor) + ipi.calculaImposto(valor) + cofins.calculaImposto(valor);
        System.out.println("Valor Final: " + valorFinal);
    }
}
