package com.tarea.desweb1;

public class Perro extends Mamiferos {
    String lugarDeEntrenamiento;
    public Perro(String nombre, String raza, String fechaNacimiento, float peso, String lugarDeEntrenamiento) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.lugarDeEntrenamiento = lugarDeEntrenamiento;
    }
    @Override
    public void comunicarse() {
        System.out.println("guau guau");
    }

}
