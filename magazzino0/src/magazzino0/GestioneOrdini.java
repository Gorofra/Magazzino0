package magazzino0;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class GestioneOrdini {
	private ArrayList<Prodotto> ordine;
	private int orderCount;
	public GestioneOrdini() {
		ordine=new ArrayList<>();
	}
	
	public void addOrdine(Prodotto p) {
	ordine.add(p);
	}
	
	
	public ArrayList<Prodotto> getOrdine() {
		return ordine;
	}

	public String toString() {
		StringBuilder s= new StringBuilder();
		double count=0;
		for(Prodotto p: this.getOrdine()) {
			s.append(p.getNome()+" "+ p.getPrezzo()+" "+ p.getId()+" "+ p.getDisponibile()+ " \n");
			count+=p.getPrezzo();
		}
		return s.toString()+"\n totale="+ count	;
		
		
	}
	public void registraOrdine(String nome, String indirizzo, String ordinato)throws IOException{
		this.orderCount++;
		//String ord=this.ordine.toString();
		//System.out.println(ord.concat(" "+ nome+ " indirizzo:"+ indirizzo));
		byte[] buf= ordinato.getBytes();
		System.out.println(buf);
		String titolo=String.format("%s%d.txt", "ordine", this.orderCount);
		try (FileOutputStream f1 = new FileOutputStream(titolo)) {
		for(int i=0; i<buf.length;i++) {
			f1.write(buf[i]);
		}
		}finally {
		}
		
		System.out.println("[Gestione Ordini] ordine creato con successo");
	}
	

}
