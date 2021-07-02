package br.edu.infnet.appaluno.model.testes;

import br.edu.infnet.appaluno.model.domain.Atividade;
import br.edu.infnet.appaluno.model.domain.Comportamento;
import br.edu.infnet.appaluno.model.domain.Prova;

public class AvaliacaoTeste {

	public static void main(String[] args) {
		
		Atividade ativ1 = new Atividade("Português", 2);//?por que esse contrutor funciona somente com os parâmetros da mãe? Não precisa colocar os parâmentros da classe atividade?
		ativ1.setTipo(1);
		ativ1.setDescricao("Aula invertida");								
		System.out.println("Atividade: " + ativ1);
		
		Prova prov1 = new Prova("História", 7);
		prov1.setNotaAv1(8);
		prov1.setNotaAv2(10);
		System.out.println("Prova: " + prov1);
	
		Comportamento comp1 = new Comportamento("Matemática", 3);
		comp1.setHabilidade("Trabalhou Duro");
		comp1.setFeedback(true);
		System.out.println("Comportamento: " + comp1);
	}
}
