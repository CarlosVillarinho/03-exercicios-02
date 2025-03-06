package exercicio04;

public class Funcionarios {

    //ATRIBUTOS
    String nome, cargo;
    double salario;

    //construtor para inicializar os atributos com valores recebidos por parametors
    public Funcionarios(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    //METODO PARA AUMENTO DE SALARIO DOS FUNCIONARIOS;
    public void aumentoSalario(double porcentagem){
        salario = salario + (salario * porcentagem / 100);
    }

    //METODO PARA AUMENTO DE SALARIO DOS FUNCIONARIOS DE ACORDO COM O CARGO;
    //pode repetir o metodo, mas nao os parametros (SOBRECARGA)!
    public void aumentoSalario(String cargo, double porcentagem){
        if (this.cargo.equalsIgnoreCase(cargo)){
            salario = salario + (salario * porcentagem / 100);
        }
    }

    //METODO PARA PROMOCOES/PROMOVER FUNCIONARIOS
    public void promover(String cargo){
        this.cargo = cargo;
    }
}
