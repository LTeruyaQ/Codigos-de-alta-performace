package FilasSequenciais;

public class FilasSequenciaisInt {

	public final int n = 3;
	int[] dados = new int[n];
	int ini, fim, cont;

	public void init() {
		ini = fim = 0;
	}

	public boolean isEnpty() {
		if (cont == 0)
			return true;
		else
			return false;
	}

	public boolean isFull() {
		if (cont == n)
			return true;
		else
			return false;
	}

	public void enqueue(int elem) {
		if (isFull())
			System.out.println("Fila cheia!");

		else {
			dados[fim] = elem;
			fim = (fim + 1) % n;
			cont++;
		}
	}

	public int dequeue() {
		int e = dados[ini];
		ini = (ini + 1) % n;
		cont--;

		System.out.println("O valor " + e + " foi retirado da fila");

		return e;
	}

	public void first() {
		int e = dados[ini];
		System.out.println("O valor " + e + " é o primeiro da Fila");
	}

	public int firstElem() {
		int e = dados[ini];
		System.out.println("O valor " + e + " é o primeiro da Fila");

		return e;
	}

	public int teste() {
		return cont;
	}
}
