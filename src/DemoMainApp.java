public class DemoMainApp {

    public static void main(String[] args) {
        System.out.println("Hello World");

        //Klassen arbeiten mit mehreren Dateien! - main wird immer kleiner - weniger bedeutung;

        Person susi;         // Ein Objekt von Person für Susi definiert - susi ist eine Variable/Objekt vom Typ Person
        susi = new Person();            // initialisieren - Susi ist eine neue Person
        susi.uniqueID = 4711;
        susi.firstName = "Susi";            //Objekte von Klassen so bennen was drinnen ist
        susi.lastName = "Sorglos";
        susi.ageInYears = 39;
        susi.mailAddress = "susi.sorglos@test.com";


        Person max = new Person();
        max.uniqueID = 2511;                      // müssen wir am Anfang noch selbst vergeben;
        max.firstName = "Max";                    // diese 5 Werte gehören zur Variable max
        max.lastName = "Mustermann";
        max.ageInYears = 40;
        max.mailAddress = "max.mustermann@test.com";

        printPerson(max);
        printPerson(susi);

        System.out.println();
        printTwoPerson(susi, max);

        max.print();     //max zeige dein Verhalten nach print
        susi.print();     //in Klasse machen - gehört zu meiner Person - kann ich in main Methode verwenden

        System.out.println("max.fullName() = " + max.fullName());

        susi.setLastName(max.lastName);
        System.out.println("susi.fullName() = " + susi.fullName());                 //Susi heiratet max - nimmt Nachname an

        susi.changeAge(40);                                           //mit Methode sicherstellen wie ich funktioniere
        System.out.println("susi.ageInYears = " + susi.ageInYears);
        susi.changeAge(28);
        System.out.println("susi.ageInYears = " + susi.ageInYears);
        susi.ageInYears = 28;
        System.out.println("susi.ageInYears = " + susi.ageInYears);


        System.out.println("max.toString() = " + max.toString());
    }

    public static void printTwoPerson(Person person1, Person person2){
        printPerson(person1);
        printPerson(person2);
    }

    public static void printPerson(Person person) {                      //Variable wird auch person genannt
        System.out.println("person.uniqueID = " + person.uniqueID);
        System.out.println("person.firstName = " + person.firstName);        //soutv + bei person - Pfeil nach rechts
        System.out.println("person.lastName = " + person.lastName);         //strg + re/li - wörterweise hüpfen
        System.out.println("person.mailAddress = " + person.mailAddress);    //alt + rauf/runter - methoden weiter
        System.out.println("person.ageInYears = " + person.ageInYears);

    }
}

