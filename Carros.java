package Descripcion;


public class Carros {
    
private String color;
    private boolean status;
    private String modelo;
    private String matricula;
    private int people;
    private float precio;
    
    public Carros(String color,boolean status,String modelo,String matricula,int people,float precio)
    {
        this.color=color;
        this.status=status;
        this.modelo=modelo;
        this.matricula=matricula;
        this.people=people;
        this.precio=precio;
    }
    
    public void encender(boolean z)
    {
        this.status=z;
    }
    
    public String getColor()
    {
        System.out.println("Color:"+color);
        return color;
    }
    
    public void setColor(String fcolor)
    {
        this.color=fcolor;
    }
    public boolean getPrender()
    {
        if(status)
        {
            System.out.println("Encendido");
        }
        else
        {
            System.out.println("Apagado");
        }
        return status;
    }
    public String getModelo()
    {
        return modelo;
    }
   public void setModelo(String fmodelo)
   {
       this.modelo=fmodelo;
   }
    public String getMatricula()
    {
        System.out.println("Numero de Matricula:"+matricula);
        return matricula;
    }
     public void setMatricula(String fmatricula)
    {
        this.matricula=fmatricula;
    }
    public int getPeople()
    {
        System.out.println("Hay:"+" "+people+" "+"Personas en el Atomovil");
        return people;  
    }
    
     public void setPeople(int fpeople)
    {
        this.people=fpeople;
    }
     
      public float getPrecio()
    {
        System.out.println("El precio es de:" +precio);
        return precio;
    }
        public void setPrecio(float fprecio)
     {
         this.precio=fprecio;
     }
        
    
    
     @Override
     public String toString(){
    String aux="";
    aux="Color del Automovil:"+" "+color+"\n"+"Modelo del Automovil: "+" "+modelo+"\n"+"Numero de la matricula:"+" "+matricula+"\n"+"Hay"+" "+people+" "+"Personas en el Automovil\n"+"El Automovil esta ";
        if(status){
       aux=aux+"Encendido";
       
        }else{
       aux=aux+"Apagado"+"\nPrecio:"+precio;
        }
   return aux;
}
    
    
}
    

