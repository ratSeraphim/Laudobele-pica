package lv.picas;

import javax.swing.JOptionPane;

public class Picerija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int telNumurs;
		String vardsUzv, dzivvieta;
		telNumurs = Integer.parseInt(JOptionPane.showInputDialog("Ieraksti telefona numuru!"));
		vardsUzv = JOptionPane.showInputDialog("Ieraksti vārdu un uzvārdu!");
		dzivvieta = JOptionPane.showInputDialog("Ieraksti adresi");
		Pasutitajs sutitajs = new Pasutitajs(telNumurs, vardsUzv, dzivvieta);
		sutitajs.pasutitPicu();
		sutitajs.pasutitajaDati();
	}

}

