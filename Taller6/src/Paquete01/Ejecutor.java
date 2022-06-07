/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Paquete01;

import Paquete02.Ciudad;
import Paquete02.Enfermeros;
import Paquete02.Hospital;
import Paquete02.Medicos;
import java.util.Scanner;

/**
 *
 * @author UsuarioITC
 */
public class Ejecutor {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        String nombreHospital;
        String direccion;
        String ciudad;
        String provincia;
        Medicos[] medicos;
        int numeroMedicos;
        String nombreMedico;
        double sueldoMedico;
        String especialidadMedico;
        Enfermeros[] enfermeros;
        int numeroEnfermeros;
        String nombreEnfermeros;
        double sueldoEnfermeros;
        String tipoEnfermeros;
        int numeroEspecialidades;

        System.out.println("Ingrese el nombre del Hospital");
        nombreHospital = entrada.nextLine();
        System.out.println("Ingrese la direccion del Hospital");
        direccion = entrada.nextLine();

        System.out.println("Ingrese el nombre de la ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingrese la provincia");
        provincia = entrada.nextLine();
        
        Ciudad c1 = new Ciudad(ciudad, provincia);
        
        
        
        System.out.println("Ingrese el numero de médicos que tiene el hospital");
        numeroMedicos = entrada.nextInt();
        medicos = new Medicos[numeroMedicos];
        entrada.nextLine();

        for (int i = 0; i < numeroMedicos; i++) {
            
            System.out.printf("Ingrese el nombre del médico %d\n", i + 1);
            nombreMedico = entrada.nextLine();
            System.out.println("Ingrese el sueldo que recibe");
            sueldoMedico = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese su especialidad");
            especialidadMedico = entrada.nextLine();

            Medicos m1 = new Medicos(nombreMedico, sueldoMedico, especialidadMedico);

            medicos[i] = m1;
        }

        System.out.println("Ingrese el número de enfermeros(as)");
        numeroEnfermeros = entrada.nextInt();
        enfermeros = new Enfermeros[numeroEnfermeros];
        
        entrada.nextLine();

        for (int i = 0; i < numeroEnfermeros; i++) {
            System.out.printf("Ingrese el nombre del enfermero/a %d\n", i + 1);
            nombreEnfermeros = entrada.nextLine();
            System.out.println("Ingrese el sueldo que recibe");
            sueldoEnfermeros = entrada.nextDouble();
            entrada.nextLine();
            System.out.println("Ingrese el tipo de contrato que tiene");
            tipoEnfermeros = entrada.nextLine();

            Enfermeros e1 = new Enfermeros(nombreEnfermeros, sueldoEnfermeros, 
                    tipoEnfermeros);

            enfermeros[i] = e1;
            
        }
        numeroEspecialidades = numeroMedicos + numeroEnfermeros;
        
        Hospital entidadHospitalaria = new Hospital (nombreHospital,
                direccion, c1, numeroEspecialidades, medicos, enfermeros);
        entidadHospitalaria.calcularSueldo();
        
        
        System.out.printf("\n%s\n", entidadHospitalaria);
    }

}
