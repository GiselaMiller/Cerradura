package ar.edu.unlam.tallerweb.cerradura;

public class Cerradura {
	private Integer claveApertura;
	private Integer fallosBloqueo;
	private Integer contador=0;
	private Boolean estado=false;
	private Integer exitosas=0;
	private Integer fallidas=0;
	
	public Cerradura (Integer clave, Integer fallos){
		claveApertura= clave;
		fallosBloqueo= fallos;
	}
	
	public Boolean abrir(Integer clave){
		Integer contador=0;
		if (clave.equals(claveApertura)){
			contador=0;
			estado=true;
			exitosas=exitosas+1;
			return estado;
	}
		else{
			contador=contador+1;
			estado=false;
			fallidas=fallidas+1;
			return estado;			
		}
}
	
	public Boolean cerrar(){
		if (estado){
			estado=false;
			return true;
		}
		return false;
	}
	
	public Boolean estaAbierta(){
		if (estado){
			return true;
		}
		return false;
	}
	
	public Boolean estaCerrada(){
		if (!estado){
			return true;
		}
		return false;
	}
	
	public Boolean fueBloqueada() {
		if (fallosBloqueo>=contador){
			return true;
		}
		else{
			return false;
		} 
	}
	
	public Integer aperturasExitosas(){
		return exitosas;
	}
	
	public Integer aperturasFallidas(){
		return fallidas;
	}
}
