/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Descripcion;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
    
    public static void main(String[]args){
        
        boolean element=true;
        boolean element2=false;
     Scanner scanner = new Scanner(System.in);
     int opc;
           Carros Tipos1=new Carros("Plateado",false,"Lamborghini","FFC365",5,500000);
           Carros Tipos2=new Carros("Negro",false,"Ferrari","FFL300",3,800000);
           Carros Tipos3=new Carros("Verde",true,"Spark","MDC389",4,10000);
        
           ArrayList<Carros> lista= new ArrayList();
       
        lista.add(Tipos1);
        lista.add(Tipos2);
        lista.add(Tipos3);
       
        
        do{
         try{
             System.out.println(" ***** PRINCIPAL MENU ***** ");
             System.out.println("___________________________");
             System.out.println("1.- Automoviles Disponibles");
             System.out.println("2.- Editar Automovil");
             System.out.println("3.- Agregar Automovil");
             System.out.println("4.-Eliminar Automovil");
             System.out.println("5.-Exit");
        int stone=scanner.nextInt();
        
        
    switch(stone){//SWITCH PRINCIPAL
        case 1:
                System.out.println("\n");
                System.out.println("-ALMACEN-");
                int i=1;
                for(Carros temp:lista)
                    {
                        System.out.println(i+".- "+temp.getModelo());
                        i=i+1;
                    }
                System.out.println("\n");
                System.out.println("Seleccione Automovil Para Revisar Detalles\n");
                int auto=scanner.nextInt();
                switch(auto)//SWITCH DE CASE 1
                {
                    case 1:
                        System.out.println(Tipos1+"\n");
                        element2 = true;
                    break;
                    case 2:
                        System.out.println(Tipos2+"\n");
                        element2 = true;
                    break;
                    case 3:
                        System.out.println(Tipos3+"\n");
                        element2 = true;
                    break;
                    
                }
                 if(auto>5 || auto<1){
                         System.out.println("ERROR! --INTENTAR DE NUEVO \n");
                         element2 = true;
                    }
            break;
                
        case 2:
                System.out.println("\n");
                System.out.println("NUMERO DE AUTOMOVIL PARA MODIFICAR");
                int j=1;
                for(Carros temp:lista)
                    {
                        System.out.println(j+".- "+temp.getModelo());
                        j=j+1;
                    }
                System.out.println("->");
                int Automovil=scanner.nextInt();
                
                    switch(stone)//SWITCH DE CASE 2
                        {
                        case 1:
                          
                            System.out.println(Tipos1+"\n");
                            System.out.println("Ingrese Color Recienete");
                            String fcolor=scanner.next();
                            System.out.println("Ingrese Matricula Reciente");
                            String fmatricula=scanner.next();
                            System.out.println("Ingrese el Numero de Personas ");
                            int fpeople=scanner.nextInt();
                            Tipos1.setColor(fcolor);
                            Tipos1.setMatricula(fmatricula);
                            Tipos1.setPeople(fpeople);
                            System.out.println("\n");
                            element2 = true;
                        break;
                        case 2:
                             System.out.println(Tipos2+"\n");
                             System.out.println("Ingrese Color Reciente");
                             String fcolorp=scanner.next();
                             System.out.println("Ingrese Matricula Reciente");
                             String fmatriculap=scanner.next();
                             System.out.println("Ingrese el numero de Personas");
                             int fpeoplep=scanner.nextInt();
                             Tipos2.setColor(fcolorp);
                             Tipos2.setMatricula(fmatriculap);
                             Tipos2.setPeople(fpeoplep);
                             System.out.println("\n");
                             element2 = true;
                       
                        break;
                             
                        case 3:
                            System.out.println(Tipos3+"\n");
                            System.out.println("Ingrese Color Reciente");
                            String fcolors=scanner.next();
                            System.out.println("Ingrese Matricula Reciente");
                            String fmatriculas=scanner.next();
                            System.out.println("Ingrese el numero de Personas");
                            int fpeoples=scanner.nextInt();
                            System.out.println("Ingrese Precio Reciente");
                            Tipos3.setColor(fcolors);
                            Tipos3.setMatricula(fmatriculas);
                            Tipos3.setPeople (fpeoples);
                            System.out.println("\n");
                            element2 = true;
                        
                        break;
                    }//end of switch
                    if(stone>5 || stone<1){
                         System.out.println("Automovil in Existencia\n");
                         element2 = true;
                    }
            break;
        case 3:
                    System.out.println("**** REGISTRO DE VEHICULO ****");
                    System.out.println("Ingresar color del atomovil");
                    String colorh=scanner.next();
                    System.out.println("Ingresar modelo del automovil");
                    String modeloh=scanner.next();
                    System.out.println("Ingresar ID de la matricula");
                    String matriculah=scanner.next();
                    System.out.println("Ingresar numero de personas");
                    int peopleh=scanner.nextInt();
                    System.out.println("Ingresar el precio");
                    float precioh=scanner.nextFloat();
                    Carros aux = new Carros(colorh,false,modeloh,matriculah,peopleh,precioh);
                    lista.add(aux);
                    
                    element2=true;
                    System.out.println("\n");
            break;
        case 4: 
                System.out.println("Automoviles en Almacen");
                int k=1;
                for(Carros temp:lista)
                    {
                        System.out.println("id.-"+k+" "+temp.getModelo());
                        k=k+1;
                    }
                System.out.println("\n");
                System.out.println("Numero del Automovil para Eliminacion");
                int var=scanner.nextInt();
                int resu=var-1;
                
                lista.remove(resu);
                System.err.println("Automovil ELIMINADO!");
            break;
            
            //Cierra el programa
                
            case 5:
                    element2 = false;
                    element2 = false;
            break;
        }//end of switch
         if(stone>5 || stone<1){
                         System.err.println("OPCION INCORRECTA!");
                         element = true;
                    }
                } catch (Exception ex) {
                    System.err.println("Automovil No Encontrado!");
                    element = true;
                }
            System.out.println("\n");
            } while(element);
        
        
        
    }
    
    
}
  
      
       
      
        
        

        
                 
                
                
                
           
                
                
                
                
                
                
                
                   
                   
                   
                   
             
 