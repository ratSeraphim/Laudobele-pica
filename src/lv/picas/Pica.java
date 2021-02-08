package lv.picas;
//OOP programmesana?
public class Pica {
	//atribūti
	int izmers; //cm diametrs 
	boolean sieraMalas; //vai malām ir siera pildījums?
	String piedevas; //izmantošu kā masīvu, lai pievienotu vairākas piedevas!
	boolean piegade;
	
	//konstruktors
	public Pica(int izm, String p, boolean sierM, boolean pieg) {
		this.izmers = izm;
		this.sieraMalas = sierM;
		this.piedevas = p;
		this.piegade = pieg;
	}

}
