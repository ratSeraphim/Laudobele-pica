package lv.picas;

import javax.swing.JOptionPane;

//OOP programmesana?
public class Pica {
	//atribūti
	int izmers; //cm diametrs 
	String[] picPiedevas = new String[0]; //izmantošu kā masīvu, lai pievienotu vairākas piedevas!
	boolean sieraMalas; //vai malām ir siera pildījums?
	boolean piegade;
	
	//konstruktors
	public Pica(int izm, String[] picPied, boolean sierM, boolean pieg) {
		this.izmers = izm;
		this.picPiedevas = picPied;
		this.sieraMalas = sierM;
		this.piegade = pieg;
	}
	//metodes
	public void noteiktPicu() {
		String visasPiedevas = " ";
		for(int i=0; i<picPiedevas.length; i++) {
			visasPiedevas = visasPiedevas + picPiedevas[i]+", ";
		}
		JOptionPane.showMessageDialog(null, "Pasūtītā pica ir "+izmers+"cm liela.\n"
				+ " Picas piedevas: "+visasPiedevas+".\n"
				+ " Malas ir pildītas ar sieru: "+sieraMalas+".\n Vai tā jāpiegādā: "+piegade,"Pica", JOptionPane.PLAIN_MESSAGE);
	}
}
