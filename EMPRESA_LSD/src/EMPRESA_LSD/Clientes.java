package EMPRESA_LSD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Clientes {

	private JFrame frame;
	private JTextField txtID_CLIENTE;
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
					Clientes window = new Clientes();
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
	public Clientes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 744, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CLIENTES");
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 18));
		lblNewLabel.setBounds(309, 11, 209, 62);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblID_CLIENTE = new JLabel("ID CLIENTE");
		lblID_CLIENTE.setBounds(27, 145, 99, 14);
		frame.getContentPane().add(lblID_CLIENTE);
		
		JLabel lblNOMBRE_CLIENTE = new JLabel("NOMBRE-CLIENTE");
		lblNOMBRE_CLIENTE.setBounds(27, 199, 99, 14);
		frame.getContentPane().add(lblNOMBRE_CLIENTE);
		
		JLabel lblAPELLIDO_PATERNO = new JLabel("APELLIDO PATERNO");
		lblAPELLIDO_PATERNO.setBounds(27, 253, 99, 14);
		frame.getContentPane().add(lblAPELLIDO_PATERNO);
		
		JLabel lblAPELLIDO_MATERNO = new JLabel("APELLIDO MATERNO");
		lblAPELLIDO_MATERNO.setBounds(27, 307, 114, 14);
		frame.getContentPane().add(lblAPELLIDO_MATERNO);
		
		JLabel lblTELEFONO = new JLabel("TELEFONO");
		lblTELEFONO.setBounds(27, 364, 99, 14);
		frame.getContentPane().add(lblTELEFONO);
		
		txtID_CLIENTE = new JTextField();
		txtID_CLIENTE.setBounds(201, 142, 411, 20);
		frame.getContentPane().add(txtID_CLIENTE);
		txtID_CLIENTE.setColumns(10);
		
		txtNOMBRE_CLIENTE = new JTextField();
		txtNOMBRE_CLIENTE.setBounds(201, 196, 401, 20);
		frame.getContentPane().add(txtNOMBRE_CLIENTE);
		txtNOMBRE_CLIENTE.setColumns(10);
		
		txtAPELLIDO_PATERNO = new JTextField();
		txtAPELLIDO_PATERNO.setBounds(201, 250, 411, 20);
		frame.getContentPane().add(txtAPELLIDO_PATERNO);
		txtAPELLIDO_PATERNO.setColumns(10);
		
		txtAPELLIDO_MATERNO = new JTextField();
		txtAPELLIDO_MATERNO.setBounds(201, 304, 401, 20);
		frame.getContentPane().add(txtAPELLIDO_MATERNO);
		txtAPELLIDO_MATERNO.setColumns(10);
		
		txtTELEFONO = new JTextField();
		txtTELEFONO.setBounds(201, 361, 401, 20);
		frame.getContentPane().add(txtTELEFONO);
		txtTELEFONO.setColumns(10);
		
		JButton btnGUARDAR = new JButton("GUARDAR");
		btnGUARDAR.setBounds(37, 450, 89, 23);
		frame.getContentPane().add(btnGUARDAR);
		
		JButton btnCONSULTAR = new JButton("CONSULTAR");
		btnCONSULTAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCONSULTAR.setBounds(148, 450, 117, 23);
		frame.getContentPane().add(btnCONSULTAR);
		
		JButton btnACTUALIZAR = new JButton("ACTUALIZAR");
		btnACTUALIZAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnACTUALIZAR.setBounds(289, 450, 106, 23);
		frame.getContentPane().add(btnACTUALIZAR);
		
		JButton btnELIMINAR = new JButton("ELIMINAR");
		btnELIMINAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnELIMINAR.setBounds(429, 450, 89, 23);
		frame.getContentPane().add(btnELIMINAR);
	}

}
