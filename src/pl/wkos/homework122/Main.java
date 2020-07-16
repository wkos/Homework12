package pl.wkos.homework122;

public class Main {
    public static void main(String[] args) {
        String text = "ala  \nma\n\n\n  \tkota";
        System.out.println("Liczba czarnych znaków: " + TextStatistics.numberOfSignsWithoutWhiteSpaces(text));
        System.out.println("Liczba czarnych znaków ze spacjami: " + TextStatistics.numberOfSignsWithSpaces(text));
        System.out.println("Liczba wszystkich znaków: " + TextStatistics.numberOfAllSigns(text));
        System.out.println("Liczba słów: " + TextStatistics.numberOfWords(text));
    }
}
