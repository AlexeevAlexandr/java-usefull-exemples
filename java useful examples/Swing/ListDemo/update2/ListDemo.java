import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class ListDemo implements ListSelectionListener{
JList<String>jlst;
JLabel jlab;
JScrollPane jscrlp;

String names[] = {"Novosad family", "Alexeev family"};

ListDemo(){

	JFrame jfrm = new JFrame("Who is who in ouer family");

	jfrm.setLayout(new GridLayout());

	jfrm.setSize(400, 300);

	jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	jlst = new JList<String>(names);


	jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	jscrlp = new JScrollPane(jlst);

	jscrlp.setPreferredSize(new Dimension(200, 150));

	jlab = new JLabel ("Please choose a name");

	jlst.addListSelectionListener (this);

	jfrm.add(jscrlp);
	jfrm.add(jlab);

	jfrm.setVisible(true);
	}

public void valueChanged (ListSelectionEvent le){

	int idx = jlst.getSelectedIndex();

	if(idx != -1){ jlab.setText("Current selection: "+names[idx]);{
		if(names[idx].equals ("Novosad family")){
		 	JFrame m = new JFrame("Content Novosad family");
			m.setSize(300, 100);
			JLabel j = new JLabel("Roman-dad, Olya-mam, Milana-daughter");
			m.add(j);
			m.setVisible(true);
			}
		if(names[idx].equals ("Alexeev family")){
			JFrame m = new JFrame("Content Alexeev family");
			m.setSize(300, 100);
			JLabel j = new JLabel("Sasha-dad, Luba-mam, Sofiya-daughter, Kirill-son");
			m.add(j);
			m.setVisible(true);
			}
		}}
	else jlab.setText("Please choose a name");

	}
public static void main (String args []){
	SwingUtilities.invokeLater(new Runnable(){
		public void run(){
			new ListDemo();
			}
		});
	}
}