package FilasSequenciais;

public class FilasSequenciaisString {

	public final int n = 3;  
	String[] dados = new String[n];
	int ini, fim, cont;
	
	public void init() {
		ini = fim = 0;
	}
	
	public boolean isEnpty() {
		if(cont == 0)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(cont == n)
			return true;
		else
			return false;
	}
	
	public void enqueue(String elem) {
		if(isFull())
			System.out.println("Fila cheia!");
		
		else {
			dados[fim] = elem;
			fim = (fim+1) % n;
			cont++;
		}
	}
	
	public String dequeue() {
		String e = dados[ini];
		ini = (ini+1) % n;
		cont--;

		System.out.println("O valor " + e + " foi retirado da fila");
		
		return e;
	}
	
	public void first() {
		String e = dados[ini];	
		System.out.println("O valor " + e + " é o primeiro da Fila");
	}
	
	public String firstElem() {
		String e = dados[ini];	
		System.out.println("O valor " + e + " é o primeiro da Fila");
		
		return e;
	}
	
}
