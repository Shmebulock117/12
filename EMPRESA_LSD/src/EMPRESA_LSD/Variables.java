package EMPRESA_LSD;

public class Variables {
	int ID_PROVEDOR;
	int ID_PRODUCTOSS;
	//NOSE
	
	String TEL;
	String CONTENIDO;
	String CANTIDAD;
	String MARCA;
	String NUMERO_PIEZAS;
	String APELLIDO_PATT;
	String APELLIDO_MATT;
	
	//COMPRAS
	String TOTAL_DE_COMPRA;
	String CANTIDAD_VENDIDA_DEL_PRODUCTO;
	String PRECIO_DEL_PRODUCTO;
	int ID_VENTAS;
	//VENTAS
	
	String APELLIDO_MAT;
	String APELLIDO_PAT;
	String NOMBRE_DEL_CLIENTE;
	String NOMBRE_CLIENTE;
	int ID_CLIENTE;
	//CLIENTES
	String CANTIDAD_DEL_PRODUCTO;
	String TIPO_DEL_PRODUCTO;
	String DIRECCION;
	String CORREO;
	String TELEFONO;
	String NOMBRE_COMPLETO_PROVEDOR;
	int ID_CLIENTES;
	//PROVEDORES
	String CONTENIDO_DEL_PRODUCTO;
	String PRECIO_PRODUCTO;
	String CALIDAD_PRODUCTO;
	String NOMBRE_PRODUCTO;
	int ID_PRODUCTO;
	//EMPLEADOS
	String REFERENCIA;
	String NUMERO_SEGURIDAD_SOCIAL;
	String CORREO_ELECTRONICO;
	String TELEFONO_PERSONAL;
	String HORARIO;
	String FECHA_DE_NACIMIENTO;
	String DIRECCION_EMPLEADO;
	String APELLIDO_MATERNO;
	String APELLIDO_PATERNO;
	String NOMBRE_EMPLEADO;
	int ID_DEL_EMPLEADO;
	// PRODUCTO
	
	String MARCA_PRODUCTO;
 String TIPO_DE_PRODUCTO;
	String CALIDAD;
	String NOMBRE_DEL_PRODUCTO;
	int ID_DE_MATERIA_PRUEBA;
	//MATERIA PRIMA
	String FECHA_DE_SALIDA;
	String FECHA_DE_ENTRADA;
	String FECHA_DE_CADUCIDAD;
	String CANTIDAD_DE_MATERIA_PRIMA;
	String  TIPO_DE_MATERIA_PRIMA;
	int  ID_MATERIA_PRIMA;
	
	String confirmacion;
	Conexion dc=null;
	public Variables() {
		
	}
	//MATERIA_PRIMA//
	//insertar_materia_prima//
	
	public boolean insertarM() {
		if(dc.insertarMATERIA_PRIMA(this)) {
			return true;
		} else {
			return false;
		}
	}
	
	//consultar_materia_prima//
		public boolean consultarM() {
			if(dc.consultarMATERIA_PRIMA(this)) {
				return true;
			} else {
				return false;
			}
		}
	
	//actualizar_materia_prima//
	public boolean actualizarM() {
		if(dc.actualizarMATERIA_PRIMA(this)) {
			return true;
		} else {
			return false;
		}
	}
	
	//elimar_materia_prima//
	public boolean elimarM() {
		if(dc.eliminarMATERIA_PRIMA(this.ID_DE_MATERIA_PRUEBA)) {
			return true;
		} else {
			return false;
		}
	}
	
	//PRODUCTO//
	//insertar_producto//
	
	public boolean insertarP() {
		if(dc.insertarPRODUCTO(this)) {
			return true;
		} else {
			return false;
		}
	}
	
	//consultar_producto//
		public boolean consultarP() {
			if(dc.consultarPRODUCTO(this)) {
				return true;
			} else {
				return false;
			}
		}
		
		//actualizar_producto//
		public boolean actualizarP() {
			if(dc.actualizarPRODUCTO(this)) {
				return true;
			} else {
				return false;
			}
		}
		
		//elimar_producto//
		public boolean elimarP() {
			if(dc.eliminarPRODUCTO(this.ID_PRODUCTO)) {
				return true;
			} else {
				return false;
			}
		}
		
		//EMPLEADOS//
		//insertar_EMPLEADO//
		
