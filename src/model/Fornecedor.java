public class Fornecedor extends Pessoa {
    private double valorDivida;
    private double valorCredito;
    
    public Fornecedor(String nome, String telefone, double valorDivida, double valorCredito){
        super(nome, telefone);
        setValorDivida(valorDivida);
        setValorCredito(valorCredito);
    }
    
    public void setValorDivida(double valorDivida){
        this.valorDivida = valorDivida;
    }
    
    public void setValorCredito(double valorCredito){
        this.valorCredito = valorCredito;
    }
    
    public double getValorDivida(){
        return valorDivida;
    }
    
    public double getValorCredito(){
        return valorCredito;
    }
    
    public double valorAPagar(){
        return valorCredito - valorDivida;
    }
    
    @Override
    public String toString(){
        return String.format("%s  |  Valor a Pagar: %.2f", super.toString(), valorAPagar());
    }
}
