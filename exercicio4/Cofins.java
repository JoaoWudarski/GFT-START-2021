package exercicio4;

public class Cofins implements Imposto{

    @Override
    public double calculaImposto(double valor) {
        
        if(valor > 12000)
            return valor * 0.08;
        else
            return 0;    
    }
    
}
