package ex;

public class Produzir implements Runnable{

private Pilha pilha;
	
	public Produzir(Pilha pilha) {
		this.pilha = pilha;
	}
	
	@Override
	public void run() {
		
		char[] alfabeto = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		for (int i = 0; i < 26; i++) {
			
			pilha.push(alfabeto[i]);
			
		}
		
	}
	
	
}
