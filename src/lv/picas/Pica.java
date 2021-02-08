package lv.picas;
//OOP programmesana?
public class Pica {
	//atribūti
	int izmers; //cm diametrs 
	boolean sieraMalas; //vai malām ir siera pildījums?
	String piedevas; //izmantošu kā masīvu, lai pievienotu vairākas piedevas!
	
	//konstruktors
	public Pica(int picasIzmers, String picasPiedevas, boolean picasSiMal) {
		this.izmers = picasIzmers;
		this.sieraMalas = picasSiMal;
		this.piedevas = picasPiedevas;
	}

}
