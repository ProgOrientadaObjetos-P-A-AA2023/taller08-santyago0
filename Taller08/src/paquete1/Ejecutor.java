/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;
import paquete2.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese los nombres del docente");
        String nombres = entrada.nextLine();
        System.out.println("Ingrese la cédula del docente");
        String cedula = entrada.nextLine();
        
        boolean condicion = true;
        while(condicion) {
            System.out.printf("\n%s\n%s\n%s\n%s\n\n%s",
                    "--Menú de Opciones--",
                    "1) Ingresar un Docente Nombremiento",
                    "2) Ingresar un Docente Factura",
                    "3) Salir",
                    "Elija una opción: ");
            
            int opcion;
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch(opcion) {
                case 1:
                    System.out.println("\nIngrese el valor del sueldo");
                    double sueldo = entrada.nextDouble();
                    System.out.println("Ingrese el valor de las horas extra");
                    double valorHoras = entrada.nextDouble();
                    System.out.println("Ingrese el núemro de horas");
                    int horas = entrada.nextInt();
                    
                    DocenteNombramiento docenteN = new DocenteNombramiento();

                    docenteN.establerNombres(nombres);
                    docenteN.establerCedula(cedula);
                    docenteN.establecerValorSueldo(sueldo);
                    docenteN.establecerValorHoraExtra(valorHoras);
                    docenteN.establecerNumeroHoras(horas);
                    docenteN.calcularSueldo();

                    System.out.printf("\n%s\n", docenteN);
                    break;
                case 2:
                    System.out.println("\nIngrese el valor de la factura");
                    double factura = entrada.nextDouble();
                    System.out.println("Ingrese el valor del descuento del "
                            + "iva");
                    double ivaDescuento = entrada.nextDouble();
                    
                    DocenteFactura docenteF = new DocenteFactura();

                    docenteF.establerNombres(nombres);
                    docenteF.establerCedula(cedula);
                    docenteF.establecerValorFactura(factura);
                    docenteF.establecerValorIvaDescuento(ivaDescuento);
                    docenteF.calcularValorCancelar();

                    System.out.printf("\n%s\n", docenteF);
                    break;
                case 3:
                    System.err.println("\nSaliendo del programa...");
                    condicion = false;
                    break;
                default:
                    System.out.println("\nOpción incorrecta...");
            }
        }
    }
    
}