		public boolean insertarE() {
			if(dc.insertarEMPLEADOS(this)) {
				return true;
			} else {
				return false;
			}
		}
		
		//consultar_EMPLEADO//
			public boolean consultarE() {
				if(dc.consultarEMPLEADOS(this)) {
					return true;
				} else {
					return false;
				}
			}
			
			//actualizar_EMPLEADOS//
			public boolean actualizarE() {
				if(dc.actualizarEMPLEADOS(this)) {
					return true;
				} else {
					return false;
				}
			}
			
			//elimar_EMPLEADOS//
			public boolean elimarE() {
				if(dc.eliminarEMPLEADOS(this.ID_DEL_EMPLEADO)) {
					return true;
				} else {
					return false;
				}
			}
			
			//COMPRAS//
			//insertar_COMPRAS//
			
			public boolean insertarC() {
				if(dc.insertarCOMPRAS(this)) {
					return true;
				} else {
					return false;
				}
			}
			
			//consultar_COMPRAS//
				public boolean consultarC() {
					if(dc.consultarCOMPRAS(this)) {
						return true;
					} else {
						return false;
					}
				}
				
				//actualizar_COMPRAS//
				public boolean actualizarC() {
					if(dc.actualizarCOMPRAS(this)) {
						return true;
					} else {
						return false;
					}
				}
				
				//elimar_COMPRAS//
				public boolean elimarC() {
					if(dc.eliminarCOMPRAS(this.ID_PRODUCTO)) {
						return true;
					} else {
						return false;
					}
				}
				
				//PROVEDOR//
				//insertar_PROVEDOR//
				
				public boolean insertarPV() {
					if(dc.insertarPROVEDORES(this)) {
						return true;
					} else {
						return false;
					}
				}
				
				//consultar_PROVEDOR//
					public boolean consultarPV() {
						if(dc.consultarPROVEDORES(this)) {
							return true;
						} else {
							return false;
						}
					}
					
					//actualizar_PROVEDOR//
					public boolean actualizarPV() {
						if(dc.actualizarPROVEDORES(this)) {
							return true;
						} else {
							return false;
						}
					}
					
					//elimar_PROVEDOR//
					public boolean elimarPV() {
						if(dc.eliminarPROVEDORES(this.ID_PROVEDOR)) {
							return true;
						} else {
							return false;
						}
					}
					
					
					//CLIENTES//
					//insertar_CLIENTES//
					
					public boolean insertarCL() {
						if(dc.insertarCLIENTES(this)) {
							return true;
						} else {
							return false;
						}
					}
					
					//consultar_CLIENTES//
						public boolean consultarCL() {
							if(dc.consultarCLIENTE(this)) {
								return true;
							} else {
								return false;
							}
						}
						
						//actualizar_CLIENTES//
						public boolean actualizarCL() {
							if(dc.actualizarCLIENTES(this)) {
								return true;
							} else {
								return false;
							}
						}
						
						//elimar_CLIENTES//
						public boolean elimarCL() {
							if(dc.eliminarCLIENTES(this.ID_CLIENTES)) {
								return true;
							} else {
								return false;
							}
						}
			
		
						
						//VENTAS//
						//insertar_VENTAS//
						
						public boolean insertarV() {
							if(dc.insertarVENTAS(this)) {
								return true;
							} else {
								return false;
							}
						}
						
						//consultar_VENTAS//
							public boolean consultarV() {
								if(dc.consultarVENTAS(this)) {
									return true;
								} else {
									return false;
								}
							}
							
							//actualizar_VENTAS//
							public boolean actualizarV() {
								if(dc.actualizarVENTAS(this)) {
									return true;
								} else {
									return false;
								}
							}
							
