package servis;

import java.util.LinkedList;
import java.util.List;

import interfejs.IMagacin;
import magacin.Artikal;

public class MagacinServis implements IMagacin {

	private List<Artikal> artikli = new LinkedList<>();
	private static int index =0;
	
	@Override
	public void dodajArtikal(Artikal artikal) {
		artikli.add(index++, artikal);
		
	}

	@Override
	public void dodajArtikalKolicinu(int sifra, int kol) {
		for (Artikal artikal : artikli) {
			try {
				if(artikal.getSifra()==sifra)
					artikal.setKolicina(kol);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public Artikal izbaciArtikal(int sifra) {
		return artikli.remove(0);
	}

	@Override
	public void pronadji(int sifra) {
	for (int i = 0; i < artikli.size(); i++) {
		try {
			if(artikli.get(i).getSifra()==sifra) {
				System.out.println(artikli.get(i).toString());
				return;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	}

}
