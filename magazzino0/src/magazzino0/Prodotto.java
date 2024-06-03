package magazzino0;

public class Prodotto {
	private String nome;
	private double prezzo;
	private String id;
	private int disponibile;

	public Prodotto(String nome, double prezzo, String id, int disponibile) {
		this.setNome(nome);
		this.setDisponibile(disponibile);
		this.setId(id);
		this.setPrezzo(prezzo);
	}
	
	public void setNome(String nome){
		try {
			if(nome.length()>16) {
				throw new Exception("[Prodotto] il nome non puo essere piu lungo di 16 caratteri");
			}
			else {
				this.nome=nome;
				System.out.println("[Prodotto] nome impostato con successo");
			}
		}catch(Exception e){
		e.printStackTrace();
		}
	}
	
	public void setPrezzo(double prezzo){
		try {
			if(prezzo==0) {
				throw new Exception("[Prodotto] il prezzo non puo essere 0");
			}
			else {
				this.prezzo=Math.abs(prezzo);
				System.out.println("[Prodotto] prezzo impostato con successo");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void setDisponibile(int disponibile) {
				this.disponibile=(Math.abs(disponibile));
				System.out.println("[Prodotto] disponibilità impostata con successo");
	}
	public void ricaricaDispinibilita(int quantita) {
		this.setDisponibile(this.getDisponibile()+Math.abs(quantita));
	}
	public void rimuoviDisponibilita(int quantita) throws Exception {
		if(quantita!=0) {
			if(this.getDisponibile()-Math.abs(quantita)<0) {
				throw new Exception("[Protoddo] non hai abbastanza disponibilità per effettuare questo ordine");
			}
			else {
				this.setDisponibile(this.getDisponibile()-Math.abs(quantita));
				System.out.println("[Prodotto] numero di prodotti disponibili ridotto con successo");
			}
		}
		else {
			throw new Exception("[Prodotto] non puoi modificare la disponibilita con 0");
		}
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getDisponibile() {
		return disponibile;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public String getNome() {
		return nome;
	}
	
}
