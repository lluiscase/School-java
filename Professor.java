package Pessoa;

/**
 *
 * @author luis_andrade
 */
public class Professor extends Pessoa{
    private double salario;
    private String disciplina;
    private int quantidadeAulaDada = 0;
    
    public double getSalario(){
        return this.salario;
    }
    
    public String getDisciplina(){
        return this.disciplina;
    }
    
    public int getQuantidade(){
        return this.quantidadeAulaDada;
    }
    
    public void setAtributos(int quantidadeAulaDada, double salario, String disciplina){
        this.quantidadeAulaDada = quantidadeAulaDada;
        this.salario = salario;
        this.disciplina = disciplina;
    }
    
    public int darAula(int qtdadeaula) {
    	return qtdadeaula + quantidadeAulaDada;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Nome: " + super.getNome() + 
        		"\n CPF: " + super.getCPF() + 
        		"\n Idade: " + super.getIdade() + 
        		"\n Salario: " + getSalario() + 
        		"\n Disciplina: " + getDisciplina() +
        		"\n Quantidade de aula na semana: " + darAula(quantidadeAulaDada));
    }
}
