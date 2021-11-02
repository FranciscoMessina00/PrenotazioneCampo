package prenotazione;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int scelta;
		String[] lista;
		String nome;
		int[] orario=new int[2];
		boolean uscire=false;
		Scanner input=new Scanner(System.in);
		System.out.println("Benvenuto nell'applicazione delle prenotazioni! ");
		do {
			System.out.println("Cosa desidera fare?\n"
					+ "1)Vedere lista prenotazioni;\n"
					+ "2)Aggiungere prenotazione;\n"
					+ "3)Rimuovere prenotazione;\n"
					+ "4)Uscire;\n"
					+ "Digitare il numero per scegliere l'opzione: ");
			scelta=input.nextInt();
			switch (scelta) {
				case 1:
					lista=Campo.tostring();
					for (String prenotazioni:lista) {
						System.out.println(prenotazioni);
					}
					break;
				case 2:
					System.out.println("Aggiungere prenotazione, inserire il nome: ");
					nome=input.next();
					
					do {
						System.out.println("Inserire orario di inizio: ");
						orario[0]=input.nextInt();
						System.out.println("Inserire orario di fine");
						orario[1]=input.nextInt();
						if ((orario[0]>orario[1]) || orario[0]<0 || orario[0]>23 || orario[1]<1 || orario[1]>24) {
							System.out.println("Orario non valido!  Riprova!");
						}
					}while((orario[0]>orario[1]) || orario[0]<0 || orario[0]>23 || orario[1]<1 || orario[1]>24);
					
					if(Campo.addPrenotazione(nome, orario)) {
						System.out.println("Prenotazione eseguita con successo!");
					} else {
						System.out.println("Prenotazione fallita, campo occupato "
								+ "nell'orario inserito! Provare un orario diverso");
					}
					break;
				case 3:
					System.out.println("Rimuovere prenotazione, inserire il nome: ");
					nome=input.next();
					if(Campo.removePrenotazione(nome)) {
						System.out.println("Prenotazione rimossa con successo!");
					} else {
						System.out.println("Utente non presente");
					}
					break;
				case 4:
					uscire=true;
					break;
			}
			
		}while(!uscire);
		System.out.println("Grazie per aver usato la nostra applicazione! A presto!");
		input.close();
		}

}
