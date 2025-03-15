package View;

import Controller.Controller;

public class Principal {

	public static void main(String[] args) {
		
		Controller div = new Controller();
		
		int dividendo = 19;
		int divisor = 3;
		int resto = div.resto(dividendo, divisor);

		System.out.println(resto);
	}

}
