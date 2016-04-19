package ar.edu.unlam.tallerweb.cerradura;

public class Cerradura {
	private Integer claveApertura;
	private Integer cantidadFallosBloqueo;
	Integer contador=0;
	
	public Cerradura (Integer clave, Integer fallos){
		claveApertura= clave;
		cantidadFallosBloqueo= fallos;
	}
	
	public Boolean abrir(Integer clave){
		Integer contador=0;
		if (clave.equals(claveApertura)){
			return true;
	}
		contador = contador+1;
	return false;
	
}

	public Boolean fueBloqueada() {
		if (fallos>=contador){
			return true;
		}
		return false;
		 
	}
}
