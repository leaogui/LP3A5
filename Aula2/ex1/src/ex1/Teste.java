package ex1;

public class Teste implements Runnable{

	
	int x;
	String text;
	int mili;
	
	public Teste(String txt, int m) {
		this.text = text;
		this.mili = mili;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				System.out.println(text + x);
				x += 1;
				Thread.sleep(mili);
			}
		} catch (InterruptedException e){
			System.out.println("\n" + Thread.currentThread().getName() + " interrompida.");
			System.out.println("INTERROMPIDO flag: " + Thread.currentThread().isInterrupted());
		}
		System.out.println("Thread " + Thread.currentThread().getName() + " Acabou.");
	}
}
