package Salas;

import java.io.Serializable;
/**
 * @author Santiago de Prada Lorenzo
 *
 */

public abstract class Sala implements Serializable {

	private static final long serialVersionUID = 56433896L;
	protected int aforo;
	protected String descripcion;
	
	/**
	 * Metodo constructor 
	 * 
	 * @param aforo (int)
	 * @param descripcion (String)
	 */
	public Sala(int aforo, String descripcion) {
		this.aforo = aforo;
		this.descripcion = descripcion;
		
	}
	
	/**
	 * Metodo getter para el atributo aforo de la clase Sala
	 * 
	 * @return aforo(int)
	 */
	public int getAforo() {
		return aforo;
	}
    /**
	 * Metodo setter para que se pueda modificar el aforo de la sala.
	 * 
	 * @param aforo (int)
	 */
	public void setAforo(int aforo) {
		this.aforo = aforo;
	}
	/**
	 * Metodo getter para el atributo descripcion de la clase Sala
	 * 
	 * @return descripcion(String)
	 */
	public String getDescripcion() {
		return descripcion;
	}
    /**
	 * Metodo setter para que se pueda modificar la descripcion de la sala.
	 * 
	 * @param descripcion (String)
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	

	/**
	 * Metodo toString de la clase Sala
	 */
	@Override
	public String toString() {
		return "Aforo : " + this.aforo + ", Descripcion : " + this.descripcion;
	}
	
}
