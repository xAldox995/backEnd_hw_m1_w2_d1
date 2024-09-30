package esercizio3.contiClasses;

import esercizio3.exception.BancaException;

public class ContoOnline extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnline(double saldo, String titolare, double maxPrelievo) {
        super(saldo, titolare);
        this.maxPrelievo = maxPrelievo;
    }

    @Override
    public void preleva(double x) throws BancaException {
        if (x > maxPrelievo) {
            throw new BancaException("il prelievo non è disponibile");
        }
        super.preleva(x);
    }
}
