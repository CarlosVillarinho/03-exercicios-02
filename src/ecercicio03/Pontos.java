package ecercicio03;

public class Pontos {

    //ATRIBUTOS ou VARIAVEIS DE INSTANCIA (variavel/vetor/matrix)
   int x;
   int y;

    //METODO PARA CALCULAR E RETORNAR A DISTANCIA ENTRE OS DOIS PONTOS
    public double calculaDistancia(Pontos p){
        double distancia;
        distancia = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));

        return distancia;
    }

    //METODO PARA CALCULAR E RETORNAR DE UM PONTO ATE A ORIGEM
    public double calcularOrigem(){
        double distancia;
        Pontos origem = new Pontos();
        //NAO PRECISA PQ TODA | origem.x = 0;
        //VARIAVEL NUMERICA INICIALIZA COMO ZERO | origem.y = 0;
        distancia = calculaDistancia(origem);

        return distancia;
    }

    //METODO PARA RETORNAR OS DADOS DO PONTO
    public String formatarPonto(){
        return "(" + x + "," + y + ")";
    }

    //METODO PARA RETORNAR O PONTO MAIS PROXIMO DA ORIGEM
    public Pontos maisProximoDaOrigem(Pontos p1, Pontos p2){
        double dp1 = p1.calcularOrigem();
        double dp2 = p1.calcularOrigem();
        if(dp1 < dp2){
            return p1;
        }
        return p2;
    }
}
