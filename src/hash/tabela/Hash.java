package hash.tabela;

public class Hash <T>{
	
	public int quant;
	public T tabela [];
	
	
	public Hash(int tamanho) {
		tabela = (T[]) new Object [tamanho];
	}
	
	
	public boolean insererHash_SemColisao(T object) {
		if(object == null || quant == tabela.length) {
			return false;
		}
		
		// deve colocar a chave como elemento de busca. String ou Inteiro
		//	int chave = object.TipoInteiro
		int chave = valorString(object.toString());		
		
		int pos = chaveDivisao(chave, tabela.length);
		T novoElemento = (T) new Object();
		novoElemento = object;
		tabela[pos] = (T) novoElemento;
		this.quant++;
		return true;
	}
	
	public T buscaHash_SemColisão(String chave) {
		int num = valorString(chave);
		int pos = chaveDivisao(num, tabela.length);
		
		if(tabela[pos] == null) {
			return null;
		}
		T elemento = tabela[pos];
		return elemento;
	}
	
	// Metodos para calcular os tipos de chave.
	public int chaveDivisao(int chave, int tabela_size) {
		return (chave & 0x7FFFFFFF) % tabela_size;
	}
	
	public int chaveMultiplicacao(int chave, int tabela_size) {
		double a = 0.6180339887; //constante: 0 < A < 1
		double valor = chave * a;
		valor = valor - (int) valor;
		return (int) (tabela_size * valor);
	}
	
	public int chaveDobra(int chave, int tabela_size) {
		int num_bits = 5;
		int parte1 = chave >> num_bits;
		int parte2 = chave & (tabela_size - 1);
		return (parte1 ^ parte2);
	}
	
	//passando um valor String para Inteiro
	public int  valorString(String str) {
		int valor = 7;
		int tamanho = str.length();
		//calculo pegando cada caracter da string
		for(int i = 0; i < tamanho; i++) {
			valor = 31 * valor + str.charAt(i);
		}
		return valor;
	}
	
	
	
	
	
	
	
	
	
}
