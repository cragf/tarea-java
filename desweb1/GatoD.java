package com.tarea.desweb1;

public class GatoD extends MamiferosD {
    float alturaDeSalto;
    public GatoD(String nombre, String raza, String fechaNacimiento, float peso, float alturaDeSalto, String tipoAnimal) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.alturaDeSalto = alturaDeSalto;
        this.tipoAnimal = tipoAnimal;
    }
    @Override
    public void comunicarse() {
        System.out.println("miau miau");
    }
}
