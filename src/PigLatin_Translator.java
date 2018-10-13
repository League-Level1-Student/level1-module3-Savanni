import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin_Translator implements ActionListener {

	PigLatinTranslator PLT = new PigLatinTranslator();
	
	JPanel newpanel = new JPanel();
	JFrame newframe = new JFrame();
	JLabel newlabel = new JLabel();
	JButton newbutton = new JButton();
	JTextField english = new JTextField(10);
	JTextField platin = new JTextField(10);
	
	public static void main(String[] args) {
		PigLatin_Translator translate = new PigLatin_Translator();
		translate.createui();
		
	}	
void createui(){

	newbutton.setText("Translate");
	newframe.setVisible(true);
	newframe.setSize(400, 100);
	
	newpanel.add(english);
	newpanel.add(newbutton);
	newpanel.add(platin);

	
	newframe.add(newpanel);
	newframe.pack();
	
	newbutton.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub

String answer = PLT.translate(english.getText());
	platin.setText(answer);
	
}
}
