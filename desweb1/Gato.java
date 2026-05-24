package com.tarea.desweb1;

public class Gato extends Mamiferos {
    float alturaDeSalto;
    public Gato(String nombre, String raza, String fechaNacimiento, float peso, float alturaDeSalto) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.alturaDeSalto = alturaDeSalto;
    }
    @Override
    public void comunicarse() {
        System.out.println("miau miau");
    }
}
