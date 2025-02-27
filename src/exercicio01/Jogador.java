package exercicio01;

public class Jogador {

    //ATRIBUTOS (variavel/vetor/matrix)
    String nome;
    int[] pontuacoes = new int[3];

    //METODO PARA CALCULAR E RETORNAR O SCORE TOTAL
    public int calcularPuntuacaoTotal(){
        int total = 0;

        for(int i : pontuacoes) {
            total += i;
        }
        return total;
    }
}
