package lv.picas;

import javax.swing.JOptionPane;

public class Pasutitajs {
	//atributi
 int telefonaNum; //telefona numurs
 String vardsUzvards; 
 String adrese;
 
//konstruktors
	public Pasutitajs(int telN, String vards, String adr) {
		this.telefonaNum = telN;
		this.vardsUzvards = vards;
		this.adrese = adr;
	}
	
//metodes
	public void pasutitPicu() {
		int izmers;
		String piedeva, x;
		boolean pildmalas = false, piegade = false;
		izmers = Integer.parseInt(JOptionPane.showInputDialog("Ieraksti picas izmeru!"));
		piedeva = JOptionPane.showInputDialog("Ievadi picas piedevu!");
		x = JOptionPane.showInputDialog("Vai vēlaties lai picas malas ir pildītas ar sieru? y|n");
		if(x.charAt(0) == 'y') {pildmalas = true;}
		x = JOptionPane.showInputDialog("Vai picu piegadat uz jusu majam? y|n ");
		if(x.charAt(0) == 'y') {piegade = true;}
		Pica jaunsPasut = new Pica(izmers, piedeva, pildmalas, piegade);
		jaunsPasut.noteiktPicu();
	}
	public void pasutitajaDati() {
		JOptionPane.showMessageDialog(null, "Vārds, Uzvārds: "+vardsUzvards+".\n Telefona numurs: "+telefonaNum+".\n"
				+ " Adrese: "+adrese+".","Pasūtītājs", JOptionPane.PLAIN_MESSAGE);
	}
}