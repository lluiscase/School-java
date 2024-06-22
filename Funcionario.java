package Pessoa;

public class Funcionario extends Pessoa{
	private String cargo;
	private String setor;
	private String tarefaExecutada;
	
	public String get(String attribute) {
	    switch(attribute) {
	        case "cargo":
	            return cargo;
	        case "setor":
	            return setor;
	        case "tarefaexecutada":
	            return tarefaExecutada;
	        default:
	            return "Invalid attribute";
	    }
	}
	
	public void setAttributes(String cargo, String setor) {
		this.cargo = cargo;
		this.setor = setor;
	}
	
	public void executarTarefa(String tarefa) {
		tarefa = this.tarefaExecutada;
		System.out.println("Tarefa atual: " + tarefa);
	}
	
	@Override
    public void exibirDados(){
        System.out.println("Nome: " + super.getNome() + 
        		"\n CPF: " + super.getCPF() + 
        		"\n Idade: " + super.getIdade()  
        		);
    }

}
