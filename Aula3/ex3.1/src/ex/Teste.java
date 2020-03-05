package ex;

public class Teste {

private volatile int x = -1;
	
	public boolean isSet() {
		return x != -1;
	}
	
	public synchronized boolean set(int v) {
		try {
			while(isSet()) {
				wait();
			}
			x = v;
			System.out.println(Thread.currentThread().getName() + ": Produziu: " + x);
			notify();
			return true;
		}catch(InterruptedException e) {
			return false;
		}
	}
	
	public synchronized boolean reset() {
		try {
			while(!isSet()) {
				wait();
			}
			System.out.println(Thread.currentThread().getName() + ": Consumiu: " + x);
			x = -1;
			notify();
			return true;
		}catch(InterruptedException e) {
			return false;
		}
	}
	
}
