package exercicio1;

public class Caixa {
    
    public double calculaValorFinal(Produto produto, int quantidade){

        double resultado;

        resultado = produto.getValor() * quantidade;

        if(produto.getTipo() == 1){
            return resultado * 0.9;
        }
        else if(produto.getTipo() == 2){
            return resultado * 0.8;
        }
        else if(produto.getTipo() == 3 && quantidade > 5){
            return resultado * 0.9;
        }
        else
            return resultado;
    }
}
