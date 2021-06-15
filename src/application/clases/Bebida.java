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
     *
     * @param nombre
     * @param puntaje
     * @param dulce
     * @param calorias
     * @param natural
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
     * @param dulce
     * resibe el valor para ser asignado al atributo dulce
     */
    public void setDulce(Boolean dulce)
    {
        this.dulce = dulce;
    }

    /**
     * @return el atributo dulce
     */
    public boolean getDulce()
    {
        return dulce;
    }

    /**
     * @return el atributo calorias
     */
    public int getCalorias()
    {
        return this.calorias;
    }

    /**
     * @param dulce
     * @param natural
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
     * @param natural
     * resibe el valor para ser asignado al atributo natural
     */
    public void setNatural(Boolean natural)
    {
        this.natural = natural;
    }

    /**
     * @return el atributo natural
     */
     public boolean getNatural()
     {
         return this.natural;
     }

}
