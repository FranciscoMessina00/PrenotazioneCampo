package segreteria;
import java.util.ArrayList;

public class Studente{
	private String nome;
	private int matricola;
	private ArrayList<Esame>esamiFatti, pianoDiStudi;

	private Studente(String nome, int matricola, ArrayList<Esame> esami){
		this.nome=nome;
		this.matricola=matricola;
		pianoDiStudi=esami;
	}

	public String getNome(){
		return nome;
	}
	public int getMatricola(){
		return matricola;
	}

	public ArrayList<Esame> getEsami(){
		for (int i=0; i<pianoDiStudi.size(); i++){
			if (pianoDiStudi.get(i).getVoto()>=18){
				esamiFatti.add(pianoDiStudi.get(i));
			}
		}
		return esamiFatti;
	}

	public double mediaEsami(ArrayList<Esame> esamiFatti){
		double media=0;

		return media;
	}

}