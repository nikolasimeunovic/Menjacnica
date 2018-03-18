package interfejsi;

import java.util.GregorianCalendar;

import valuta.Valuta;

public interface menjacnicaInterfejs {

	public void dodajKurs(Valuta valuta);
	
	public boolean obrisiKurs(Valuta valuta);
	
	public Valuta pronadjiKurs(Valuta valuta);
	
}
