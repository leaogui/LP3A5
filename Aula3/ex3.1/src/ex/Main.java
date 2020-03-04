package ex;

public class Main {
	
	public static void main(String[] args) {
		Runnable obj = new Teste();
		Thread t = new Thread(obj);
		t.start();
	}

}
