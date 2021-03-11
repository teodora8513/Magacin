package servis;

import java.util.ArrayList;
import java.util.List;

import interfejs.IMagacin;
import magacin.Artikal;
import magacin.Magacin;

public class MagacinServis implements IMagacin {

	List<Artikal> artikli = new ArrayList<>();
	Magacin magacin = new Magacin(artikli);

	@Override
	public void dodajArtikal(Artikal artikal) {
		artikli.add(artikal);

	}

	@Override
	public void dodajArtikalKolicinu(int sifra, int kol) {

		try {
			for (Artikal artikal : artikli) {
				if (artikal.getSifra() == sifra) {
					artikal.setKolicina(kol);
					return;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Artikal izbaciArtikal(int sifra) {
		
			try {
				for (int i = 0; i < artikli.size(); i++) 
				if(artikli.get(i).getSifra()==sifra)
					return artikli.remove(i);
				throw new Exception("Nema tog artikla");
			} catch (Exception e) {
				
				e.getMessage();
			}
		
		
		return null;
	}

	@Override
	public void pronadji(int sifra) {
		
			try {
				for (Artikal artikal : artikli) 
				if(artikal.getSifra()==sifra)
					System.out.println(artikal.toString());
				throw new Exception("Nema tog artikla");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


