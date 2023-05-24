package view;

import br.edu.fateczl.arvoreint.Arvore;

public class Principal {

	public static void main(String[] args) throws Exception{
		int[] vetor = {33,15,41,38,47,34,49,43};
		Arvore arvore = new Arvore();
		for(int i: vetor) {
			arvore.insert(i);
		}
		arvore.prefixSearch();
		System.out.println("");
		arvore.infixSearch();
		System.out.println("");
		arvore.postfixSearch();		
	}
}
