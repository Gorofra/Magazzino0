package magazzino0;

import java.util.*;

public class Magazzino {
	ArrayList<Prodotto> magazzinoProdotti;
	public Magazzino() {
		magazzinoProdotti=new ArrayList<>();
	}
	public void addMagazzino(ArrayList<Prodotto> ap) {
		for(Prodotto p: ap) {
			this.addMagazzino(p);
		}
	}
	public void addMagazzino(Prodotto p) {
		magazzinoProdotti.add(p);
	}
	public String toSting() {
		StringBuilder s= new StringBuilder();
		for(Prodotto p: this.getMagazzinoProdotti()) {
			s.append(p.getNome()+" "+ p.getPrezzo()+" "+ p.getId()+" "+ p.getDisponibile()+ " \n");
		}
		return s.toString();
		
		
	}
	public ArrayList<Prodotto> getMagazzinoProdotti() {
		return magazzinoProdotti;
	}
}
