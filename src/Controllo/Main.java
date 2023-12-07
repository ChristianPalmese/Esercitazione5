package Controllo;

import Modello.Automobile;
import Modello.Concessionaria;

public class Main {
    public static void main(String[] args) {
        // Creazione di un'istanza di Concessionaria
        Concessionaria concessionaria = new Concessionaria();

        // Creazione di alcune automobili
        Automobile auto1 = new Automobile(1, "Modello1", "Rosso", "Casa1", 2.0, 15000.0);
        Automobile auto2 = new Automobile(2, "Modello2", "Blu", "Casa2", 1.5, 12000.0);
        Automobile auto3 = new Automobile(3, "Modello3", "Nero", "Casa1", 2.5, 18000.0);

        // Aggiunta di automobili al magazzino della concessionaria
        concessionaria.addAuto(auto1);
        concessionaria.addAuto(auto2);
        concessionaria.addAuto(auto3);

        // Esempio di utilizzo dei metodi della Concessionaria
        System.out.println("Resoconto del magazzino:");
        concessionaria.resoconto();

        System.out.println("Somma dei prezzi delle automobili nel magazzino: " + concessionaria.sommaAuto());

        System.out.println("Casa produttrice più frequente: " + concessionaria.casaProduttricePiuFrequente());

        System.out.println("Auto con prezzo inferiore a 10000 e minore cilindrata: " + concessionaria.findAutoPiuBassaWithPrezzo());

        System.out.println("Auto con cilindrata più alta e prezzo superiore alla media: " + concessionaria.findAutoCilindrataAltaPrezzoSuperioreAllaMedia());

        System.out.println("Automobili con prezzo inferiore alla media: " + concessionaria.findCaseProduttriciaAutoPrezzoInferioreAllaMedia());

        System.out.println("Case produttrici con auto della stessa cilindrata: ");
        concessionaria.findCaseProduttriciAutoStessaCilindrata();
    }
}


