
package Pessoa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luis_andrade
 */
public class Aluno extends Pessoa {
    private int matricula;
    private String curso;
    
    public void realizarMatricula(int matricula, String Novocurso) throws MatriculaInvalidaException{
    	this.matricula = matricula;
    	this.curso = curso;
    	if(matricula == 0) {
    		throw new MatriculaInvalidaException("Matricula não encontrada");
    	}
    		else {
    		System.out.println("Curso cadastrado: "
    				+ this.curso + 
    				"\n Matricula do aluno: " + 
    				this.matricula);
    	}
    }
    
    public String getCurso(){
        return curso;
    }
    
    public int getMatricula() {
    	return this.matricula;
    }
    
    @Override
    public void exibirDados(){
        System.out.println("Nome: " + super.getNome() + 
        		"\n CPF: " + super.getCPF() + 
        		"\n Idade: " + super.getIdade() + 
        		"\n Matricula: " + getMatricula() + 
        		"\n Curso: " + getCurso());
    }
    
}
