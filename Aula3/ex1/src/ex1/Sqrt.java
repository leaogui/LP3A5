package ex1;

import java.util.ArrayList;

public class Sqrt implements Runnable{
	
	@Override
	public void run() {
		this.Raiz2();
	}

	
	private synchronized void Raiz2() {
		ArrayList<Double> raiz = new ArrayList();
		raiz.clear();
		for(int a = 2; a <= 100; a ++) {
			if(a % 2 != 0) {
				raiz.add(Math.sqrt(a));	
			}
		}
		Repo.setRep(raiz);
		Repo.print();
	}
}
