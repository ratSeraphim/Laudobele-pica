package lv.picas;

import javax.swing.JOptionPane;

public class Picerija {

	public static void main(String[] args) {
		int x;
		 do {  String[] options = {"Jauns sūtījums", "Aktīvie sūtījumi", "Iziet no programmas"};
	      
	        x = JOptionPane.showOptionDialog(null, "Veic izvēli!",
	                null,
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	     switch(x) {
	     case 0: jaunsSutijums();
			
	     case 1: JOptionPane.showMessageDialog(null, "Nav izstrādāts kods...");
	    	 
	     case 2: JOptionPane.showMessageDialog(null,"Programma tiek apturēta","WARNING", JOptionPane.WARNING_MESSAGE);
default: 
	    }
		 }while(x != 2);
		
	}
	public static void jaunsSutijums(){
		int telNumurs;
		String vardsUzv, dzivvieta, y;
		vardsUzv = JOptionPane.showInputDialog("Ieraksti vārdu un uzvārdu!");
		do {
			y = JOptionPane.showInputDialog("Ieraksti telefona numuru!");
		}while(y.length() != 8);
		telNumurs = Integer.parseInt(y);
		dzivvieta = JOptionPane.showInputDialog("Ieraksti adresi");
		Pasutitajs sutitajs = new Pasutitajs(telNumurs, vardsUzv, dzivvieta);
		sutitajs.pasutitajaDati();
		sutitajs.pasutitPicu();
	}

}

