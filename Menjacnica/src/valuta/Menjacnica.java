package valuta;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsi.menjacnicaInterfejs;

public class Menjacnica implements menjacnicaInterfejs {

	LinkedList<Valuta> kursevi = new LinkedList<Valuta>();
	
	@Override
	public void dodajKurs(Valuta valuta) {
		if(valuta != null) 
			kursevi.add(valuta);

	}

	@Override
	public void obrisiKurs(Valuta valuta) {
		kursevi.remove(valuta);
		
	}

	@Override
	public Valuta pronadjiKurs(String naziv, GregorianCalendar datum) {
		return null;
	}

}
