package segreteria;
import java.util.Scanner;

public class EsameAPI{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il nome di un esame");
		String nome = input.next();
		System.out.println("Inserisci il numero di crediti dell'esame");
		int crediti = input.nextInt();
		Esame esame1 = new Esame(nome, crediti);
		System.out.println("Inserisci il voto ottenuto nell'esame");
		int voto = input.nextInt();
		esame1.setVoto(voto);
		System.out.println(esame1.toString());
	}
}