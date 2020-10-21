import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;


// Child class Blackjack
public class BlackJack extends Kaart {

    public static void main(String[] args) {

        //  Initiatie spel: BlackJack.
        System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
        System.out.print("♤♥♣♦ Welkom bij het spel BlackJack in ons casino! ♦♣♥♤");
        System.out.printf("%n――――――――――――――――――――――――――――――――――%n");

        // Invoer: nieuw spel of stop programma.
        while (!checkNieuwSpelExtern)
        {
            System.out.printf("%nWil je een nieuw potje starten?%n%nDruk 'J/j' for ja of 'N/n' for nee om te stoppen en bevestig vervolgens je antwoord met 'ENTER'-toets: ");
            var invoerExitGame = invoerExtern.nextLine();

            // Optie Nieuw Spel: invoer 'J/j' nieuw / herhaal programma.
            if (invoerExitGame.equalsIgnoreCase("j"))
            {
//                aantalSpelersExtern = Integer.parseInt(null);

                // Parent class Kaart als ArrayList.
                Kaart kaart = new Kaart(); // Constructor wordt hier gerund.

                // Laat alle niet geschudde kaarten zien.
                System.out.printf("%n――――――――――――――%n");
                System.out.print("♤♥♣♦  NIEUW POTJE ♦♣♥♤");
                System.out.printf("%n――――――――――――――%n");
                System.out.printf("Mooi! Dan maak ik een nieuwe stapel kaarten open.%n");


                System.out.printf("%nNieuwe stapel met " + kaartArrayList.size() + " kaarten:%n");
                kaartStapel();

                // Kaarten schudden.
                Collections.shuffle(kaartArrayList, new Random());

                // Laat geschudde kaarten zien:
                System.out.printf("Vervolgens wordt de stapel kaarten goed geschud.%n");


                System.out.printf("%nGeschudde stapel met " + kaartArrayList.size() + " kaarten:%n");
                kaartStapel();


                // Initiatie Spelers.
                aantalSpelersExtern();
                spelerNamenExtern();
                beurtKlaarExtern();
                inHetSpelExtern();


                // Invoer: Druk op 'ENTER'-toets om door te gaan.
                invoerEnterExtern();

                // Initiatie eerste kaarten uitdelen.
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print("EERSTE KAARTEN UITDELEN:");
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");


                // Eerste en tweede kaarten van de stapel krijgen: Spelers, bank krijgt eerste kaart.

                if (aantalSpelersExtern >= 2) // Eerste kaart van de stapel krijgen: Speler 1.
                {
                    System.out.printf("%n" + spelerNaamExtern.get(1) + " heeft de eerste kaart ontvangen: " + kaartArrayList.get(0) + "%n");
                    moveKaartSpeler1(kaartArrayList, kaartSpeler1, 0);

                } // Einde Eerste kaart van de stapel krijgen: Speler 1.


                if (aantalSpelersExtern >= 3) // Eerste kaart van de stapel krijgen: Speler 2.
                {
                    System.out.printf("%n" + spelerNaamExtern.get(2) + " heeft de eerste kaart ontvangen: " + kaartArrayList.get(0) + "%n");
                    moveKaartSpeler2(kaartArrayList, kaartSpeler2, 0);
                }


                if (aantalSpelersExtern >= 4) // Eerste kaart van de stapel krijgen: Speler 3.
                {
                    System.out.printf("%n" + spelerNaamExtern.get(3) + " heeft de eerste kaart ontvangen: " + kaartArrayList.get(0) + "%n");
                    moveKaartSpeler3(kaartArrayList, kaartSpeler3, 0);
                }


                if (aantalSpelersExtern >= 5) // Eerste kaart van de stapel krijgen: Speler 4.
                {
                    System.out.printf("%n" + spelerNaamExtern.get(4) + " heeft de eerste kaart ontvangen: " + kaartArrayList.get(0) + "%n");
                    moveKaartSpeler4(kaartArrayList, kaartSpeler4, 0);
                }


                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");

                // Eerste kaart van de stapel krijgen: Bank.
                System.out.printf("%nDe bank heeft de eerste kaart ontvangen: " + kaartArrayList.get(0) + "%n");
                moveKaartBank(kaartArrayList, kaartBank, 0);

                // Invoer: Druk op 'ENTER'-toets om door te gaan.
                invoerEnterExtern();

                if (aantalSpelersExtern >= 2) // Tweede kaart van de stapel krijgen: Speler 1.
                {
                    System.out.printf(spelerNaamExtern.get(1) + " heeft de tweede kaart ontvangen: " + kaartArrayList.get(0) + "%n");
                    moveKaartSpeler1(kaartArrayList, kaartSpeler1, 0);

                } // Einde Tweede kaart van de stapel krijgen: Speler 1.


                if (aantalSpelersExtern >= 3) // Tweede kaart van de stapel krijgen: Speler 2.
                {
                    System.out.printf("%n" + spelerNaamExtern.get(2) + " heeft de tweede kaart ontvangen: " + kaartArrayList.get(0) + "%n");
                    moveKaartSpeler2(kaartArrayList, kaartSpeler2, 0);
                }


                if (aantalSpelersExtern >= 4) // Tweede kaart van de stapel krijgen: Speler 3.
                {
                    System.out.printf("%n" + spelerNaamExtern.get(3) + " heeft de tweede kaart ontvangen: " + kaartArrayList.get(0) + "%n");
                    moveKaartSpeler3(kaartArrayList, kaartSpeler3, 0);
                }


                if (aantalSpelersExtern >= 5) // Tweede kaart van de stapel krijgen: Speler 4.
                {
                    System.out.printf("%n" + spelerNaamExtern.get(4) + " heeft de tweede kaart ontvangen: " + kaartArrayList.get(0) + "%n");
                    moveKaartSpeler4(kaartArrayList, kaartSpeler4, 0);
                }

                // Einde eerste en tweede kaarten van de stapel krijgen: Spelers, bank krijgt eerste kaart.



                // Spelers: 21 punten behaald = BlackJack.
                check21Punten();

                // Invoer: Druk op 'ENTER'-toets om door te gaan.
                invoerEnterExtern();

                // Beurten spelers.
                beurtSpeler1();
                beurtSpeler2();
                beurtSpeler3();
                beurtSpeler4();
                // Einde Beurten spelers.

                // Bank draait tweede kaart om.
                System.out.printf("%n―――――――――――――――――――――――――――――――――――――――――%n");

                // Tweede kaart van de stapel krijgen: Bank.
                System.out.print("De bank heeft de tweede kaart omgedraaid: " + kaartArrayList.get(0));
                moveKaartBank(kaartArrayList, kaartBank, 0);

                System.out.printf("%n―――――――――――――――――――――――――――――――――――――――――%n");

                // Invoer: Druk op 'ENTER'-toets om door te gaan.
                invoerEnterExtern();

                System.out.printf("De bank heeft tot nu toe in totaal de volgende " + kaartBank.size() + " kaart(en) in bezit:%n");
                kaartDisplayBank();
                // Einde Bank draait tweede kaart om.


                // Bank tot eindstand uitspelen.
                if (getPuntenBank() <= 16 && inHetSpelExtern.contains(Boolean.TRUE))
                {
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――%n");
                    System.out.print("De bank krijgt steeds een nieuwe kaart tot een totaal van minimaal 17 punten.");
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――%n");

                    while (getPuntenBank() <= 16)
                    {
                        System.out.printf("%nDe bank heeft de volgende kaart ontvangen: " + kaartArrayList.get(0) + "%n");
                        moveKaartBank(kaartArrayList, kaartBank, 0);
                        System.out.printf("%nDe bank heeft tot nu toe in totaal de volgende " + kaartBank.size() + " kaart(en) in bezit:%n");
                        kaartDisplayBank();
                        // Invoer: Druk op 'ENTER'-toets om door te gaan.
                        invoerEnterExtern();
                    }
                } // Einde Bank tot eindstand uitspelen.



                // Overzicht: Eindstand
                System.out.printf("%n――――――――――――――――――――――――――――――――――――――――%n");
                System.out.printf("EINDSTAND");
                System.out.printf("%n――――――――――――――――――――――――――――――――――――――――%n");

                // Overzicht: Eindstand Bank
                System.out.printf("%nBank:%n");
                kaartDisplayBank();

                if (getPuntenBank() > 21) {
                    inHetSpelExtern.set(0, false);
                    System.out.printf("%nDe bank heeft meer dan 21 punten overschreden.%n");
                } // Einde Overzicht: Eindstand Bank

                System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――%n");

                // Overzicht: Eindstand Speler 1
                System.out.printf("%n" + spelerNaamExtern.get(1) + ":%n");
                kaartDisplaySpeler1();
                if (inHetSpelExtern.get(1) && getPuntenSpeler1() > getPuntenBank()) {
                    System.out.printf("%n" + spelerNaamExtern.get(1) + " heeft van de bank gewonnen! Gefeliciteerd!%n");
                }

                else if (inHetSpelExtern.get(1) && inHetSpelExtern.get(0) && getPuntenSpeler1() < getPuntenBank()) {
                    System.out.printf("%n" + spelerNaamExtern.get(1) + " heeft van de bank verloren. Probeer nogmaals!%n");
                }

                else if (inHetSpelExtern.get(1) && getPuntenSpeler1() == getPuntenBank()) {
                    System.out.printf("%n" + spelerNaamExtern.get(1) + " heeft gelijkgespeeld met de bank.%n");
                }

                else if (inHetSpelExtern.get(1) && getPuntenBank() > 21) {
                    System.out.printf("%nDe bank heeft meer dan 21 punten overschreden. " + spelerNaamExtern.get(1) + " heeft van de bank gewonnen! Gefeliciteerd.%n");
                }

                else if (!inHetSpelExtern.get(1) && getPuntenSpeler1() == 21) {
                    System.out.printf("%n" + spelerNaamExtern.get(1) + " heeft reeds 21 punten behaald!%n");
                }

                else {
                    System.out.printf("%n" + spelerNaamExtern.get(1) + " was reeds uit dit potje.%n");
                } // Einde Overzicht: Eindstand Speler 1


                if (aantalSpelersExtern >= 3) { // Overzicht: Eindstand Speler 2
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――%n");
                    System.out.printf("%n" + spelerNaamExtern.get(2) + ":%n");
                    kaartDisplaySpeler2();
                    if (inHetSpelExtern.get(2) && getPuntenSpeler2() > getPuntenBank()) {
                        System.out.printf("%n" + spelerNaamExtern.get(2) + " heeft van de bank gewonnen! Gefeliciteerd!%n");
                    }

                    else if (inHetSpelExtern.get(2) && inHetSpelExtern.get(0) && getPuntenSpeler2() < getPuntenBank()) {
                        System.out.printf("%n" + spelerNaamExtern.get(2) + " heeft van de bank verloren. Probeer nogmaals!%n");
                                        }

                    else if (inHetSpelExtern.get(2) && getPuntenSpeler2() == getPuntenBank()) {
                        System.out.printf("%n" + spelerNaamExtern.get(2) + " heeft gelijkgespeeld met de bank.%n");
                    }

                    else if (inHetSpelExtern.get(2) && getPuntenBank() > 21) {
                        System.out.printf("%nDe bank heeft meer dan 21 punten overschreden. " + spelerNaamExtern.get(2) + " heeft van de bank gewonnen! Gefeliciteerd.%n");
                    }

                    else if (!inHetSpelExtern.get(2) && getPuntenSpeler2() == 21) {
                        System.out.printf("%n" + spelerNaamExtern.get(2) + " heeft reeds 21 punten behaald!%n");
                    }

                    else {
                        System.out.printf("%n" + spelerNaamExtern.get(2) + " was reeds uit dit potje.%n");
                    }
                } // Einde Overzicht: Eindstand Speler 2


                if (aantalSpelersExtern >= 4) { // Overzicht: Eindstand Speler 3
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――%n");
                    System.out.printf("%n" + spelerNaamExtern.get(3) + ":%n");
                    kaartDisplaySpeler3();
                    if (inHetSpelExtern.get(3) && getPuntenSpeler3() > getPuntenBank()) {
                        System.out.printf("%n" + spelerNaamExtern.get(3) + " heeft van de bank gewonnen! Gefeliciteerd!%n");
                    }

                    else if (inHetSpelExtern.get(3) && inHetSpelExtern.get(0) && getPuntenSpeler3() < getPuntenBank()) {
                        System.out.printf("%n" + spelerNaamExtern.get(3) + " heeft van de bank verloren. Probeer nogmaals!%n");
                    }

                    else if (inHetSpelExtern.get(3) && getPuntenSpeler3() == getPuntenBank()) {
                        System.out.printf("%n" + spelerNaamExtern.get(3) + " heeft gelijkgespeeld met de bank.%n");
                    }

                    else if (inHetSpelExtern.get(3) && getPuntenBank() > 21) {
                        System.out.printf("%nDe bank heeft meer dan 21 punten overschreden. " + spelerNaamExtern.get(3) + " heeft van de bank gewonnen! Gefeliciteerd.%n");
                    }

                    else if (!inHetSpelExtern.get(3) && getPuntenSpeler3() == 21) {
                        System.out.printf("%n" + spelerNaamExtern.get(3) + " heeft reeds 21 punten behaald!%n");
                    }

                    else {
                        System.out.printf("%n" + spelerNaamExtern.get(3) + " was reeds uit dit potje.%n");
                    }
                } // Einde Overzicht: Eindstand Speler 3


                if (aantalSpelersExtern >= 5) {
                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――%n");
                    System.out.printf("%n" + spelerNaamExtern.get(4) + ":%n");
                    kaartDisplaySpeler4();
                    if (inHetSpelExtern.get(4) && getPuntenSpeler4() > getPuntenBank()) {
                        System.out.printf("%n" + spelerNaamExtern.get(4) + " heeft van de bank gewonnen! Gefeliciteerd!%n");
                    }

                    else if (inHetSpelExtern.get(4) && inHetSpelExtern.get(0) && getPuntenSpeler4() < getPuntenBank()) {
                        System.out.printf("%n" + spelerNaamExtern.get(4) + " heeft van de bank verloren. Probeer nogmaals!%n");
                    }

                    else if (inHetSpelExtern.get(4) && getPuntenSpeler4() == getPuntenBank()) {
                        System.out.printf("%n" + spelerNaamExtern.get(4) + " heeft gelijkgespeeld met de bank.%n");
                    }

                    else if (inHetSpelExtern.get(4) && getPuntenBank() > 21) {
                        System.out.printf("%nDe bank heeft meer dan 21 punten overschreden. " + spelerNaamExtern.get(4) + " heeft van de bank gewonnen! Gefeliciteerd.%n");
                    }

                    else if (!inHetSpelExtern.get(4) && getPuntenSpeler4() == 21) {
                        System.out.printf("%n" + spelerNaamExtern.get(4) + " heeft reeds 21 punten behaald!%n");
                    }

                    else {
                        System.out.printf("%n" + spelerNaamExtern.get(4) + " was reeds uit dit potje.%n");
                    }
                }

            System.out.printf("%n――――――――――――――%n");
            System.out.print("♤♥♣♦  EINDE POTJE ♦♣♥♤");
            System.out.printf("%n――――――――――――――%n");

            reset();
            } // Einde Optie Nieuwe Spel: invoer 'J/j' nieuw spel.


            else if (invoerExitGame.equalsIgnoreCase("n")) // Optie Nieuwe Spel: invoer 'N/n' einde programma.
            {
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                System.out.print("Dat was het dan. Dank voor het spelen en tot ziens! :)");
                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
                checkNieuwSpelExtern = true;


            } // Einde Optie Nieuwe Spel: invoer 'N/n' einde programma.

            else // Optie Nieuwe Spel: ongeldige invoer.
            {
                geenGeldigeInvoer();
                checkNieuwSpelExtern = false;
            } // Einde Optie Nieuwe Spel: ongeldige invoer.

        } // Einde Nieuwe Spel.

    } // Einde public static void main(String[] args)
} // Einde public class BlackJack


