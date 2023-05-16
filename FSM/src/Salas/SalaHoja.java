package Salas;

import java.io.Serializable;
/**
 * @author Santiago de Prada Lorenzo
 *
 */

public abstract class SalaHoja extends Sala implements Serializable {
	private static final long serialVersionUID = 1631245480669906666L;
	
	/**
	 * Metodo constructor 
	 * 
	 * @param aforo (int)
	 * @param descripcion (String)
	 */
	public SalaHoja(int aforo, String descripcion) {
		super(aforo, descripcion);
		
	}

}
