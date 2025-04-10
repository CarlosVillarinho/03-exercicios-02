package exercicio04;

import ecercicio03.Pontos;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //variaveis locais
        Funcionarios f;
        String nome, cargo;
        double salario, porcentagem;

        //ENTRADA DE DADOS
        System.out.print("Informe o nome do funcionario: ");
        nome = entrada.next();
        System.out.print("Cargo do funcionario: ");
        cargo = entrada.next();
        System.out.print("Salario do funcionario: ");
        salario = entrada.nextDouble();

        f = new Funcionarios(nome, cargo, salario);

        //AUMENTAR O SALARIO DE ACORDO COM UMA PORCENTAGEM
        System.out.print("Informe a porcentagem de aumento (0 - 100): ");
        porcentagem = entrada.nextDouble();
        f.aumentoSalario(porcentagem);
        System.out.println("Novo salario R$ " + f.salario);

        //AUMENTAR O SALARIO D ACORDO COM O CARGO E UMA PORCENTAGEM
        System.out.println();
        System.out.print("Informe a porcentagem de aumento (0 - 100): ");
        porcentagem = entrada.nextDouble();
        System.out.println("Informe o cargo que tera aumento: ");
        cargo = entrada.next();
        f.aumentoSalario(cargo, porcentagem);
        System.out.println("Novo salario R$ " + f.salario);

    }
}
