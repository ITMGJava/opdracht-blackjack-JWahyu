import java.util.*;

//// Kaart als complexe samenstelling van formules van diverse arrays.
//public class Kaart {
//    public String soort;
//    public String rang;
//    public int punt;
//
//    public Kaart(String s, String r, int p) {
//        soort = s;
//        rang = r;
//        punt = p;
//    }
//
//    public String getSoort() {return soort;}
//    public String getRang() {return rang;}
//    public int getPunten() {return punt;}
//
//    public void setSoort(String s) {soort = s;}
//    public void setRang(String r) {rang = r;}
//    public void setPunten(int p) {punt = p;}
//
//    public String toString() {
//        return soort + " " + rang + " (" + punt + "p)";
//    }
//
//    public static void main(String[] args) {
//        Stapel stapel = new Stapel();
//    }
//
//    public static class Stapel {
//
//        String[] soorten = {"Schoppen", "♥ Harten", "♣ Klaver", "♦ Ruiten",};
//        String[] rangen = {null, "Aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Dame", "Koning",};
//        int[] punten = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10,};
//
//        public String rang;
//        public int punt;
//
//        public Stapel() {
//            int aantalKaarten = 52;
//            Kaart[] kaarten = new Kaart[aantalKaarten];
//            int huidigeKaart = 0;
//            for (int soort = 0; soort <= 3; soort++) {
//                for (int rang = 1; rang <= 13; rang++) {
//                    this.rang = rangen[rang] + "";
//                    this.punt = punten[rang];
//
//                    kaarten[huidigeKaart] = new Kaart(soorten[soort], this.rang, punt);
//                    System.out.print(kaarten[huidigeKaart].toString() + ", ");
//                    if (((huidigeKaart + 1) % 13) == 0) {
//                        System.out.println();
//                    }
//                    huidigeKaart++;
//                }
//            }
//        }
//    } // Einde public Stapel
//
//} // Einde class Kaart als complexe samenstelling van formules van diverse arrays.

// ---

//    public String toString() {
////        String[] waarde = {"Aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Dame", "Koning"};
////        String[] soort = {"♤ Schoppen", "♥ Harten", "♣ Klaver", "♦ Ruiten"};
//        String kaartArray = SOORT[this.soort] + " " + RANG[this.rang] + " (" + PUNTEN[this.punt] + "p)";
//        Kaart[] kaartStapel = new Kaart[52];
//        int kaartIndex = 0;
//        for (int soort = 0; soort <= 3; soort++) {
//            for (int rang = 1; rang <= 13; rang++) {
//            int punt =
//                    kaartStapel[kaartIndex] = new Kaart(soort, rang, punt);
//                    kaartIndex++;
//            }
//        }
//
//        if (kaartStapel[0] == null) {
//            System.out.println("Nog geen kaart beschikbaar!");
//        }
//
//            System.out.println(Arrays.toString(kaartStapel));
//            System.out.println(kaartStapel.length);
//
////        System.out.println(Arrays.toString(kaartStapel));
//        return kaartArray;

// ---

//        String kaartArray = SOORT[this.soort] + " " + RANG[this.rang] + " (" + PUNTEN[this.punt] + "p)";
//        Kaart[] kaartStapel = new Kaart[52];
//        int kaartIndex = 0;
//        for (int soort = 0; soort <= 3; soort++) {
//            for (int rang = 1; rang <= 13; rang++) {
//                int punt =
//                        kaartStapel[kaartIndex] = new Kaart(soort, rang, punt);
//                kaartIndex++;
//            }
//        }
//
//        if (kaartStapel[0] == null) {
//            System.out.println("Nog geen kaart beschikbaar!");
//        }
//
//        System.out.println(Arrays.toString(kaartStapel));
//        System.out.println(kaartStapel.length);
//
////        System.out.println(Arrays.toString(kaartStapel));
//        return kaartArray;

//    public static final String[] SOORT = {
//            "♤ Schoppen", "♥ Harten", "♣ Klaver", "♦ Ruiten",
//    };
//
//    public static final String[] RANG = {
//            null, "Aas", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Boer", "Dame", "Koning",
//    };
//
//    public static final int[] PUNTEN = {
//            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10,
//    };
//
//    public static final String[] PUNTENLETTERLIJK = new String[PUNTEN.length];

//            "♤ Schoppen Aas",
//            "♤ Schoppen 2",
//            "♤ Schoppen 3",
//            "♤ Schoppen 4",
//            "♤ Schoppen 5",
//            "♤ Schoppen 6",
//            "♤ Schoppen 7",
//            "♤ Schoppen 8",
//            "♤ Schoppen 9",
//            "♤ Schoppen 10",
//            "♤ Schoppen Boer",
//            "♤ Schoppen Dame",
//            "♤ Schoppen Koning",
//            "♥ Harten Aas",
//            "♥ Harten 2",
//            "♥ Harten 3",
//            "♥ Harten 4",
//            "♥ Harten 5",
//            "♥ Harten 6",
//            "♥ Harten 7",
//            "♥ Harten 8",
//            "♥ Harten 9",
//            "♥ Harten 10",
//            "♥ Harten Boer",
//            "♥ Harten Dame",
//            "♥ Harten Koning",
//            "♣ Klaver Aas",
//            "♣ Klaver 2",
//            "♣ Klaver 3",
//            "♣ Klaver 4",
//            "♣ Klaver 5",
//            "♣ Klaver 6",
//            "♣ Klaver 7",
//            "♣ Klaver 8",
//            "♣ Klaver 9",
//            "♣ Klaver 10",
//            "♣ Klaver Boer",
//            "♣ Klaver Dame",
//            "♣ Klaver Koning",
//            "♦ Ruiten Aas",
//            "♦ Ruiten 2",
//            "♦ Ruiten 3",
//            "♦ Ruiten 4",
//            "♦ Ruiten 5",
//            "♦ Ruiten 6",
//            "♦ Ruiten 7",
//            "♦ Ruiten 8",
//            "♦ Ruiten 9",
//            "♦ Ruiten 10",
//            "♦ Ruiten Boer",
//            "♦ Ruiten Dame",
//            "♦ Ruiten Koning"
//};



// @Override toString() functie: belangrijk want anders krijg je alle uitvoer in de andere class niet LETTERLIJK te zien.
//    @Override
//    public String[] getKaartArray() {
//        return kaartArray.clone();
//    }


// Public class Kaart als ArrayList
public class Kaart {
    // Variabelen
    public String kaartNaam;
    public int punt;
    public static ArrayList<Kaart> kaartArrayList = new ArrayList<>();
    public static ArrayList<Kaart> kaartBank = new ArrayList<>();
    public static ArrayList<Kaart> kaartSpeler1 = new ArrayList<>();
    public static ArrayList<Kaart> kaartSpeler2 = new ArrayList<>();
    public static ArrayList<Kaart> kaartSpeler3 = new ArrayList<>();
    public static ArrayList<Kaart> kaartSpeler4 = new ArrayList<>();
    public static ArrayList<String> spelerNaamExtern = new ArrayList<>();
    public static ArrayList<Boolean> inHetSpelExtern= new ArrayList<>(Arrays.asList(new Boolean[5]));
    public static ArrayList<Boolean> beurtKlaarExtern = new ArrayList<>(Arrays.asList(new Boolean[5]));

