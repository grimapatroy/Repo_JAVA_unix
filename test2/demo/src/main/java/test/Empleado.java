package test;

import java.util.Scanner;

public class Empleado {
    // atributos
    String nombre;
    String apellidos;
    int numSeguridadSocial;
    int diasBaja;
    int diasAntiguedad;
    int sueldoBase;
    String categoriaProfesional;
    String departamento;
    int numEmpleado;
    String actividadPlus;
    int contPlus;
    int valorPlus;    


    // constructor
    // public Empleado(String nom,String apell, int numSegu, int dBajas, int dAnti, int sueldo, String categoria, String dep, int numEmp){
    //     nombre = nom;
    //     apellidos = apell;
    //     numSeguridadSocial = numSegu;
    //     diasBaja = dBajas;
    //     diasAntiguedad = dAnti;
    //     sueldoBase = sueldo;
    //     categoriaProfesional = categoria;
    //     departamento = dep;
    //     numEmpleado = numEmp;
    // }

    public void leeDatosPlus(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        nombre = teclado.nextLine();
        
        System.out.println("Ingrese apellidos: ");
        apellidos = teclado.next();
        
        System.out.println("Ingrese numero de seguridad Social: ");
        numSeguridadSocial = teclado.nextInt();
        
        System.out.println("Ingrese dias que no laboro:");
        diasBaja= teclado.nextInt();
        
        System.out.println("Ingrese dias de Antiguedad:");
        diasAntiguedad= teclado.nextInt();
        
        System.out.println("Ingrese sueldo Base:");
        sueldoBase= teclado.nextInt();
        // System.out.println("Ingrese categoria profesional:");
        // categoriaProfesional= teclado.nextLine();
        System.out.println("Ingrese departamento:");
        departamento= teclado.next();
        
        System.out.println("Ingrese codigo de empleado:");
        numEmpleado= teclado.nextInt();
        
        System.out.println("Ingrese actividad plus:");
        actividadPlus= teclado.next();
        
        System.out.println("Ingrese el valor plus:");
        valorPlus= teclado.nextInt();
    }


    public void leeDatos(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        nombre = teclado.nextLine();
        
        System.out.println("Ingrese apellidos: ");
        apellidos = teclado.next();
        
        System.out.println("Ingrese numero de seguridad Social: ");
        numSeguridadSocial = teclado.nextInt();
        
        System.out.println("Ingrese dias que no laboro:");
        diasBaja= teclado.nextInt();
        
        System.out.println("Ingrese dias de Antiguedad:");
        diasAntiguedad= teclado.nextInt();
        
        System.out.println("Ingrese sueldo Base:");
        sueldoBase= teclado.nextInt();
        // System.out.println("Ingrese categoria profesional:");
        // categoriaProfesional= teclado.nextLine();
        System.out.println("Ingrese departamento");
        departamento= teclado.next();
        
        System.out.println("Ingrese codigo de empleado:");
        numEmpleado= teclado.nextInt();
        // System.out.println("Ingrese actividad plus:");
        actividadPlus= "no";
        // System.out.println("Ingrese el valor plus:");
        valorPlus= 0;
    }

    public void mostrarDatos(){
        System.out.println("NOMBRE:"+nombre);
        System.out.println("APELLIDO:"+apellidos);
        System.out.println("NUMERO DE SEGURIDAD:"+numEmpleado);
        System.out.println("DIAS DE BAJA:"+diasBaja);
        System.out.println("DIAS DE ANTIGUEDAD:"+diasAntiguedad);
        System.out.println("SUELDO BASE:"+sueldoBase);
        System.out.println("CATEGORIA PROFECIONAL:"+categoriaProfesional);
        System.out.println("DEPARTAMENTO:"+departamento);
        System.out.println("CODIGO DE EMPLEADO:"+numEmpleado);
        System.out.println("ACTIVIDAD PLUS:"+actividadPlus);
        System.out.println("NUMERO DE PLUS:"+contPlus);
        System.out.println("VALOR PLUS:"+valorPlus);

    }

    public static void mostrarSueldoSinPlus(Empleado lista[]){
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].contPlus==0) {
                System.out.println("NOMBRE:"+lista[i].nombre);
                System.out.println("APELLIDOS:"+lista[i].apellidos);
                System.out.println("CATEGORIA PROFESIONAL:"+lista[i].categoriaProfesional);
                System.out.println("CODIGO EMPLEADO:"+lista[i].numEmpleado);
                System.out.println("ACTIVIDAD:"+lista[i].actividadPlus);
                System.out.println("CANTIDAD PLUS:"+lista[i].valorPlus);
                System.out.println("SUELDO BASE:"+lista[i].sueldoBase);
                System.out.println("TIENE "+lista[i].contPlus+" Plus");
            }
        }
    }

    public static void mostrarSueldoConPlus(Empleado lista[]){
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].contPlus>0) {
                System.out.println("NOMBRE:"+lista[i].nombre);
                System.out.println("APELLIDOS:"+lista[i].apellidos);
                System.out.println("CATEGORIA PROFESIONAL:"+lista[i].categoriaProfesional);
                System.out.println("CODIGO EMPLEADO:"+lista[i].numEmpleado);
                System.out.println("ACTIVIDAD:"+lista[i].actividadPlus);
                System.out.println("CANTIDAD PLUS:"+lista[i].valorPlus);
                System.out.println("SUELDO BASE:"+lista[i].sueldoBase);
                System.out.println("TIENE "+lista[i].contPlus+" Plus");
            }
        }
    }

    public static void buscarCod(Empleado lista[], int v){
        for (int i = 0; i < lista.length; i++) {
            if(lista[i].numEmpleado == v){
                System.out.println("NOMBRE:"+lista[i].nombre);
                System.out.println("APELLIDOS:"+lista[i].apellidos);
                System.out.println("CATEGORIA PROFESIONAL:"+lista[i].categoriaProfesional);
                System.out.println("CODIGO EMPLEADO:"+lista[i].numEmpleado);
                System.out.println("ACTIVIDAD:"+lista[i].actividadPlus);
                System.out.println("CANTIDAD PLUS:"+lista[i].valorPlus);
                System.out.println("SUELDO BASE:"+lista[i].sueldoBase);
                System.out.println("TIENE "+lista[i].contPlus+" Plus");
                break;
            }
        }
    }

}
