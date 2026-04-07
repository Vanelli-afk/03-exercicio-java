package model;

public class Operario extends Empregado {
    private double valorHoraExtra;
    private double horasExtras;
    
    public Operario(String nome, String telefone, int codigoSetor, double salarioBase, double imposto, 
    double valorHoraExtra, double horasExtras){
        super(nome, telefone, codigoSetor, salarioBase, imposto);
        setValorHoraExtra(valorHoraExtra);
        setHorasExtras(horasExtras);
    }
    
    public void setValorHoraExtra(double valorHoraExtra){
        this.valorHoraExtra = valorHoraExtra;
    }
    
    public void setHorasExtras(double horasExtras){
        this.horasExtras = horasExtras;
    }
    
    public double getValorHoraExtra(){
        return valorHoraExtra;
    }
    
    public double getHorasExtras(){
        return horasExtras;
    }
    
    @Override
    public double calcularSalario(){
        return super.calcularSalarioBase() + (getValorHoraExtra() * getHorasExtras());
    }
    
    @Override
    public String toString(){
        return String.format("%s  |  Salário: %.2f", super.toString(), calcularSalario());
    }
}