							//elimar_VENTAS//
							public boolean elimarV() {
								if(dc.ELIMINAR_VENTAS(this.ID_VENTAS)) {
									return true;
								} else {
									return false;
								}
							}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	public String getTEL() {
		return TEL;
	}
	public void setTEL(String tEL) {
		TEL = tEL;
	}
	public String getCONTENIDO() {
		return CONTENIDO;
	}
	public void setCONTENIDO(String cONTENIDO) {
		CONTENIDO = cONTENIDO;
	}
	public String getCANTIDAD() {
		return CANTIDAD;
	}
	public void setCANTIDAD(String cANTIDAD) {
		CANTIDAD = cANTIDAD;
	}
	public String getMARCA() {
		return MARCA;
	}
	public void setMARCA(String mARCA) {
		MARCA = mARCA;
	}
	public String getNUMERO_PIEZAS() {
		return NUMERO_PIEZAS;
	}
	public void setNUMERO_PIEZAS(String nUMERO_PIEZAS) {
		NUMERO_PIEZAS = nUMERO_PIEZAS;
	}
	public String getAPELLIDO_PATT() {
		return APELLIDO_PATT;
	}
	public void setAPELLIDO_PATT(String aPELLIDO_PATT) {
		APELLIDO_PATT = aPELLIDO_PATT;
	}
	public String getAPELLIDO_MATT() {
		return APELLIDO_MATT;
	}
	public void setAPELLIDO_MATT(String aPELLIDO_MATT) {
		APELLIDO_MATT = aPELLIDO_MATT;
	}
	public String getTOTAL_DE_COMPRA() {
		return TOTAL_DE_COMPRA;
	}
	public void setTOTAL_DE_COMPRA(String tOTAL_DE_COMPRA) {
		TOTAL_DE_COMPRA = tOTAL_DE_COMPRA;
	}
	public String getCANTIDAD_VENDIDA_DEL_PRODUCTO() {
		return CANTIDAD_VENDIDA_DEL_PRODUCTO;
	}
	public void setCANTIDAD_VENDIDA_DEL_PRODUCTO(String cANTIDAD_VENDIDA_DEL_PRODUCTO) {
		CANTIDAD_VENDIDA_DEL_PRODUCTO = cANTIDAD_VENDIDA_DEL_PRODUCTO;
	}
	public String getPRECIO_DEL_PRODUCTO() {
		return PRECIO_DEL_PRODUCTO;
	}
	public void setPRECIO_DEL_PRODUCTO(String pRECIO_DEL_PRODUCTO) {
		PRECIO_DEL_PRODUCTO = pRECIO_DEL_PRODUCTO;
	}
	public int getID_VENTAS() {
		return ID_VENTAS;
	}
	public void setID_VENTAS(int iD_VENTAS) {
		ID_VENTAS = iD_VENTAS;
	}
	public String getAPELLIDO_MAT() {
		return APELLIDO_MAT;
	}
	public void setAPELLIDO_MAT(String aPELLIDO_MAT) {
		APELLIDO_MAT = aPELLIDO_MAT;
	}
	public String getAPELLIDO_PAT() {
		return APELLIDO_PAT;
	}
	public void setAPELLIDO_PAT(String aPELLIDO_PAT) {
		APELLIDO_PAT = aPELLIDO_PAT;
	}
	public String getNOMBRE_DEL_CLIENTE() {
		return NOMBRE_DEL_CLIENTE;
	}
	public void setNOMBRE_DEL_CLIENTE(String nOMBRE_DEL_CLIENTE) {
		NOMBRE_DEL_CLIENTE = nOMBRE_DEL_CLIENTE;
	}
	public int getID_CLIENTE() {
		return ID_CLIENTE;
	}
	public void setID_CLIENTE(int iD_CLIENTE) {
		ID_CLIENTE = iD_CLIENTE;
	}
	public String getCANTIDAD_DEL_PRODUCTO() {
		return CANTIDAD_DEL_PRODUCTO;
	}
	public void setCANTIDAD_DEL_PRODUCTO(String cANTIDAD_DEL_PRODUCTO) {
		CANTIDAD_DEL_PRODUCTO = cANTIDAD_DEL_PRODUCTO;
	}
	public String getTIPO_DEL_PRODUCTO() {
		return TIPO_DEL_PRODUCTO;
	}
	public void setTIPO_DEL_PRODUCTO(String tIPO_DEL_PRODUCTO) {
		TIPO_DEL_PRODUCTO = tIPO_DEL_PRODUCTO;
	}
	public String getDIRECCION() {
		return DIRECCION;
	}
	public void setDIRECCION(String dIRECCION) {
		DIRECCION = dIRECCION;
	}
	public String getCORREO() {
		return CORREO;
	}
	public void setCORREO(String cORREO) {
		CORREO = cORREO;
	}
	public String getTELEFONO() {
		return TELEFONO;
	}
	public void setTELEFONO(String tELEFONO) {
		TELEFONO = tELEFONO;
	}
	public String getNOMBRE_COMPLETO_PROVEDOR() {
		return NOMBRE_COMPLETO_PROVEDOR;
	}
	public void setNOMBRE_COMPLETO_PROVEDOR(String nOMBRE_COMPLETO_PROVEDOR) {
		NOMBRE_COMPLETO_PROVEDOR = nOMBRE_COMPLETO_PROVEDOR;
	}
	public int getID_CLIENTES() {
		return ID_CLIENTES;
	}
	public void setID_CLIENTES(int iD_CLIENTES) {
		ID_CLIENTES = iD_CLIENTES;
	}
	public String getCONTENIDO_DEL_PRODUCTO() {
		return CONTENIDO_DEL_PRODUCTO;
	}
	public void setCONTENIDO_DEL_PRODUCTO(String cONTENIDO_DEL_PRODUCTO) {
		CONTENIDO_DEL_PRODUCTO = cONTENIDO_DEL_PRODUCTO;
	}
	public String getPRECIO_PRODUCTO() {
		return PRECIO_PRODUCTO;
	}
	public void setPRECIO_PRODUCTO(String pRECIO_PRODUCTO) {
		PRECIO_PRODUCTO = pRECIO_PRODUCTO;
	}
	public String getCALIDAD_PRODUCTO() {
		return CALIDAD_PRODUCTO;
	}
	public void setCALIDAD_PRODUCTO(String cALIDAD_PRODUCTO) {
		CALIDAD_PRODUCTO = cALIDAD_PRODUCTO;
	}
	public String getNOMBRE_PRODUCTO() {
		return NOMBRE_PRODUCTO;
	}
	public void setNOMBRE_PRODUCTO(String nOMBRE_PRODUCTO) {
		NOMBRE_PRODUCTO = nOMBRE_PRODUCTO;
	}
	public int getID_PRODUCTO() {
		return ID_PRODUCTO;
	}
	public void setID_PRODUCTO(int iD_PRODUCTO) {
		ID_PRODUCTO = iD_PRODUCTO;
	}
	public String getREFERENCIA() {
		return REFERENCIA;
	}
	public void setREFERENCIA(String rEFERENCIA) {
		REFERENCIA = rEFERENCIA;
	}
	public String getNUMERO_SEGURIDAD_SOCIAL() {
		return NUMERO_SEGURIDAD_SOCIAL;
	}
	public void setNUMERO_SEGURIDAD_SOCIAL(String nUMERO_SEGURIDAD_SOCIAL) {
		NUMERO_SEGURIDAD_SOCIAL = nUMERO_SEGURIDAD_SOCIAL;
	}
	public String getCORREO_ELECTRONICO() {
		return CORREO_ELECTRONICO;
	}
	public void setCORREO_ELECTRONICO(String cORREO_ELECTRONICO) {
		CORREO_ELECTRONICO = cORREO_ELECTRONICO;
	}
	public String getTELEFONO_PERSONAL() {
		return TELEFONO_PERSONAL;
	}
	public void setTELEFONO_PERSONAL(String tELEFONO_PERSONAL) {
		TELEFONO_PERSONAL = tELEFONO_PERSONAL;
	}
	public String getHORARIO() {
		return HORARIO;
	}
	public void setHORARIO(String hORARIO) {
		HORARIO = hORARIO;
	}
	public String getFECHA_DE_NACIMIENTO() {
		return FECHA_DE_NACIMIENTO;
	}
	public void setFECHA_DE_NACIMIENTO(String fECHA_DE_NACIMIENTO) {
		FECHA_DE_NACIMIENTO = fECHA_DE_NACIMIENTO;
	}
	public String getDIRECCION_EMPLEADO() {
		return DIRECCION_EMPLEADO;
	}
	public void setDIRECCION_EMPLEADO(String dIRECCION_EMPLEADO) {
		DIRECCION_EMPLEADO = dIRECCION_EMPLEADO;
	}
	public String getAPELLIDO_MATERNO() {
		return APELLIDO_MATERNO;
	}
	public void setAPELLIDO_MATERNO(String aPELLIDO_MATERNO) {
		APELLIDO_MATERNO = aPELLIDO_MATERNO;
	}
	public String getAPELLIDO_PATERNO() {
		return APELLIDO_PATERNO;
	}
	public void setAPELLIDO_PATERNO(String aPELLIDO_PATERNO) {
		APELLIDO_PATERNO = aPELLIDO_PATERNO;
	}
	public String getNOMBRE_EMPLEADO() {
		return NOMBRE_EMPLEADO;
	}
	public void setNOMBRE_EMPLEADO(String nOMBRE_EMPLEADO) {
		NOMBRE_EMPLEADO = nOMBRE_EMPLEADO;
	}
	public int getID_DEL_EMPLEADO() {
		return ID_DEL_EMPLEADO;
	}
	public void setID_DEL_EMPLEADO(int iD_DEL_EMPLEADO) {
		ID_DEL_EMPLEADO = iD_DEL_EMPLEADO;
	}
	public String getMARCA_PRODUCTO() {
		return MARCA_PRODUCTO;
	}
	public void setMARCA_PRODUCTO(String mARCA_PRODUCTO) {
		MARCA_PRODUCTO = mARCA_PRODUCTO;
	}
	public String getTIPO_DE_PRODUCTO() {
		return TIPO_DE_PRODUCTO;
	}
	public void setTIPO_DE_PRODUCTO(String tIPO_DE_PRODUCTO) {
		TIPO_DE_PRODUCTO = tIPO_DE_PRODUCTO;
	}
	public String getCALIDAD() {
		return CALIDAD;
	}
	public void setCALIDAD(String cALIDAD) {
		CALIDAD = cALIDAD;
	}
	public String getNOMBRE_DEL_PRODUCTO() {
		return NOMBRE_DEL_PRODUCTO;
	}
	public void setNOMBRE_DEL_PRODUCTO(String nOMBRE_DEL_PRODUCTO) {
		NOMBRE_DEL_PRODUCTO = nOMBRE_DEL_PRODUCTO;
	}
	public int getID_DE_MATERIA_PRUEBA() {
		return ID_DE_MATERIA_PRUEBA;
	}
	public void setID_DE_MATERIA_PRUEBA(int iD_DE_MATERIA_PRUEBA) {
		ID_DE_MATERIA_PRUEBA = iD_DE_MATERIA_PRUEBA;
	}
	public String getFECHA_DE_SALIDA() {
		return FECHA_DE_SALIDA;
	}
	public void setFECHA_DE_SALIDA(String fECHA_DE_SALIDA) {
		FECHA_DE_SALIDA = fECHA_DE_SALIDA;
	}
	public String getFECHA_DE_ENTRADA() {
		return FECHA_DE_ENTRADA;
	}
	public void setFECHA_DE_ENTRADA(String fECHA_DE_ENTRADA) {
		FECHA_DE_ENTRADA = fECHA_DE_ENTRADA;
	}
	public String getFECHA_DE_CADUCIDAD() {
		return FECHA_DE_CADUCIDAD;
	}
	public void setFECHA_DE_CADUCIDAD(String fECHA_DE_CADUCIDAD) {
		FECHA_DE_CADUCIDAD = fECHA_DE_CADUCIDAD;
	}
	public String getCANTIDAD_DE_MATERIA_PRIMA() {
		return CANTIDAD_DE_MATERIA_PRIMA;
	}
	public void setCANTIDAD_DE_MATERIA_PRIMA(String cANTIDAD_DE_MATERIA_PRIMA) {
		CANTIDAD_DE_MATERIA_PRIMA = cANTIDAD_DE_MATERIA_PRIMA;
	}
	public String getTIPO_DE_MATERIA_PRIMA() {
		return TIPO_DE_MATERIA_PRIMA;
	}
	public void setTIPO_DE_MATERIA_PRIMA(String tIPO_DE_MATERIA_PRIMA) {
		TIPO_DE_MATERIA_PRIMA = tIPO_DE_MATERIA_PRIMA;
	}
	public int getID_MATERIA_PRIMA() {
		return ID_MATERIA_PRIMA;
	}
	public void setID_MATERIA_PRIMA(int iD_MATERIA_PRIMA) {
		ID_MATERIA_PRIMA = iD_MATERIA_PRIMA;
	}
	public int getID_PROVEDOR() {
		// TODO Auto-generated method stub
		return 0;
	}

public void setNOMBRE_CLIENTE(int NOMBRE_CLIENTE) {
	NOMBRE_CLIENTE = NOMBRE_CLIENTE;
}

public int getNOMBRE_CLIENTE() {
	// TODO Auto-generated method stub
	return 0;
}
public String getPRODUCTOSS() {
	return TEL;
}

public String getPROVEDOR() {
	return TEL;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
