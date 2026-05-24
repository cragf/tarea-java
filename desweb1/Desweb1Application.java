package com.tarea.desweb1;

public class Desweb1Application {

	public static void main(String[] args) {
		AsignacionA a = new AsignacionA();
		a.run();

		AsignacionB b = new AsignacionB();
		b.run();

		//Asignacion C
		System.out.println("================tarea C==================");
		Perro perro = new Perro("Firulais", "Labrador", "01/01/2020", 25.5f, "Parque Central");
		perro.comunicarse();

		Gato gato = new Gato("Michi", "Siames", "15/03/2019", 4.2f, 1.5f);
		gato.comunicarse();

		//Asignacion C
		System.out.println("================tarea D==================");
		PerroD perrod = new PerroD("Firulais", "Labrador", "01/01/2020", 25.5f, "Parque Central", "Perro");
		perrod.comunicarse();

		GatoD gatod = new GatoD("Michi", "Siames", "15/03/2019", 4.2f, 1.5f,"gato");
		gatod.comunicarse();
	}

}
