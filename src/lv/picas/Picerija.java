package lv.picas;

import javax.swing.JOptionPane;

public class Picerija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int telNumurs;
		String vardsUzv, dzivvieta, x;
		do {
		x = JOptionPane.showInputDialog("Ieraksti telefona numuru!");
		}while(x.length() != 8);
		telNumurs = Integer.parseInt(x);
		vardsUzv = JOptionPane.showInputDialog("Ieraksti vārdu un uzvārdu!");
		dzivvieta = JOptionPane.showInputDialog("Ieraksti adresi");
		Pasutitajs sutitajs = new Pasutitajs(telNumurs, vardsUzv, dzivvieta);
		sutitajs.pasutitajaDati();
		sutitajs.pasutitPicu();
		
	}

}

