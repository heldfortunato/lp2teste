public class Prova{
	Questao questao;
	Professor professor;
	Aluno aluno;
	Curso curso;
	Disciplina disciplina;
	float periodo;
	
	
	public Prova(Questao q, Professor prof, Aluno alun, Curso cur,Disciplina dis){
		this.questao=q;
		this.professor=prof;
		this.aluno=alun;
		this.curso=cur;
		this.disciplina=dis;
	}
	public Prova(){
		this.questao=null;
		this.professor=null;
		this.aluno=null;
		this.curso=null;
		this.disciplina=null;
	}
}