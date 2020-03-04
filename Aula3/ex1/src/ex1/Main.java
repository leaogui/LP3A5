package ex1;

public class Main {

		public static void main(String[] args) {
			Runnable obj = new Teste();
			Thread t1 = new Thread(obj);
			t1.start();
		}
}
