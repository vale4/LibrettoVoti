package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Memorizza e gestisce un insieme di voti superati
 * 
 * @author Maco
 *
 */

public class Libretto {
	
	private List<Voto>voti=new ArrayList<>();
	
	/**
	 * Aggiungere un nuovo voto al libretto
	 * 
	 * @param v Voto da aggiungere
	 */
	public void add(Voto v) {
		this.voti.add(v);
	}
	
	
	/**
	 * Dato un Libretto, restituisce una stringa nella quale vi sono solamente i voti pari
	 * al valore specificato
	 * @param voto valore specificato
	 * @return stringa formattata per visualizzare il sotto-libretto
	 */
	public String stampaVotiUguali(int voto) {
		String s="";
		for(Voto v : this.voti) {
			if(v.getVoto()==voto) {
				s+=v.toString()+"\n";
			}
		}
		return s;
	}
	
	/**
	 * Genera un nuovo libretto, a partire da quello esistente, che conterrà esclusivamente
	 * i voti con votazione pari a quella specificata
	 * @param voto votazione specificata
	 * @return nuovo libretto "ridotto"
	 */
	public Libretto estraiVotiUguali(int voto) {
		Libretto nuovo=new Libretto();
		for(Voto v : this.voti) {
			if(v.getVoto()==voto) {
				nuovo.add(v);
			}
		}
		return nuovo;
	}
	
	public String toString() {
		String s="";
		for(Voto v : this.voti) {
			s+=v.toString()+"\n";
		}
		return s;
	}
	
	

}