    public static int aantalSpelersExtern;

    public static boolean checkNieuwSpelExtern = false;
    public static boolean checkAantalSpelersExtern = false;

    public static Scanner invoerExtern = new Scanner(System.in);
    // Einde variabelen.

    // Type element definiëren met bijbehorende waardes.
    public Kaart(String kaartNaam, int punt) {
        this.kaartNaam = kaartNaam;
        this.punt = punt;
    }

    public void setKaartNaam(String kaartNaam) {this.kaartNaam = kaartNaam;}
    public void setPunt(int punt) {this.punt = punt;}

    public String getKaartNaam() {return kaartNaam;}
    public int getPunt() {return punt;}

    // Print kaart layout.
    public String toString() {
        return (kaartNaam + " (" + punt + "p)");
    }
    // Einde type element definiëren met bijbehorende waardes.


    // Constructor
    public Kaart() {
        // Alle kaarten als een ArrayList: kaartArrayList.
        kaartArrayList.add(new Kaart("♤ Schoppen Aas", 11));
        kaartArrayList.add(new Kaart("♤ Schoppen 2", 2));
        kaartArrayList.add(new Kaart("♤ Schoppen 3", 3));
        kaartArrayList.add(new Kaart("♤ Schoppen 4", 4));
        kaartArrayList.add(new Kaart("♤ Schoppen 5", 5));
        kaartArrayList.add(new Kaart("♤ Schoppen 6", 6));
        kaartArrayList.add(new Kaart("♤ Schoppen 7", 7));
        kaartArrayList.add(new Kaart("♤ Schoppen 8", 8));
        kaartArrayList.add(new Kaart("♤ Schoppen 9", 9));
        kaartArrayList.add(new Kaart("♤ Schoppen 10", 10));
        kaartArrayList.add(new Kaart("♤ Schoppen Boer", 10));
        kaartArrayList.add(new Kaart("♤ Schoppen Dame", 10));
        kaartArrayList.add(new Kaart("♤ Schoppen Koning", 10));
        kaartArrayList.add(new Kaart("♥ Harten Aas", 11));
        kaartArrayList.add(new Kaart("♥ Harten 2", 2));
        kaartArrayList.add(new Kaart("♥ Harten 3", 3));
        kaartArrayList.add(new Kaart("♥ Harten 4", 4));
        kaartArrayList.add(new Kaart("♥ Harten 5", 5));
        kaartArrayList.add(new Kaart("♥ Harten 6", 6));
        kaartArrayList.add(new Kaart("♥ Harten 7", 7));
        kaartArrayList.add(new Kaart("♥ Harten 8", 8));
        kaartArrayList.add(new Kaart("♥ Harten 9", 9));
        kaartArrayList.add(new Kaart("♥ Harten 10", 10));
        kaartArrayList.add(new Kaart("♥ Harten Boer", 10));
        kaartArrayList.add(new Kaart("♥ Harten Dame", 10));
        kaartArrayList.add(new Kaart("♥ Harten Koning", 10));
        kaartArrayList.add(new Kaart("♣ Klaver Aas", 11));
        kaartArrayList.add(new Kaart("♣ Klaver 2", 2));
        kaartArrayList.add(new Kaart("♣ Klaver 3", 3));
        kaartArrayList.add(new Kaart("♣ Klaver 4", 4));
        kaartArrayList.add(new Kaart("♣ Klaver 5", 5));
        kaartArrayList.add(new Kaart("♣ Klaver 6", 6));
        kaartArrayList.add(new Kaart("♣ Klaver 7", 7));
        kaartArrayList.add(new Kaart("♣ Klaver 8", 8));
        kaartArrayList.add(new Kaart("♣ Klaver 9", 9));
        kaartArrayList.add(new Kaart("♣ Klaver 10", 10));
        kaartArrayList.add(new Kaart("♣ Klaver Boer", 10));
        kaartArrayList.add(new Kaart("♣ Klaver Dame", 10));
        kaartArrayList.add(new Kaart("♣ Klaver Koning", 10));
        kaartArrayList.add(new Kaart("♦ Ruiten Aas", 11));
        kaartArrayList.add(new Kaart("♦ Ruiten 2", 2));
        kaartArrayList.add(new Kaart("♦ Ruiten 3", 3));
        kaartArrayList.add(new Kaart("♦ Ruiten 4", 4));
        kaartArrayList.add(new Kaart("♦ Ruiten 5", 5));
        kaartArrayList.add(new Kaart("♦ Ruiten 6", 6));
        kaartArrayList.add(new Kaart("♦ Ruiten 7", 7));
        kaartArrayList.add(new Kaart("♦ Ruiten 8", 8));
        kaartArrayList.add(new Kaart("♦ Ruiten 9", 9));
        kaartArrayList.add(new Kaart("♦ Ruiten 10", 10));
        kaartArrayList.add(new Kaart("♦ Ruiten Boer", 10));
        kaartArrayList.add(new Kaart("♦ Ruiten Dame", 10));
        kaartArrayList.add(new Kaart("♦ Ruiten Koning", 10));
        // Einde Alle kaarten als een ArrayList: kaartArrayList.

    } // Einde constructor public Kaart()


