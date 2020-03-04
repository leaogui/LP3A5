package ex1;

import java.util.ArrayList;

public class Cbrt implements Runnable{
	
	@Override
	public void run() {
		this.Raiz3();
	}

	
	private synchronized void Raiz3() {
		ArrayList<Double> raiz = new ArrayList();
		raiz.clear();
		for(int a = 1; a <= 1000; a ++) {
			if(a % 2 == 0) {
				raiz.add(Math.cbrt(a));	
			}
		}
		Repo.setRep(raiz);
		Repo.print();
	}
}
