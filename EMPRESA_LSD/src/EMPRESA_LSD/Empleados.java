package EMPRESA_LSD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class Empleados {

	private JFrame frame;
	private JTextField txtID_EMPLEADO;
	private JTextField txtAPELLIDO_PAT;
	private JTextField txtAPELLIDO_MAT;
	private JTextField txtDIRECCION;
	private JTextField txtFECHA_NACIMIENTO;
	private JTextField txtTELEFONO;
	private JTextField txtCORREO;
	private JTextField txtREFERENCIAS;
	private JTextField txtHORARIO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Empleados window = new Empleados();
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
	public Empleados() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 785, 564);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("EMPLEADOS ");
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.PLAIN, 19));
		lblNewLabel.setBounds(346, 21, 111, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblID_EMPLEADO = new JLabel("ID EMPLEADO ");
		lblID_EMPLEADO.setBounds(45, 56, 111, 14);
		frame.getContentPane().add(lblID_EMPLEADO);
		
		JLabel lblAPELLIDO_MATEE = new JLabel("APELLIDO MATERNO");
		lblAPELLIDO_MATEE.setBounds(45, 134, 111, 14);
		frame.getContentPane().add(lblAPELLIDO_MATEE);
		
		JLabel lblDIRECCIONN = new JLabel("DIRECCION ");
		lblDIRECCIONN.setBounds(45, 178, 111, 14);
		frame.getContentPane().add(lblDIRECCIONN);
		
		JLabel lblFECHA_NACIMIENTO = new JLabel("FECHA DE NACIMIENTO ");
		lblFECHA_NACIMIENTO.setBounds(45, 222, 140, 14);
		frame.getContentPane().add(lblFECHA_NACIMIENTO);
		
		JLabel lblTELEFON = new JLabel("TELEFONO");
		lblTELEFON.setBounds(45, 268, 111, 14);
		frame.getContentPane().add(lblTELEFON);
		
		JLabel lblCORREROO = new JLabel("CORREO ");
		lblCORREROO.setBounds(45, 313, 111, 14);
		frame.getContentPane().add(lblCORREROO);
		
		JLabel lblREFERENCIA = new JLabel("REFERENCIAS ");
		lblREFERENCIA.setBounds(45, 353, 111, 14);
		frame.getContentPane().add(lblREFERENCIA);
		
		JLabel lblHORARIO = new JLabel("HORARIO");
		lblHORARIO.setBounds(45, 399, 111, 14);
		frame.getContentPane().add(lblHORARIO);
		
		txtID_EMPLEADO = new JTextField();
		txtID_EMPLEADO.setBounds(230, 53, 429, 20);
		frame.getContentPane().add(txtID_EMPLEADO);
		txtID_EMPLEADO.setColumns(10);
		
		txtAPELLIDO_PAT = new JTextField();
		txtAPELLIDO_PAT.setColumns(10);
		txtAPELLIDO_PAT.setBounds(230, 89, 429, 20);
		frame.getContentPane().add(txtAPELLIDO_PAT);
		
		txtAPELLIDO_MAT = new JTextField();
		txtAPELLIDO_MAT.setColumns(10);
		txtAPELLIDO_MAT.setBounds(230, 131, 429, 20);
		frame.getContentPane().add(txtAPELLIDO_MAT);
		
		txtDIRECCION = new JTextField();
		txtDIRECCION.setColumns(10);
		txtDIRECCION.setBounds(230, 175, 429, 20);
		frame.getContentPane().add(txtDIRECCION);
		
		txtFECHA_NACIMIENTO = new JTextField();
		txtFECHA_NACIMIENTO.setColumns(10);
		txtFECHA_NACIMIENTO.setBounds(230, 219, 429, 20);
		frame.getContentPane().add(txtFECHA_NACIMIENTO);
		
		txtTELEFONO = new JTextField();
		txtTELEFONO.setColumns(10);
		txtTELEFONO.setBounds(230, 265, 429, 20);
		frame.getContentPane().add(txtTELEFONO);
		
		txtCORREO = new JTextField();
		txtCORREO.setColumns(10);
		txtCORREO.setBounds(230, 310, 429, 20);
		frame.getContentPane().add(txtCORREO);
		
		txtREFERENCIAS = new JTextField();
		txtREFERENCIAS.setColumns(10);
		txtREFERENCIAS.setBounds(230, 350, 429, 20);
		frame.getContentPane().add(txtREFERENCIAS);
		
		txtHORARIO = new JTextField();
		txtHORARIO.setColumns(10);
		txtHORARIO.setBounds(230, 396, 429, 20);
		frame.getContentPane().add(txtHORARIO);
		
		JLabel lblAPELLIDO_PATEE = new JLabel("APELLIDO PATERNO");
		lblAPELLIDO_PATEE.setBounds(45, 92, 98, 14);
		frame.getContentPane().add(lblAPELLIDO_PATEE);
		
		JButton btnGUARDAR = new JButton("GUARDAR");
		btnGUARDAR.setBounds(135, 445, 111, 23);
		frame.getContentPane().add(btnGUARDAR);
		
		JButton btnCONSULTAR = new JButton("CONSULTAR");
		btnCONSULTAR.setBounds(281, 445, 111, 23);
		frame.getContentPane().add(btnCONSULTAR);
		
		JButton btnACTUALIZAR = new JButton("ACTUALIZAR");
		btnACTUALIZAR.setBounds(434, 445, 111, 23);
		frame.getContentPane().add(btnACTUALIZAR);
		
		JButton btnELIMINAR = new JButton("ELIMINAR ");
		btnELIMINAR.setBounds(596, 445, 111, 23);
		frame.getContentPane().add(btnELIMINAR);
	}

}
