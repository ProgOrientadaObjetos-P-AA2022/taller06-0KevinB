/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete02;

/**
 *
 * @author UsuarioITC
 */
public class Medicos {

    private String nombre;
    private String especialidad;
    private double sueldo;

    public Medicos(String n, double s, String e) {
        nombre = n;
        especialidad= e;
        sueldo = s;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerEspecialidad(String c) {
        especialidad = c;
    }

    public void establecerSueldo(double c) {
        sueldo = c;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerEspecialidad() {
        return especialidad;
    }

    public double obtenerSueldo() {
        return sueldo;
    }
}
