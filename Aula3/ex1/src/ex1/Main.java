package ex1;

public class Main {

		public static void main(String[] args) {
			
			Runnable obj1 = new Sqrt();
			Runnable obj2 = new Cbrt();
			
			Thread t1 = new Thread(obj1);
			Thread t2 = new Thread(obj2);
			
			Object obj = new Object();
			
			synchronized(obj) {
			t1.start();
			t2.start();
		}
			}
}
