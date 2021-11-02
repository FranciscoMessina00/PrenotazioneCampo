package segreteria;
import java.util.Scanner;

public class StudenteAPI{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci il nome studente:");
		String nome = input.next();
		System.out.println("Inserisci il numero di matricola:");
		int matricola = input.nextInt();
		Studente stud= new Studente(nome,matricola);
		System.out.println("Inserisci quanti esami dovrà sostenere lo studente nel suo piano studi:");
		int n = input.nextInt();
	}
}