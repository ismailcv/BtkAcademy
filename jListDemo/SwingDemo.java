package jListDemo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.sound.sampled.Line;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class SwingDemo extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingDemo frame = new SwingDemo();
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
	public SwingDemo() {

// ---------  Çerçeveyi oluþturmak için kullanýyoruz. ------------------------------		
		setTitle("Swing Liste Uygulama");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 579, 427);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList lstStudent = new JList();
		lstStudent.setBounds(98, 80, 224, 204);
		contentPane.add(lstStudent);
		
		DefaultListModel model = new DefaultListModel();
		lstStudent.setModel(model);
		
		JLabel lblName = new JLabel("\u00D6\u011Frenci ad\u0131: ");
		lblName.setBounds(12, 13, 74, 16);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		
		txtName.setBounds(98, 10, 224, 22);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblMessage = new JLabel("");
		lblMessage.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMessage.setBounds(12, 335, 375, 32);
		contentPane.add(lblMessage);


//------------ Listeye öðrenci eklemek için kullanýyoruz ------------------------------		
		JButton btnAdd = new JButton("\u00D6\u011Frenci ekle");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				model.addElement(txtName.getText());
				lblMessage.setText("Öðrenci eklendi: " + txtName.getText());
			}
		});
		btnAdd.setBounds(12, 42, 138, 25);
		contentPane.add(btnAdd);
		
//---------- Listeden öðrenci silmek için kullanýyoruz. ----------------------		
		JButton btnRemove = new JButton("\u00D6\u011Frenci sil");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.removeElement(txtName.getText());
				lblMessage.setText("Öðrenci silindi: " + txtName.getText());
			}
		});
		btnRemove.setBounds(172, 42, 146, 25);
		contentPane.add(btnRemove);
		
//------------ Seçili elemaný silmek için kullanýyoruz ------------------------------------------------		
		JButton btnRemoveSelected = new JButton("Se\u00E7ili Sil");
		btnRemoveSelected.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = lstStudent.getSelectedIndex();  //listede seçili olan elemanýn indisini verir.
				if(index != -1){
					model.removeElementAt(index);
					lblMessage.setText("Seçtiðiniz öðrenci silindi.");
				} else{
					lblMessage.setText("Seçtiðiniz öðrenci bulunmuyor.");
				}
			}
		});
		btnRemoveSelected.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRemoveSelected.setBounds(217, 297, 105, 25);
		contentPane.add(btnRemoveSelected);
		
		
		model.addElement("Ýsmail"); //direk sona eleman ekler.
		model.add(1, "Engin"); // aralara eleman eklemek istersek kullanabiliriz.
		model.removeElementAt(0);
		
		
	}
}
