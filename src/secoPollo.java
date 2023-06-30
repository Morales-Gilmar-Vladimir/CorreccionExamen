public class secoPollo extends ComidaTipica{
    private String ingrePrin;

    public secoPollo(String nomplato, String ciuOrigen, double anioOrigen, String ingrePrin) {
        super(nomplato, ciuOrigen, anioOrigen);
        this.ingrePrin = ingrePrin;
    }

    public String getIngrePrin() {
        return ingrePrin;
    }

    public void setIngrePrin(String ingrePrin) {
        this.ingrePrin = ingrePrin;
    }
}
