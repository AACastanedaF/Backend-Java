//Clase Spiderman
public class Spiderman{
    public String Nombre;
    private String Universo;
    private boolean IdentidadSecreta;
    private int Edad;
    private String Genero;
    /*
    Spiderman(String newNombre, String newUniverso, boolean newIdentidadSecreta,
                     int newEdad, String newGenero){
        this.Nombre = newNombre;
        this.Universo = newUniverso;
        this.IdentidadSecreta = newIdentidadSecreta;
        this.Edad = newEdad;
        this.Genero = newGenero;
    }*/
    //setters
    public void SetNombre(String newNombre){
        this.Nombre = newNombre;
    }
    public void SetUniverso(String newUniverso){
        this.Universo = newUniverso;
    }
    public void SetIdentidadSecreta(boolean newIdentidad){
        this.IdentidadSecreta = newIdentidad;
    }
    public void SetEdad(int newEdad){
        this.Edad =  newEdad;
    }
    public void SetGenero(String newGenero){
        this.Genero = newGenero;
    }
    //getters
    public void GetNombre(){
        System.out.println(Nombre);
    }
    public void GetUniverso(){
        System.out.println(Universo);
    }
    public void GetIdentidadSecreta(){
        if (IdentidadSecreta == true){
            System.out.println("La identidad de este personaje ES escreta");
        } else {
            System.out.println("La identidad de este personaje NO es escreta");
        }
    }
    public void GetEdad(){
        System.out.println(Edad);
    }
    public void GetGenero(){
        System.out.println(Genero);
    }
    public void GetAll(){
        GetNombre();
        GetUniverso();
        GetEdad();
        GetIdentidadSecreta();
        GetGenero();
    }
}
//Interfaces
interface Basico{
    public void golpe();
    public void patada();
    public void golpecargado();
    public void patadacargada();
    public void listaAtaquesB();
}
interface AtaqueAvanzado{
    public void telaraña();
    public void stunTelaraña();
    public void patadavoladora();
    public void TreparPared();
    public void ListaAtaquesA();
}
 interface AtaqueObjetos{
    public void laser();
    public void golpeconMartillo();
    public void poderArmadura();
    public void ListaAtaquesO();
}

class MilesMorales extends Spiderman implements Basico, AtaqueAvanzado{
    public void golpe(){
        System.out.println("Golpe");
    }
    public void patada(){
        System.out.println("Patada");
    }
    public void golpecargado(){
        System.out.println("Golpe Cargado");
    }
    public void patadacargada(){
        System.out.println("Patada Cargada");
    }
    public void telaraña(){
        System.out.println("Lanzar Telaraña");
    }
    public void stunTelaraña(){
            System.out.println("Aturdir con Telaraña");
    }
    public void patadavoladora(){
        System.out.println("Patada Voladora");
    }
    public void TreparPared(){
        System.out.println("Trepar Pared");
    }
    public void listaAtaquesB(){
        System.out.println("Los Ataques Básicos de "+ Nombre + " son:");
        golpe();
        patada();
        golpecargado();
        patadacargada();
    }
    public void ListaAtaquesA(){
        System.out.println("Los Ataques Avanzados de "+ Nombre + " son:");
        telaraña();
        stunTelaraña();
        patadavoladora();
        TreparPared();
    }
}
class SpiderGwen extends Spiderman implements Basico, AtaqueAvanzado{
    public void golpe(){
        System.out.println("Golpe");
    }
    public void patada(){
        System.out.println("Patada");
    }
    public void golpecargado(){
        System.out.println("Golpe Cargado");
    }
    public void patadacargada(){
        System.out.println("Patada Cargada");
    }
    public void telaraña(){
        System.out.println("Lanzar Telaraña");
    }
    public void stunTelaraña(){
        System.out.println("Aturdir con Telaraña");
    }
    public void patadavoladora(){
        System.out.println("Patada Voladora");
    }
    public void TreparPared(){
        System.out.println("Trepar Pared");
    }
    public void listaAtaquesB(){
        System.out.println("Los Ataques Básicos de "+ Nombre + " son:");
        golpe();
        patada();
        golpecargado();
        patadacargada();
    }
    public void ListaAtaquesA(){
        System.out.println("Los Ataques Avanzados de "+ Nombre + " son:");
        telaraña();
        stunTelaraña();
        patadavoladora();
        TreparPared();
    }
}
class SpiderHam extends Spiderman implements AtaqueAvanzado, AtaqueObjetos{
    public void patadavoladora(){
        System.out.println("No tiene Patada Voladora");
    }
    public void TreparPared(){
        System.out.println("Trepar Pared");
    }
    public void telaraña(){
        System.out.println("Lanzar Telaraña");
    }
    public void stunTelaraña(){
        System.out.println("Aturdir con Telaraña");
    }
    public void laser(){
        System.out.println("No puede lanzar lasers");
    }
    public void golpeconMartillo(){
        System.out.println("Golpe con martillo");
    }
    public void poderArmadura(){
        System.out.println("No tiene poder con armadura");
    }
    public void ListaAtaquesO(){
        System.out.println("Los Ataques con Objetos de "+ Nombre + " son:");
        laser();
        golpeconMartillo();
        poderArmadura();
    }
    public void ListaAtaquesA(){
        System.out.println("Los Ataques Avanzados de "+ Nombre + " son:");
        telaraña();
        stunTelaraña();
        patadavoladora();
        TreparPared();
    }
}
class IronSpider extends Spiderman implements Basico, AtaqueAvanzado, AtaqueObjetos{
    public void golpe(){
        System.out.println("Golpe");
    }
    public void patada(){
        System.out.println("Patada");
    }
    public void golpecargado(){
        System.out.println("Golpe Cargado");
    }
    public void patadacargada(){
        System.out.println("Patada Cargada");
    }
    public void laser(){
        System.out.println("Puede lanzar lasers");
    }
    public void golpeconMartillo(){
        System.out.println("No tiene Golpe con martillo");
    }
    public void poderArmadura(){
        System.out.println("Poder con armadura");
    }
    public void telaraña(){
        System.out.println("Lanzar Telaraña");
    }
    public void stunTelaraña(){
        System.out.println("Aturdir con Telaraña");
    }
    public void patadavoladora(){
        System.out.println("Patada Voladora");
    }
    public void TreparPared(){
        System.out.println("Trepar Pared");
    }
    public void ListaAtaquesO(){
        System.out.println("Los Ataques con Objetos de "+ Nombre + " son:");
        laser();
        golpeconMartillo();
        poderArmadura();
    }
    public void ListaAtaquesA(){
        System.out.println("Los Ataques Avanzados de "+ Nombre + " son:");
        telaraña();
        stunTelaraña();
        patadavoladora();
        TreparPared();
    }
    public void listaAtaquesB(){
        System.out.println("Los Ataques Básicos de "+ Nombre + " son:");
        golpe();
        patada();
        golpecargado();
        patadacargada();
    }
}
class SpiderLess extends Spiderman{
    public void Ataques(){
        System.out.println("No tiene ningún poder");
    }
}
