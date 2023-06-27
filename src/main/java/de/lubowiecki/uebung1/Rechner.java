package de.lubowiecki.uebung1;

public class Rechner {

    private String protokoll = "";

    private final String FMT = "%f %s %f = %f \n";

    // Instanzmethoden, können nur benutzt werden, wenn ein Objekt von Rechner gebaut wurde
    public double add(double a, double b) {
        double erg = a + b;
        addToProtokoll(a, b, "+", erg);
        return erg;
    }

    public double multi(double a, double b) {
        double erg = a * b;
        addToProtokoll(a, b, "*", erg);
        return erg;
    }

    public double sub(double a, double b) {
        double erg = a - b;
        addToProtokoll(a, b, "-", erg);
        return erg;
    }

    public double div(double a, double b) {
        double erg = a / b;
        addToProtokoll(a, b, "/", erg);
        return erg;
    }


    private void addToProtokoll(double op1, double op2, String operator, double erg) {
        // addToProtokoll(100.2, 10.25, "+", 110.45) {
        // "100.2 + 10.25 = 110.45 \n";
        protokoll += String.format(FMT, op1, operator, op2, erg);
    }

    public String getProtokoll() {
        return protokoll;
    }
}
