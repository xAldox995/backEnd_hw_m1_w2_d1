package esercizio3.contiClasses;

import esercizio3.exception.BancaException;

public class ContoCorrente {
    protected String titolare;
    private int nMovimenti;
    private final int maxMovimenti = 50;
    protected double saldo;

    public ContoCorrente(int nMovimenti, double saldo, String titolare) {
        this.nMovimenti = 0;
        this.saldo = saldo;
        this.titolare = titolare;
    }

    public void preleva (double x) throws BancaException {
        saldo -= x;
        nMovimenti ++;
        if (saldo <= 0) {
            throw new BancaException("Il conto è vuoto. Ricaricalo Povero!!");
        }
    }

    public double restituisciSaldo () {
        return saldo;
    }
}
