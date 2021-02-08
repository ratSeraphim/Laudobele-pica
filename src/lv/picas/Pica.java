package lv.picas;
//OOP programmesana?
public class Pica {
	//atribūti
	int izmers; //cm diametrs 
	String piedevas; //izmantošu kā masīvu, lai pievienotu vairākas piedevas!
	boolean sieraMalas; //vai malām ir siera pildījums?
	boolean piegade;
	
	//konstruktors
	public Pica(int izm, String p, boolean sierM, boolean pieg) {
		this.izmers = izm;
		this.piedevas = p;
		this.sieraMalas = sierM;
		this.piegade = pieg;
	}
	//metodes
	public void noteiktPicu() {
		System.out.println("Pasūtītā pica ir "+izmers+"cm liela, tās piedevas ir "+piedevas+","
				+ " Tās malas ir pildītas ar sieru: "+sieraMalas+", vai tā tiks piegādāta: "+piegade);
	}
}
