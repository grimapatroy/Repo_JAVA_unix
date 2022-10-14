package test;

import java.io.*;
import java.util.Scanner;


// public void mostrarSueldoSinPlus(Empleado lista[]){}
public class Principal {

    public static void main( String[] args ){
        // Empleado e1 = new Empleado(null, null, 0, 0, 0, 0, null, null, 0);
        int tam = 0,opcion=0,buscar=0;
        boolean salir=false;
        Scanner sc = new Scanner (System.in); 
        System.out.println( "*****************************BIENVENIDOS AL SISTEMA DE GESTION DE EMPLEADOS******************************" );
        System.out.println( "INGRESE LA CANTIDAD DE EMPLEADOS: " );
        tam = sc.nextInt();
        Empleado listEmpleado[] = new Empleado[tam];
        
        for (int i = 0; i < tam; i++) {
                while (!salir) {
                    Menu m = new Menu();
                    opcion = m.menu1();
                    // opcion=sc.nextInt();
                        switch (opcion) {
                            case 1:
                                Empleado e1 = new Empleado();
                                e1.leeDatosPlus();
                                e1.categoriaProfesional="ADMINISTRATIVO";
                                e1.contPlus = 2;
                                listEmpleado[i] = e1;
                                break;
                            case 2:
                                Empleado e2 = new Empleado();
                                e2.leeDatosPlus();
                                e2.categoriaProfesional="DIRECTIVO";
                                e2.contPlus = 2;
                                listEmpleado[i] = e2;
                                break;
                            case 3:
                                Empleado e3 = new Empleado();
                                e3.leeDatosPlus();
                                e3.categoriaProfesional="PUBLICISTA";
                                e3.contPlus = 2;
                                listEmpleado[i] = e3;
                                break;
                            case 4:
                                Empleado e4 = new Empleado();
                                e4.leeDatos();
                                e4.categoriaProfesional="CONTABLE";
                                e4.contPlus = 0;
                                listEmpleado[i] = e4;
                                break;
                            case 5:
                                Empleado e5 = new Empleado();
                                e5.leeDatosPlus();
                                e5.categoriaProfesional="PROGRAMADOR";
                                e5.contPlus = 1;
                                listEmpleado[i] = e5;
                                break;
                            case 6:
                                Empleado e6 = new Empleado();
                                e6.leeDatosPlus();
                                e6.categoriaProfesional="SISTEMAS";
                                e6.contPlus = 1;
                                listEmpleado[i] = e6;
                                break;
                            case 7:
                                Empleado e7 = new Empleado();
                                e7.leeDatosPlus();
                                e7.categoriaProfesional="RECURSOS HUMANOS";
                                e7.contPlus = 1;
                                listEmpleado[i] = e7;
                                break;
                            case 8:
                                Empleado e8 = new Empleado();
                                e8.leeDatosPlus();
                                e8.categoriaProfesional="COMERCIAL";
                                e8.contPlus = 1;
                                listEmpleado[i] = e8;
                                break;
                            case 9:
                                System.out.println("BIENVENIDOS A CONSULTAR");
                                System.out.println( "INGRESE CODIGO DE EMPLEADO: " );
                                buscar = sc.nextInt();
                                // buscarCod(listEmpleado, buscar);
                                Empleado.buscarCod(listEmpleado, buscar);
                                --i;
                                break;
                            case 10:
                                System.out.println("BIENVENIDOS A REPORTES");
                                System.out.println( "*********SUELDO CON PLUS*******" );
                                Empleado.mostrarSueldoConPlus(listEmpleado);
                                System.out.println( "*********SUELDO SIN PLUS*******" );
                                Empleado.mostrarSueldoSinPlus(listEmpleado);
                                // mostrarSueldoSinPlus(listEmpleado);
                                // mostrarSueldoConPlus(listEmpleado);
                                --i;
                                break;
                            case 11:
                                salir=true;
                                break;
                            default:
                                System.out.println("SOLO NUMEROS ENTRE EL 1 AL 10");
                                --i;
                                break;
                        }
                break;
                }
        }        
        while (!salir) {
                Menu m = new Menu();
                opcion = m.menu2();
                switch (opcion) {
                    case 1:
                        System.out.println("BIENVENIDOS A CONSULTAR POR ID");
                        System.out.println( "INGRESE CODIGO DE EMPLEADO: " );
                        buscar = sc.nextInt();
                        // buscar(listEmpleado, buscar);
                        Empleado.buscarCod(listEmpleado, buscar);
                        break;
                    case 2:
                        System.out.println("BIENVENIDOS A REPORTES");
                        // mostrarSueldoSinPlus(listEmpleado);
                        // mostrarSueldoConPlus(listEmpleado);
                        Empleado.mostrarSueldoConPlus(listEmpleado);
                        Empleado.mostrarSueldoSinPlus(listEmpleado);
                    break;
                    case 3:
                        salir=true;
                    break;
                    default:
                    System.out.println("SOLO NUMEROS ENTRE EL 1 AL 3");
                    break;
                }
        }
        
        System.out.println("************************FIN DEL PROGRAMA********************: "+listEmpleado.length);
    }



}
