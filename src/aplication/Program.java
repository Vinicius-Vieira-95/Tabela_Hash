package aplication;

import hash.tabela.Hash;

public class Program {

	public static void main(String[] args) {
		
		Hash<String> h = new Hash<String>(10);
		
		
		System.out.println(h.chaveDivisao(2,20 ));
		System.out.println(h.chaveMultiplicacao(12345, 20));
		
		System.out.println(h.chaveDobra(10, 20));
		
		System.out.println(h.valorString("cama"));
		System.out.println(h.valorString("maca"));
		
		System.out.println(h.insererHash_SemColisao("Vini"));
		System.out.println(h.insererHash_SemColisao("Ceci"));
		System.out.println(h.insererHash_SemColisao("Marcia"));
		System.out.println(h.insererHash_SemColisao("Alfredo"));
		
		String nome = h.buscaHash_SemColisão("Vini");
		System.out.println(nome);
		
	}

}
