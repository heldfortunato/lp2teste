public class Questao{
	String pergunta;
	int numero;
	Resposta resp;
	public Questao(int numero, String pergunta,String resposta){
		this.numero=numero;
		this.pergunta=pergunta;
		this.resp= new Resposta(resposta);
	}
	public Questao(){
		this.pergunta=null;
		this.numero=0;
		this.resp= new Resposta();
	}
	public void setPergunta(String pergunta){
		this.pergunta=pergunta;
	}
	public void setNumero(int numero){
		this.numero=numero;
	}
	public void setResp(String resposta){
		this.resp.setResposta(resposta);
	}
	public String getPergunta(){
		return this.pergunta;
	}
	public int getNumero(){
		return this.numero;
	}
	public String getResp(){
		return this.resp.getResposta();
	}
}
