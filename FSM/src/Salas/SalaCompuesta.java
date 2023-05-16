package Salas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;




/**
 * @author Santiago de Prada Lorenzo
 *
 */
public class SalaCompuesta extends Sala implements Serializable  {

	private static final long serialVersionUID = 52331L;
	private List<Sala> subsalas;
	/**
	 * Metodo constructor 
	 * 
	 * @param aforo (int)
	 * @param descripcion (String)
	 */
	public SalaCompuesta(int aforo, String descripcion) {
		super(aforo, descripcion);
		this.subsalas= new ArrayList<>();
	}
	
	/**
	 * Metodo getter para el atributo subsalas de la clase SalaCompuesta
	 * 
	 * @return nombreUsuario(String)
	 */
	public List<Sala> getSubsalas() {
		return subsalas;
	}
	/**
	 * Metodo para calcular el aforo restante de la sala no ocupado por subsalas
	 * 
	 * @return aforoRestante(int)
	 */
	public int calcularAforoRestante() {
		int aforoSubsalas = 0;
		int aforoRestante = this.getAforo();
		for (Sala sala: this.subsalas) {
			int aforoSubsala = sala.getAforo();
			aforoSubsalas += aforoSubsala;
	
		}
		aforoRestante -= aforoSubsalas;
		return aforoRestante;
	}
	
	/**
	 * Metodo para anaydir subsala a la sala
	 * 
	 * @return true si se ha podido y false si no(boolean)
	 */
	public boolean anaydirSubsala(SalaHoja salaHoja) throws AforoExcedidoException {
		int aforoRestante = this.calcularAforoRestante();
		if (aforoRestante < salaHoja.getAforo()) {
			throw new AforoExcedidoException(aforoRestante, salaHoja.getAforo());
		}
		this.subsalas.add(salaHoja);
		return true;
	}
	/**
	 * Metodo toString de SalaCompuesta
	 */
	
	@Override
	public String toString() {
		return "Sala compuesta, " + super.toString();
	}
	

}
