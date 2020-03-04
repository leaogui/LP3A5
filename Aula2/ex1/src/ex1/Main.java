package ex1;

public class Main {
	
	
	public static void main(String[] args) {
		Runnable obj = new Teste("Num: ", 200);
		Thread t = new Thread(obj);
		t.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException a){
			
		}
		
		t.interrupt();
		System.out.println("\nThread " + Thread.currentThread().getName() + " Acabou!");
	}

}
