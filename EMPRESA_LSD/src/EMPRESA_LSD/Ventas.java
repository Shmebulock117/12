package EMPRESA_LSD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ventas {

	private JFrame frame;
	private JTextField textField;
	private JTextField txtREGISTRO_VENTA;
	private JTextField txtNOMBRE_CLIENTE;
	private JTextField txtAPELLIDO_PAT;
	private JTextField txtAPELLIDO_MAT;
	private JTextField txtDIRECCION;
	private JTextField txtTELEFONO_LOCAL;
	private JTextField txtTELEFONO;
	private JTextField txtTIPO_PRODUCTO;
	private JTextField txtFORMA_PAGO;
	private JTextField txtTOTAL_COMPRA;
	private JLabel lblAPELLIDO_MAT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventas window = new Ventas();
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
	public Ventas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 755, 572);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ventas");
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 19));
		lblNewLabel.setBounds(293, 11, 288, 72);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblREGISTRO_VENTA = new JLabel("Registro de ventas");
		lblREGISTRO_VENTA.setBounds(48, 92, 108, 14);
		frame.getContentPane().add(lblREGISTRO_VENTA);
		
		JLabel lblNOMBRE_CLIENTE = new JLabel("Nombre del cliente");
		lblNOMBRE_CLIENTE.setBounds(48, 129, 98, 14);
		frame.getContentPane().add(lblNOMBRE_CLIENTE);
		
		JLabel lblAPELLIDO_PAT = new JLabel("Apellido paterno");
		lblAPELLIDO_PAT.setBounds(48, 166, 98, 14);
		frame.getContentPane().add(lblAPELLIDO_PAT);
		
		lblAPELLIDO_MAT = new JLabel("Apellido materno");
		lblAPELLIDO_MAT.setBounds(48, 209, 98, 14);
		frame.getContentPane().add(lblAPELLIDO_MAT);
		
		JLabel lblTELEFONO_LOCAL = new JLabel("Telefono local");
		lblTELEFONO_LOCAL.setBounds(48, 267, 98, 14);
		frame.getContentPane().add(lblTELEFONO_LOCAL);
		
		JLabel lblTIPO_PRODUCTO = new JLabel("Tipo de producto");
		lblTIPO_PRODUCTO.setBounds(48, 356, 98, 14);
		frame.getContentPane().add(lblTIPO_PRODUCTO);
		
		JLabel lblDIRECCION = new JLabel("Direccion");
		lblDIRECCION.setBounds(48, 234, 98, 14);
		frame.getContentPane().add(lblDIRECCION);
		
		JLabel lblTEL = new JLabel("Telefono");
		lblTEL.setBounds(48, 312, 108, 14);
		frame.getContentPane().add(lblTEL);
		
		JLabel lblTOTAL_COMPRA = new JLabel("Total de compra");
		lblTOTAL_COMPRA.setBounds(48, 442, 98, 14);
		frame.getContentPane().add(lblTOTAL_COMPRA);
		
		JLabel lblFORMA_PAGO = new JLabel("Forma de pago");
		lblFORMA_PAGO.setBounds(48, 399, 98, 14);
		frame.getContentPane().add(lblFORMA_PAGO);
		
		textField = new JTextField();
		textField.setBounds(141, 117, 5, -33);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		txtREGISTRO_VENTA = new JTextField();
		txtREGISTRO_VENTA.setBounds(173, 94, 255, 20);
		frame.getContentPane().add(txtREGISTRO_VENTA);
		txtREGISTRO_VENTA.setColumns(10);
		
		txtNOMBRE_CLIENTE = new JTextField();
		txtNOMBRE_CLIENTE.setColumns(10);
		txtNOMBRE_CLIENTE.setBounds(173, 126, 255, 20);
		frame.getContentPane().add(txtNOMBRE_CLIENTE);
		
		txtAPELLIDO_PAT = new JTextField();
		txtAPELLIDO_PAT.setColumns(10);
		txtAPELLIDO_PAT.setBounds(173, 163, 260, 20);
		frame.getContentPane().add(txtAPELLIDO_PAT);
		
		txtAPELLIDO_MAT = new JTextField();
		txtAPELLIDO_MAT.setColumns(10);
		txtAPELLIDO_MAT.setBounds(173, 198, 255, 20);
		frame.getContentPane().add(txtAPELLIDO_MAT);
		
		txtDIRECCION = new JTextField();
		txtDIRECCION.setColumns(10);
		txtDIRECCION.setBounds(173, 231, 255, 20);
		frame.getContentPane().add(txtDIRECCION);
		
		txtTELEFONO_LOCAL = new JTextField();
		txtTELEFONO_LOCAL.setColumns(10);
		txtTELEFONO_LOCAL.setBounds(173, 276, 255, 20);
		frame.getContentPane().add(txtTELEFONO_LOCAL);
		
		txtTELEFONO = new JTextField();
		txtTELEFONO.setColumns(10);
		txtTELEFONO.setBounds(173, 309, 255, 20);
		frame.getContentPane().add(txtTELEFONO);
		
		txtTIPO_PRODUCTO = new JTextField();
		txtTIPO_PRODUCTO.setColumns(10);
		txtTIPO_PRODUCTO.setBounds(173, 353, 255, 20);
		frame.getContentPane().add(txtTIPO_PRODUCTO);
		
		txtFORMA_PAGO = new JTextField();
		txtFORMA_PAGO.setColumns(10);
		txtFORMA_PAGO.setBounds(173, 396, 255, 20);
		frame.getContentPane().add(txtFORMA_PAGO);
		
		txtTOTAL_COMPRA = new JTextField();
		txtTOTAL_COMPRA.setColumns(10);
		txtTOTAL_COMPRA.setBounds(173, 439, 255, 20);
		frame.getContentPane().add(txtTOTAL_COMPRA);
		
		JButton btnGUARDAR = new JButton("GUARDAR");
		btnGUARDAR.setBounds(525, 88, 108, 23);
		frame.getContentPane().add(btnGUARDAR);
		
		JButton btnCONSULTAR = new JButton("CONSULTAR");
		btnCONSULTAR.setBounds(525, 145, 108, 23);
		frame.getContentPane().add(btnCONSULTAR);
		
		JButton btnACTUALIZAR = new JButton("ACTUALIZAR");
		btnACTUALIZAR.setBounds(525, 218, 108, 23);
		frame.getContentPane().add(btnACTUALIZAR);
		
		JButton btnELIMINAR = new JButton("ELIMINAR");
		btnELIMINAR.setBounds(525, 289, 108, 23);
		frame.getContentPane().add(btnELIMINAR);
	}
}
