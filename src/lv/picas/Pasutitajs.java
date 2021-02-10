package lv.picas;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.text.DecimalFormat;

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
		double pilnaCena = 0;
		double izCen= 0, piCen= 0, sieCen = 0, merCen = 0;
		String piedevas, cenaForm;
		boolean pildmalas = false, piegade = false;
		
		//Izmers
		String[] options2 = {"20","25","30","40","50","100"};
		String izmerStr = (String) JOptionPane.showInputDialog(null,"Izvēlies picas izmēru","Veic izvēli!", JOptionPane.QUESTION_MESSAGE, null, options2, options2[0]);
		izmers = Integer.parseInt(izmerStr);
		switch(izmers) {
		case 20: izCen = 4; break;
		case 25: izCen = 4.5; break; 
		case 30: izCen = 5; break; 
		case 40: izCen = 6; break; 
		case 50: izCen = 7; break; 
		case 100: izCen = 14; break; 
		}
		//Izmers beidzas
		
		//Piedevas
		piedDaudz = Integer.parseInt(JOptionPane.showInputDialog("Ieraksti cik piedevas vēlies uz picas!"));
		String[] picPied = new String[piedDaudz];
		for(int i=0 ; i< piedDaudz; i++) {
			piedevas = JOptionPane.showInputDialog("Ievadi picas piedevu!");
			picPied[i] = piedevas;
		}
		//Piedevas beidzas
		
		//Merces
		String[] options = {"Barbekjū mērce", "Pesto mērce", "Ķiploku mērce", "Karija mērce", "Ranča mērce", "Asā mērce", "Neviena!"};
	    String mercesIzvele = (String) JOptionPane.showInputDialog(null, "Kādu mērci vēlaties uz picas?", "Veiciet izvēli!", JOptionPane.QUESTION_MESSAGE, null,
	    options, options[0]);
	    if (mercesIzvele == "Neviena!") {
	    	merCen = 0;
	    } else {
	    	merCen = 1.5;
	    }
	    //Merces beidzas
		
		if(JOptionPane.showConfirmDialog(null, "Vai picas malas ir pildītas ar sieru?","Veiciet izvēli",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {pildmalas = true; sieCen = 2.5;}
		if(JOptionPane.showConfirmDialog(null, "Vai picu jāpiegādā uz mājām ?","Veiciet izvēli",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {piegade = true; piCen = 2.2;}
		
		pilnaCena = (piedDaudz * 0.2) + izCen + piCen + merCen + sieCen;
		cenaForm = String.format("%,.2fEUR", pilnaCena);
		Pica jaunsPasut = new Pica(izmers, picPied, mercesIzvele, pildmalas, piegade, cenaForm);
		jaunsPasut.noteiktPicu();
	}
	
	public void pasutitajaDati() {
		JOptionPane.showMessageDialog(null, "Vārds, Uzvārds: "+vardsUzvards+".\n Telefona numurs: "+telefonaNum+"\n"
				+ " Adrese: "+adrese+".","Pasūtītājs", JOptionPane.PLAIN_MESSAGE);
		
		try {
			FileOutputStream file = new FileOutputStream("Pasutijumi.txt", true);
			OutputStreamWriter raksta = new OutputStreamWriter(file, Charset.forName("UTF8"));
					raksta.write("\nVārds, Uzvārds: "+vardsUzvards+".\n Telefona numurs: "+telefonaNum+".\n"
							+ " Adrese: "+adrese+".\n\n");
				raksta.close();
			
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Kļūme ierakstot failā!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
			}
	}
}