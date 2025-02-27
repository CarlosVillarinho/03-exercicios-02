package exercicio01;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //VARIAVEL (referencia o objeto)
        Jogador jogador = new Jogador();

        //ENTRADA DE DADOS
            System.out.println("----- TriScore -----");
            System.out.print("Nome do jogador: ");
            jogador.nome = entrada.nextLine();

            for(int i=0;i<jogador.pontuacoes.length;i++){
                System.out.print("Rodada N°" + (i+1) + ": ");
                jogador.pontuacoes[i] = entrada.nextInt();
            }

            //SAIDA DE DADOS
        System.out.println();
        System.out.println("Nome: " + jogador.nome);
        System.out.println("Pontuacao Total: " + jogador.calcularPuntuacaoTotal());
    }
}

