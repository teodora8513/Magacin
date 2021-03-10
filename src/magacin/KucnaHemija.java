package magacin;

import java.util.Date;

public class KucnaHemija extends Artikal{

	private final Date rokTrajanja;
	
	
	
	public KucnaHemija(String naziv, int sifra, String opis, int kolicina, Date rokTrajanja) {
		super(naziv, sifra, opis, kolicina);
		this.rokTrajanja = rokTrajanja;
	}



	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	
}
