package prenotazione;

public class Campo {
	/*-public boolean addPrenotazione() per prenotare. L'utente deve fornire l'orario
	(inizio e fine) e il propio nominativo.
	-public boolean removePrenotazione() per cancellare la prenotazione di un dato 
	cliente
	-public String tostring() per ottenere la lista delle prenotazini*/
	private static boolean prenotFatta=true, prenotRimossa=false;
	private static String[] lista=new String[25];
	private static Prenotazione[] prenotazioni=new Prenotazione[25];
	public static Prenotazione utenteCorrente;
	public static boolean addPrenotazione(String nome, int[] orario) {
		utenteCorrente= new Prenotazione(nome, orario);
		
		//controllo che non ci siano prenotazioni in quell'orario
		for (int i=orario[0]; i<orario[1]; i++) {
			if (prenotazioni[i]!=null) prenotFatta=false;
		}
		
		//se non ci sono prenotazioni allora metto la prenotazione corrente
		if(prenotFatta) {
			for (int i=orario[0]; i<=orario[1]; i++) {
				prenotazioni[i]=utenteCorrente;
			}
		}
		//ritorno l'esito della prenotazione
		return prenotFatta;
	}
	
	public static boolean removePrenotazione(String nome) {
		
		
		//controllo che la lista di prenotazioni contenga l'utente, se c'è lo tolgo
		for (int i=0; i<25; i++) {
			if (prenotazioni[i]==null) {}
			else if (prenotazioni[i].nome.equals(nome)) {
				prenotRimossa=true;
				prenotazioni[i]=null;
			}
		}
		//ritorno l'esito della prenotazione
				
		return prenotRimossa;
	}
	
	public static String[] tostring() {
		for (int i=0;i<25;i++) {
			if (prenotazioni[i]==null) {
				lista[i]= i+":00 vuoto";
			} else {
				lista[i]= i+":00 prenotato da:  "+prenotazioni[i].nome;
			}
			
		}
		return lista;
	}
}
