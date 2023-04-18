package EMPRESA_LSD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexion {
    private static final String conector = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/elotesLSD";
	private static final String usuario = "root";
	private static final String password = "";
	static {
		try {
			Class.forName(conector);
			System.out.println("Conexion a la base chida :)");
			
		}catch (ClassNotFoundException e) {
			System.out.println("Error la base no se conecto");
			e.printStackTrace();
		}	
	}

	public Connection conectar () {
		Connection LA = null;
		try {
			LA = DriverManager.getConnection(url, usuario, password);
			System.out.println("Conexion exitosa con la B.D :)");
		}catch(SQLException e) {
			System.out.print("Conexion fallida con la B.D :(");
			e.printStackTrace();
		}
		return LA;
	}
	
	
	//MATERIA_PRIMA_INSERTAR
	public boolean insertarMATERIA_PRIMA(Variables ng) {
		  PreparedStatement ps=null;
		  
		  try {
			  ps= conectar().prepareStatement("INSERT INTO MATERIA_PRIMA VALUES (?,?,?,?,?,?)");
			  ps.setInt(1, ng.getID_MATERIA_PRIMA());
			  ps.setString(2, ng.getTIPO_DE_MATERIA_PRIMA());
			  ps.setString(3, ng.getCANTIDAD_DE_MATERIA_PRIMA());
			  ps.setString(4, ng.getFECHA_DE_CADUCIDAD());
			  ps.setString(5, ng.getFECHA_DE_SALIDA());
			  ps.setString(7, ng.getFECHA_DE_SALIDA());
			  ps.executeUpdate();
			  
			  return true;
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
			  return false;
		  }
		  
	  }
	
	//PRODUCTO_INSERTAR
	public boolean insertarPRODUCTO(Variables ng) {
		  PreparedStatement ps=null;
		  
		  try {
			  ps= conectar().prepareStatement("INSERT INTO PRODUCTO VALUES (?,?,?,?,?)");
			  ps.setInt(1, ng.getID_DE_MATERIA_PRUEBA());
			  ps.setString(2, ng.getNOMBRE_DEL_PRODUCTO());
			  ps.setString(3, ng.getCALIDAD());
			  ps.setString(4, ng.getTIPO_DE_PRODUCTO());
			  ps.setString(5, ng.getMARCA_PRODUCTO());
			  ps.executeUpdate();
			  
			  return true;
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
			  return false;
		  }
		  
	  }
	
	//EMPLEADOS_INSERTAR
	public boolean insertarEMPLEADOS(Variables ng) {
		  PreparedStatement ps=null;
		  
		  try {
			  ps= conectar().prepareStatement("INSERT INTO EMPLEADOS VALUES (?,?,?,?,?,?,?,?,?,?,?)");
			  ps.setInt(1, ng.getID_DEL_EMPLEADO());
			  ps.setString(2, ng.getNOMBRE_EMPLEADO());
			  ps.setString(3, ng.getAPELLIDO_PATERNO());
			  ps.setString(4, ng.getAPELLIDO_MATERNO());
			  ps.setString(5, ng.getDIRECCION_EMPLEADO());
			  ps.setString(6, ng.getFECHA_DE_NACIMIENTO());
			  ps.setString(7, ng.getHORARIO());
			  ps.setString(8, ng.getTELEFONO_PERSONAL());
			  ps.setString(9, ng.getCORREO_ELECTRONICO());
			  ps.setString(10, ng.getNUMERO_SEGURIDAD_SOCIAL());
			  ps.setString(11, ng.getREFERENCIA());
			  ps.executeUpdate();
			  
			  return true;
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
			  return false;
		  }
		  
	  }
	
	//PROVEDORES_INSERTAR
	public boolean insertarPROVEDORES(Variables ng) {
		  PreparedStatement ps=null;
		  
		  try {
			  ps= conectar().prepareStatement("INSERT INTO PROVEDORES VALUES (?,?,?,?,?)");
			  ps.setInt(1, ng.getID_PRODUCTO());
			  ps.setString(2, ng.getNOMBRE_PRODUCTO());
			  ps.setString(3, ng.getCALIDAD_PRODUCTO());
			  ps.setString(4, ng.getPRECIO_PRODUCTO());
			  ps.setString(5, ng.getCONTENIDO_DEL_PRODUCTO());
			  ps.executeUpdate();
			  
			  return true;
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
			  return false;
		  }
		  
	  }
	
	//CLIENTES_INSERTAR
	public boolean insertarCLIENTES(Variables ng) {
		  PreparedStatement ps=null;
		  
		  try {
			  ps= conectar().prepareStatement("INSERT INTO CLIENTES VALUES (?,?,?,?,?,?,?)");
			  ps.setInt(1, ng.getID_PROVEDOR());
			  ps.setString(2, ng.getNOMBRE_COMPLETO_PROVEDOR());
			  ps.setString(3, ng.getTELEFONO());
			  ps.setString(4, ng.getCORREO());
			  ps.setString(5, ng.getDIRECCION());
			  ps.setString(6, ng.getTIPO_DEL_PRODUCTO());
			  ps.setString(7, ng.getCANTIDAD_DEL_PRODUCTO());
			  ps.executeUpdate();
			  
			  return true;
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
			  return false;
		  }
		  
	  }
	
	//VENTAS_INSERTAR
	public boolean insertarVENTAS(Variables ng) {
		  PreparedStatement ps=null;
		  
		  try {
			  ps= conectar().prepareStatement("INSERT INTO VENTAS VALUES (?,?,?,?)");
			  ps.setInt(1, ng.getID_CLIENTE());
			  ps.setString(2, ng.getNOMBRE_DEL_CLIENTE());
			  ps.setString(3, ng.getAPELLIDO_PAT());
			  ps.setString(4, ng.getAPELLIDO_MAT());
			  ps.setString(4, ng.getTELEFONO());
			  ps.setString(4, ng.getTIPO_DEL_PRODUCTO());
			  ps.executeUpdate();
			  
			  return true;
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
			  return false;
		  }
		  
	  }
	
	//COMPRAS_INSERTAR
	public boolean insertarCOMPRAS(Variables ng) {
		  PreparedStatement ps=null;
		  
		  try {
			  ps= conectar().prepareStatement("INSERT INTO COMPRAS VALUES (?,?,?,?)");
			  ps.setInt(1, ng.getID_PRODUCTO());
			  ps.setString(2, ng.getPRECIO_PRODUCTO());
			  ps.setString(3, ng.getNOMBRE_PRODUCTO());
			  ps.setString(4, ng.getNUMERO_PIEZAS());
			  ps.setString(5, ng.getMARCA());
			  ps.setString(6, ng.getCANTIDAD());
			  ps.setString(7, ng.getCONTENIDO());
			  ps.executeUpdate();
			  
			  return true;
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
			  return false;
		  }
		  
	  }
	//metodo_consultar_CLIENTE
	
		public boolean consultarCLIENTE(Variables ng) {
			PreparedStatement ps=null;
			ResultSet rs=null;
			
			try {
				ps=conectar().prepareStatement("SELECT * FROM CLIENTE WHERE ID_CLIENTE=?");
				 ps.setInt(1, ng.getID_CLIENTE());
				rs=ps.executeQuery();
				
				if(rs.next()) {
					ng.setID_CLIENTE(rs.getInt("ID_CLIENTE"));
					ng.setNOMBRE_DEL_CLIENTE(rs.getString("NOMBRE_CLIENTE"));
					ng.setAPELLIDO_PAT(rs.getString("APELLIDO_PAT"));
					ng.setAPELLIDO_MAT(rs.getString("APELLIDO_MAT"));
					ng.setTELEFONO(rs.getString("TELEFONO"));}
					
					return true;
				}catch(SQLException e) {
					e.printStackTrace();
					return false;
					
				}
			
		}
		
		
		//metodo_consultar_VENTAS
		
			public boolean consultarVENTAS(Variables ng) {
				PreparedStatement ps=null;
				ResultSet rs=null;
				
				try {
					ps=conectar().prepareStatement("SELECT * FROM VENTAS WHERE VENTAS=?");
					 ps.setInt(1, ng.getID_VENTAS());
					rs=ps.executeQuery();
					
					if(rs.next()) {
						ng.setID_CLIENTE(rs.getInt("REGISTRO_VETAS"));
						ng.setNOMBRE_DEL_CLIENTE(rs.getString("NOMBRE_CLIENTE"));
						ng.setAPELLIDO_PAT(rs.getString("APELLIDO_PAT"));
						ng.setAPELLIDO_MAT(rs.getString("APELLIDO_MAT"));
						ng.setDIRECCION(rs.getString("DIRECCION"));
						ng.setTELEFONO(rs.getString("TELEFONO"));
						ng.setTIPO_DEL_PRODUCTO(rs.getString("TIPO_DEL_PRODUCTO"));
						ng.setTELEFONO(rs.getString("TELEFONO_LOCAL"));}
						
						return true;
					}catch(SQLException e) {
						e.printStackTrace();
						return false;
						
					}
				
			}
			

			//metodo_consultar_PROVEDORES
			
				public boolean consultarPROVEDORES(Variables ng) {
					PreparedStatement ps=null;
					ResultSet rs=null;
					
					try {
						ps=conectar().prepareStatement("SELECT * FROM PROVEDORES WHERE PROVEDORES=?");
						 ps.setInt(1, ng.getID_PROVEDOR());
						rs=ps.executeQuery();
						
						if(rs.next()) {
							ng.setID_CLIENTE(rs.getInt("ID_PRODUCTO"));
							ng.setNOMBRE_DEL_CLIENTE(rs.getString("NOMBRE_COMPLETO"));
							ng.setAPELLIDO_PAT(rs.getString("TELEFONO"));
							ng.setAPELLIDO_MAT(rs.getString("CORREO"));
							ng.setDIRECCION(rs.getString("DIRECCION"));
							ng.setTIPO_DEL_PRODUCTO(rs.getString("TIPO_PRODUCTO"));
							ng.setCANTIDAD(rs.getString("CANTIDAD"));}
							
							return true;
						}catch(SQLException e) {
							e.printStackTrace();
							return false;
							
						}
					
				}
				
				//metodo_consultar_EMPLEDOS
				
				public boolean consultarEMPLEADOS(Variables ng) {
					PreparedStatement ps=null;
					ResultSet rs=null;
					
					try {
						ps=conectar().prepareStatement("SELECT * FROM EMPLEADOS WHERE EMPLEADOS=?");
						 ps.setInt(1, ng.getID_DEL_EMPLEADO());
						rs=ps.executeQuery();
						
						if(rs.next()) {
							ng.setNOMBRE_EMPLEADO(rs.getString("NOMBRE_EMPLEADO"));
							ng.setAPELLIDO_PAT(rs.getString("APELLIDO_PAT"));
							ng.setAPELLIDO_MAT(rs.getString("APELLIDO_MAT"));
							ng.setDIRECCION_EMPLEADO(rs.getString("DIRECCION_EMPLEADO"));
							ng.setHORARIO(rs.getString("HORARIO"));
							ng.setTELEFONO_PERSONAL(rs.getString("TELEFONO_PERSONAL"));
							ng.setCORREO_ELECTRONICO(rs.getString("CORREO_ELECTRONICO"));
							ng.setNUMERO_SEGURIDAD_SOCIAL(rs.getString("NUMERO_SEGURIDAD_SOCIAL"));
							ng.setREFERENCIA(rs.getString("REFERENCIA"));
							ng.setFECHA_DE_NACIMIENTO(rs.getString("FECHA_DE_NACIMIENTO"));}
							
							return true;
						}catch(SQLException e) {
							e.printStackTrace();
							return false;
							
						}
					
				}
				
//metodo_consultar_PRODUCTO
				
				public boolean consultarPRODUCTO(Variables ng) {
					PreparedStatement ps=null;
					ResultSet rs=null;
					
					try {
						ps=conectar().prepareStatement("SELECT * FROM PRODUCTO WHERE PRODUCTO=?");
						 ps.setInt(1, ng.getID_PRODUCTO());
						rs=ps.executeQuery();
						
						if(rs.next()) {
							ng.setNOMBRE_EMPLEADO(rs.getString("NOMBRE_DEL_PRODUCTO"));
							ng.setAPELLIDO_PAT(rs.getString("CALIDAD"));
							ng.setAPELLIDO_MAT(rs.getString("FECHA_DE_CADUCIDAD"));
							ng.setDIRECCION_EMPLEADO(rs.getString("TIPO_DE_PRODUCTO"));
							ng.setHORARIO(rs.getString("MARCA_PRODUCTO"));}
							
							return true;
						}catch(SQLException e) {
							e.printStackTrace();
							return false;
							
						}
					
				}
				
//metodo_consultar_COMPRAS
				
				public boolean consultarCOMPRAS(Variables ng) {
					PreparedStatement ps=null;
					ResultSet rs=null;
					
					try {
						ps=conectar().prepareStatement("SELECT * FROM COMPRAS WHERE COMPRAS=?");
						 ps.setInt(1, ng.getID_PRODUCTO());
						rs=ps.executeQuery();
						
						if(rs.next()) {
							ng.setID_CLIENTE(rs.getInt("ID_PRODUCTO"));
							ng.setNOMBRE_PRODUCTO(rs.getString("NOMBRE_PRODUCTO"));
							ng.setTIPO_DE_PRODUCTO(rs.getString("TIPO_DE_PRODUCTO"));
							ng.setMARCA_PRODUCTO(rs.getString("MARCA_PRODUCTO"));
							ng.setCALIDAD_PRODUCTO(rs.getString("CALIDAD_PRODUCTO"));
							ng.setPRECIO_PRODUCTO(rs.getString("PRECIO_PRODUCTO"));}
							
							return true;
						}catch(SQLException e) {
							e.printStackTrace();
							return false;
							
						}
					
				}
				
//metodo_consultar_MATERIA_PRIMA
				
				public boolean consultarMATERIA_PRIMA(Variables ng) {
					PreparedStatement ps=null;
					ResultSet rs=null;
					
					try {
						ps=conectar().prepareStatement("SELECT * FROM MATERIA_PRIMA WHERE MATERIA_PRIMA=?");
						 ps.setInt(1, ng.getID_MATERIA_PRIMA());
						rs=ps.executeQuery();
						
						if(rs.next()) {
							ng.setNOMBRE_EMPLEADO(rs.getString("TIPO_DE_MATERIA_PRIMA"));
							ng.setAPELLIDO_PAT(rs.getString("CANTIDAD_DE_MATERIA_PRIMA"));
							ng.setAPELLIDO_MAT(rs.getString("FECHA_DE_CADUCIDAD"));
							ng.setDIRECCION_EMPLEADO(rs.getString("FECHA_DE_ENTRADA"));
							ng.setHORARIO(rs.getString("FECHA_DE_SALIDA"));}
							
							return true;
						}catch(SQLException e) {
							e.printStackTrace();
							return false;
							
						}
					
				}
	
	//ELIMINAR_MATERIA_PRIMA
	public boolean eliminarMATERIA_PRIMA(int ID_MATERIA_PRIMA){
		  PreparedStatement ps=null;
		  
		  try {
			  ps=conectar().prepareStatement("DELATE FROM MATERIA_PRIMA WHERE ID_MATERIA_PRIMA=?");
			  ps.setInt(1,ID_MATERIA_PRIMA);
			  ps.executeUpdate();
			  
			  return true;
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
			  return false;
			  
		  }
			  
		  }
	
	//ELIMINAR_PRODUCTO
	public boolean eliminarPRODUCTO(int ID_PRODUCTO){
		  PreparedStatement ps=null;
		  
		  try {
			  ps=conectar().prepareStatement("DELATE FROM PRODUCTO WHERE ID_MATERIA_PRUEBA=?");
			  ps.setInt(1,ID_PRODUCTO);
			  ps.executeUpdate();
			  
			  return true;
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
			  return false;
			  
		  }
			  
		  }
	
	//ELIIMINAR_EMPLEADOS
	public boolean eliminarEMPLEADOS(int ID_DEL_EMPLEADO){
		  PreparedStatement ps=null;
		  
		  try {
			  ps=conectar().prepareStatement("DELATE FROM EMPLEADOS WHERE ID_DEL_EMPLEADO=?");
			  ps.setInt(1,ID_DEL_EMPLEADO);
			  ps.executeUpdate();
			  
			  return true;
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
			  return false;
			  
		  }
			  
		  }
	
	//ELIMINAR_PROVEDORES
	public boolean eliminarPROVEDORES(int ID_PROVEDORES){
		  PreparedStatement ps=null;
		  
		  try {
			  ps=conectar().prepareStatement("DELATE FROM PROVEDORES WHERE ID_PRODUCTO=?");
			  ps.setInt(1,ID_PROVEDORES);
			  ps.executeUpdate();
			  
			  return true;
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
			  return false;
			  
		  }
			  
		  }
	
	//ELIMINAR_CLIENTES
	public boolean eliminarCLIENTES(int ID_CLIENTES){
		  PreparedStatement ps=null;
		  
		  try {
			  ps=conectar().prepareStatement("DELATE FROM CLIENTES WHERE ID_PROVEDOR=?");
			  ps.setInt(1,ID_CLIENTES);
			  ps.executeUpdate();
			  
			  return true;
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
			  return false;
			  
		  }
			  
		  }
	
	//ELIMINAR_VENTAS
	public boolean ELIMINAR_VENTAS(int ID_VENTAS){
		  PreparedStatement ps=null;
		  
		  try {
			  ps=conectar().prepareStatement("DELATE FROM VENTAS WHERE ID_CLIENTE=?");
			  ps.setInt(1,ID_VENTAS);
			  ps.executeUpdate();
			  
			  return true;
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
			  return false;
			  
		  }
			  
		  }
	
	//ELIMINAR_COMPRAS
	public boolean eliminarCOMPRAS(int ID_COMPRAS){
		  PreparedStatement ps=null;
		  
		  try {
			  ps=conectar().prepareStatement("DELATE FROM COMPRAS WHERE ID_VENTAS=?");
			  ps.setInt(1,ID_COMPRAS);
			  ps.executeUpdate();
			  
			  return true;
			  
		  }catch(SQLException e) {
			  e.printStackTrace();
			  return false;
		  }
			  
		  }
		  //metodo_actualizar_CLIENTES
		  public boolean actualizarCLIENTES(Variables ng){
			  PreparedStatement ps=null;
			  
			  try {
				  ps=conectar().prepareStatement("UPDATE CLIENTES SET ID_=?,NOMBRE_CLIENTE=?,APELLIDO_PATERNO=?,APELLIDO_MATERNO=?,TELEFONO=?");
				  ps.setInt(1,ng.getID_CLIENTE());
				  ps.setInt(2,ng.getNOMBRE_CLIENTE());
				  ps.setString(3,ng.getAPELLIDO_PATERNO());
				  ps.executeUpdate();
				  
				  return true;
				  
			  }catch(SQLException e) {
				  e.printStackTrace();
				  return false;
				  
				  
			  }
			
		  
		  }
		  
		  //ACTUALIZAR MATERIA PRIMA///////////////////////////////
		  public boolean actualizarMATERIA_PRIMA(Variables ng) {
		  	  PreparedStatement ps=null;
		  	  
		  	  try {
		  		  ps= conectar().prepareStatement("UPDATE MATERIA_PRIMA SET ID_MATERIA_PRIMA=?,TIPO_DE_MATERIA_PRIMA=?,CANTIDAD_DE_MATERIA_PRIMA=?,FECHA_DE_CADUCIDAD=?,FECHA_DE_ENTRADA=?,FECHA_DE_SALIDA=?");
		  		  ps.setInt(1, ng.getID_MATERIA_PRIMA());
		  		  ps.setString(2, ng.getTIPO_DE_MATERIA_PRIMA());
		  		  ps.setString(3, ng.getCANTIDAD_DE_MATERIA_PRIMA());
		  		  ps.setString(4, ng.getFECHA_DE_CADUCIDAD());
		  		  ps.setString(5, ng.getFECHA_DE_ENTRADA());
		  		  ps.setString(6, ng.getFECHA_DE_SALIDA());
		  		  ps.executeUpdate();
		  		  
		  		  return true;
		  		  
		  	  }catch(SQLException e) {
		  		  e.printStackTrace();
		  		  return false;
		  	  }
		  	  
		  }
		  
		  //ACTUALIZAR PRODUCTO//////////////////////////////
		  public boolean actualizarPRODUCTO(Variables ng) {
		  	  PreparedStatement ps=null;
		  	  
		  	  try {
		  		  ps= conectar().prepareStatement("UPDATE PRODUCTO SET ID_DE_MATERIA_PRUEBA=?,NOMBRE_DEL_PRODUCTO=?,CALIDAD=?,TIPO_DE_PRODUCTO=?,MARCA_PRODUCTO=?");
		  		  ps.setInt(1, ng.getID_DE_MATERIA_PRUEBA());
		  		  ps.setString(2, ng.getNOMBRE_DEL_PRODUCTO());
		  		  ps.setString(3, ng.getCALIDAD());
		  		  ps.setString(4, ng.getTIPO_DE_PRODUCTO());
		  		  ps.setString(5, ng.getMARCA_PRODUCTO());
		  		  ps.executeUpdate();
		  		  
		  		  return true;
		  		  
		  	  }catch(SQLException e) {
		  		  e.printStackTrace();
		  		  return false;
		  	  }
		  	  
		  }
		  
		 //ACTUALIZAR EMPLEADOS///////////////////// 
		  public boolean actualizarEMPLEADOS(Variables ng) {
		  	  PreparedStatement ps=null;
		  	  
		  	  try {
		  		  ps= conectar().prepareStatement("UPDATE EMPLEAODS SET ID_DEL_EMPLEADO=?,NOMBRE_EMPLEADO=?,APELLIDO_PATERNO=?,APELLIDO_MATERNO=?,DIRECCION_EMPLEADO=?,FECHA_DE_NACIMIENTO=?,HORARIO=?,TELEFONO_PERSONAL=?,CORREO_ELECTRONICO=?,NUMERO_SEGURIDAD_SOCIAL=?");
		  		  ps.setInt(1, ng.getID_DEL_EMPLEADO());
		  		  ps.setString(2, ng.getNOMBRE_EMPLEADO());
		  		  ps.setString(3, ng.getAPELLIDO_PATERNO());
		  		  ps.setString(4, ng.getAPELLIDO_MATERNO());
		  		  ps.setString(5, ng.getDIRECCION_EMPLEADO());
		  		  ps.setString(6, ng.getFECHA_DE_NACIMIENTO());
		  		  ps.setString(6, ng.getHORARIO());
		  		  ps.setString(6, ng.getTELEFONO_PERSONAL());
		  		  ps.setString(6, ng.getCORREO_ELECTRONICO());
		  		  ps.setString(6, ng.getNUMERO_SEGURIDAD_SOCIAL());
		  		  ps.executeUpdate();
		  		  
		  		  return true;
		  		  
		  	  }catch(SQLException e) {
		  		  e.printStackTrace();
		  		  return false;
		  	  }
		  	  
		  } 
		  
		  //ACTUALIZAR PROVEDORES////////////////////////
		  public boolean actualizarPROVEDORES(Variables ng) {
		  	  PreparedStatement ps=null;
		  	  
		  	  try {
		  		  ps= conectar().prepareStatement("UPDATE PROVEDORES SET ID_PROVEDOR=?,NOMBRE_COMPLETO_PROVEDOR=?,TELFONO=?,CORREO=?,DIRECCION=?,TIPO_DEL_PRODUCTO=?,CANTIDAD_DEL_PRODUCTO=?");
		  		  ps.setInt(1, ng.getID_PROVEDOR());
		  		  ps.setString(2, ng.getNOMBRE_COMPLETO_PROVEDOR());
		  		  ps.setString(3, ng.getTELEFONO());
		  		  ps.setString(4, ng.getCORREO());
		  		  ps.setString(5, ng.getDIRECCION());
		  		  ps.setString(5, ng.getTIPO_DEL_PRODUCTO());
		  		  ps.setString(5, ng.getCANTIDAD_DEL_PRODUCTO());
		  		  ps.executeUpdate();
		  		  
		  		  return true;
		  		  
		  	  }catch(SQLException e) {
		  		  e.printStackTrace();
		  		  return false;
		  	  }
		  	 
		  	  //ACTUALIZAR VENTAS///////////////////
		  }
		  
		  
		  public boolean actualizarVENTAS(Variables ng) {
		  	  PreparedStatement ps=null;
		  	  
		  	  try {
		  		  ps= conectar().prepareStatement("UPDATE VENTAS SET ID_VENTAS=?,PRECIO_DEL_PRODUCTO=?,CANTIDAD_VENDIDA_DEL_PRODUCTO=?,TOTAL_DE_COMPRA=?,");
		  		  ps.setInt(1, ng.getID_VENTAS());
		  		  ps.setString(2, ng.getPRECIO_DEL_PRODUCTO());
		  		  ps.setString(3, ng.getCANTIDAD_VENDIDA_DEL_PRODUCTO());
		  		  ps.setString(4, ng.getTOTAL_DE_COMPRA());
		  		  ps.executeUpdate();
		  		  
		  		  return true;
		  		  
		  	  }catch(SQLException e) {
		  		  e.printStackTrace();
		  		  return false;
		  	  }
		  	  
		  }
		  //ACTUALIZAR COMPRAS////////////////////////
		  public boolean actualizarCOMPRAS(Variables ng) {
		  	  PreparedStatement ps=null;
		  	  
		  	  try {
		  		  ps= conectar().prepareStatement("UPDATE COMPRAS SET ID_PROVEDOR=?,NOMBRE_COMPLETO_PROVEDOR=?,TELFONO=?,CORREO=?,DIRECCION=?,TIPO_DEL_PRODUCTO=?,CANTIDAD_DEL_PRODUCTO=?");
		  		  ps.setInt(1, ng.getID_PRODUCTO());
		  		  ps.setString(2, ng.getPRECIO_PRODUCTO());
		  		  ps.setString(3, ng.getNOMBRE_PRODUCTO());
		  		  ps.setString(4, ng.getNUMERO_PIEZAS());
		  		  ps.setString(5, ng.getMARCA());
		  		  ps.setString(6, ng.getCANTIDAD());
		  		  ps.setString(7, ng.getCONTENIDO());
		  		  ps.executeUpdate();
		  		  
		  		  return true;
		  		  
		  	  }catch(SQLException e) {
		  		  e.printStackTrace();
		  		  return false;
		  	  }  
}
}