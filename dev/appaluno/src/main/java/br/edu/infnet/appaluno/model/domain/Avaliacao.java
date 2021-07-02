package br.edu.infnet.appaluno.model.domain;

public abstract class Avaliacao {

	private String disciplina;
	private int pontos;
	private int data;
	
	public Avaliacao() {
	super();
	}
	
	public Avaliacao(String disciplina, int pontos){ //int data) 
	this.disciplina = disciplina;
	this.pontos = pontos;
	//this.data = data;
	}
	
	public abstract float CalcularPontos() ;
	
//	public int CalcularNotas() {
//		return 10
//	}
	
//	public int CalcularPontos() {
//	 return 3
//}
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(this.disciplina);
		sb.append(";");
		sb.append(this.pontos);
//		sb.append(";");
//		sb.append(this.data);
		
		return sb.toString();
	}
	
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public float getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
//	public int getData() {
//		return data;
//	}
//	public void setData(int data) {
//		this.data = data;
//	}
	
}
