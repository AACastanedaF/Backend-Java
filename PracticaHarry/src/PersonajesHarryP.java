//Programa Principal
//Para este programa opte por crear los objetos por constructor
//De igual manera cree los setters por cualquier cosa
public class PersonajesHarryP {
    public static void main (String[] args){
        Personaje Harry = new Personaje("Harry Potter", "Masculino",
                "Sangre Mestiza", "Gryffindor", "Ciervo");
        Harry.getAll();
        Personaje Snape = new Personaje("Severus Snape", "Masculino",
                "Sangre Mestizo", "Slytherin", "Ciervo");
        Snape.getAll();
        Personaje Hermione = new Personaje("Hermione Granger", "Femenino",
                "Hija de Muggles", "Gryffindor", "Nurtia");
        Hermione.getAll();
        Personaje Bellatrix = new Personaje("Bellatrix Lastrangre", "Femenino",
                "Sangre Pura", "Slytherin", "...");
        Bellatrix.getAll();
        Personaje Draco = new Personaje("Draco Malfoy", "Masculino",
                "Sangre Pura", "Slytherin", "...");
        Draco.getAll();
    }
}


