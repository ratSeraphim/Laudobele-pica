package lv.picas;

import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JOptionPane;

public class Picerija {
	static String teksts;
	public static void main(String[] args) {
		int x;
		 do {  String[] options = {"Jauns sūtījums", "Aktīvie sūtījumi", "Iziet no programmas"};
	      
	        x = JOptionPane.showOptionDialog(null, "Veic izvēli!",
	                null,
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	     switch(x) {
	     case 0: jaunsSutijums();
	     break;
	     
	     case 1: 
	     try {
	    	 FileReader fr= new FileReader("Pasutijumi.txt");
				BufferedReader lasa = new BufferedReader(fr);
				while((teksts = lasa.readLine())!=null) {
					System.out.println(teksts);
				}
	      lasa.close();
	     }catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Kļūme ierakstot faila!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
			}
	     
	     break;
	    	 
	     case 2: JOptionPane.showMessageDialog(null,"Programma tiek apturēta","Brīdinājums", JOptionPane.WARNING_MESSAGE);
	     break;
default: JOptionPane.showMessageDialog(null,"Jūs neveicāt izvēli!","Brīdinājums", JOptionPane.ERROR_MESSAGE);
	    }
		 }while(x != 2);
		
	}
	public static void jaunsSutijums(){
		int telNumurs;
		String vardsUzv, dzivvieta, y;
		vardsUzv = JOptionPane.showInputDialog("Ieraksti vārdu un uzvārdu!");
		do {
			y = JOptionPane.showInputDialog("Ieraksti telefona numuru!");
			if(y.length() != 8)JOptionPane.showMessageDialog(null, "Telefona numuram jābūt 8 ciparus garam!","ERROR", JOptionPane.ERROR_MESSAGE);
		}while(y.length() != 8);
		telNumurs = Integer.parseInt(y);
		dzivvieta = JOptionPane.showInputDialog("Ieraksti adresi");
		Pasutitajs sutitajs = new Pasutitajs(telNumurs, vardsUzv, dzivvieta);
		sutitajs.pasutitajaDati();
		sutitajs.pasutitPicu();
	}
	

}

