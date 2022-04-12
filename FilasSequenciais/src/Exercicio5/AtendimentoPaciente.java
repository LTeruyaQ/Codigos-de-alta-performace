package Exercicio5;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import FilasSequenciais.FilasSequenciaisInt;
import FilasSequenciais.FilasSequenciaisString;

public class AtendimentoPaciente {

	public static void main(String[] args) {

		FilasSequenciaisString fila = new FilasSequenciaisString();
		fila.init();

		String aux = "Escolha uma opção: \n1. Cadastrar Paciente\n2. Atender Paciente\n3. Encerrar.";

		int opcao;
		String nome;
		boolean end = false;

		do {

			opcao = parseInt(showInputDialog(aux));

			if (opcao < 1 || opcao > 3) {
				showMessageDialog(null, "Opção invalida");
			}

			else {

				switch (opcao) {

				case 1:
					nome = showInputDialog("Informe o Nome do Paciente que que sera atendido.");

					if (fila.isFull())
						showMessageDialog(null, "Atingimos o maximo de Paciente na fila.");

					else {

						fila.enqueue(nome);
						showMessageDialog(null, "O Paciente " + nome + " esta na fila de espera.");
					}

					break;

				case 2:

					if (fila.isEnpty())
						showMessageDialog(null, "Nenhum Cliente a ser atendido.");

					else {
						nome = fila.firstElem();

						showMessageDialog(null, "Atendendo o Paciente " + nome + " ...");
						fila.dequeue();
					}

					break;

				case 3:

					if (!fila.isEnpty()) {
						showMessageDialog(null, "Ainda temos Clientes na fila de espera.");
						end = true;
					}

					else
						opcao = 0;
					break;
				}
			}
		} while (opcao != 3);
	}
}
