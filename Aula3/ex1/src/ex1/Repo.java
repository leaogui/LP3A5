package ex1;

import java.util.ArrayList;

public class Repo{
	
	static ArrayList<Double> rep = new ArrayList<Double>();

	public static ArrayList<Double> getRep() {
		return rep;
	}

	public static void setRep(ArrayList<Double> repo) {
		rep = repo;
	}

	
	public synchronized static void print() {
		ArrayList<Double> repo = getRep();
		for(int i = 0; i < repo.size(); i++) {
			System.out.println("Raiz: " + repo.get(i));
		}
	try {
	
		Thread.sleep(50);
	}catch(InterruptedException e){
		
	}
	}
}
