package EMPRESA_LSD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Materia_Prima {

	private JFrame frame;
	private JTextField txtCLIENTES;
	private JTextField txtNOMBRE_CLIENTE;
	private JTextField txtAPELLIDO_PATERNO;
	private JTextField txtAPELLIDO_MATERNO;
	private JTextField txtTELEFONO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Materia_Prima window = new Materia_Prima();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Materia_Prima() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 560, 451);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METERIA PRIMA");
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 19));
		lblNewLabel.setBounds(213, 11, 131, 23);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblID_CLIENTES = new JLabel("ID Clientes");
		lblID_CLIENTES.setBounds(50, 72, 83, 14);
		frame.getContentPane().add(lblID_CLIENTES);
		
		JLabel lblNOMBRE_CLIENTES = new JLabel("Nombre Cliente ");
		lblNOMBRE_CLIENTES.setBounds(50, 107, 97, 14);
		frame.getContentPane().add(lblNOMBRE_CLIENTES);
		
		JLabel lblAPELLIDO_PATE = new JLabel("Apellido Paterno ");
		lblAPELLIDO_PATE.setBounds(50, 152, 120, 14);
		frame.getContentPane().add(lblAPELLIDO_PATE);
		
		JLabel lblAPELLIDO_MATE = new JLabel("Apellido Materno");
		lblAPELLIDO_MATE.setBounds(50, 199, 109, 14);
		frame.getContentPane().add(lblAPELLIDO_MATE);
		
		JLabel lblTELEFONOS = new JLabel("Telefono ");
		lblTELEFONOS.setBounds(50, 252, 46, 14);
		frame.getContentPane().add(lblTELEFONOS);
		
		txtCLIENTES = new JTextField();
		txtCLIENTES.setBounds(207, 69, 327, 20);
		frame.getContentPane().add(txtCLIENTES);
		txtCLIENTES.setColumns(10);
		
		txtNOMBRE_CLIENTE = new JTextField();
		txtNOMBRE_CLIENTE.setColumns(10);
		txtNOMBRE_CLIENTE.setBounds(207, 104, 327, 20);
		frame.getContentPane().add(txtNOMBRE_CLIENTE);
		
		txtAPELLIDO_PATERNO = new JTextField();
		txtAPELLIDO_PATERNO.setColumns(10);
		txtAPELLIDO_PATERNO.setBounds(207, 149, 327, 20);
		frame.getContentPane().add(txtAPELLIDO_PATERNO);
		
		txtAPELLIDO_MATERNO = new JTextField();
		txtAPELLIDO_MATERNO.setColumns(10);
		txtAPELLIDO_MATERNO.setBounds(207, 196, 327, 20);
		frame.getContentPane().add(txtAPELLIDO_MATERNO);
		
		txtTELEFONO = new JTextField();
		txtTELEFONO.setColumns(10);
		txtTELEFONO.setBounds(207, 249, 327, 20);
		frame.getContentPane().add(txtTELEFONO);
		
		JButton btnGUARDAR = new JButton("GUARDAR");
		btnGUARDAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGUARDAR.setBounds(50, 300, 89, 23);
		frame.getContentPane().add(btnGUARDAR);
		
		JButton btnCONSULTAR = new JButton("CONSULTAR");
		btnCONSULTAR.setBounds(200, 300, 102, 23);
		frame.getContentPane().add(btnCONSULTAR);
		
		JButton btnACTUALIZAR = new JButton("ACTUALIZAR");
		btnACTUALIZAR.setBounds(363, 300, 102, 23);
		frame.getContentPane().add(btnACTUALIZAR);
		
		JButton btnELIMINAR = new JButton("ELIMINAR");
		btnELIMINAR.setBounds(207, 350, 89, 23);
		frame.getContentPane().add(btnELIMINAR);
	}
}
