package interfejs;

import magacin.Artikal;

public interface IMagacin {

	public void dodajArtikal(Artikal artikal);
	public void dodajArtikalKolicinu(int sifra, int kol);
	public Artikal izbaciArtikal();
	public void pronadji(int sifra);
}