// Ongebruikte methods:
//                kaartTrek = kaartArrayList.get(0);
//                    kaartSpeler1.add(kaartTrek);
//                    kaartArrayList.remove(kaartTrek);

////                // Willekeurige kaart pakken.
////                Random r = new Random();
////                int willekeurigNummer = r.nextInt(kaartArrayList.length());
////                kaartTrek = kaartArrayList.get(willekeurigNummer);

// String kaart vanuit parent class Kaart krijgen.
//    Kaart kaartTrek;

//                if(getPuntenSpeler1() > getPuntenBank() && getPuntenSpeler1() <= 21) {
//                    System.out.printf("%nGefeliciteerd! U hebt met " + getPuntenSpeler1() +  " punten van de bank met " + getPuntenBank() + " punten gewonnen! %n");
//                } else if(getPuntenSpeler1() < getPuntenBank() && getPuntenSpeler1() <= 21) {
//                    System.out.printf("%nHelaas! U hebt met " + getPuntenSpeler1() + " punten van de bank met " + getPuntenBank() + " punten verloren. Probeer nogmaals!%n");
//                } else if(getPuntenSpeler1() == getPuntenBank() && getPuntenSpeler1() <= 21) {
//                    System.out.printf("U hebt gelijkspel gespeeld met de bank. Probeer nogmaals!");
//                }

