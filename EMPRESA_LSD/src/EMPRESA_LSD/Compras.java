package EMPRESA_LSD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Compras {

	private JFrame frame;
	private JTextField txtPRODUCTO;
	private JTextField txtPRECIO_PRODUCTO;
	private JTextField txtNUMERO_PRODUCTO;
	private JTextField txtNUMERO_PIEZA;
	private JTextField txtMARACA_PRODUCTO;
	private JTextField txtCANTIDAD_PRODUCTO;
	private JTextField txtCONTENIDO_PRODUCTO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Compras window = new Compras();
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
	public Compras() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(224, 255, 255));
		frame.setBounds(100, 100, 788, 573);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COMPRAS");
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 19));
		lblNewLabel.setBounds(333, 11, 147, 32);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel IblPRODUCTO = new JLabel("ID  PRODUCTO");
		IblPRODUCTO.setBounds(39, 85, 141, 14);
		frame.getContentPane().add(IblPRODUCTO);
		
		JLabel lblPRECIO_PRODUCTO = new JLabel("PRECIO PRODUCTO");
		lblPRECIO_PRODUCTO.setBounds(39, 127, 141, 14);
		frame.getContentPane().add(lblPRECIO_PRODUCTO);
		
		JLabel lblMARCA = new JLabel("MARCA DEL PRODUCTO ");
		lblMARCA.setBounds(39, 248, 141, 14);
		frame.getContentPane().add(lblMARCA);
		
		JLabel lblNOMBRE_PRODUCTO = new JLabel("NOMBRE PRODUCTO");
		lblNOMBRE_PRODUCTO.setBounds(39, 165, 141, 14);
		frame.getContentPane().add(lblNOMBRE_PRODUCTO);
		
		JLabel lblCANTIDAD = new JLabel("CANTIDAD DEL PRODUCTO ");
		lblCANTIDAD.setBounds(39, 292, 141, 14);
		frame.getContentPane().add(lblCANTIDAD);
		
		JLabel lblCONTENIDO = new JLabel("CONTENIDO DEL PRODUCTO ");
		lblCONTENIDO.setBounds(39, 342, 159, 14);
		frame.getContentPane().add(lblCONTENIDO);
		
		JLabel lblNUMERO_PIEZA = new JLabel("NUMERO DE PIEZAS");
		lblNUMERO_PIEZA.setBounds(39, 208, 141, 14);
		frame.getContentPane().add(lblNUMERO_PIEZA);
		
		txtPRODUCTO = new JTextField();
		txtPRODUCTO.setBounds(227, 82, 391, 20);
		frame.getContentPane().add(txtPRODUCTO);
		txtPRODUCTO.setColumns(10);
		
		txtPRECIO_PRODUCTO = new JTextField();
		txtPRECIO_PRODUCTO.setBounds(227, 124, 391, 20);
		frame.getContentPane().add(txtPRECIO_PRODUCTO);
		txtPRECIO_PRODUCTO.setColumns(10);
		
		txtNUMERO_PRODUCTO = new JTextField();
		txtNUMERO_PRODUCTO.setBounds(227, 162, 391, 20);
		frame.getContentPane().add(txtNUMERO_PRODUCTO);
		txtNUMERO_PRODUCTO.setColumns(10);
		
		txtNUMERO_PIEZA = new JTextField();
		txtNUMERO_PIEZA.setBounds(227, 205, 391, 20);
		frame.getContentPane().add(txtNUMERO_PIEZA);
		txtNUMERO_PIEZA.setColumns(10);
		
		txtMARACA_PRODUCTO = new JTextField();
		txtMARACA_PRODUCTO.setBounds(227, 245, 391, 20);
		frame.getContentPane().add(txtMARACA_PRODUCTO);
		txtMARACA_PRODUCTO.setColumns(10);
		
		txtCANTIDAD_PRODUCTO = new JTextField();
		txtCANTIDAD_PRODUCTO.setBounds(227, 289, 391, 20);
		frame.getContentPane().add(txtCANTIDAD_PRODUCTO);
		txtCANTIDAD_PRODUCTO.setColumns(10);
		
		txtCONTENIDO_PRODUCTO = new JTextField();
		txtCONTENIDO_PRODUCTO.setBounds(227, 339, 391, 20);
		frame.getContentPane().add(txtCONTENIDO_PRODUCTO);
		txtCONTENIDO_PRODUCTO.setColumns(10);
		
		JButton btnGUARDAR = new JButton("GUARDAR");
		btnGUARDAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NegocioCliente ng = new NegocioCliente();
				ng.setClienteID(txtClienteID.getText());
				ng.setNombreCompañia(txtNombreCompañia.getText());
				ng.setNombreContacto(txtNombreContacto.getText());
				ng.setDireccion(txtDireccion.getText());
				ng.setTelefono(txtTelefono.getText());
				ng.setE_Mail(txtE_Mail.getText());
				
				if(ng.insertar()) {
					JOptionPane.showMessageDialog(null, "CLIENTE AGREGADO");
                                        limpiar();
				}else {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
				
			}
		});
			}
		});
		btnGUARDAR.setBounds(10, 420, 89, 23);
		frame.getContentPane().add(btnGUARDAR);
		
		JButton btnCONSULTAR = new JButton("CONSULTAR ");
		btnCONSULTAR.setBounds(148, 420, 102, 23);
		frame.getContentPane().add(btnCONSULTAR);
		
		JButton btnACTUALIZAR = new JButton("ACTUALIZAR ");
		btnACTUALIZAR.setBounds(307, 420, 106, 23);
		frame.getContentPane().add(btnACTUALIZAR);
		
		JButton btnELIMINAR = new JButton("ELIMINAR ");
		btnELIMINAR.setBounds(444, 420, 89, 23);
		frame.getContentPane().add(btnELIMINAR);
	}

}

