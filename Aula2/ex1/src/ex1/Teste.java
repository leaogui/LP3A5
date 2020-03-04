package ex1;

public class Teste implements Runnable{

	
	int x;
	String txt;
	int m;
	
	public Teste(String txt, int m) {
		this.txt = txt;
		this.m = m;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println(txt + x);
				x += 1;
				Thread.sleep(m);
			}
		} catch (InterruptedException e){
			System.out.println("\n" + Thread.currentThread().getName() + " interrompida.");
			System.out.println("INTERROMPIDO flag: " + Thread.currentThread().isInterrupted());
		}
		System.out.println("Thread " + Thread.currentThread().getName() + " acabou.");
	}
}
