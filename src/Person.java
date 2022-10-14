public class Person {
    // Unsere Klassen haben KEINE main-Methode!!! (wenn wir Objekt aus realer Welt abbilden wollen)


    // public - Variable definieren - String + "Name", oder int + "Name",... definieren was ich brauche
    // zurzeit Person besteht aus 5 Attribute        - (alles in Deutsch oder Englisch)

    public int uniqueID;                    //eindeutige Nummer - z.B. Versicherungsnummer
    public String firstName;
    public String lastName;
    public int ageInYears;
    public String mailAddress;

    //Methoden innerhalb der Klasse sind MEIST NICHT static (zu 99%)
    public void print () {                                     //"leben einhauchen" - kein Parameter
        System.out.println("uniqueID = " + uniqueID);            //Personen wissen das und können darauf zugreifen
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("ageInYears = " + ageInYears);
        System.out.println("mailAddress = " + mailAddress);        //Klasse kann auf eigene Attribute zugreifen
    }

    public String fullName() {                                     //dadurch weniger Fehler
        return lastName.toUpperCase() + " " + firstName;          // text in Großbuchstaben umwandeln
    }


    public void setLastName(String lastName) {                   // so kann ich neuen Nachnamen setzten
        this.lastName = lastName;                               //this Übung - Folie S.47 ca
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void changeAge (int newAge) {
        if (newAge > ageInYears && newAge > 0 && newAge < 150) {     // wir können nur älter werden, und muss größer als 0 sein + <150J
            ageInYears = newAge;
        }
        else {
            System.out.println("404 - this age is not correct: " + newAge);
        }
    }

    @Override
    public String toString() {                                              //Code + Generate + toString
        return "Person{" +
                "uniqueID=" + uniqueID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ageInYears=" + ageInYears +
                ", mailAddress='" + mailAddress + '\'' +
                '}';
    }
}
