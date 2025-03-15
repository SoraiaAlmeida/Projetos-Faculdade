package Controller;

public class Controller {
	
	public Controller() {
			
	super();
	}

    public int par (int[] vetor, int tamanho) {
    	if (tamanho == 0) {
    	return 0;
    		
    	}
    	else {
    		int ultimo = vetor[tamanho - 1];
    		int quantPar = ultimo % 2 == 0 ? 1 : 0;
    		
    		return quantPar + par (vetor,tamanho -1);
    	}
    		
    	}
  
    }
    
