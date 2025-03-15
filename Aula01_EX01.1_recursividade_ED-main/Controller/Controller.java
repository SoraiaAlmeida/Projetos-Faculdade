package Controller;

public class Controller {
	
	public Controller() {
		super();
}

  public int Fatorial (int valor) {
	
	  
	if ( valor <= 1) {
	//Condição de parada, quando o valor for menor ou igual a 1.
		
		return 1;
	} 
	else
		return valor * Fatorial(valor - 1);
}
}