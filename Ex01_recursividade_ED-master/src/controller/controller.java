package controller;

public class controller {

	public controller() {
		super();
		}
		public int soma(int A, int B) {
		//Condi��o de parada
			
		if (B == 1) {
		return A;
		} 
		else {
		B = B - 1;
		return A + soma (A, B);
}
		}
}
