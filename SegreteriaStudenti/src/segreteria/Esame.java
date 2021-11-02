package segreteria;
import java.util.ArrayList;

public class Esame{
	private String nome;
	private int crediti;
	private int voto;

	public Esame(String nome, int crediti){
		this.nome = nome;
		this.crediti = crediti;
		this.voto = 0;
	}

	public String getNome(){
		return nome;
	}

	public int getCrediti(){
		return crediti;
	}

	public int getVoto(){
		return voto;
	}

	public void setVoto(int voto){
		this.voto = voto;
	}

	public String toString(){
		String r ="";
		r = r + "Nome esame: " + getNome() + "\n";
		r = r + "Crediti: " + getCrediti() + "\n";
		r = r + "Voto: " + getVoto() + "\n";
		return r;
	}
}