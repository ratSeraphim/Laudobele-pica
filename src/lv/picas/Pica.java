package lv.picas;

import javax.swing.JOptionPane;

//OOP programmesana?
public class Pica {
	//atribūti
	int izmers; //cm diametrs 
	String[] picPiedevas = new String[0]; //izmantošu kā masīvu, lai pievienotu vairākas piedevas!
	String picMerce;
	boolean sieraMalas; //vai malām ir siera pildījums?
	boolean piegade;
	
	//konstruktors
	public Pica(int izm, String[] picPied, String merce, boolean sierM, boolean pieg) {
		this.izmers = izm;
		this.picPiedevas = picPied;
		this.sieraMalas = sierM;
		this.piegade = pieg;
		this.picMerce = merce;
	}
	//metodes
	
	public void noteiktPicu() {
		String visasPiedevas = " ";
		for(int i=0; i<picPiedevas.length; i++) {
			visasPiedevas = visasPiedevas + picPiedevas[i]+", ";
		}
		visasPiedevas = visasPiedevas.substring(0, visasPiedevas.length() - 2);
		JOptionPane.showMessageDialog(null, "Pasūtītā pica ir "+izmers+"cm liela.\n"
				+ "Picas piedevas: "+visasPiedevas+".\n"
				+ "Mērce: "+picMerce+".\n"
				+ "Malas ir pildītas ar sieru: "+sieraMalas+".\n"
				+ "Vai tā jāpiegādā: "+piegade,"Pica", JOptionPane.PLAIN_MESSAGE);
	}
}
