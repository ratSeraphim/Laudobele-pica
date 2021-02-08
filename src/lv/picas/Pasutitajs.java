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
		int izmers, piedDaudz;
		String x, piedevas, merces;
		boolean pildmalas = false, piegade = false;
		
		izmers = Integer.parseInt(JOptionPane.showInputDialog("Ieraksti picas izmeru!"));
		
		piedDaudz = Integer.parseInt(JOptionPane.showInputDialog("Ieraksti cik piedevas vēlies uz picas!"));
		String[] picPied = new String[piedDaudz];
		for(int i=0 ; i< piedDaudz; i++) {
			piedevas = JOptionPane.showInputDialog("Ievadi picas piedevu!");
			picPied[i] = piedevas;
		}
		
		String[] options = {"Barbekjū mērce", "Pesto mērce", "Ķiploku mērce", "Karija mērce", "Ranča mērce", "Asā mērce", "Nevienu!"};
	      
	       String izvele = (String) JOptionPane.showInputDialog(null, "Kādu mērci vēlaties uz picas?", "Veic izvēli!", JOptionPane.QUESTION_MESSAGE, null,
	    		   options, options[0]);
		
		x = JOptionPane.showInputDialog("Vai vēlaties lai picas malas ir pildītas ar sieru? y|n");
		if(x.charAt(0) == 'y') {pildmalas = true;}
		x = JOptionPane.showInputDialog("Vai picu piegadat uz jusu majam? y|n ");
		if(x.charAt(0) == 'y') {piegade = true;}
		
		Pica jaunsPasut = new Pica(izmers, picPied, izvele, pildmalas, piegade);
		jaunsPasut.noteiktPicu();
	}
	public void pasutitajaDati() {
		JOptionPane.showMessageDialog(null, "Vārds, Uzvārds: "+vardsUzvards+".\n Telefona numurs: "+telefonaNum+".\n"
				+ " Adrese: "+adrese+".","Pasūtītājs", JOptionPane.PLAIN_MESSAGE);
	}
}