package lv.picas;

import javax.swing.JOptionPane;

public class Picerija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String[] options = {"Jauns sūtījums", "Aktīvie sūtījumi", "Iziet no programmas"};
	      
	        int x = JOptionPane.showOptionDialog(null, "Veic izvēli!",
	                null,
	                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
	     switch(x) {
	     case 0: jaunsSutijums();
			
	     case 1: JOptionPane.showMessageDialog(null, "Nav izstrādāts kods...");
	    	 
	     case 2: System.exit(0);
default: 
	    }
		
	}
	public static void jaunsSutijums(){
		int telNumurs;
		String vardsUzv, dzivvieta, y;
		do {
			y = JOptionPane.showInputDialog("Ieraksti telefona numuru!");
		}while(y.length() != 8);
		telNumurs = Integer.parseInt(y);
		vardsUzv = JOptionPane.showInputDialog("Ieraksti vārdu un uzvārdu!");
		dzivvieta = JOptionPane.showInputDialog("Ieraksti adresi");
		Pasutitajs sutitajs = new Pasutitajs(telNumurs, vardsUzv, dzivvieta);
		sutitajs.pasutitajaDati();
		sutitajs.pasutitPicu();
	}

}

