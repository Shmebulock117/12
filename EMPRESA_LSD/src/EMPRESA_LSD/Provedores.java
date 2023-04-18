package EMPRESA_LSD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class Provedores {

	private JFrame frame;
	private JTextField txtID_PRODUCTO;
	private JTextField txtNOMBRE_COMPLETO;
	private JTextField txtTELEFONO;
	private JTextField txtCORREO;
	private JTextField txtDIRECCION;
	private JTextField txtTIPO_PRODUCTO;
	private JTextField txtCANTIDAD;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Provedores window = new Provedores();
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
	public Provedores() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 783, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PROVEDORES");
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 18));
		lblNewLabel.setBounds(355, 24, 120, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblID_PRODUCTOSS = new JLabel("ID PRODUCTO");
		lblID_PRODUCTOSS.setBounds(50, 67, 129, 14);
		frame.getContentPane().add(lblID_PRODUCTOSS);
		
		JLabel lblNOMBRE_COMPLETO = new JLabel("NOMBRE COMPLETO");
		lblNOMBRE_COMPLETO.setBounds(50, 101, 129, 14);
		frame.getContentPane().add(lblNOMBRE_COMPLETO);
		
		JLabel lblTELEFONOO = new JLabel("TELEFONO");
		lblTELEFONOO.setBounds(50, 147, 144, 14);
		frame.getContentPane().add(lblTELEFONOO);
		
		JLabel lblCORREO = new JLabel("CORREO");
		lblCORREO.setBounds(50, 182, 129, 14);
		frame.getContentPane().add(lblCORREO);
		
		JLabel lblDIRECCION = new JLabel("DIRECCION");
		lblDIRECCION.setBounds(50, 229, 129, 14);
		frame.getContentPane().add(lblDIRECCION);
		
		JLabel lblTIPO_PRODUCTOS = new JLabel("TIPO DE PRODUCTO");
		lblTIPO_PRODUCTOS.setBounds(50, 279, 129, 14);
		frame.getContentPane().add(lblTIPO_PRODUCTOS);
		
		JLabel lblCANTIDAD = new JLabel("CANTIDAD");
		lblCANTIDAD.setBounds(50, 320, 129, 14);
		frame.getContentPane().add(lblCANTIDAD);
		
		txtID_PRODUCTO = new JTextField();
		txtID_PRODUCTO.setBounds(225, 64, 316, 20);
		frame.getContentPane().add(txtID_PRODUCTO);
		txtID_PRODUCTO.setColumns(10);
		
		txtNOMBRE_COMPLETO = new JTextField();
		txtNOMBRE_COMPLETO.setColumns(10);
		txtNOMBRE_COMPLETO.setBounds(225, 98, 316, 20);
		frame.getContentPane().add(txtNOMBRE_COMPLETO);
		
		txtTELEFONO = new JTextField();
		txtTELEFONO.setColumns(10);
		txtTELEFONO.setBounds(225, 141, 316, 20);
		frame.getContentPane().add(txtTELEFONO);
		
		txtCORREO = new JTextField();
		txtCORREO.setColumns(10);
		txtCORREO.setBounds(225, 179, 316, 20);
		frame.getContentPane().add(txtCORREO);
		
		txtDIRECCION = new JTextField();
		txtDIRECCION.setColumns(10);
		txtDIRECCION.setBounds(225, 226, 316, 20);
		frame.getContentPane().add(txtDIRECCION);
		
		txtTIPO_PRODUCTO = new JTextField();
		txtTIPO_PRODUCTO.setColumns(10);
		txtTIPO_PRODUCTO.setBounds(225, 276, 316, 20);
		frame.getContentPane().add(txtTIPO_PRODUCTO);
		
		txtCANTIDAD = new JTextField();
		txtCANTIDAD.setColumns(10);
		txtCANTIDAD.setBounds(225, 317, 316, 20);
		frame.getContentPane().add(txtCANTIDAD);
		
		JButton btnGUARDAR = new JButton("GUARDAR");
		btnGUARDAR.setBounds(105, 381, 103, 23);
		frame.getContentPane().add(btnGUARDAR);
		
		JButton btnCONSULTAR = new JButton("CONSULTAR");
		btnCONSULTAR.setBounds(238, 381, 103, 23);
		frame.getContentPane().add(btnCONSULTAR);
		
		JButton btnACTUALIZAR = new JButton("ACTUALIZAR");
		btnACTUALIZAR.setBounds(372, 381, 103, 23);
		frame.getContentPane().add(btnACTUALIZAR);
		
		JButton btnELIMINAR = new JButton("ELIMINAR");
		btnELIMINAR.setBounds(506, 381, 103, 23);
		frame.getContentPane().add(btnELIMINAR);
	}

}
