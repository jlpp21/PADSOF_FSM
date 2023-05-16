package Salas;
import java.io.Serializable;
import java.time.LocalTime;
/**
 * @author Santiago de Prada Lorenzo
 *
 */

public class SalaAclimatizada extends SalaHoja implements Serializable {
	private static final long serialVersionUID = 1631245480669905555L;
	private LocalTime inicioAclimatizacion;
	private LocalTime finAclimatizacion;
	
	/**
	 * Metodo constructor 
	 * 
	 * @param aforo (int)
	 * @param descripcion (String)
	 * @param inicioAclimatizacion (LocalTime)
	 * @param finAclimatizacion (LocalTime)
	 */
	public SalaAclimatizada(int aforo, String descripcion, LocalTime inicioAclimatizacion, LocalTime finAclimatizacion) {
		super(aforo, descripcion);
		this.inicioAclimatizacion = inicioAclimatizacion;
		this.finAclimatizacion = finAclimatizacion;
	}
	/**
	 * Metodo getter para el atributo inicioAclimatizacion de la clase SalaAclimatizada
	 * 
	 * @return inicioAclimatizacion(LocalDate)
	 */
	public LocalTime getInicioAclimatizacion() {
		return inicioAclimatizacion;
	}
    /**
	 * Metodo setter para que se pueda modificar el inicio de la aclimatizacion de la sala.
	 * 
	 * @param inicioAclimatizacion (LocalTime)
	 */
	public void setInicioAclimatizacion(LocalTime inicioAclimatizacion) {
		this.inicioAclimatizacion = inicioAclimatizacion;
	}
	/**
	 * Metodo getter para el atributo finAclimatizacion de la clase SalaAclimatizada
	 * 
	 * @return finAclimatizacion(LocalDate)
	 */
	public LocalTime getFinAclimatizacion() {
		return finAclimatizacion;
	}
    /**
	 * Metodo setter para que se pueda modificar el final de la aclimatizacion de la sala.
	 * 
	 * @param finAclimatizacion (LocalTime)
	 */
	public void setFinAclimatizacion(LocalTime finAclimatizacion) {
		this.finAclimatizacion = finAclimatizacion;
	}
	/**
	 * Metodo toString de SalaAclimatizada
	 */
	@Override
	public String toString() {
		return "Subsala aclimatizada, " + super.toString();
	}
	
	
}
