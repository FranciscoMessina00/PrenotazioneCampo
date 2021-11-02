package segreteria;

import java.util.ArrayList;

public class CorsoLaurea{

	private String nome;
	private ArrayList<Studente> immatricolati;
	public static int prossimaMatricola=1000; //Numero matricola da assegnare
	public static final int MIN_CREDITI=180; //Numero crediti per la laurea

	public CorsoLaurea(String NomeCorso){
		immatricolati = new ArrayList<Studente>();
		nome = NomeCorso;
	}

	public String getNome(){
		return nome;
	}

	public void iscritto (String NomeStudente){
		prossimaMatricola++;
		immatricolati.add(new Studente(nome, prossimaMatricola));
	}

	public int cercaStudente (int Matricola){

	}

	public void ritira(String NomeStudente){

	}

