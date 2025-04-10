package ecercicio03;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        DecimalFormat formato = new DecimalFormat( "0.000");
        Scanner entrada = new Scanner(System.in);

        Pontos p1 = new Pontos();
        Pontos p2 = new Pontos();

        //ENTRADA DE DADOS
        System.out.println("Informe as coordenadas do ponto 1:");
        p1.x = entrada.nextInt();
        p1.y = entrada.nextInt();
        System.out.println();
        System.out.println("Informe as coordenadas do ponto 2:");
        p2.x = entrada.nextInt();
        p2.y = entrada.nextInt();

        //IMPRESSAO DA DISTANCIA ENTRE OS DOIS PONTOS
        System.out.println();
        System.out.println("Distancia de p1 para p2: " + formato.format(p1.calculaDistancia(p2)));
        System.out.println("Distancia de p2 para p1: " + formato.format(p2.calculaDistancia(p1)));

        //IMPRESSAO DA DISTANCIA DE CADA PRONTO ATE A ORIGEM
        System.out.println();
        System.out.println("Distancia do p1 ate a origem: " + formato.format(p1.calcularOrigem()));
        System.out.println("Distancia do p2 ate a origem: " + formato.format(p2.calcularOrigem()));

        //IMPRESSAO DO PONTO MAIS PROXIMO DA ORIGEM
        System.out.println();
        Pontos aux = Pontos.maisProximoDaOrigem(p1, p2);
        System.out.println(aux.formatarPonto());
    }
}
