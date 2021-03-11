package magacin;

public  class Artikal {

	private final String naziv;
	private final int sifra;
	private final String opis;
	private  int kolicina;
	
	public Artikal(String naziv, int sifra, String opis, int kolicina) {
		super();
		this.naziv = naziv;
		this.sifra = sifra;
		this.opis = opis;
		this.kolicina = kolicina;
	}

<<<<<<< HEAD
	public void setKolicina(int broj) {
		kolicina  = broj;
	}
=======
	
>>>>>>> refs/heads/implementacijainterfejsa
	public String getNaziv() throws Exception {
		if(naziv==null)
			throw new Exception("Artikal nije imenovan");
		return naziv;
	}

	public void setKolicina(int broj) {
		kolicina = broj;
	}
	public int getSifra() throws Exception {
		if(sifra==0)
			throw new Exception("Artikal ne postoji");
		return sifra;
	}

	public String getOpis() {
		return opis;
	}

	public int getKolicina() {
		return kolicina;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sifra;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Artikal))
			return false;
		Artikal other = (Artikal) obj;
		if (sifra != other.sifra)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", sifra=" + sifra + ", opis=" + opis + ", kolicina=" + kolicina + "]";
	}
	
	
	
	
}
