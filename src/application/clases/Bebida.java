package application.clases;

/**
    * Clase creada para el alimento Bebida hereda de la Super class Alimento  
*/
public class Bebida extends Alimento {  
    
    /**
        * Atributos de la clase   
    */
    private Boolean dulce;
    private int calorias;
    private Boolean natural;
    private final Integer puntaje;
    private final String nombre;
    
    /**
        * Constructor de la clase, recibe parametros propios y heredados 
    */
    public Bebida(String nombre, Integer puntaje, Boolean dulce, Integer calorias, Boolean natural)
    {
        super(nombre, puntaje);
        
        this.puntaje = puntaje;
        this.nombre = nombre;
        this.dulce = dulce;
        this.calorias = calorias;
        this.natural = natural;
    }
    
    /**
        * Permite inducir el sabor de la bebida
    */
    public void setDulce(Boolean dulce) 
    {
        this.dulce = dulce;
    }
    
    /**
        * Permite obtener el sabor de la bebida si es dulce o no
    */
    public boolean getDulce()
    {        
        return dulce;
    }    
    
    /**
        * Permite saber el total de las calorias 
    */
    public int getCalorias()
    {
        return this.calorias;
    }
            
    /**
        * Calcula el total de calorias depende si es dulce o no y si es natural o no
    */
    public void setCalorias(boolean dulce, boolean natural)
    {
        if(dulce && natural){
            this.calorias = 25;
            
        }else if(dulce && !natural){
            this.calorias = 55;
            
        }else if(!dulce && natural){
            this.calorias = 5;

        }else{
            this.calorias = 12;
        }
    }
    
    /**
        * Permite inducir si la bebida es natural o no 
    */
    public void setNatural(Boolean natural) 
    {
        this.natural = natural;
    }
     
     /**
        * Permite saber si es natural o no la bebida
    */
     public boolean getNatural()
     {
         return this.natural;
     }
    
}
