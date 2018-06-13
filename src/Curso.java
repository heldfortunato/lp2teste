public class Curso{
	private int codigo;
	private String nome;
	public Curso(){
		this.codigo=null;
		this.nome=null;
	}
	public Curso(String nome, int codigo){
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