    //  Print stapel kaarten met nieuwe regel na elke 13 kaarten.
    public static void kaartStapel() {
        for (int i = 0; i < kaartArrayList.size(); i++) {
            System.out.print(kaartArrayList.get(i) + ", ");
            if((i+1) % 13 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }
    // Einde print stapel kaarten met nieuwe regel na elke 13 kaarten.

    public static void invoerEnterExtern() {
        boolean checkEnter = false;
        while (!checkEnter) { // Invoer: enter.
            System.out.printf("%n―――――――――――――――――――――――――%n");
            System.out.print("Druk op 'ENTER'-toets om verder te gaan.");
            System.out.printf("%n―――――――――――――――――――――――――%n");


            String toetsEnter = invoerExtern.nextLine();

            if (toetsEnter.isEmpty()) {
                checkEnter = true;
            } else {
                geenGeldigeInvoer();
                checkEnter = false;
            }
        }
    } // Einde Invoer: enter.

    public static void geenGeldigeInvoer() {
        System.out.printf("%n――――――――――――――――――――――――――%n");
        System.out.print("Geen geldige invoer. Probeer het nogmaals.");
        System.out.printf("%n――――――――――――――――――――――――――%n");
    }


    public static int aantalSpelersExtern() {
        System.out.printf("%nMet hoeveel spelers zullen we spelen? Graag een getal invoeren tussen 1 t/m 4 en bevestig vervolgens je keuze met 'ENTER'-toets: ");
        while (!checkAantalSpelersExtern) { // Invoer: aantal spelers.
            String invoerAantalSpelers = invoerExtern.nextLine();
            try { // Lees invoer: moet een getal zijn.
                aantalSpelersExtern = Integer.parseInt(invoerAantalSpelers);
            } catch (NumberFormatException ex) { // Foutmelding.
                geenGeldigeInvoer();
            }


            if (aantalSpelersExtern == 1) {
                System.out.printf("Een solo spel!%n%n");
                checkAantalSpelersExtern = true;
            } else if (aantalSpelersExtern >= 2 && aantalSpelersExtern <= 4) {
                System.out.printf("Hoe meer zielen, hoe meer vreugd!%n%n");
                checkAantalSpelersExtern = true;
            } else { // Ongeldige invoerExtern: géén geldige getal.
                System.out.printf("%nMet hoeveel spelers zullen we spelen? Graag een getal invoeren tussen 1 t/m 4 en bevestig vervolgens je keuze met 'ENTER'-toets: ");
                checkAantalSpelersExtern = false;
            }
        } // Einde Invoer: aantal spelers.

        aantalSpelersExtern++; // Bank = Speler 0.
        return aantalSpelersExtern;
    }


    public static ArrayList<String> spelerNamenExtern() {
        spelerNaamExtern.add("Bank");
        for (int i = 1; i < aantalSpelersExtern; i++) // Invoer spelersnamen.
        {
            System.out.print("Graag naam invullen voor Speler " + i + " en bevestig vervolgens je keuze met 'ENTER'-toets: ");
            spelerNaamExtern.add(invoerExtern.nextLine());
        } // Einde Invoer spelersnamen.

        // Uitvoer: spelersnamen.
        if (aantalSpelersExtern == 2) { // Overzicht: totaal 1 speler.
            System.out.printf("%nAangenaam " + spelerNaamExtern.get(1) + ". We gaan beginnen!%n");
        } else if (aantalSpelersExtern == 3) { // Overzicht: totaal 2 spelers.
            System.out.printf("%nAangenaam " + spelerNaamExtern.get(1) + " en " + spelerNaamExtern.get(2) + ". We gaan beginnen!%n");
        } else if (aantalSpelersExtern == 4) { // Overzicht: totaal 3 spelers.
            System.out.printf("%nAangenaam " + spelerNaamExtern.get(1) + ", " + spelerNaamExtern.get(2) + " en " + spelerNaamExtern.get(3) + ". We gaan beginnen!%n");
        } else if (aantalSpelersExtern == 5) { // Overzicht: totaal 4 spelers.
            System.out.printf("%nAangenaam " + spelerNaamExtern.get(1) + ", " + spelerNaamExtern.get(2) + ", " + spelerNaamExtern.get(3) + " en " + spelerNaamExtern.get(4) + ". We gaan beginnen!%n");
        } else {
            System.out.print("Niet gelukt"); // Einde Uitvoer: spelersnamen.
        }
        return spelerNaamExtern;
    }



    public static ArrayList<Boolean> beurtKlaarExtern() {
        // Vul Boolean Array: Is de beurt van de speler al klaar?
        Collections.fill(beurtKlaarExtern, Boolean.FALSE);
        // Einde Vul Boolean Array: Is de beurt van de speler al klaar?
        return beurtKlaarExtern;
    }

    public static ArrayList<Boolean> inHetSpelExtern() {
        // Vul Boolean Array: Zit de speler nog in het spel?
        Collections.fill(inHetSpelExtern, Boolean.FALSE);
        for (int i = 0; i < aantalSpelersExtern; i++) {
            inHetSpelExtern.set(i, true);
        }
        // Einde Vul Boolean Array: Zit de speler nog in het spel?
        return inHetSpelExtern;
    }

    

    // Punten.
    public static int getPuntenBank() {
        int punt = 0;
        for (Kaart kaart : kaartBank) {
            punt += kaart.getPunt();
        }
        return punt;
    }

    public static int getPuntenSpeler1() {
        int punt = 0;
        for (Kaart kaart : kaartSpeler1) {
            punt += kaart.getPunt();
        }
        return punt;
    }

    public static int getPuntenSpeler2() {
        int punt = 0;
        for (Kaart kaart : kaartSpeler2) {
            punt += kaart.getPunt();
        }
        return punt;
    }

    public static int getPuntenSpeler3() {
        int punt = 0;
        for (Kaart kaart : kaartSpeler3) {
            punt += kaart.getPunt();
        }
        return punt;
    }

    public static int getPuntenSpeler4() {
        int punt = 0;
        for (Kaart kaart : kaartSpeler4) {
            punt += kaart.getPunt();
        }
        return punt;
    }
    // Einde punten.


    // Kaarten tonen: Bank.
    public static void kaartDisplayBank() {
        System.out.printf(
                kaartBank.size() + " kaarten: " +
                kaartBank.toString().replace("[","").replace("]","").replace(",", " +")
                        + "%nTotale punten: " + getPuntenBank() + "p%n"
        );
    }
    // Einde kaarten tonen: Bank.

    // Kaarten tonen: Spelers.
    public static void kaartDisplaySpeler1() {
            System.out.printf(
                    kaartSpeler1.size() + " kaarten: " +
                    kaartSpeler1.toString().replace("[", "").replace("]", "").replace(",", " +")
                            + "%nTotale punten: " + getPuntenSpeler1() + "p%n");
    }

    public static void kaartDisplaySpeler2() {
            System.out.printf(
                    kaartSpeler2.size() + " kaarten: " +
                    kaartSpeler2.toString().replace("[", "").replace("]", "").replace(",", " +")
                            + "%nTotale punten: " + getPuntenSpeler2() + "p%n");
    }

    public static void kaartDisplaySpeler3() {
            System.out.printf(
                    kaartSpeler3.size() + " kaarten: " +
                    kaartSpeler3.toString().replace("[", "").replace("]", "").replace(",", " +")
                            + "%nTotale punten: " + getPuntenSpeler3() + "p%n");
    }

    public static void kaartDisplaySpeler4() {
            System.out.printf(
                    kaartSpeler4.size() + " kaarten: " +
                    kaartSpeler4.toString().replace("[", "").replace("]", "").replace(",", " +")
                            + "%nTotale punten: " + getPuntenSpeler4() + "p%n");
    }
    
    // Einde kaarten tonen: Spelers.


    // Kaarten krijgen: Bank.
    public static void moveKaartBank (ArrayList<Kaart> kaartArrayList,
                                         ArrayList<Kaart> kaartBank,
                                         int indexKaart) {
        kaartBank.add(kaartArrayList.remove(indexKaart));

        if (getPuntenBank() > 21) { // Verander waarde van Aas als totale kaartpunten > 21.
            for (Kaart puntVerander : kaartBank) {

                if (puntVerander.getKaartNaam().equals("♤ Schoppen Aas"))
                    puntVerander.setPunt(1);

                if (puntVerander.getKaartNaam().equals("♥ Harten Aas"))
                    puntVerander.setPunt(1);

                if (puntVerander.getKaartNaam().equals("♣ Klaver Aas"))
                    puntVerander.setPunt(1);

                if (puntVerander.getKaartNaam().equals("♦ Ruiten Aas"))
                    puntVerander.setPunt(1);

            }
        }  // Einde verander waarde van Aas als totale kaartpunten > 21.

    }
    // Einde kaarten krijgen: Bank.


    // Kaarten krijgen: Spelers.
    public static void moveKaartSpeler1 (ArrayList<Kaart> kaartArrayList,
                                        ArrayList<Kaart> kaartSpeler1,
                                        int indexKaart) {
        kaartSpeler1.add(kaartArrayList.remove(indexKaart));

        if (getPuntenSpeler1() > 21) { // Verander waarde van Aas als totale kaartpunten > 21.
            for (Kaart puntVerander : kaartSpeler1) {

                if (puntVerander.getKaartNaam().equals("♤ Schoppen Aas"))
                    puntVerander.setPunt(1);

                if (puntVerander.getKaartNaam().equals("♥ Harten Aas"))
                    puntVerander.setPunt(1);

                if (puntVerander.getKaartNaam().equals("♣ Klaver Aas"))
                    puntVerander.setPunt(1);

                if (puntVerander.getKaartNaam().equals("♦ Ruiten Aas"))
                    puntVerander.setPunt(1);

            }
        }  // Einde verander waarde van Aas als totale kaartpunten > 21.
    }

    public static void moveKaartSpeler2 (ArrayList<Kaart> kaartArrayList,
                                         ArrayList<Kaart> kaartSpeler2,
                                         int indexKaart) {
        kaartSpeler2.add(kaartArrayList.remove(indexKaart));

        if (getPuntenSpeler2() > 21) { // Verander waarde van Aas als totale kaartpunten > 21.
            for (Kaart puntVerander : kaartSpeler2) {

                if (puntVerander.getKaartNaam().equals("♤ Schoppen Aas"))
                    puntVerander.setPunt(1);

                if (puntVerander.getKaartNaam().equals("♥ Harten Aas"))
                    puntVerander.setPunt(1);

                if (puntVerander.getKaartNaam().equals("♣ Klaver Aas"))
                    puntVerander.setPunt(1);

                if (puntVerander.getKaartNaam().equals("♦ Ruiten Aas"))
                    puntVerander.setPunt(1);

            }
        }  // Einde verander waarde van Aas als totale kaartpunten > 21.
    }


    public static void moveKaartSpeler3 (ArrayList<Kaart> kaartArrayList,
                                         ArrayList<Kaart> kaartSpeler3,
                                         int indexKaart) {
        kaartSpeler3.add(kaartArrayList.remove(indexKaart));

        if (getPuntenSpeler3() > 21) { // Verander waarde van Aas als totale kaartpunten > 21.
            for (Kaart puntVerander : kaartSpeler3) {

                if (puntVerander.getKaartNaam().equals("♤ Schoppen Aas"))
                    puntVerander.setPunt(1);

                if (puntVerander.getKaartNaam().equals("♥ Harten Aas"))
                    puntVerander.setPunt(1);

                if (puntVerander.getKaartNaam().equals("♣ Klaver Aas"))
                    puntVerander.setPunt(1);

                if (puntVerander.getKaartNaam().equals("♦ Ruiten Aas"))
                    puntVerander.setPunt(1);

            }
        }  // Einde verander waarde van Aas als totale kaartpunten > 21.
    }


    public static void moveKaartSpeler4 (ArrayList<Kaart> kaartArrayList,
                                         ArrayList<Kaart> kaartSpeler4,
                                         int indexKaart) {
        kaartSpeler4.add(kaartArrayList.remove(indexKaart));

        if (getPuntenSpeler4() > 21) { // Verander waarde van Aas als totale kaartpunten > 21.
            for (Kaart puntVerander : kaartSpeler4) {

                if (puntVerander.getKaartNaam().equals("♤ Schoppen Aas"))
                    puntVerander.setPunt(1);

                if (puntVerander.getKaartNaam().equals("♥ Harten Aas"))
                    puntVerander.setPunt(1);

                if (puntVerander.getKaartNaam().equals("♣ Klaver Aas"))
                    puntVerander.setPunt(1);

                if (puntVerander.getKaartNaam().equals("♦ Ruiten Aas"))
                    puntVerander.setPunt(1);

            }
        }  // Einde verander waarde van Aas als totale kaartpunten > 21.
    }

    // Einde kaarten krijgen: Spelers.




    // Reset alle ArrayLists voor een nieuw spel.
    public static void reset() {
        kaartArrayList.clear();
        kaartBank.clear();
        kaartSpeler1.clear();
        kaartSpeler2.clear();
        kaartSpeler3.clear();
        kaartSpeler4.clear();
        inHetSpelExtern.clear();
        beurtKlaarExtern.clear();
        spelerNaamExtern.clear();
//        aantalSpelersExtern = 0;
        checkNieuwSpelExtern = false;
        checkAantalSpelersExtern = false;
        invoerExtern.reset();
    }
    // Einde public static void reset() reset alle ArrayLists voor een nieuw spel.



//    // Timer functie.
//    private String invoerTimer = "";
//
//    public void getInvoer() throws Exception {
//        Timer timer = new Timer();
//        timer.schedule(task, 5*1000);
//
//        System.out.printf("%nMaak a.u.b. keuze uit één van de bovenstaande mogelijkheden. Als U niets invoert dan past U automatisch na 5 seconden: ");
//        var invoerTimer = invoerExtern.next();
//
//        timer.cancel();
//        System.out.println("U hebt de volgende ingetoetst: " + invoerTimer);
//    }
//    // Einde timer functie.


//    TimerTask task = new TimerTask() {
//
//        public void run() {
//            if (invoerTimer.equals("")) {
//                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                System.out.print("GÉÉN INVOER > PAS:");
//                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                System.out.printf("U past en ontvangt dus géén nieuwe kaart.%n");
//
//                // Pass geen kaart krijgen: Speler 1.
//                System.out.printf("%nU hebt tot nu toe in totaal de volgende " + kaartSpeler1.size() + " kaart(en) in bezit:%n");
//                kaartDisplaySpeler1();
//
//                // Eerste kaart van de stapel krijgen: Bank.
//                System.out.printf("%nDe bank heeft de volgende kaart ontvangen: " +  kaartArrayList.get(0) + "%n");
//                moveKaartBank(kaartArrayList, kaartBank, 0);
//
//                System.out.printf("%nDe bank heeft tot nu toe in totaal de volgende " + kaartBank.size() + " kaart(en) in bezit:%n");
//                kaartDisplayBank();
//
//
//
//            }
//
//        } // Einde public void run()
//    }; // Einde TimerTask.




    // Spelerskaarten: 21 punten behaald = BlackJack.
    public static void check21Punten() {
        if (aantalSpelersExtern == 2 && getPuntenSpeler1() == 21) // Solospel: 21 punten behaald = BlackJack.
        {
            System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
            System.out.printf("%n" + spelerNaamExtern.get(1) + " heeft in totaal de volgende " + kaartSpeler1.size() + " kaart(en) in bezit:%n");
            kaartDisplaySpeler1();

            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
            System.out.print(spelerNaamExtern.get(1) + " heeft in totaal 21 punten. Gefeliciteerd!");
            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");

            inHetSpelExtern.set(1, false);
            checkNieuwSpelExtern = true;
        } // Solospel: 21 punten behaald = BlackJack.


        if (aantalSpelersExtern >= 3 && getPuntenSpeler1() == 21) // Speler 1: 21 punten behaald = BlackJack.
        {
            System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
            System.out.printf("%n" + spelerNaamExtern.get(1) + " heeft in totaal de volgende " + kaartSpeler1.size() + " kaart(en) in bezit:%n");
            kaartDisplaySpeler1();

            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
            System.out.print(spelerNaamExtern.get(1) + " heeft in totaal 21 punten. Gefeliciteerd! Deze speler is klaar met dit potje.");
            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");

            inHetSpelExtern.set(1, false);
        } // Speler 1: 21 punten behaald = BlackJack.


        if (getPuntenSpeler2() == 21) // Speler 2: 21 punten behaald = BlackJack.
        {
            System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
            System.out.printf("%n" + spelerNaamExtern.get(2) + " heeft in totaal de volgende " + kaartSpeler2.size() + " kaart(en) in bezit:%n");
            kaartDisplaySpeler2();

            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
            System.out.print(spelerNaamExtern.get(2) + " heeft in totaal 21 punten. Gefeliciteerd! Deze speler is klaar met dit potje.");
            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
            inHetSpelExtern.set(2, false);
        } // Einde Speler 2: 21 punten behaald = BlackJack.


        if (getPuntenSpeler3() == 21) // Speler 3: 21 punten behaald = BlackJack.
        {
            System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
            System.out.printf("%n" + spelerNaamExtern.get(3) + " heeft in totaal de volgende " + kaartSpeler3.size() + " kaart(en) in bezit:%n");
            kaartDisplaySpeler3();

            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
            System.out.print(spelerNaamExtern.get(3) + " heeft in totaal 21 punten. Gefeliciteerd! Deze speler is klaar met dit potje.");
            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
            inHetSpelExtern.set(3, false);
        } // Einde Speler 3: 21 punten behaald = BlackJack.


        if (getPuntenSpeler4() == 21) // Speler 4: 21 punten behaald = BlackJack.
        {
            System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
            System.out.printf("%n" + spelerNaamExtern.get(4) + " heeft in totaal de volgende " + kaartSpeler4.size() + " kaart(en) in bezit:%n");
            kaartDisplaySpeler4();

            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
            System.out.print(spelerNaamExtern.get(4) + " heeft in totaal 21 punten. Gefeliciteerd! Deze speler is klaar met dit potje.");
            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
            inHetSpelExtern.set(4, false);
        } // Einde Speler 4: 21 punten behaald = BlackJack.
    }
    // Einde Spelerskaarten: 21 punten behaald = BlackJack.
    
    

    // Overzicht uitgedeelde kaarten.
    public static void overzichtKaartenExtern() {
        System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――%n");
        System.out.printf("OVERZICHT UITGEDEELDE KAARTEN");
        System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――%n");

        if (inHetSpelExtern.get(1)) { // Overzicht: totaal 1 spelers.
            System.out.printf("%n" + spelerNaamExtern.get(1) + " (speelt nog mee):%n");
        } else {
            System.out.printf("%n" + spelerNaamExtern.get(1) + " (uit het potje):%n");
        }
        kaartDisplaySpeler1();
        // Einde Overzicht: totaal 1 spelers.


        if (aantalSpelersExtern >= 3) { // Overzicht: totaal 2 spelers.
            if (inHetSpelExtern.get(2)) {
                System.out.printf("%n" + spelerNaamExtern.get(2) + " (speelt nog mee):%n");
                kaartDisplaySpeler2();
            } else if (!inHetSpelExtern.get(2)) {
                System.out.printf("%n" + spelerNaamExtern.get(2) + " (uit het potje):%n");
                kaartDisplaySpeler2();
            }
        } else {
            System.out.print("");
        }  // Einde Overzicht: totaal 2 spelers.


        if (aantalSpelersExtern >= 4) { // Overzicht: totaal 3 spelers.
            if (inHetSpelExtern.get(3)) {
                System.out.printf("%n" + spelerNaamExtern.get(3) + " (speelt nog mee):%n");
                kaartDisplaySpeler3();
            } else if (!inHetSpelExtern.get(3)) {
                System.out.printf("%n" + spelerNaamExtern.get(3) + " (uit het potje):%n");
                kaartDisplaySpeler3();
            }
        } else {
            System.out.print("");
        }  // Einde Overzicht: totaal 3 spelers.


        if (aantalSpelersExtern >= 5) { // Overzicht: totaal 4 spelers.
            if (inHetSpelExtern.get(4)) {
                System.out.printf("%n" + spelerNaamExtern.get(4) + " (speelt nog mee):%n");
                kaartDisplaySpeler4();
            } else if (!inHetSpelExtern.get(4)) {
                System.out.printf("%n" + spelerNaamExtern.get(4) + " (uit het potje):%n");
                kaartDisplaySpeler4();
            }
        } else {
            System.out.print("");
        }  // Einde Overzicht: totaal 4 spelers.

        System.out.printf("%n―――――――――――――――――――――――――――――――――――――――――――%n");

        System.out.printf("%nBank:%n");
        kaartDisplayBank();
    } // Einde Overzicht uitgedeelde kaarten.


    // Beurt Speler 1:
    public static void beurtSpeler1() {
        while (!beurtKlaarExtern.get(1) && inHetSpelExtern.get(1) && getPuntenSpeler1() < 21) {
            System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
            System.out.print(spelerNaamExtern.get(1) + " is nu aan de beurt. Wat wil je doen?");
            System.out.printf("%n――――――――――――――――――――――――――――――――――%n");

            System.out.printf("1. Druk 'K/k' om een nieuwe kaart te krijgen.%n" +
                    "2. Druk 'P/p' om te passen en om géén kaart te krijgen.%n" +
                    "3. Druk 'S/s' om de stapel kaarten te zien.%n" +
                    "4. Druk 'O/o' om het overzicht van alle uitgedeelde kaarten te zien.%n" +
                    "5. Druk 'Q/q' om met dit potje te stoppen.%n");

            System.out.printf("%nMaak a.u.b. keuze uit één van de bovenstaande mogelijkheden en bevestig vervolgens je keuze met 'ENTER'-toets: ");
            var invoerSpeler1 = invoerExtern.nextLine();

            if (invoerSpeler1.equalsIgnoreCase("k")) // Optie Beurt Speler 1: invoerExtern 'K/k' nieuwe kaart krijgen.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print(spelerNaamExtern.get(1) + " wilt een nieuwe kaart en kreeg: " + kaartArrayList.get(0));
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");

                moveKaartSpeler1(kaartArrayList, kaartSpeler1, 0);

                System.out.printf("%n" + spelerNaamExtern.get(1) + " heeft tot nu toe in totaal de volgende " + kaartSpeler1.size() + " kaart(en) in bezit:%n");
                kaartDisplaySpeler1();

                // Vergelijk kaarten van spelers en bank.
                if (getPuntenSpeler1() == 21 && getPuntenBank() >= 17 && getPuntenBank() != 21) {
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
                    System.out.print(spelerNaamExtern.get(1) + " heeft in totaal 21 punten.");
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");

                    invoerEnterExtern();
                    beurtKlaarExtern.set(1, true);
                } else if (getPuntenSpeler1() > 21) {
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
                    System.out.print(spelerNaamExtern.get(1) + " heeft helaas meer dan 21 punten overschreden. Probeer het nogmaals!");
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");

                    invoerEnterExtern();
                    inHetSpelExtern.set(1, false);
                    beurtKlaarExtern.set(1, true);
                }
                beurtKlaarExtern.set(1, false);
            } // Einde Optie Beurt Speler 1: invoerExtern 'K/k' nieuwe kaart krijgen.

            else if (invoerSpeler1.equalsIgnoreCase("p")) // Optie Beurt Speler 1: invoerExtern 'P/p' pass geen kaart krijgen.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print(spelerNaamExtern.get(1) + " past en ontvangt dus géén nieuwe kaart.");
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");

                System.out.printf(spelerNaamExtern.get(1) + " heeft tot nu toe in totaal de volgende " + kaartSpeler1.size() + " kaart(en) in bezit:%n");
                kaartDisplaySpeler1();
                beurtKlaarExtern.set(1, true);
            } // Einde Optie Beurt Speler 1: invoerExtern 'P/p' pass geen kaart krijgen.

            else if (invoerSpeler1.equalsIgnoreCase("s")) // Optie Beurt Speler 1: invoerExtern 'S/s' stapel kaart zien.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print("Geschudde stapel met " + kaartArrayList.size() + " kaarten:");
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                kaartStapel();
                beurtKlaarExtern.set(1, false);
            } // Einde Optie Beurt Speler 1: invoerExtern 'S/s' stapel kaart zien.

            else if (invoerSpeler1.equalsIgnoreCase("o")) // Optie Beurt Speler 1: invoerExtern 'O/o' overzicht kaarten.
            {
                overzichtKaartenExtern();
                beurtKlaarExtern.set(1, false);

            } // Einde Optie Beurt Speler 1: invoerExtern 'O/o' overzicht kaarten.

            else if (invoerSpeler1.equalsIgnoreCase("q")) // Optie Beurt Speler 1: invoerExtern 'Q/q' einde programma.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print(spelerNaamExtern.get(1) + " trekt zich terug uit dit potje.");
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");

                inHetSpelExtern.set(1, false);
                beurtKlaarExtern.set(1, true);
            } // Einde Optie Beurt Speler 1: invoerExtern 'Q/q' einde programma.

