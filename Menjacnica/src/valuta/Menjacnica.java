package valuta;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import interfejsi.menjacnicaInterfejs;

public class Menjacnica implements menjacnicaInterfejs {
	
	LinkedList<Valuta> kursevi = new LinkedList<Valuta>();

	@Override
	public void dodajKurs(Valuta valuta) {
		if(valuta == null || kursevi.contains(valuta)) 
			throw new RuntimeException("Kurs postoji u listi ili je neispravno unet");
		
		kursevi.add(valuta);
	}

	@Override
	public void obrisiKurs(Valuta valuta) {
		if(!kursevi.contains(valuta))
			throw new RuntimeException("Uneli ste nepostojeci kurs");
		
		kursevi.remove(valuta);
	}

	@Override
	public Valuta pronadjiKurs(String naziv, GregorianCalendar datum) {
		for(int i=0;i<kursevi.size();i++) {
			if(kursevi.get(i).getNaziv().equals(naziv) && kursevi.get(i).getDatum().equals(datum)) 
				return kursevi.get(i);
		}
		
		throw new RuntimeException("U listi ne postoji kurs za datu valutu i datum!");
	}

}
