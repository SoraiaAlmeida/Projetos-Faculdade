package Controller;

public class Controller {


	public Controller() {
		 super();
	}
public double soma(int n) {
		
		if (n == 1) {
			return 1;
			
			// A condi��o de parada vai ser quando o n�mero  for igual a 1.
					}
		else {
			
			double x = 1 / fat(n);
			
			n = n -1;
			//A rela��o da chamado, � quando o "n" n�o � igual a 1.  O m�todo chama a si mesmo no "n-1". Depois � chamado o fat(n) para calcular o fatorial de "n" e armazena o resultado em fat.
			
			return soma (n)+x;
		
}
}
		public double fat (double n){
			
			if (n == 1) {
				return 1;

}
			else
				return n * fat(n - 1);
			
		}
}
