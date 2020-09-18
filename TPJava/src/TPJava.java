import java.util.Calendar;
import java.util.StringTokenizer;
import java.awt.Font;
import javax.swing.*;



public class TPJava {
	public static void main(String[] args) {
		Object[] options = { "Nouvelle saisie", "Terminer"};
		
		String ages[] = {"20","21", "22","23","24","25","26","27","28","29","30"};
		String Name = JOptionPane.showInputDialog(null, "Préonom Nom", "Entrée", JOptionPane.INFORMATION_MESSAGE);
		String AgeChoisir = (String) JOptionPane.showInputDialog(null, "Age", "Ages",JOptionPane.QUESTION_MESSAGE,
				null, ages, ages[0]);
		
		String[] parts = Name.split(" ");
		String prenome = parts[0]; 
		String nome = parts[1]; 
		
		int choice = JOptionPane.showOptionDialog(null, "Votre option :", "Choisir une option", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
		JTextArea Table = new JTextArea("Prenome: "+ parts[0] + "\nNome: " + parts[1] + "\nAge: " + AgeChoisir);
		JOptionPane.showMessageDialog(null, Table);
		
		
	}
}


