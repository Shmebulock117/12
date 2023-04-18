package EMPRESA_LSD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class Producto {

	private JFrame frame;
	private JTextField txtPRODUCTO;
	private JTextField txtNOMBRE;
	private JTextField txtCALIDAD;
	private JTextField txtCADUCIDAD;
	private JTextField txtTIPO;
	private JTextField txtMARCA_PRODUCTO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Producto window = new Producto();
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
	public Producto() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 586, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PRODUCTO");
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 19));
		lblNewLabel.setBounds(253, 24, 164, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblID_PRODUCTO = new JLabel("ID Producto");
		lblID_PRODUCTO.setBounds(39, 84, 124, 14);
		frame.getContentPane().add(lblID_PRODUCTO);
		
		JLabel lblNOMBRE_PRODUCTO = new JLabel("Nombre Producto ");
		lblNOMBRE_PRODUCTO.setBounds(39, 124, 144, 14);
		frame.getContentPane().add(lblNOMBRE_PRODUCTO);
		
		JLabel lblCALIDAD = new JLabel("Calidad ");
		lblCALIDAD.setBounds(39, 166, 144, 14);
		frame.getContentPane().add(lblCALIDAD);
		
		JLabel lblFECHA_CADUCIDAD = new JLabel("Fecha de Caducidad ");
		lblFECHA_CADUCIDAD.setBounds(39, 209, 144, 14);
		frame.getContentPane().add(lblFECHA_CADUCIDAD);
		
		JLabel lblTIPO_PRODUCTOS = new JLabel("Tipo de Producto ");
		lblTIPO_PRODUCTOS.setBounds(39, 249, 144, 14);
		frame.getContentPane().add(lblTIPO_PRODUCTOS);
		
		JLabel lblMARCA_PRODUCTO = new JLabel("Marca de Producto");
		lblMARCA_PRODUCTO.setBounds(39, 293, 144, 14);
		frame.getContentPane().add(lblMARCA_PRODUCTO);
		
		txtPRODUCTO = new JTextField();
		txtPRODUCTO.setBounds(214, 81, 333, 20);
		frame.getContentPane().add(txtPRODUCTO);
		txtPRODUCTO.setColumns(10);
		
		txtNOMBRE = new JTextField();
		txtNOMBRE.setColumns(10);
		txtNOMBRE.setBounds(214, 121, 333, 20);
		frame.getContentPane().add(txtNOMBRE);
		
		txtCALIDAD = new JTextField();
		txtCALIDAD.setColumns(10);
		txtCALIDAD.setBounds(214, 163, 333, 20);
		frame.getContentPane().add(txtCALIDAD);
		
		txtCADUCIDAD = new JTextField();
		txtCADUCIDAD.setColumns(10);
		txtCADUCIDAD.setBounds(214, 206, 333, 20);
		frame.getContentPane().add(txtCADUCIDAD);
		
		txtTIPO = new JTextField();
		txtTIPO.setColumns(10);
		txtTIPO.setBounds(214, 246, 333, 20);
		frame.getContentPane().add(txtTIPO);
		
		txtMARCA_PRODUCTO = new JTextField();
		txtMARCA_PRODUCTO.setColumns(10);
		txtMARCA_PRODUCTO.setBounds(214, 290, 333, 20);
		frame.getContentPane().add(txtMARCA_PRODUCTO);
		
		JButton btnGUARDAR = new JButton("GUARDAR");
		btnGUARDAR.setBounds(33, 381, 89, 23);
		frame.getContentPane().add(btnGUARDAR);
		
		JButton btnCONSULTAR = new JButton("CONSULTAR");
		btnCONSULTAR.setBounds(147, 381, 98, 23);
		frame.getContentPane().add(btnCONSULTAR);
		
		JButton btnACTUALIZAR = new JButton("ACTUALIZAR ");
		btnACTUALIZAR.setBounds(277, 381, 98, 23);
		frame.getContentPane().add(btnACTUALIZAR);
		
		JButton btnELIMINAR = new JButton("ELIMINAR ");
		btnELIMINAR.setBounds(423, 381, 89, 23);
		frame.getContentPane().add(btnELIMINAR);
	}

}
