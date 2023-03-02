package com.cursoceat.main;

public class Main {

	public static void main(String[] args) {
		Texto miCadena = new Texto(15);
		miCadena.addFinal('o');
		miCadena.addInicio("Francisc");
		miCadena.mostrar();
	}
}
