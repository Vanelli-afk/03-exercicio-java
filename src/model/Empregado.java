public abstract class Empregado extends Pessoa {
    private int codigoSetor;
    private double salarioBase;
    private double imposto;
    
    public Empregado(String nome, String telefone, int codigoSetor, double salarioBase, double imposto){
        super(nome, telefone);
        setCodigoSetor(codigoSetor);
        setSalarioBase(salarioBase);
        setImposto(imposto);
    }
    
    public void setCodigoSetor(int codigoSetor){
        this.codigoSetor = codigoSetor;
    }
    
    public void setSalarioBase(double salarioBase){
        this.salarioBase = salarioBase;
    }
    
    public void setImposto(double imposto){
        this.imposto = imposto;
    }
    
    public int getCodigoSetor(){
        return codigoSetor;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public double getImposto(){
        return imposto;
    }
    
    public double calcularSalarioBase(){
        return getSalarioBase() - (getSalarioBase() * getImposto())/100;
    }
    
    public abstract double calcularSalario();
}
