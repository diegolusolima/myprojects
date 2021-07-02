package br.edu.infnet.appaluno.model.domain;

public class Atividade extends Avaliacao {

	private String descricao;
	private int tipo;
	//private boolean emGrupo;
	
	public Atividade() {
		super();
	}
	
	public Atividade(String disciplina, int pontos) {
		super(disciplina, pontos);
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());//getPontos()
		sb.append(";");
		sb.append(this.descricao);
		sb.append(";");
		sb.append(this.tipo);
		sb.append(";");
		sb.append(this.CalcularPontos()); //método abstrato
	
		return sb.toString();
	}
	
	@Override
	public float CalcularPontos() {
		// TODO Auto-generated method stub
		return 9;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

//	public boolean isEmGrupo() {
//		return emGrupo;
//	}
//
//	public void setEmGrupo(boolean emGrupo) {
//		this.emGrupo = emGrupo;
//	}

}
