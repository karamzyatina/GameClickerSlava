package clicker;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Main extends JFrame {
  private int pizduley = 0;
  private JLabel countLabel;
  private JButton add;
  private JButton remove;

  public Main(){
    super("Новогодний подарок для Славы");

    countLabel = new JLabel("Пиздюлей выдано Славе: " + pizduley);
    add = new JButton("Дать пиздюлей Славе");
    remove = new JButton("Извиниться");


    JPanel buttonsPanel = new JPanel(new FlowLayout()); 

    buttonsPanel.add(countLabel, BorderLayout.NORTH); 

    buttonsPanel.add(add);
    buttonsPanel.add(remove);

    add(buttonsPanel, BorderLayout.SOUTH);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add.addActionListener(new ActionListener(){
    	  public void actionPerformed(ActionEvent e) {
    		  pizduley = pizduley + 1; 
    	     countLabel.setText("Пиздюлей выдано Славе: " + pizduley); 
    	  }
    	});
    remove.addActionListener(new ActionListener(){
    	  public void actionPerformed(ActionEvent e) {
    	    if( pizduley > 0 ) {
    	    	pizduley = pizduley - 1;
    	      countLabel.setText("Пиздюлей выдано Славе: " + pizduley);
    	    } 
    	  }
    	});

  }
  @SuppressWarnings("unused")
private void updateCounter() {
	  countLabel.setText("Пиздюлей выдано Славе: " + pizduley);
	}
public static void main(String[] args) {
    Main app = new Main();
    app.setVisible(true);
    app.pack(); 
  }

}