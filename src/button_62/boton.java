package button_62;
import javax.swing.*;
import java.awt.event.*;
public class boton extends JFrame implements ActionListener {
JButton boton;
public void Formulario() {
	setLayout(null);
	boton= new JButton("Finalizar");
	boton.setBounds(300,250,100,30);
	add(boton);
	boton.addActionListener(this);
}
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==boton) {
		System.exit(0);
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boton inter= new boton();
		inter.Formulario();
		inter.setBounds(0,0,450,350);
		inter.setVisible(true);
		inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