            else // Optie Speler 1: ongeldige invoerExtern.
            {
                geenGeldigeInvoer();
                beurtKlaarExtern.set(1, false);
            } // Einde Optie Speler 1: ongeldige invoerExtern.

        }
        beurtKlaarExtern.set(1, false);
    } // Einde Beurt Speler 1.


    // Beurt Speler 2.
    public static void beurtSpeler2() {
        while (!beurtKlaarExtern.get(2) && inHetSpelExtern.get(2) && getPuntenSpeler2() < 21) // Beurt Speler 2:
        {
            System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
            System.out.print(spelerNaamExtern.get(2) + " is nu aan de beurt. Wat wil je doen?");
            System.out.printf("%n――――――――――――――――――――――――――――――――――%n");


            System.out.printf("1. Druk 'K/k' om een nieuwe kaart te krijgen.%n" +
                    "2. Druk 'P/p' om te passen en om géén kaart te krijgen.%n" +
                    "3. Druk 'S/s' om de stapel kaarten te zien.%n" +
                    "4. Druk 'O/o' om het overzicht van alle uitgedeelde kaarten te zien.%n" +
                    "5. Druk 'Q/q' om met dit potje te stoppen.%n");

            System.out.printf("%nMaak a.u.b. keuze uit één van de bovenstaande mogelijkheden en bevestig vervolgens je keuze met 'ENTER'-toets: ");
            var invoerSpeler2 = invoerExtern.nextLine();

            if (invoerSpeler2.equalsIgnoreCase("k")) // Optie Beurt Speler 2: invoerExtern 'K/k' nieuwe kaart krijgen.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print(spelerNaamExtern.get(2) + " wilt een nieuwe kaart en kreeg: " + kaartArrayList.get(0));
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");

                moveKaartSpeler1(kaartArrayList, kaartSpeler2, 0);

                System.out.printf("%n" + spelerNaamExtern.get(2) + " heeft tot nu toe in totaal de volgende " + kaartSpeler2.size() + " kaart(en) in bezit:%n");
                kaartDisplaySpeler2();

                // Vergelijk kaarten van spelers en bank.
                if (getPuntenSpeler2() == 21 && getPuntenBank() >= 17 && getPuntenBank() != 21) {
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
                    System.out.print(spelerNaamExtern.get(2) + " heeft in totaal 21 punten.");
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");

                    beurtKlaarExtern.set(2, true);
                } else if (getPuntenSpeler2() > 21) {
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
                    System.out.print(spelerNaamExtern.get(2) + " heeft helaas meer dan 21 punten overschreden. Probeer het nogmaals!");
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");

                    invoerEnterExtern();
                    inHetSpelExtern.set(2, false);
                    beurtKlaarExtern.set(2, true);
                }
                beurtKlaarExtern.set(2, false);
            } // Einde Optie Beurt Speler 2: invoerExtern 'K/k' nieuwe kaart krijgen.

            else if (invoerSpeler2.equalsIgnoreCase("p")) // Optie Beurt Speler 2: invoerExtern 'P/p' pass geen kaart krijgen.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print(spelerNaamExtern.get(2) + " past en ontvangt dus géén nieuwe kaart.");
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");

                System.out.printf("%n" + spelerNaamExtern.get(2) + " heeft tot nu toe in totaal de volgende " + kaartSpeler2.size() + " kaart(en) in bezit:%n");
                kaartDisplaySpeler2();
                beurtKlaarExtern.set(2, true);
            } // Einde Optie Beurt Speler 2: invoerExtern 'P/p' pass geen kaart krijgen.

            else if (invoerSpeler2.equalsIgnoreCase("s")) // Optie Beurt Speler 2: invoerExtern 'S/s' stapel kaart zien.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print("Geschudde stapel met " + kaartArrayList.size() + " kaarten:");
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                kaartStapel();
                beurtKlaarExtern.set(2, false);
            } else if (invoerSpeler2.equalsIgnoreCase("o")) // Optie Beurt Speler 2: invoerExtern 'O/o' overzicht kaarten.
            {
                overzichtKaartenExtern();
                beurtKlaarExtern.set(2, false);

            } // Einde Optie Beurt Speler 2: invoerExtern 'O/o' overzicht kaarten.

            else if (invoerSpeler2.equalsIgnoreCase("q")) // Optie Beurt Speler 2: invoerExtern 'Q/q' einde programma.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print(spelerNaamExtern.get(2) + " trekt zich terug uit dit potje.");
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");

                inHetSpelExtern.set(2, false);
                beurtKlaarExtern.set(2, true);
            } else // Optie Speler 2: ongeldige invoerExtern.
            {
                geenGeldigeInvoer();
                beurtKlaarExtern.set(2, false);
            }
        }
        beurtKlaarExtern.set(2, false);
    } // Einde Beurt Speler 2.


    // Beurt Speler 3:
    public static void beurtSpeler3() {
        while (!beurtKlaarExtern.get(3) && inHetSpelExtern.get(3) && getPuntenSpeler3() < 21)
        {
            System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
            System.out.print(spelerNaamExtern.get(3) + " is nu aan de beurt. Wat wil je doen?");
            System.out.printf("%n――――――――――――――――――――――――――――――――――%n");


            System.out.printf("1. Druk 'K/k' om een nieuwe kaart te krijgen.%n" +
                    "2. Druk 'P/p' om te passen en om géén kaart te krijgen.%n" +
                    "3. Druk 'S/s' om de stapel kaarten te zien.%n" +
                    "4. Druk 'O/o' om het overzicht van alle uitgedeelde kaarten te zien.%n" +
                    "5. Druk 'Q/q' om met dit potje te stoppen.%n");


            System.out.printf("%nMaak a.u.b. keuze uit één van de bovenstaande mogelijkheden en bevestig vervolgens je keuze met 'ENTER'-toets: ");
            var invoerSpeler3 = invoerExtern.nextLine();

            if (invoerSpeler3.equalsIgnoreCase("k")) // Optie Beurt Speler 3: invoerExtern 'K/k' nieuwe kaart krijgen.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print(spelerNaamExtern.get(3) + " wilt een nieuwe kaart en kreeg: " + kaartArrayList.get(0));
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");

                moveKaartSpeler3(kaartArrayList, kaartSpeler3, 0);

                System.out.printf("%n" + spelerNaamExtern.get(3) + " heeft tot nu toe in totaal de volgende " + kaartSpeler3.size() + " kaart(en) in bezit:%n");
                kaartDisplaySpeler3();

                // Vergelijk kaarten van spelers en bank.
                if (getPuntenSpeler3() == 21 && getPuntenBank() >= 17 && getPuntenBank() != 21) {
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
                    System.out.print(spelerNaamExtern.get(3) + " heeft in totaal 21 punten.");
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");

                    beurtKlaarExtern.set(3, true);
                } else if (getPuntenSpeler3() > 21) {
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
                    System.out.print(spelerNaamExtern.get(3) + " heeft helaas meer dan 21 punten overschreden. Probeer het nogmaals!");
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");

                    invoerEnterExtern();
                    inHetSpelExtern.set(3, false);
                    beurtKlaarExtern.set(3, true);
                }
                beurtKlaarExtern.set(3, false);
            } // Einde Optie Beurt Speler 3: invoerExtern 'K/k' nieuwe kaart krijgen.

            else if (invoerSpeler3.equalsIgnoreCase("p")) // Optie Beurt Speler 3: invoerExtern 'P/p' pass geen kaart krijgen.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print(spelerNaamExtern.get(3) + " past en ontvangt dus géén nieuwe kaart.");
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");

                System.out.printf("%n" + spelerNaamExtern.get(3) + " heeft tot nu toe in totaal de volgende " + kaartSpeler1.size() + " kaart(en) in bezit:%n");
                kaartDisplaySpeler3();
                beurtKlaarExtern.set(3, true);
            } // Einde Optie Beurt Speler 3: invoerExtern 'P/p' pass geen kaart krijgen.


            else if (invoerSpeler3.equalsIgnoreCase("s")) // Optie Beurt Speler 3: invoerExtern 'S/s' stapel kaart zien.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print("Geschudde stapel met " + kaartArrayList.size() + " kaarten:");
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                kaartStapel();
                beurtKlaarExtern.set(3, false);
            } else if (invoerSpeler3.equalsIgnoreCase("o")) // Optie Beurt Speler 3: invoerExtern 'O/o' overzicht kaarten.
            {
                overzichtKaartenExtern();
                beurtKlaarExtern.set(3, false);

            } // Einde Optie Beurt Speler 3: invoerExtern 'O/o' overzicht kaarten.

            else if (invoerSpeler3.equalsIgnoreCase("q")) // Optie Beurt Speler 3: invoerExtern 'Q/q' einde programma.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print(spelerNaamExtern.get(3) + " trekt zich terug uit dit potje.");
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");

                inHetSpelExtern.set(3, false);
                beurtKlaarExtern.set(3, true);
            } // Einde Optie Beurt Speler 3: invoerExtern 'Q/q' einde programma.

            else // Optie Speler 3: ongeldige invoerExtern.
            {
                geenGeldigeInvoer();
                beurtKlaarExtern.set(3, false);
            } // Einde Optie Speler 3: ongeldige invoerExtern.

        }
        beurtKlaarExtern.set(3, false);
    } // Einde Beurt Speler 3:


    // Beurt Speler 4:
    public static void beurtSpeler4() {
        while (!beurtKlaarExtern.get(4) && inHetSpelExtern.get(4) && getPuntenSpeler4() < 21)
        {
            System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
            System.out.print(spelerNaamExtern.get(4) + " is nu aan de beurt. Wat wil je doen?");
            System.out.printf("%n――――――――――――――――――――――――――――――――――%n");


            System.out.printf("1. Druk 'K/k' om een nieuwe kaart te krijgen.%n" +
                    "2. Druk 'P/p' om te passen en om géén kaart te krijgen.%n" +
                    "4. Druk 'S/s' om de stapel kaarten te zien.%n" +
                    "4. Druk 'O/o' om het overzicht van alle uitgedeelde kaarten te zien.%n" +
                    "5. Druk 'Q/q' om met dit potje te stoppen.%n");


            System.out.printf("%nMaak a.u.b. keuze uit één van de bovenstaande mogelijkheden en bevestig vervolgens je keuze met 'ENTER'-toets: ");
            var invoerSpeler4 = invoerExtern.nextLine();

            if (invoerSpeler4.equalsIgnoreCase("k")) // Optie Beurt Speler 4: invoerExtern 'K/k' nieuwe kaart krijgen.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print(spelerNaamExtern.get(4) + " wilt een nieuwe kaart en kreeg: " + kaartArrayList.get(0));
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");

                moveKaartSpeler4(kaartArrayList, kaartSpeler4, 0);

                System.out.printf("%n" + spelerNaamExtern.get(4) + " heeft tot nu toe in totaal de volgende " + kaartSpeler4.size() + " kaart(en) in bezit:%n");
                kaartDisplaySpeler4();

                // Vergelijk kaarten van spelers en bank.
                if (getPuntenSpeler4() == 21 && getPuntenBank() >= 17 && getPuntenBank() != 21) {
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
                    System.out.print(spelerNaamExtern.get(4) + " heeft in totaal 21 punten.");
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");

                    beurtKlaarExtern.set(4, true);
                } else if (getPuntenSpeler4() > 21) {
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
                    System.out.print(spelerNaamExtern.get(4) + " heeft helaas meer dan 21 punten overschreden. Probeer het nogmaals!");
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");

                    invoerEnterExtern();
                    inHetSpelExtern.set(4, false);
                    beurtKlaarExtern.set(4, true);
                }
                beurtKlaarExtern.set(4, false);
            } // Einde Optie Beurt Speler 4: invoerExtern 'K/k' nieuwe kaart krijgen.

            else if (invoerSpeler4.equalsIgnoreCase("p")) // Optie Beurt Speler 4: invoerExtern 'P/p' pass geen kaart krijgen.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print(spelerNaamExtern.get(4) + " past en ontvangt dus géén nieuwe kaart.");
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");

                System.out.printf("%n" + spelerNaamExtern.get(4) + " heeft tot nu toe in totaal de volgende " + kaartSpeler1.size() + " kaart(en) in bezit:%n");
                kaartDisplaySpeler4();
                beurtKlaarExtern.set(4, true);
            } // Einde Optie Beurt Speler 4: invoerExtern 'P/p' pass geen kaart krijgen.


            else if (invoerSpeler4.equalsIgnoreCase("s")) // Optie Beurt Speler 4: invoerExtern 'S/s' stapel kaart zien.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print("Geschudde stapel met " + kaartArrayList.size() + " kaarten:");
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                kaartStapel();
                beurtKlaarExtern.set(4, false);
            } else if (invoerSpeler4.equalsIgnoreCase("o")) // Optie Beurt Speler 4: invoerExtern 'O/o' overzicht kaarten.
            {
                overzichtKaartenExtern();
                beurtKlaarExtern.set(4, false);

            } // Einde Optie Beurt Speler 4: invoerExtern 'O/o' overzicht kaarten.

            else if (invoerSpeler4.equalsIgnoreCase("q")) // Optie Beurt Speler 4: invoerExtern 'Q/q' einde programma.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print(spelerNaamExtern.get(4) + " trekt zich terug uit dit potje.");
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");

                inHetSpelExtern.set(4, false);
                beurtKlaarExtern.set(4, true);
            } // Einde Optie Beurt Speler 4: invoerExtern 'Q/q' einde programma.

            else // Optie Speler 4: ongeldige invoerExtern.
            {
                geenGeldigeInvoer();
                beurtKlaarExtern.set(4, false);
            } // Einde Optie Speler 4: ongeldige invoerExtern.

        }
        beurtKlaarExtern.set(4, false);
    } // Einde Beurt Speler 4:



    public static void main(String[] args) {
// Het is niet erg als dit leeg is.
    }

} // Einde public class Kaart als ArrayList




