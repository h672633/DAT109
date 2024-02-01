package no.hvl.dat109.webshop;

public class Stiger {

    private int start;
    private int slutt;

  
    public Stiger(int start, int slutt) {
        this.start = start;
        this.slutt = slutt;
    }

   
    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

   
    public int getSlutt() {
        return slutt;
    }

    public void setSlutt(int slutt) {
        this.slutt = slutt;
    }
}
