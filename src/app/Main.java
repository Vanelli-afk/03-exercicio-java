import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
        ArrayList<Pessoa> empresa = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int opcao;
        
        do{
            opcao = menu(scan);
            escolhaMenu(opcao, scan, empresa);
        }while(opcao != 5);
        
    }
    
    public static int menu(Scanner scan){
        System.out.println("========= MENU =========");
        System.out.println("1. Inclusão de Fornecedor");
        System.out.println("2. Inclusão de Funcionário");
        System.out.println("3. Listar Cadastrados");
        System.out.println("4. Folha de Pagamento");
        System.out.println("5. Sair do Sistema");
        System.out.println("========================");
        System.out.print("Insira a opção (1 - 5): ");
        
        return scan.nextInt();
    }
    
    public static void escolhaMenu(int op, Scanner scan, ArrayList<Pessoa> empresa){
        int opcaoFuncionario;
        
        switch(op){
            case 1:
                incluirFornecedor(scan, empresa);
                break;
            
            case 2:
                opcaoFuncionario = escolheFuncionario(scan);
                incluirFuncionario(opcaoFuncionario, scan, empresa);
                break;
            
            case 3:
                listarCadastrados(empresa);
                break;
            
            case 4:
                folhaPagamento(empresa);
                break;
                
            case 5:
                System.out.println("Saindo...");
                break;
                
            default:
                System.out.println("Valor Inválido.");
                break;
        }
    }
    
    public static void incluirFornecedor(Scanner scan, ArrayList<Pessoa> empresa){
        String nome, telefone;
        double valorDivida, valorCredito;
        
        scan.nextLine();
        
        System.out.print("Insira o nome: "); nome = scan.nextLine();
        System.out.print("Insira o telefone: "); telefone = scan.nextLine();
        System.out.print("Insira o valor da dívida: "); valorDivida = scan.nextDouble();
        System.out.print("Insira o valor do crédito: "); valorCredito = scan.nextDouble();
        
        Fornecedor f = new Fornecedor(nome, telefone, valorDivida, valorCredito);
        empresa.add(f);
        System.out.println("Fornecedor cadastrado!");
    }
    
    public static void incluirFuncionario(int op, Scanner scan, ArrayList<Pessoa> empresa){
        switch(op){
            case 1:
                incluirOperario(scan, empresa);
                break;
                
            case 2:
                incluirVendedor(scan, empresa);
                break;
            
            default: 
                System.out.println("Valor inválido.");
                break;
        }
    }
    
    public static void listarCadastrados(ArrayList<Pessoa> empresa){
        for(Pessoa membro : empresa){
            System.out.print(membro + "\n");
        }
    }
        
    public static void folhaPagamento(ArrayList<Pessoa> empresa){
        for(Pessoa membro : empresa){
            if(membro instanceof Empregado){
                Empregado e = (Empregado) membro;
                System.out.printf("%s - Salário: %.2f%n", e.getNome(), e.calcularSalario());
            }
        }
    }
    
    public static int escolheFuncionario(Scanner scan){
        System.out.println("1 - Operário");
        System.out.println("2 - Vendedor");
        System.out.print("Escolha: ");
        return scan.nextInt();
    }
    
    public static void incluirOperario(Scanner scan, ArrayList<Pessoa> empresa){
            String nome, telefone;
            int codigoSetor;
            double salarioBase, imposto, valorHoraExtra, horasExtras;
        
            scan.nextLine();
            
            System.out.print("Insira o nome: "); nome = scan.nextLine();
            System.out.print("Insira o telefone: "); telefone = scan.nextLine();
            System.out.print("Insira o código do setor: "); codigoSetor = scan.nextInt();
            System.out.print("Insira o salário base: "); salarioBase = scan.nextDouble();
            System.out.print("Insira o imposto: "); imposto = scan.nextDouble();
            System.out.print("Insira o valor das horas extras: "); valorHoraExtra = scan.nextDouble();
            System.out.print("Insira a quantidade de horas extras: "); horasExtras = scan.nextDouble();
    
            Operario o = new Operario(nome, telefone, codigoSetor, salarioBase, imposto, 
            valorHoraExtra, horasExtras);
            empresa.add(o);
            System.out.println("Operário cadastrado!");
    }
    
    public static void incluirVendedor(Scanner scan, ArrayList<Pessoa> empresa){
            String nome, telefone;
            int codigoSetor;
            double salarioBase, imposto, valorVendas, comissao;
            
            scan.nextLine();
            
            System.out.print("Insira o nome: "); nome = scan.nextLine();
            System.out.print("Insira o telefone: "); telefone = scan.nextLine();
            System.out.print("Insira o código do setor: "); codigoSetor = scan.nextInt();
            System.out.print("Insira o salário base: "); salarioBase = scan.nextDouble();
            System.out.print("Insira o imposto: "); imposto = scan.nextDouble();
            System.out.print("Insira o valor das vendas: "); valorVendas = scan.nextDouble();
            System.out.print("Insira a comissao: "); comissao = scan.nextDouble();
    
            Vendedor v = new Vendedor(nome, telefone, codigoSetor, salarioBase, imposto, 
            valorVendas, comissao);
            empresa.add(v);
            System.out.println("Vendedor cadastrado!");
    }
}