//                    if (getPuntenBank() == 21) {
//        System.out.printf("%nDe bank heeft BlackJack!%n");
//    }
//
//                    if (getPuntenSpeler1() >= 15) {
//        System.out.printf("%nWow het wordt spannender en spannender!%n");
//    }

//                if (getPuntenSpeler1() > 21) {
//                    System.out.printf("%nU hebt helaas 21 punten overschreden. Probeer het nogmaals!%n");
//                    System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//
//                    beurtKlaar = true;
//                } else {
//                    beurtKlaar = false;
//                }
//
//
//                if (invoerExit.equalsIgnoreCase("k")) { // Validatie k: nieuwe kaart.
//                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                System.out.printf("%nU en de bank ontvangen allebei één nieuwe kaart.%n");
//
//                // Eerste kaart van de stapel krijgen: Bank.
//                System.out.printf("%nDe bank heeft de volgende kaart ontvangen: " +  kaartArrayList.get(0) + "%n");
//                moveKaartBank(kaartArrayList, kaartBank, 0);
//
//                System.out.printf("%nDe bank heeft tot nu toe in totaal de volgende " + kaartBank.size() + " kaart(en) in bezit:%n");
//                kaartDisplayBank();
//
//                // Eerste kaart van de stapel krijgen: Speler 1.
//                System.out.printf("%nU hebt de volgende kaart ontvangen: " +  kaartArrayList.get(0) + "%n");
//                moveKaartSpeler1(kaartArrayList, kaartSpeler1, 0);
//
//                System.out.printf("%nU hebt tot nu toe in totaal de volgende " + kaartSpeler1.size() + " kaart(en) in bezit:%n");
//                kaartDisplaySpeler1();

