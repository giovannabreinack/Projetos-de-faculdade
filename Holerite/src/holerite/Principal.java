package holerite;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
    Scanner tc = new Scanner(System.in);
    CalculoInss D1 = new CalculoInss();
    double SalarioBruto,SalaarioLiquido;
    String Nome ;
        System.out.println("Insira o nome do funcionário: ");
        Nome = tc.nextLine();
        
        System.out.println("Insira o salário do Funcionário: "); 
        SalarioBruto = tc.nextDouble();
        D1.Salario = SalarioBruto;
        
        D1.CalculoDescontoInss();
        
        
        System.out.println(Nome);
        System.out.println(D1.DescontoInss);
        
        
        
        
    }
    
}

