package com.tarea.desweb1;

public class PerroD extends MamiferosD{
    String lugarDeEntrenamiento;
    public PerroD(String nombre, String raza, String fechaNacimiento, float peso, String lugarDeEntrenamiento, String tipoAnimal) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.lugarDeEntrenamiento = lugarDeEntrenamiento;
        this.tipoAnimal = tipoAnimal;
    }
    @Override
    public void comunicarse() {
        System.out.println("guau guau");
    }

}
