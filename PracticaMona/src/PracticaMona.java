public class PracticaMona {
    public static void main(String[] args){
        Mona Sencilla = new Mona();
        MonaProfesionista Scubatocat = new MonaProfesionista();
        MonaProfesionista Snowtocat = new MonaProfesionista();
        MonaProfesionista Dinotocat = new MonaProfesionista();
        MonaProfesionista Justicetocat = new MonaProfesionista();
        MonaAcompanada Bewitchedtocat = new MonaAcompanada();
        MonaAcompanada Octoasians = new MonaAcompanada();
        //impresion de clase madre
        System.out.println("Especie: " + Sencilla.Especie);
        System.out.println("Nombre: " + Sencilla.Nombre);
        System.out.println("Sonido: " + Sencilla.Sonido);
        System.out.println("\n");
        //Atribuir propiedades a subclases
        Scubatocat.SetNombre("Scubatocat");
        Scubatocat.SetProfesion("Buceadora");
        Scubatocat.SetDescripcion("Viste un traje de buzo y esta viendo un pez globo");
        Scubatocat.SetSonido("glu glu glu");
        Scubatocat.GetAll();
        Justicetocat.SetNombre("Justicetocat");
        Justicetocat.SetProfesion("Estatua d ela Justicia");
        Justicetocat.SetDescripcion("Aparece con una espada y una balamza");
        Justicetocat.SetSonido("...And Justice For All");
        Justicetocat.GetAll();
        Snowtocat.SetNombre("Snowtocat");
        Snowtocat.SetProfesion("Esquiadora");
        Snowtocat.SetDescripcion("Trae puesta ropa de invierno y esquis");
        Snowtocat.SetSonido("Extremo!");
        Snowtocat.GetAll();
        Dinotocat.SetNombre("Dinotocat");
        Dinotocat.SetProfesion("Dinosaurio");
        Dinotocat.SetDescripcion("Godzilla!!!");
        Dinotocat.SetSonido("Rawr!");
        Dinotocat.GetAll();
        Bewitchedtocat.SetNombre("Bewtichedtocat");
        Bewitchedtocat.SetTematica("Halloween");
        Bewitchedtocat.SetDescripcion("Esta conduciendo una escoba voladora en la noche");
        Bewitchedtocat.SetAcompanantes("Sale con tres niños disfrazados");
        Bewitchedtocat.SetSonido("Swoooosh, magia");
        Bewitchedtocat.GetAll();
        Octoasians.SetNombre("Octoasians");
        Octoasians.SetTematica("Asia");
        Octoasians.SetDescripcion("Fiesta de los parientes asiaticos de Mona");
        Octoasians.SetAcompanantes("Hay 7 participantes");
        Octoasians.SetSonido("Wuuuu, Fiesta!");
        Octoasians.GetAll();
    }
}
