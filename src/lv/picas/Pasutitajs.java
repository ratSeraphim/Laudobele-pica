package lv.picas;

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
		Pica jaunsPasut = new Pica(30, "Mocarellas siers",true, false);
		jaunsPasut.noteiktPicu();
	}
	public void pasutitajaDati() {
		System.out.println("Pasūtītāja vārds un uzvārds ir "+vardsUzvards+", telefona numurs: "+telefonaNum+" un adrese "+adrese);
	}
}