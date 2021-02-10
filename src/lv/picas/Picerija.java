package lv.picas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Picerija {
	static String teksts;
	public static void main(String[] args) {
		int x;
		 do {  String[] options = {"Jauns sūtījums", "Skatīt aktīvos sūtījumi", "Nodot visus aktīvos sūtījumus", "Skatīt nodotos sūtījumus", "Iziet no programmas"};
	      
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
	    	 
	     case 2: 
	    	 nodot();
	    	 try {
	 			FileWriter fw = new FileWriter("Pasutijumi.txt");
	 			PrintWriter raksta = new PrintWriter(fw);
	 			raksta.println(" ");
	 			raksta.close();
	 			JOptionPane.showMessageDialog(null, "Teksts saglabāts");
	 					
	 		}catch(Exception e) {
	 			JOptionPane.showMessageDialog(null, "Kļūme ierakstot failā!","Kļūme!", JOptionPane.ERROR_MESSAGE);
	 		}
	     break;
	     case 3:  try {
	    	 FileReader fr= new FileReader("NodotiePasutijumi.txt");
				BufferedReader lasa = new BufferedReader(fr);
				while((teksts = lasa.readLine())!=null) {
					System.out.println(teksts);
				}
	      lasa.close();
	     }catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Kļūme ierakstot faila!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
			}
	     break;
	     case 4: JOptionPane.showMessageDialog(null,"Programma tiek apturēta","Brīdinājums", JOptionPane.WARNING_MESSAGE); break;
	    	 
default: JOptionPane.showMessageDialog(null,"Jūs neveicāt izvēli!","Brīdinājums", JOptionPane.ERROR_MESSAGE);
	    }
		 }while(x != 4);
		
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
	public static void nodot() {
		try {
	    	 FileReader fr= new FileReader("Pasutijumi.txt");
				BufferedReader lasa = new BufferedReader(fr);
				while((teksts = lasa.readLine())!=null) {
					 try {
				 			FileWriter fw = new FileWriter("NodotiePasutijumi.txt", true);
				 			PrintWriter raksta = new PrintWriter(fw);
				 			raksta.println(teksts);
				 			raksta.close();
				 					
				 		}catch(Exception e) {
				 			JOptionPane.showMessageDialog(null, "Kļūme ierakstot failā!","Kļūme!", JOptionPane.ERROR_MESSAGE);
				 		}
					 JOptionPane.showMessageDialog(null, "Fails saglabāts", "Uzmanību", JOptionPane.INFORMATION_MESSAGE);
				}
	      lasa.close();
	     }catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Kļūme ierakstot faila!", "Kļūme!", JOptionPane.ERROR_MESSAGE);
			}
	}

}