// Ongebruikte methods:
//            int huidigeKaart = 0;
//            for (int soort = 0; soort <= 3; soort++) {
//
//                    System.out.print(kaartArrayList);
//                    if (((huidigeKaart + 1) % 13) == 0) {
//                        System.out.println();
//                    }
//                    huidigeKaart++;

//        kaartArrayList.forEach(System.out::println); // Print nieuwe regel per item in ArrayList

//        // Trek een willekeurige kaart.
//        Random r = new Random();
//        int willekeurigNummer = r.nextInt(kaartArrayList.size());
////        kaartTrek = kaartArrayList.get(willekeurigNummer);
//

// Print oorspronkelijke aantal kaarten uit.

//
//        // Print willekeurige kaart uit.
//        System.out.println(kaartTrek);
//
//        // Verwijder uit ArrayList.
//        kaartArrayList.remove(kaartTrek);
//
//        // Print resterende aantal kaarten uit.
//        System.out.println("Aantal resterende kaarten op de stapel: " + kaartArrayList.size());




//    // @Override toString() functie: belangrijk want anders krijg je alle uitvoer in de andere class niet LETTERLIJK te zien.
//    @Override
//    public String toString() {
//        return (kaartNaam + "" + punt);
//    } // Einde String toString()


//// Vergelijk kaarten van spelers en bank.
//                if (getPuntenBank() > 21 && getPuntenSpeler4() <= 21) {
//                        System.out.printf("%n――――――――――――――――――――――――――――――――――――――――%n");
//                        System.out.print("De bank heeft meer dan 21 punten overschreden. U hebt gewonnen!");
//                        System.out.printf("%n――――――――――――――――――――――――――――――――――――――――%n");
//
//                        inHetSpelExtern.set(4, false);
//                        beurtKlaarExtern.set(4, true);
//                        } else if (getPuntenSpeler4() == 21 && getPuntenBank() >= 17 && getPuntenBank() != 21) {
//                        System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
//                        System.out.print(spelerNaamExtern.get(4) + " heeft in totaal 21 punten. Gefeliciteerd! Deze speler is klaar met dit potje.");
//                        System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
//
//                        inHetSpelExtern.set(4, false);
//                        beurtKlaarExtern.set(4, true);
//                        } else if (getPuntenSpeler4() > 21) {
//                        System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
//                        System.out.print(spelerNaamExtern.get(4) + " heeft helaas meer dan 21 punten overschreden. Probeer het nogmaals!");
//                        System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
//
//                        inHetSpelExtern.set(4, false);
//                        beurtKlaarExtern.set(4, true);
//                        } else if (getPuntenBank() >= 17 && getPuntenSpeler4() == getPuntenBank() && getPuntenBank() <= 21) {
//                        System.out.printf("%n――――――――――――――――――――――――――――――――――――%n");
//                        System.out.print(spelerNaamExtern.get(4) + " heeft gelijkspel gespeeld met de bank. Probeer nogmaals!");
//                        System.out.printf("%n――――――――――――――――――――――――――――――――――――%n");
//
//                        inHetSpelExtern.set(4, false);
//                        beurtKlaarExtern.set(4, true);
//                        } else if (getPuntenBank() >= 17 && getPuntenSpeler4() <= getPuntenBank()) {
//                        System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                        System.out.printf("%nDe bank heeft in totaal de volgende " + kaartBank.size() + " kaart(en) in bezit:%n");
//                        kaartDisplayBank();
//
//                        System.out.printf("%n" + spelerNaamExtern.get(4) + " heeft in totaal de volgende " + kaartSpeler1.size() + " kaart(en) in bezit:%n");
//                        kaartDisplaySpeler4();
//
//                        System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
//                        System.out.print(spelerNaamExtern.get(4) + " heeft met " + getPuntenSpeler4() + " punten van de bank met " + getPuntenBank() + " punten verloren. Probeer nogmaals!");
//                        System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
//
//                        inHetSpelExtern.set(4, false);
//                        beurtKlaarExtern.set(4, true);
//                        } else if (getPuntenBank() >= 17 && getPuntenSpeler4() >= getPuntenBank()) {
//                        System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                        System.out.printf("%nDe bank heeft in totaal de volgende " + kaartBank.size() + " kaart(en) in bezit:%n");
//                        kaartDisplayBank();
//
//                        System.out.printf("%n" + spelerNaamExtern.get(4) + " heeft in totaal de volgende " + kaartSpeler1.size() + " kaart(en) in bezit:%n");
//                        kaartDisplaySpeler4();
//
//                        System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――%n");
//                        System.out.print(spelerNaamExtern.get(4) + " heeft met " + getPuntenSpeler4() + " punten van de bank met " + getPuntenBank() + " punten gewonnen. Gefeliciteerd!");
//                        System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――%n");
//
//                        inHetSpelExtern.set(4, false);
//                        beurtKlaarExtern.set(4, true);
//                        }
//                        beurtKlaarExtern.set(4, true);
//                        } // Einde Optie Beurt Speler 4: invoerExtern 'K/k' nieuwe kaart krijgen.