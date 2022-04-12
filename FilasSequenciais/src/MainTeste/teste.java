package MainTeste;

import FilasSequenciais.FilasSequenciaisInt;

public class teste {

	public static void main(String[] args) {

		FilasSequenciaisInt fila = new FilasSequenciaisInt();
		fila.init();

		fila.enqueue(23);
		fila.first();
		fila.dequeue();
		fila.first();
		fila.enqueue(66);
		fila.enqueue(17);
		fila.enqueue(66);
		fila.first();

		fila.dequeue();
		fila.dequeue();

		fila.first();

	}

}
