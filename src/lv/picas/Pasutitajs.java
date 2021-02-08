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
		String piedevas;
		boolean pildmalas = false, piegade = false;
		
		String[] options2 = {"20","25","30","40","50","100"};
		String izmerStr = (String) JOptionPane.showInputDialog(null,"Izvēlies picas izmēru","Veic izvēli!", JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
		izmers = Integer.parseInt(izmerStr);
		piedDaudz = Integer.parseInt(JOptionPane.showInputDialog("Ieraksti cik piedevas vēlies uz picas!"));
		String[] picPied = new String[piedDaudz];
		for(int i=0 ; i< piedDaudz; i++) {
			piedevas = JOptionPane.showInputDialog("Ievadi picas piedevu!");
			picPied[i] = piedevas;
		}
		
		String[] options = {"Barbekjū mērce", "Pesto mērce", "Ķiploku mērce", "Karija mērce", "Ranča mērce", "Asā mērce", "Neviena!"};
	    String mercesIzvele = (String) JOptionPane.showInputDialog(null, "Kādu mērci vēlaties uz picas?", "Veiciet izvēli!", JOptionPane.QUESTION_MESSAGE, null,
	    options, options[0]);
		
		if(JOptionPane.showConfirmDialog(null, "Vai picas malas ir pildītas ar sieru?","Veiciet izvēli",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {pildmalas = true;}
		if(JOptionPane.showConfirmDialog(null, "Vai picu jāpiegādā uz mājām?","Veiciet izvēli",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {piegade = true;}
		
		Pica jaunsPasut = new Pica(izmers, picPied, mercesIzvele, pildmalas, piegade);
		jaunsPasut.noteiktPicu();
	}
	public void pasutitajaDati() {
		JOptionPane.showMessageDialog(null, "Vārds, Uzvārds: "+vardsUzvards+".\n Telefona numurs: "+telefonaNum+".\n"
				+ " Adrese: "+adrese+".","Pasūtītājs", JOptionPane.PLAIN_MESSAGE);
	}
}