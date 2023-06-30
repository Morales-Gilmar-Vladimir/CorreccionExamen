public class fanesca extends secoPollo {
    private double numIngre;

    public fanesca(String nomplato, String ciuOrigen, double anioOrigen, String ingrePrin, double numIngre) {
        super(nomplato, ciuOrigen, anioOrigen, ingrePrin);
        this.numIngre = numIngre;
    }

    public double getNumIngre() {
        return numIngre;
    }

    public void setNumIngre(double numIngre) {
        this.numIngre = numIngre;
    }
}