//            // Timer functie.
//            String invoerLeeg = "";
//            TimerTask task = new TimerTask() {
//                public void run() {
//                    boolean beurtKlaar = false;
//                    if (invoerLeeg.equals("")) {  // Validatie géén invoer: pass geen kaart krijgen.
//                        System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                        System.out.print("GÉÉN INVOER > PAS:");
//                        System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                        System.out.printf("U past en ontvangt dus géén nieuwe kaart.%n");
//
//                        // Pass geen kaart krijgen: Speler 1.
//                        System.out.printf("%nU hebt tot nu toe in totaal de volgende " + kaartSpeler1.size() + " kaart(en) in bezit:%n");
//                        kaartDisplaySpeler1();
//
//                        // Eerste kaart van de stapel krijgen: Bank.
//                        System.out.printf("%nDe bank heeft de volgende kaart ontvangen: " + kaartArrayList.get(0) + "%n");
//                        moveKaartBank(kaartArrayList, kaartBank, 0);
//
//                        System.out.printf("%nDe bank heeft tot nu toe in totaal de volgende " + kaartBank.size() + " kaart(en) in bezit:%n");
//                        kaartDisplayBank();
//
//                        // Vergelijk kaarten van spelers en bank.
//                        if (getPuntenBank() > 21 && getPuntenSpeler1() <= 21) {
//                            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――%n");
//                            System.out.print("De bank heeft meer dan 21 punten overschreden. U hebt gewonnen!");
//                            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――%n");
//
//                            beurtKlaar = true;
//                        } else if (getPuntenSpeler1() == 21 && getPuntenBank() >= 17 && getPuntenBank() != 21) {
//                            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――%n");
//                            System.out.print(spelerNaam[0] + " heeft in totaal 21 punten. Gefeliciteerd! Deze speler is klaar met dit potje.");
//                            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――%n");
//
//                            beurtKlaar = true;
//                        } else if (getPuntenSpeler1() > 21) {
//                            System.out.printf("%n―――――――――――――――――――――――――――――――――――――――――――%n");
//                            System.out.print("U hebt helaas meer dan 21 punten overschreden. Probeer het nogmaals!");
//                            System.out.printf("%n―――――――――――――――――――――――――――――――――――――――――――%n");
//
//                            beurtKlaar = true;
//                        } else if (getPuntenBank() >= 17 && getPuntenSpeler1() == getPuntenBank() && getPuntenBank() <= 21) {
//                            System.out.printf("%n――――――――――――――――――――――――――――――――――――%n");
//                            System.out.print("U hebt gelijkspel gespeeld met de bank. Probeer nogmaals!");
//                            System.out.printf("%n――――――――――――――――――――――――――――――――――――%n");
//
//                            beurtKlaar = true;
//                        } else if (getPuntenBank() >= 17 && getPuntenSpeler1() <= getPuntenBank()) {
//                            System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                            System.out.printf("%nDe bank heeft in totaal de volgende " + kaartBank.size() + " kaart(en) in bezit:%n");
//                            kaartDisplayBank();
//
//                            System.out.printf("%nU hebt in totaal de volgende " + kaartSpeler1.size() + " kaart(en) in bezit:%n");
//                            kaartDisplaySpeler1();
//
//                            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
//                            System.out.print("Helaas! U hebt met " + getPuntenSpeler1() + " punten van de bank met " + getPuntenBank() + " punten verloren. Probeer nogmaals!");
//                            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
//
//                            beurtKlaar = true;
//                        } else if (getPuntenBank() >= 17 && getPuntenSpeler1() >= getPuntenBank()) {
//                            System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                            System.out.printf("%nDe bank heeft in totaal de volgende " + kaartBank.size() + " kaart(en) in bezit:%n");
//                            kaartDisplayBank();
//
//                            System.out.printf("%nU hebt in totaal de volgende " + kaartSpeler1.size() + " kaart(en) in bezit:%n");
//                            kaartDisplaySpeler1();
//
//                            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――%n");
//                            System.out.print("Gefeliciteerd! U hebt met " + getPuntenSpeler1() + " punten van de bank met " + getPuntenBank() + " punten gewonnen.");
//                            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――%n");
//
//                            beurtKlaar = true;
//                        }
//                    }
//                }
//            };
//
//
//            Timer timer = new Timer();
//
//            timer.schedule( task, 10*1000 );
//
//            Scanner sc = new Scanner(System.in);
//            String in = sc.readLine();
//
//            timer.cancel();
//
////            // Einde timer functie.


