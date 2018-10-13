import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicArrowButton;

public class WhackAMole implements ActionListener {
	static JPanel newpanel = new JPanel();
	static JFrame newframe = new JFrame();
	static JLabel newlabel = new JLabel();
	static JButton button = new JButton();
	static WhackAMole wm = new WhackAMole();
	Random rand = new Random();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		wm.drawButtons();
		
		
	}
	
void drawButtons() {
	newframe.setVisible(true);
	newframe.setSize(300, 300);
	
	newframe.setTitle("Whack a Button for Fame and Glory");
	newframe.add(newpanel);
	
	
	
	
	int  randnum = rand.nextInt(24);
	for (int i = 0; i < 24; i++) {
		JButton button = new JButton();
		newpanel.add(button);
		if(i == randnum) {
		button.setText("Mole");
		
		}
		button.addActionListener(this);
	}
	
}
void speak(String words) {
    try {
         Runtime.getRuntime().exec("say " + words).waitFor();
    } catch (Exception e) {
         e.printStackTrace();
    }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if(buttonPressed.getText().equals("Mole")==false) {
		speak("You missed!");
	}
	else {
		newframe.dispose();
		wm.drawButtons();
	}
	}
}

