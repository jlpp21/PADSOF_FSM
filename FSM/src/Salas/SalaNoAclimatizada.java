package Salas;

import java.io.Serializable;
/**
 * @author Santiago de Prada Lorenzo
 *
 */

public class SalaNoAclimatizada extends SalaHoja implements Serializable{

	private static final long serialVersionUID = 15674366L;

	/**
	 * Metodo constructor 
	 * 
	 * @param aforo (int)
	 * @param descripcion (String)
	 */
	public SalaNoAclimatizada(int aforo, String descripcion) {
		super(aforo, descripcion);
		
	}
	/**
	 * Metodo toString de SalaNoAclimatizada
	 */
	@Override
	public String toString() {
		return "Subsala no aclimatizada, " + super.toString();
	}
}
