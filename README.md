# Opdracht-BlackJack

## Doel

Doel van de opdracht is om het spel Black Jack te maken. Pas hierbij de kennis toe, die je tot nu toe
hebt geleerd.
## Werkwijzen

De opdracht kent een aantal doelstellingen, deze worden achtereenvolgens gerealiseerd.
Veel succes met het maken van de opdracht!
## Het spel

- DONE: De Black Jack wordt in de commandline gemaakt.
- DONE: Doordat het een commandline spel is mag je natuurlijk creatief zijn in de interactie met de
gebruiker. H4 kan een harten 4 zijn. Zolang de onderliggende techniek maar werkt.
## Doelstelling 1
- DONE: Elke Black Jack begint met het tonen van de geschudde kaarten.
- DONE: De Black Jack spelen we met 1 spel van 52 kaarten. Alle kaarten zitten dus 1 keer in het
overzicht, en als het spel opnieuw gestart wordt is de volgorde in een random nieuwe
volgorde.
## Doelstelling 2
- DONE: Een speler kan meedoen met het spel. De speler kan door een 'k' in te voeren om een kaart
vragen. Een speler kan altijd met heel het spel stoppen door 'q' in te voeren. De speler mag
ook 'p' invoeren om te passen.
- DONE: Als een speler een kaart vraagt krijgt hij de bovenste kaart van de stapel. Het totaal aantal
punten wordt getoont.
- DONE: De speler mag met 0 kaarten starten. De aas mag als een fixed 11 punten kaart beschouwd
worden.
- DONE: Als de speler past, worden alle kaarten getoond die hij heeft met het totaal aantal punten van
de kaarten.
- DONE: De punten per kaart zijn: De waarde van het getal bij de 2, 3, 4, 5, 6, 7, 8, 9, 10. De Boer,Vrouw, Heer zijn 10 punten. De aas is zoals gezegd 11 punten
## Doelstelling 3
- DONE: Vanaf hier wordt het spannender. Het is vanaf deze doelstelling verplicht om met kaarten als
objecten te werken. Kaart kaart = new Kaart(). De vorige doelstellingen mochten prima op
andere wijzen volbracht worden, vanaf hier is Object Georiënteerd programmeren een
vereiste.
- DONE: De speler krijgt twee kaarten toebedeeld wanneer hij start, zoals bij de werkelijke regels. Ook
kan de Aas 1 of 11 punten waard zijn. Dat is afhankelijk van het gegeven of hij anders boven
de 21 punten uit komt.
- !UNFINISHED! Als een speler niet op tijd past, is de speler af.
Optionele doelstellingen ter inspiratie.
- DONE: Implementeer Inheritance. (Hoeft niet perse functioneel te zijn)
- DONE: Maak een mogelijkheid om met meerdere spelers te spelen.
- ? Laat de bank automatisch het spel af spelen.
- Maak een mogelijkheid voor een speler om geld in te zetten.
- DONE: Creëer een eigen Checked Exception en throw deze in een onwenselijke situatie. Handel de
exception op een logische plaats af in een try catch block.
