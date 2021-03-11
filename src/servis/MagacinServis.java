package servis;


import java.util.LinkedList;

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


