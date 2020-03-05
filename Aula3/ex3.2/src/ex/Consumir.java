package ex;

public class Consumir implements Runnable{
	
private Pilha pilha;
	
	public Consumir(Pilha pilha) {
		this.pilha = pilha;
	}

	@Override
	public void run() {
		
		while(true) 
			
			System.out.println( pilha.pop());
		
	}

}
