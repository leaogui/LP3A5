package ex;

public class Pilha {
	
	private char pilha[] = {' ', ' ', ' ', ' ', ' ', ' '};
	
	private int x;
	
	public Pilha() {
		this.x = 0;
	}

	public synchronized char pop() {
		
		try {
			while (x == 0) {
				wait();
			}
			
			char retorno = this.pilha[this.x-1];
			this.x --;
			notifyAll();
			
			return retorno;
			
		} catch(InterruptedException e) {
			return ' ';
		}
	}
	
	public synchronized void push(char c) {
		
		try {
			
			while(this.x == 6) {
				wait();
			}
			
			this.pilha[this.x] = c;
			
			this.x ++;
			notifyAll();
			
		} catch(InterruptedException e) {
			
		}
		
	}

}
