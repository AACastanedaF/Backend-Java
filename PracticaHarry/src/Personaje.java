//Objeto Personaje de Harry Potter
public class Personaje{
    //caracteristicas
    private String nombre;
    private String genero;
    private String TipoSangre;
    private String casa;
    private String patronus;
    //Constructor
    public Personaje(String newnombre, String newgenero,  String newTipoSangre,
                     String newcasa, String newpatronus){
        this.nombre = newnombre;
        this.genero = newgenero;
        this.TipoSangre = newTipoSangre;
        this.casa = newcasa;
        this.patronus = newpatronus;
    }
    //setters
    public void SetNombre(String newName){
        this.nombre = newName;
    }
    public void SetGenero(String newgenero){
        this.genero = newgenero;
    }
    public void SetCasa(String newcasa){
        this.casa = newcasa;
    }
    public void SetPatronus(String newpatronus){
        this.patronus = newpatronus;
    }
    public void SetTipoSangre(String newTipoSangre){
        this.TipoSangre = newTipoSangre;
    }
    //Getters
    //haré el getter para obtener toda la información del personaje a la vez
    public void getAll(){
        System.out.println("La información del Personaje " + this.getNombre() + " es:");
        System.out.println("Su genero es: " + this.getGenero());
        System.out.println("Su Tipo de Sangre es: " + this.getTipoSangre());
        System.out.println("Su casa es: " + this.getCasa());
        System.out.println("Su patronus es: " + this.getPatronus() + "\n");
    }
    //con estos metodos, se regresa cada atributo en especifico
    public String getNombre(){
        return nombre;
    }
    public String getGenero(){
        return genero;
    }
    public String getCasa(){
        return casa;
    }
    public String getPatronus(){
        return patronus;
    }
    public String getTipoSangre(){
        return TipoSangre;
    }
}
