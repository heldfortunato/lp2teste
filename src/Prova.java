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
	public void setProfessor(String nome, int matricula){
		this.professor.setNome(nome);
		this.professor.setMatricula(matricula);
	}
	public String getProfessorNome(){
		return this.professor.getNome();
	}
	public String getProfessorMatricula(){
		return (Integer.parseInt(this.professor.getMatricula(0)));
	}
	public void setAluno(String nome, int matricula){
		this.aluno.setNome(nome);
		this.aluno.setMatricula(matricula);
	}
	public String getAlunoNome(){
		return this.aluno.getNome();
	}
	public String getAlunoMatricula(){
		return (Integer.parseInt(this.aluno.getMatricula()));
	}
	public void setCurso(String nome, int codigo){
		this.curso.setNome(nome);
		this.curso.setCodigo(codigo);
	}
	public String getCursoNome(){
		return this.curso.getNome();
	}
	public String getCursoCodigo(){
		return (Integer.parseInt(this.curso.getCodigo()));
	}
	public void setDisciplina(String disciplina, int codigo){
		this.disciplina.setNome(disciplina);
		this.disciplina.setCodigo(codigo);
	}
	public String getDisciplinaNome(){
		return this.disciplina.getNome();
	}
	public String getDisciplinaCodigo(){
		return (Integer.parseInt(this.disciplina.getCodigo()));
	}
	public void setQuestao(String pergunta, int numero, String reposta){
		this.questao.setPergunta(pergunta);
		this.questao.setNumero(numero);
		this.questao.setResposta(reposta);
	}
	public String getQuestaoPergunta(){
		return this.questao.getPergunta();
	}
	public String getQuestaoNumero(){
		return (Integer.parseInt(this.questao.numero()));
	}
	public String getQuestaoResposta(){
		return this.questao.getResposta();
	}
}