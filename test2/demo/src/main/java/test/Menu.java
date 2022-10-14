package test;

import java.util.Scanner;

public class Menu {
    
    public int menu1(){
        int op =0;
        Scanner sc = new Scanner (System.in); 
        System.out.println("Opcion 1- REGISTRAR EMPLEADO ADMINISTRATIVO");
        System.out.println("Opcion 2- REGISTRAR EMPLEADO DIRECTIVO");
        System.out.println("Opcion 3- REGISTRAR EMPLEADO PUBLICISTA");
        System.out.println("Opcion 4- REGISTRAR EMPLEADO CONTABLE");
        System.out.println("Opcion 5- REGISTRAR EMPLEADO PROGRAMADOR");
        System.out.println("Opcion 6- REGISTRAR EMPLEADO SISTEMAS");
        System.out.println("Opcion 7- REGISTRAR EMPLEADO RRHH");
        System.out.println("Opcion 8- REGISTRAR EMPLEADO COMERCIALES");
        System.out.println("Opcion 9- CONSULTAR EMPLEADO POR NUMERO-EMPLEADO");
        System.out.println("Opcion 10- MOSTRAR REPORTES DE SUELDOS CON PLUS Y SIN PLUS");
        System.out.println("Opcion 11- TERMINAR DE REGISTRAR");
        
        System.out.println("ESCRIBE UNA DE LAS OPCIONES(DEL 1 - 11)");
        op=sc.nextInt();
        return op;
    }


    
    public int menu2(){
        int op =0;
        Scanner sc = new Scanner (System.in); 
        System.out.println("Opcion 1- CONSULTAR EMPLEADO POR NUMERO-EMPLEADO");
        System.out.println("Opcion 2- MOSTRAR REPORTES DE SUELDOS CON PLUS Y SIN PLUS ");
        System.out.println("Opcion 3- SALIR DEL SISTEMA");
        
        System.out.println("ESCRIBE UNA DE LAS OPCIONES(DEL 1 - 3)");
        op=sc.nextInt();
        return op;
    }


}
