package Tarifa;

public class TarifaPlana extends Tarifa {
	/**
	 * 
	 */
	private static final long serialVersionUID = 00221L;
	private TarifaPlanaTiempo duracion;
	private double descuentoEntrenamientoP;
	
	/**
	 * @param duracion
	 * @param descuentoEntrenamientoP
	 */
	public TarifaPlana(TarifaPlanaTiempo duracion, double descuentoEntrenamientoP) {
		this.duracion = duracion;
		this.descuentoEntrenamientoP = descuentoEntrenamientoP;
	}
	/**
	 * @return
	 */
	public TarifaPlanaTiempo getDuracion() {
		return duracion;
	}
	/**
	 * @param duracion
	 */
	public void setDuracion(TarifaPlanaTiempo duracion) {
		this.duracion = duracion;
	}
	/**
	 * @return
	 */
	public double getDescuentoEntrenamientoP() {
		return descuentoEntrenamientoP;
	}
	/**
	 * @param descuentoEntrenamientoP
	 */
	public void setDescuentoEntrenamientoP(double descuentoEntrenamientoP) {
		this.descuentoEntrenamientoP = descuentoEntrenamientoP;
	}
	/**
	 *
	 */
	@Override
	public String toString() {
		return "TarifaPlana [duracion=" + duracion + ", descuentoEntrenamientoP=" + descuentoEntrenamientoP + "]";
	}
	
	
}
