public class Mona {
    protected String Especie = "Mona es un gato";
    private String Nombre = "Original";
    private String Sonido = "Puedo hacer algun sonido";
    public void SetNombre(String newNombre){
        Nombre = newNombre;
    }
    public void SetSonido(String newSonido){
        Sonido = newSonido;
    }
}

class MonaProfesionista extends Mona{
    private String Profesion;
    private String Descripcion;
    public void SetProfesion(String newProfesion){
        Profesion = newProfesion;
    }
    public void SetDescripcion(String newDescripcion){
        Descripcion = newDescripcion;
    }
    public void GetAll(){
        System.out.println("Especie: " + Especie);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Profesion: " + Profesion);
        System.out.println("Descripcion: " + Descripcion);
        System.out.println("Sonido: " + Sonido);
        System.out.println("\n");
    }
}

class MonaAcompanada extends Mona{
    private String Tematica;
    private String Descripcion;
    private String Acompanantes;
    public void SetTematica(String newTematica){
        Tematica = newTematica;
    }
    public void SetDescripcion(String newDescripcion){
        Descripcion = newDescripcion;
    }
    public void SetAcompanantes(String newAcompanantes){
        Acompanantes = newAcompanantes;
    }
    public void GetAll(){
        System.out.println("Especie: " + Especie);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Tematica: " + Tematica);
        System.out.println("Descripcion: " + Descripcion);
        System.out.println("Acompanantes: " + Acompanantes);
        System.out.println("Sonido: " + Sonido);
        System.out.println("\n");
    }
}