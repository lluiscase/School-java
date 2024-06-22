package Pessoa;

import java.util.Scanner;

/**
 *
 * @author luis_andrade
 */
public abstract class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCPF(){
        return this.cpf;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setAtributos(String cpf, String nome, int idade){
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public abstract void exibirDados();
    
    public static void main(String[] args) throws MatriculaInvalidaException {
        try {
        	Scanner sc = new Scanner(System.in);
        	/*Objeto Aluno sendo criado abaixo*/
        	Aluno novoAluno = new Aluno();
        	novoAluno.setAtributos("505.833.698-71","luis",20);
        	novoAluno.realizarMatricula(195178,"C.C");
        	novoAluno.exibirDados();
        	//Objeto Professor sendo criado abaixo
        	Professor professorDis = new Professor();
        	professorDis.setAtributos(5, 1800.50, "Calculo 2");
        	professorDis.setAtributos("525.847.798-96", "Bahia", 45);
        	professorDis.darAula(2);
        	professorDis.exibirDados();
        	//Objeto Funcionario sendo criado abaixo
        	Funcionario novoFunc = new Funcionario();
        	novoFunc.setAtributos("879.435.974-21", "Malu", 91);
        	novoFunc.setAttributes("Gerente", "Admnistrativo");
        	novoFunc.exibirDados();
        	novoFunc.executarTarefa("Preencher planilhas");
        	//Visualização do curso
        	Curso visuGeral = new Curso();
        }catch(MatriculaInvalidaException e) {
        	System.err.println(e.getMessage());
        }
    }

}