//                // Validatie p: pass geen kaart krijgen.
//            } else if (invoerSpeler1.equalsIgnoreCase("p")) {
//                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                System.out.print("PAS:");
//                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                    System.out.printf("U past en ontvangt dus géén nieuwe kaart.%n");
//
//                    // Pass geen kaart krijgen: Speler 1.
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
//                // Vergelijk kaarten van spelers en bank.
////                vergelijkKaarten();
//                if (getPuntenBank() > 21 && getPuntenSpeler1() <= 21) {
//                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――%n");
//                    System.out.print("De bank heeft meer dan 21 punten overschreden. U hebt gewonnen!");
//                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――%n");
//
//                    beurtKlaar = true;
//                } else if (getPuntenSpeler1() == 21 && getPuntenBank() >= 17 && getPuntenBank() != 21) {
//                            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――%n");
//                            System.out.print(spelerNaam[0] + " heeft in totaal 21 punten. Gefeliciteerd! Deze speler is klaar met dit potje.");
//                            System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――%n");
//
//                    beurtKlaar = true;
//                } else if (getPuntenSpeler1() > 21) {
//                    System.out.printf("%n―――――――――――――――――――――――――――――――――――――――――――%n");
//                    System.out.print("U hebt helaas meer dan 21 punten overschreden. Probeer het nogmaals!");
//                    System.out.printf("%n―――――――――――――――――――――――――――――――――――――――――――%n");
//
//                    beurtKlaar = true;
//                } else if (getPuntenBank() >= 17 && getPuntenSpeler1() == getPuntenBank() && getPuntenBank() <= 21) {
//                    System.out.printf("%n――――――――――――――――――――――――――――――――――――%n");
//                    System.out.print("U hebt gelijkspel gespeeld met de bank. Probeer nogmaals!");
//                    System.out.printf("%n――――――――――――――――――――――――――――――――――――%n");
//
//                    beurtKlaar = true;
//                } else if (getPuntenBank() >= 17 && getPuntenSpeler1() <= getPuntenBank()) {
//                    System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                    System.out.printf("%nDe bank heeft in totaal de volgende " + kaartBank.size() + " kaart(en) in bezit:%n");
//                    kaartDisplayBank();
//
//                    System.out.printf("%nU hebt in totaal de volgende " + kaartSpeler1.size() + " kaart(en) in bezit:%n");
//                    kaartDisplaySpeler1();
//
//                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
//                    System.out.print("Helaas! U hebt met " + getPuntenSpeler1() + " punten van de bank met " + getPuntenBank() + " punten verloren. Probeer nogmaals!");
//                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――――――――――%n");
//
//                    beurtKlaar = true;
//                } else if (getPuntenBank() >= 17 && getPuntenSpeler1() >= getPuntenBank()) {
//                    System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                    System.out.printf("%nDe bank heeft in totaal de volgende " + kaartBank.size() + " kaart(en) in bezit:%n");
//                    kaartDisplayBank();
//
//                    System.out.printf("%nU hebt in totaal de volgende " + kaartSpeler1.size() + " kaart(en) in bezit:%n");
//                    kaartDisplaySpeler1();
//
//                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――%n");
//                    System.out.print("Gefeliciteerd! U hebt met " + getPuntenSpeler1() + " punten van de bank met " + getPuntenBank() + " punten gewonnen.");
//                    System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――%n");
//
//                    beurtKlaar = true;
//                } // Einde vergelijk kaarten van spelers en bank voor keuze 'K/k': nieuwe kaart krijgen.
//
//
//            } else if (invoerTimer.equalsIgnoreCase("s")) { // Validatie s: de stapel kaart zien.
//                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                System.out.print("STAPEL KAARTEN:");
//                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                System.out.printf("Geschudde stapel met " + kaartArrayList.size() + " kaarten:%n");
//                kaartStapel();
//                beurtKlaar = false;
//            } else if (invoerTimer.equalsIgnoreCase("o")) { // Validatie o: het overzicht van alle uitgedeelde kaarten zien.
//                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                System.out.print("OVERZICHT VAN ALLE UITGEDEELDE KAARTEN:");
//                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//
//                System.out.printf("De spelers hebben tot nu toe in totaal de volgende kaart(en) in bezit:%n");
//
//                // Overzicht: 1 speler.
//                if (aantalSpelersExtern == 1 ){ // Overzicht: totaal 1 spelers.
//                    System.out.printf("%n" + spelerNaam[0] + ":%n");
//                    kaartDisplaySpeler1();
//                } // Einde situatie: 1 speler.
//
//                // Overzicht: totaal 2 spelers.
//                else if (aantalSpelersExtern == 2 ) {
//                    System.out.printf("%n" + spelerNaam[0] + ":%n");
//                    kaartDisplaySpeler1();
//                    System.out.printf("%n" + spelerNaamExtern.get(1) + ":%n");
//                    kaartDisplaySpeler2();
//                }  // Einde situatie: totaal 2 spelers.
//
//                // Overzicht: totaal 3 spelers.
//                else if (aantalSpelersExtern == 3 ) {
//                    System.out.printf("%n" + spelerNaam[0] + ":%n");
//                    kaartDisplaySpeler1();
//                    System.out.printf("%n" + spelerNaamExtern.get(1) + ":%n");
//                    kaartDisplaySpeler2();
//                    System.out.printf("%n" + spelerNaamExtern.get(2) + ":%n");
//                    kaartDisplaySpeler3();
//                }  // Einde situatie: totaal 3 spelers.
//
//                // Overzicht: totaal 4 spelers.
//                else if (aantalSpelersExtern == 4 ) {
//                    System.out.printf("%n" + spelerNaam[0] + ":%n");
//                    kaartDisplaySpeler1();
//                    System.out.printf("%n" + spelerNaamExtern.get(1) + ":%n");
//                    kaartDisplaySpeler2();
//                    System.out.printf("%n" + spelerNaamExtern.get(2) + ":%n");
//                    kaartDisplaySpeler3();
//                    System.out.printf("%n" + spelerNaamExtern.get(3) + ":%n");
//                    kaartDisplaySpeler4();
//                }  // Einde situatie: totaal 4 spelers.
//
//                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//
//                System.out.printf("%nDe bank heeft tot nu toe in totaal de volgende " + kaartBank.size() + " kaart(en) in bezit:%n");
//                kaartDisplayBank();
//                beurtKlaar = false;
//
//            } else if (invoerTimer.equalsIgnoreCase("q")) { // Validatie q: einde programma.
//                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//                System.out.print("EINDE POTJE");
//                System.out.printf("%n――――――――――――――――――――――――――――――――――%n");
//
//                beurtKlaar = true;
//            } else { // Ongeldige invoer.
//                geenGeldigeInvoer();
//                beurtKlaar = false;
//            }
//        }
//
//        // Einde while (check) Valideer met k/p/s/o/q nieuwe kaart, pass, stapel zien, overzicht uitgedeelde kaarten zien of stop programma.

