package exercicio1;

public class Aplicacao {
    
    public static void main(String[] args) {
        
        Caixa caixa = new Caixa();

        Produto p1 = new Produto("Banana", 0.99, 2);
        System.out.println("Nome do Produto: " + p1.getNome() + "\nValor final: R$ " + caixa.calculaValorFinal(p1, 3));
    
        Produto p2 = new Produto("Energético", 5.49, 3);
        System.out.println("\nNome do Produto: " + p1.getNome() + "\nValor final: R$ " + caixa.calculaValorFinal(p2, 7));
        
        Produto p3 = new Produto("Arroz", 20, 1);
        System.out.println("\nNome do Produto: " + p1.getNome() + "\nValor final: R$ " + caixa.calculaValorFinal(p3, 1));
    
        Produto p4 = new Produto("Chocolate", 4.5, 1);
        System.out.println("\nNome do Produto: " + p1.getNome() + "\nValor final: R$ " + caixa.calculaValorFinal(p4, 20));
    
        Produto p5 = new Produto("Leite", 3.73, 3);
        System.out.println("\nNome do Produto: " + p1.getNome() + "\nValor final: R$ " + caixa.calculaValorFinal(p5, 3));
    
        Produto p6 = new Produto("Abacaxi", 2.4, 2);
        System.out.println("\nNome do Produto: " + p1.getNome() + "\nValor final: R$ " + caixa.calculaValorFinal(p6, 4));
    
    }
}
