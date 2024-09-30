package esercizio3.contiClasses;

import esercizio3.exception.BancaException;

public class ContoOnline extends ContoCorrente {
    private double maxPrelievo;

    public ContoOnline(int nMovimenti, double saldo, String titolare, double maxPrelievo) {
        super(nMovimenti, saldo, titolare);
        this.maxPrelievo = maxPrelievo;
    }

    @Override
    public void preleva(double x) throws BancaException {
        if (x > maxPrelievo) {
            throw new BancaException("E chi ti credi di essere IL Re dei POVER!!");
        }
        super.preleva(x);
    }
}
