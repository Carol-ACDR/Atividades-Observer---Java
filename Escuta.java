import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Dimension;

public class Escuta extends JFrame implements ActionListener{
  JButton button0, button1,button2;
  JTextField textField0,textField1,textField2;
Escuta(){
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setLayout(new FlowLayout());
  button0 = new JButton("Enviar0");
  button0.addActionListener(this);
  textField0 = new JTextField();
  textField0.setPreferredSize(new Dimension(40,40));
  button1 = new JButton("Enviar1");
  button1.addActionListener(this);
  textField1 = new JTextField();
  textField1.setPreferredSize(new Dimension(40,40));
  button2 = new JButton("Enviar2");
  button2.addActionListener(this);
  textField2 = new JTextField();
  textField2.setPreferredSize(new Dimension(40,40));
  this.add(button0);
  this.add(textField0);
  this.add(button1);
  this.add(textField1);
  this.add(button2);
  this.add(textField2);
  this.pack();
  this.setVisible(true);
}
  @Override
  public void actionPerformed(ActionEvent e){
    if ( e.getSource()== button0){
      textField0.setText(textField0.getText());
      textField1.setText(textField0.getText());
      textField2.setText(textField0.getText());
      System.out.println("beep");
    }
    else if( e.getSource()== button1){
      textField0.setText(textField1.getText());
      textField1.setText(textField1.getText());
      textField2.setText(textField1.getText());
    }
    else if ( e.getSource() == button2){
      textField0.setText(textField2.getText());
      textField1.setText(textField2.getText());
      textField2.setText(textField2.getText());
    }
  }
  
}