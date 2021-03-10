package magacin;

public  class Artikal {

	private final String naziv;
	private final int sifra;
	private final String opis;
	private final int kolicina;
	
	public Artikal(String naziv, int sifra, String opis, int kolicina) {
		super();
		this.naziv = naziv;
		this.sifra = sifra;
		this.opis = opis;
		this.kolicina = kolicina;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getSifra() {
		return sifra;
	}

	public String getOpis() {
		return opis;
	}

	public int getKolicina() {
		return kolicina;
	}
	
	
	
	
}
