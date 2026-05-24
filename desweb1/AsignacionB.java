package com.tarea.desweb1;

public class AsignacionB {
     int[] base = {23,56,4,8,9,6,93,176,45,5};

    public void run() {
        double promedio = 0;
        int suma = 0;
         //2
        for (int i : base) {
            suma += i;
        }
        promedio = (double) suma / base.length;

        System.out.println("================tarea B==================");
        
        System.out.println("El promedio es: " + promedio);
        System.out.println("La suma es: " + suma);
    }
}
