package ex;

import java.util.Random;

public class Produzir implements Runnable{

	private Teste x;
	private static final int TENTATIVAS = 3;
	
	public Produzir(Teste x) {
		this.x = x;
	}
	
	@Override
	public void run() {
		
		for (int i = 0 ; i < TENTATIVAS ; i++) {
			
			if (!x.set(new Random().nextInt(1000)))
				break;
		}
		System.out.println(Thread.currentThread().getName() + ": Produzir finalizado.");
	}
	
}
