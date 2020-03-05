package ex;

public class Consumir implements Runnable{
	
	private Teste x;
	private static final int TENTATIVAS = 3;
	
	public Consumir(Teste y) {
		this.x = y;
	}
	
	@Override 
	public void run() {
		for (int i = 0 ; i < TENTATIVAS ; i++) {
			if (!x.reset())
				break;
		}
		
		System.out.println(Thread.currentThread().getName() + ": Consumir finalizado.");
	}

}
