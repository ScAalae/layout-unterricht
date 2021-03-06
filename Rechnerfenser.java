
package rechnerpackage;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Rechnerfenser extends JFrame implements ActionListener {

private JTextField ergebnisText, text2;
private JPanel hauptPanel;
private JPanel nordPanel, southPanel,westPanel, eastPanel,centerPanel;

private JButton knopf1, knopf2,  knopf3, knopf4,  knopf5, knopf6;

//Konstruktor
public Rechnerfenser(String titel) {
super(titel);
this.setSize(500, 500);
hauptPanel = new JPanel(); //neues Panel wird erzeugt
nordPanel = new JPanel(); //neues Panel wird erzeugt
southPanel = new JPanel(); //neues Panel wird erzeugt
eastPanel = new JPanel(); //neues Panel wird erzeugt
westPanel = new JPanel(); //neues Panel wird erzeugt
centerPanel = new JPanel(); //neues Panel wird erzeugt

ergebnisText = new JTextField("Hallo Welt!");
text2 = new JTextField("Hallo Ich!");

knopf1 = new JButton("Knopf 1");
//knopf2 = new JButton("Knopf 2");
//knopf3 = new JButton("Knopf 3");
//knopf4 = new JButton("Knopf 4");
//knopf5 = new JButton("Knopf 5");
//knopf6 = new JButton("Knopf 6");
// hauptPanel.setLayout(new BoxLayout(hauptPanel, BoxLayout.X_AXIS ));
//hauptPanel.setLayout(new FlowLayout());

hauptPanel.setLayout(new GridLayout(3,3));
hauptPanel.setLayout(new BorderLayout());
//nordPanel.setLayout(new FlowLayout());
southPanel.setLayout(new GridLayout(5,5));
//centerPanel.setLayout(new BorderLayout());
//
southPanel.add(knopf1);
//southPanel.add(knopf2);
//southPanel.add(knopf3);
//southPanel.add(knopf4);
//nordPanel.add(knopf5);

//nordPanel.add(ergebnisText); //Textfeld wird dem Panel zugeordnet
//
//centerPanel.add(knopf6, BorderLayout.EAST);
//centerPanel.add(text2, BorderLayout.NORTH);
//
//eastPanel.setBackground(Color.CYAN);
//westPanel.setBackground(Color.RED);
//southPanel.setBackground(Color.GREEN);
//
//


//knopf1.addActionListener(this);
//knopf2.addActionListener(this);
//knopf3.addActionListener(this);
//knopf4.addActionListener(this);
//knopf5.addActionListener(this);

hauptPanel.add(nordPanel,BorderLayout.NORTH);
hauptPanel.add(southPanel,BorderLayout.WEST);
hauptPanel.add(eastPanel,BorderLayout.EAST);
hauptPanel.add(westPanel,BorderLayout.SOUTH);
this.add(hauptPanel);
this.setVisible(true);
}

public void actionPerformed(ActionEvent e) {
if(e.getSource() == this.knopf1) {
ergebnisText.setText("Knopf 1");
ergebnisText.setBackground(Color.blue);
} else
if(e.getSource() == this.knopf2) {

ergebnisText.setText("Knopf 2");
ergebnisText.setBackground(Color.red);
}
}
}