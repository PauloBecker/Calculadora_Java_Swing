import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Calculadora implements ActionListener {
	
	JLabel label;
	JLabel resposta;
	JTextField textField;
	JTextField textField2;
	
	public Calculadora() {
		
		JFrame frame = new JFrame("Calculadora");
		frame.setVisible(true);
		frame.setSize(450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		label = new JLabel("Digite dois números: ");
		frame.add(label);
		
		textField = new JTextField(10);
		textField.addActionListener(this);
		textField.setActionCommand("Enter");
		frame.add(textField);
		
		textField2 = new JTextField(10);
		textField2.addActionListener(this);
		textField2.setActionCommand("Enter");
		frame.add(textField2);
		
		JButton button = new JButton("Somar");
		button.addActionListener(this);
		frame.add(button);
		
		JButton button2 = new JButton("Subtrair");
		button2.addActionListener(this);
		frame.add(button2);
		
		JButton button3 = new JButton("Multiplicar");
		button3.addActionListener(this);
		frame.add(button3);
		
		JButton button4 = new JButton("Dividir");
		button4.addActionListener(this);
		frame.add(button4);
		
		resposta = new JLabel("");
		frame.add(resposta);
		
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {

				new Calculadora();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if(textField.getText().equals("") || textField2.getText().equals("")) {
			resposta.setText("Falta um número!");
			
		}else {
			
			int num1 = Integer.parseInt(textField.getText());
			int num2 = Integer.parseInt(textField2.getText());
			
			if(e.getActionCommand().equalsIgnoreCase("Somar")) {
				float num3 = num1 + num2;
				String resultado = "" + num3;
				resposta.setText("Resultado: " + num1 + " + " + num2 + " = " + resultado);
				
			}else if(e.getActionCommand().equalsIgnoreCase("Subtrair")) {
				float num3 = num1 - num2;
				String resultado = "" + num3;
				resposta.setText("Resultado: " + num1 + " - " + num2 + " = " + resultado);
				
			}else if(e.getActionCommand().equalsIgnoreCase("Multiplicar")) {
				float num3 = num1 * num2;
				String resultado = "" + num3;
				resposta.setText("Resultado: " + num1 + " * " + num2 + " = " + resultado);
				
			}else if(e.getActionCommand().equalsIgnoreCase("Dividir")) {
				float num3 = num1 / num2;
				String resultado = "" + num3;
				resposta.setText("Resultado: " + num1 + " / " + num2 + " = " + resultado);
			}else {
				resposta.setText("#####  Erro!!!  ####");
			}
		}
//		textField.setText("");
//		textField2.setText("");
	}

}
