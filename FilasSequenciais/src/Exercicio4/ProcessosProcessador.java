package Exercicio4;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import FilasSequenciais.FilasSequenciaisInt;

public class ProcessosProcessador {

	public static void main(String[] args) {

		FilasSequenciaisInt fila = new FilasSequenciaisInt();
		fila.init();
		
		String aux = "Escolha uma opção: \n1. Submeter processo \n2. Processar \n3. Encerrar.";
		
		int opcao, pid = 0;
		
		do {
			opcao = parseInt(showInputDialog(aux));
			
			
			
			if(opcao <1 || opcao > 3) {
				showMessageDialog(null, "Opção invalida");	
			}
			
			else {
				
				switch(opcao) {
					case 1: 
						pid = parseInt(showInputDialog("Informe o PID do Processo que deseja submeter."));
				
						if(fila.isFull())
							showMessageDialog(null, "Atingimos o maximo de Processos na fila.");	
						
						else {
							fila.enqueue(pid);
							showMessageDialog(null, "O Processo : " + pid +  " esta na fila de processos.");
						}
				
				break;
			
				case 2:
				
				if(fila.isEnpty())
					showMessageDialog(null, "Nenhum processo a ser executado.");	
			
				else {
				pid = fila.firstElem();
				
				showMessageDialog(null, "Executando o Processo " + pid +  " ...");	
	
				String processado = showInputDialog("O Processo " + pid + " foi executado?");
				
				if(processado.equalsIgnoreCase("sim") == false 
				&& processado.equalsIgnoreCase("não") == false){
	
					boolean erro = true;				
					
					while(erro == true){
						processado = showInputDialog("O Processo  " + pid + " foi executado?");
						
						if(processado.equalsIgnoreCase("sim") || processado.equalsIgnoreCase("não"))
							erro = false;
					}
				}
				
				else if(processado.equalsIgnoreCase("sim")) {
					showMessageDialog(null, "Processo " + pid +  " executado!");	
					fila.dequeue();
				}
				
				else if(processado.equalsIgnoreCase("não")) {
					showMessageDialog(null, "Processo " + pid +  " não foi executado, tente processar novamente.");	
				}
				}
				
				break;
				
				case 3:
				
				if(!fila.isEnpty())
					showMessageDialog(null, "Ainda temos Processos a serem processados.");	
					
				else
					opcao = 0;
				
				break;
			}
		}
		}
		while(opcao != 3);
	
}
}
	


