package Salas;

public class AforoExcedidoException extends Throwable {

	private static final long serialVersionUID = 98778L;
	private int aforoRestanteSala;
	private int aforoSubsala;
	
	public AforoExcedidoException(int aforoRestanteSala, int aforoSubsala) {
	        this.aforoRestanteSala = aforoRestanteSala;
	        this.aforoSubsala = aforoSubsala;
	}

	@Override
	public String toString() {
		return "Aforo excedido [aforo restante de la sala=" + aforoRestanteSala + ", aforo de la subsala a añadir=" + aforoSubsala + "]";
	}

}
