package ex;

public class ProduzirConsumir {
	
	public static void main(String[] args) {
		
		Teste o = new Teste();
		
		String[] names = {"Con1", "Con2", "Pro1", "Pro2"};
		
		Thread[] threads = {
				
				new Thread(new Consumir(o)), new Thread(new Consumir(o)),
				new Thread(new Produzir(o)), new Thread(new Produzir(o))
		};
		
		for(int i = 0; i < threads.length; i++) {
			
			threads[i].setName(names[i]);
			threads[i].start();
		}
		
		try {
			
			for (Thread t : threads) {
				t.join(15000);
				
				if (t.isAlive()) {
					t.interrupt();
				}
			}
		} catch (InterruptedException ignored) {}
		
		System.out.println("Finalizado");
	}

}
