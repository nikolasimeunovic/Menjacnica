package interfejsi;

import java.util.GregorianCalendar;

import valuta.Valuta;

public interface menjacnicaInterfejs {

	public void dodajKurs(Valuta valuta);
	
	public void obrisiKurs(Valuta valuta);
	
	public Valuta pronadjiKurs(String naziv, GregorianCalendar datum);
	
}
