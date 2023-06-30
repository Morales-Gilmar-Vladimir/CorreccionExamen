public class ComidaTipica {
    private String nomplato;
    private String ciuOrigen;
    private double  anioOrigen;

    //Constructor

    public ComidaTipica(String nomplato, String ciuOrigen, double anioOrigen) {
        this.nomplato = nomplato;
        this.ciuOrigen = ciuOrigen;
        this.anioOrigen = anioOrigen;
    }

    public String getNomplato() {
        return nomplato;
    }

    public void setNomplato(String nomplato) {
        this.nomplato = nomplato;
    }

    public String getCiuOrigen() {
        return ciuOrigen;
    }

    public void setCiuOrigen(String ciuOrigen) {
        this.ciuOrigen = ciuOrigen;
    }

    public double getAnioOrigen() {
        return anioOrigen;
    }

    public void setAnioOrigen(double anioOrigen) {
        this.anioOrigen = anioOrigen;
    }

    //Metodo
    public void impSeco(){
        System.out.println("Este es el plato tipico llamado seco de pollo");
    }
    public void impfanesca(){
        System.out.println("Este es el plato tipico llamado fanesca");
    }
    public void impmajado(){
        System.out.println("Este es el plato tipico llamado majado de verde");
    }
}
