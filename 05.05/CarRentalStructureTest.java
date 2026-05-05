import check.*;
import static check.Use.*;

import module org.junit.jupiter;

@BeforeAll
public static void init() {
    usedLang = Lang.EN; // uncomment to enforce the message language
    Use.theClass("rental.CarRental")
       .that(hasUsualModifiers());
}

@Test
public void fieldCars() {
    it.hasField("cars: List of Car")
      .that(hasUsualModifiers())
      .thatHasNo(GETTER, SETTER)
      .info("Kölcsönözhető autók listája.");
}

@Test
public void constructor() {
    it.hasConstructor(withParams("filename: String"))
      .thatIs(VISIBLE_TO_ALL)
      .info("A bemeneti fájl minden sora egy autót tartalmaz márka:rendszám,kölcsönzési díj formátumban.")
      .info("Lásd a cars.txt példa fájlt. Ebben az első három sor és az utolsó érvényes. Az érvénytelen sorokat figyelmen kívül hagyja a metódus.")
      .info("Ha a fájl nem létezik, vagy nem olvasható, akkor az autók listája legyen üres, a konstruktor pedig ne engedje ki a keletkező kivételt.")
      .info("A Double.parseDouble() által számmá történő konvertáláskor dobott java.lang.NumberFormatException kivételt jelzi, ha egy szöveg nem valós számot tartalmaz.");
}

@Test
public void methodNumberOfCars() {
    it.hasMethod("numberOfCars", withNoParams())
      .that(hasUsualModifiers())
      .thatReturns("int")
      .info("A kölcsönzőből kölcsönözhető autók számát adja vissza.");
}

@Test
public void text() {
    it.has(TEXTUAL_REPRESENTATION)
      .info("A szöveges reprezentációban az autók egy-egy sorban szerepeljenek, a saját szöveges reprezentációjuk szerint.")
      .info("Olyan sorrendben szerepeljenek, amilyen sorrendben a konstruktor beolvasta. Az utolsó autó után is legyen sortörés.");
}

@Test
public void methodInsertionSort() {
    it.hasMethod("insertionSort", withNoParams())
      .that(hasUsualModifiers())
      .thatReturnsNothing()
      .info("A kölcsönözhető autók listáját beszúró rendezéssel a kölcsönzési díjuk szerint növekvő sorrendbe rendezi.")
      .info("Feltesszük, hogy az egy elemből álló lista eleve rendezett.")
      .info("Minden menetben, minden elemére a listának az 1-es indexűtől kezdve a legutolsó elemig, ellenőrizzük, hogy az aktuális elem hogyan viszonyul a már rendezett részlistában lévőkhöz.")
      .info("Az aktuális elemnél nagyobb elemeket jobbra toljuk.")
      .info("Ha egy kisebb elem következik, vagy pedig a lista végére érünk, az adott elemet beszúrhatjuk.");
}

@Test
public void methodWeightedAverage() {
    it.hasMethod("weightedAverage", withNoParams())
      .that(hasUsualModifiers())
      .thatReturns("double")
      .info("Minden autó árát szorozzuk meg azzal a számmal (súllyal), ahányadik az autó a listában. Ezen szorzatok összegét osztjuk el a súlyok összegével.")
      .info("Az első (0 indexű) autó súlya 1.")
      .info("Ha nincsenek autók, akkor a metódus -1.0-t adjon vissza.");
}

@Test
public void methodRentCheapest() {
    it.hasMethod("rentCheapest", withNoParams())
      .that(hasUsualModifiers())
      .thatReturns("Car")
      .info("Egy autó kölcsönzését szimulálja.")
      .info("Az ügyfél mindig az insertionSort alapján legalacsonyabb árú autót kölcsönzi. Ezt kivesszük a cars listából és ez lesz a metódus visszatérési értéke.")
      .info("Ha a kölcsönzés elején egyetlen autó sincs a kölcsönzőben, akkor a metódus null-t adjon vissza.");
}

@Test
public void methodSale() {
    it.hasMethod("sale", withNoParams())
      .that(hasUsualModifiers())
      .thatReturns("ArrayList of Car")
      .info("Mindegyik autó árát véletlenszerűen vagy csökkenti, vagy nem. A metódus visszatérési értéke ezen autók listája.")
      .info("Használható a java.util.Random osztály véletlen adat generálására.");
}

void main() {}


