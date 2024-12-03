package escurso;

public class Bombilla {
    private int pwr;

    // propiedad de la clase o el objeto
    public int getPwr() {
        return pwr;
    }

    public void setPwr(int pwr) {
        if (pwr >= 0 && pwr <= 3)
            this.pwr = pwr;
    }

    public void increase() {
        setPwr(getPwr() + 1);
    }

    public void decrease() {
        setPwr(getPwr() - 1);

    }

}
