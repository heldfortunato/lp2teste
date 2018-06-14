public class Professor{
	private String nome;
	private int matricula;
	
	
	public Professor(){
		this.nome=null;
		this.matricula=0;
	}
	public Professor (String nome, int matricula){
		this.nome=nome;
		this.matricula=matricula;
	}
	public int getMatricula(){
		return this.matricula;
	}
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setMatricula(int matricula){
		this.matricula=matricula;
	}
	
}