public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;
    
    public Vendedor(String nome, String telefone, int codigoSetor, double salarioBase, double imposto, 
    double valorVendas, double comissao){
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        setValorVendas(valorVendas);
        setComissao(comissao);
    }
    
    public void setValorVendas(double valorVendas){
        this.valorVendas = valorVendas;
    }
    
    public void setComissao(double comissao){
        this.comissao = comissao;
    }
    
    public double getValorVendas(){
        return valorVendas;
    }
    
    public double getComissao(){
        return comissao;
    }
    
    @Override
    public double calcularSalario(){
        return super.calcularSalarioBase() + (getValorVendas() + getComissao());
    }
    
    @Override
    public String toString(){
        return String.format("%s  |  Salário: %.2f", super.toString(), calcularSalario());
    }
}