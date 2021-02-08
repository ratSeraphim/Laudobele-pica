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
	     break;
	     
	     case 1: JOptionPane.showMessageDialog(null, "Nav izstrādāts kods...");
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

