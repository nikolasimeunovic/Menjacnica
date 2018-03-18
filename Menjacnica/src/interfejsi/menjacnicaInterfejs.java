package interfejsi;

import java.util.GregorianCalendar;

import valuta.Valuta;

public interface menjacnicaInterfejs {

	public void dodajKurs(Valuta valuta, GregorianCalendar datum);
	
	public boolean obrisiKurs(Valuta valuta, GregorianCalendar datum);
	
	public Valuta pronadjiKurs(Valuta valuta, GregorianCalendar datum);
	
}
