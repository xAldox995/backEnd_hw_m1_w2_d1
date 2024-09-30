package esercizio3.contiClasses;

import esercizio3.exception.BancaException;

public class ContoCorrente {
    protected String titolare;
    private int nMovimenti;
    private final int maxMovimenti = 50;
    protected double saldo;

    public ContoCorrente(double saldo, String titolare) {
        this.nMovimenti = 0;
        this.saldo = saldo;
        this.titolare = titolare;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti >= maxMovimenti) {
            throw new BancaException("Raggiunto il limite massimo di movimenti permessi.");
        }
        saldo -= x;
        nMovimenti++;
        if (saldo <= 0) {
            throw new BancaException("Il conto è in rosso.");
        }
    }

    public double restituisciSaldo() {
        return saldo;
    }


    public int getNMovimenti() {
        return nMovimenti;
    }
}
