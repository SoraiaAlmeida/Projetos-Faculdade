package Controller;

public class Controller {
	
	public Controller() {
		
		super();
		
		}
	      
   public int numero(int a, int b) {
	   int contador = 0;
	   // contador adicionado para verificar quantas vezes a varivel b aparece na variavel a.
	   if (a == 0) {
		   return 0;
		 // A condição de parada vai ser quando a variável a for igual a 0. 
		   
	   }
	   
	   else {
		   int resto = a % 10;
		   //  resto vai dividir a variavel "a" por 10 e guardar o ultimo número depois da virgula.
		   a = a / 10;
		   // a variavel "a" vai realizar a divisão por 10 para fazer a chamada do próximo passo.
		   
		   if(b == resto) {
			   // condição para verificar se b é igual ao resto, caso seja verdadeira a condição vai somar 1 no contador.
			  contador++;
		   }
		   return contador + numero(a, b);
	   }
	
		   
	   }
   }
   