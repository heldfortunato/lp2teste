public class Disciplina{
	private int codigo;
	private String nome;
	public Disciplina(){
		this.codigo=0;
		this.nome=null;
	}
	public Disciplina(String nome, int codigo){
		this.codigo=codigo;
		this.nome=nome;
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public void setCodigo(int codigo){
		this.codigo=codigo;
	}
	public String getNome(){
		return this.nome;
	}
	public int getCodigo(){
		return this.codigo;
	}
}
