package magazzino0;

public class Main {

	public static void main(String[] args) throws Exception {
		
			Prodotto p1= new Prodotto("pane", 12.4, "00012", 20 );
			Prodotto p2= new Prodotto("latteeeeeeeeeeeeeeeeee", 11.0, "00013", 12);
			Magazzino m1 = new Magazzino();
			m1.addMagazzino(p2);
			m1.addMagazzino(p1);
			System.out.println(m1.toSting());
			GestioneOrdini o1= new GestioneOrdini();
			o1.addOrdine(p1);
			System.out.println(o1.toString());
			o1.registraOrdine("francesco", "via sb", o1.toString());
	}

}
