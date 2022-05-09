package holerite;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        CalculoInss D1 = new CalculoInss();
        CalculoVT D2 = new CalculoVT();
        double SalarioBruto, SalaarioLiquido;
        String Nome;
        System.out.println("Insira o nome do funcionário: ");
        Nome = tc.nextLine();

        System.out.println("Insira o salário do Funcionário: ");
        SalarioBruto = tc.nextDouble();
       //D1.Salario1 = SalarioBruto;
        //D2.Salario2 = SalarioBruto;

        D1.CalculoDescontoInss(SalarioBruto);
        D2.CalculoDescontoVt(SalarioBruto);
        
        
        System.out.println(Nome);
        System.out.printf("%.2f%n", D1.DescontoInss);
        System.out.printf("%.2f%n", D2.DescontoVt);
        //teste
        //teste1
    }

}