// Initiatie timer functie.

//            try {
//                (new Kaart()).getInvoer();
//            }
//            catch (Exception e) {
//                System.out.println(e);
//            }
//            System.out.println("main exit...");

// Einde timer functie.


// Oude // Overzicht uitgedeelde kaarten.
//                                System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――%n");
//                                System.out.printf("OVERZICHT UITGEDEELDE KAARTEN");
//                                System.out.printf("%n――――――――――――――――――――――――――――――――――――――――――――%n");
//
//                                if (inHetSpelExtern.get(1)) { // Overzicht: totaal 1 spelers.
//                                System.out.printf("%n" + spelerNaamExtern.get(1) + " (speelt nog mee):%n");
//                                } else {
//                                System.out.printf("%n" + spelerNaamExtern.get(1) + " (uit het potje):%n");
//                                }
//                                kaartDisplaySpeler1();
//                                // Einde Overzicht: totaal 1 spelers.
//
//
//                                if (aantalSpelersExtern >= 3) { // Overzicht: totaal 2 spelers.
//                                if (inHetSpelExtern.get(2)) {
//                                System.out.printf("%n" + spelerNaamExtern.get(2) + " (speelt nog mee):%n");
//                                kaartDisplaySpeler2();
//                                } else if (!inHetSpelExtern.get(2)) {
//                                System.out.printf("%n" + spelerNaamExtern.get(2) + " (uit het potje):%n");
//                                kaartDisplaySpeler2();
//                                }
//                                } else {
//                                System.out.print("");
//                                }  // Einde Overzicht: totaal 2 spelers.
//
//
//                                if (aantalSpelersExtern >= 4) { // Overzicht: totaal 3 spelers.
//                                if (inHetSpelExtern.get(3)) {
//                                System.out.printf("%n" + spelerNaamExtern.get(3) + " (speelt nog mee):%n");
//                                kaartDisplaySpeler3();
//                                } else if (!inHetSpelExtern.get(3)) {
//                                System.out.printf("%n" + spelerNaamExtern.get(3) + " (uit het potje):%n");
//                                kaartDisplaySpeler3();
//                                }
//                                } else {
//                                System.out.print("");
//                                }  // Einde Overzicht: totaal 3 spelers.
//
//
//                                if (aantalSpelersExtern >= 5) { // Overzicht: totaal 4 spelers.
//                                if (inHetSpelExtern.get(4)) {
//                                System.out.printf("%n" + spelerNaamExtern.get(4) + " (speelt nog mee):%n");
//                                kaartDisplaySpeler4();
//                                } else if (!inHetSpelExtern.get(4)) {
//                                System.out.printf("%n" + spelerNaamExtern.get(4) + " (uit het potje):%n");
//                                kaartDisplaySpeler4();
//                                }
//                                } else {
//                                System.out.print("");
//                                }  // Einde Overzicht: totaal 4 spelers.
//
//                                System.out.printf("%n―――――――――――――――――――――――――――――――――――――――――――%n");
//
//                                System.out.printf("%nBank:%n");
//                                kaartDisplayBank();
// Einde Oude // Overzicht uitgedeelde kaarten.
