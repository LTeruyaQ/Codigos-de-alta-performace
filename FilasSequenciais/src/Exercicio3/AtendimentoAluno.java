package Exercicio3;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

import FilasSequenciais.FilasSequenciaisInt;

public class AtendimentoAluno {

	public static void main(String[] args) {

		FilasSequenciaisInt fila = new FilasSequenciaisInt();
		fila.init();

		String aux = "Escolha uma opção: \n1. Cadastro de Alunos \n2. Atender aluno \n3. Encerrar.";

		int opcao, rm = 0;
		boolean end = false;

		do {
			opcao = parseInt(showInputDialog(aux));

			if (opcao < 1 || opcao > 3) {
				showMessageDialog(null, "Opção invalida");
			}

			else {

				switch (opcao) {

				case 1:

					if (fila.isFull())
						showMessageDialog(null,
								"Atingimos o maximo de alunos para atendimento, aguarde alguém ser atendido.");

					else {

						rm = parseInt(showInputDialog("Informe o RM do Aluno que deseja ser atendido."));

						fila.enqueue(rm);
						showMessageDialog(null, "O Aluno de RM: " + rm + " esta na fila de espera.");
					}
					break;

				case 2:

					if (fila.isEnpty())
						showMessageDialog(null, "Não ah Alunos na espera.");

					else {
						rm = fila.firstElem();

						showMessageDialog(null, "O Aluno de RM: " + rm + " será atendido agora.");
						fila.dequeue();
					}
					break;

				case 3:
					if (!fila.isEnpty()) {
						showMessageDialog(null, "Ainda temos alunos para serem atendidos.");
					}

					else
						opcao = 0;
					break;
				}
			}
		}

		while (opcao != 3);
	}
}
