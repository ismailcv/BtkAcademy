package firstSwingDemo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

public class frmIntro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmIntro frame = new frmIntro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmIntro() {
		setTitle("Swing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblMessage = new JLabel("");
		contentPane.add(lblMessage, BorderLayout.EAST);
		
		JButton btnButton1 = new JButton("Selam Ver 1");
		btnButton1.setSize(new Dimension(50, 50));
		btnButton1.setForeground(Color.RED);
		btnButton1.setBackground(Color.GREEN);
	    
		btnButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Merhaba 1");
				lblMessage.setText("Selam ver 1 .");
				
			}
		});
		contentPane.add(btnButton1, BorderLayout.SOUTH);
		
		JButton btnButton2 = new JButton("Selam Ver 2");
		btnButton2.setBackground(Color.ORANGE);
		btnButton1.setForeground(Color.WHITE);
		btnButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblMessage.setText("Selam ver 2 .");
			}
		});
		contentPane.add(btnButton2, BorderLayout.WEST);
		
		
	}

}
