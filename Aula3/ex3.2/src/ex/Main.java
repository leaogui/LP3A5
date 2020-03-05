package ex;

public class Main {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		Runnable rConsu = new Consumir(pilha);
		Thread tConsu = new Thread(rConsu);
		Runnable rProd = new Produzir(pilha);
		Thread tProd = new Thread(rProd);
		
		tConsu.start();
		tProd.start();
	}
	
}
