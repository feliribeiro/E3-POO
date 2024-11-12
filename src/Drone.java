public class Drone {
    private int codigo;
    private double custoFixo;
    private double autonomia;

    public Drone(int codigo, double custoFixo, double autonomia) {
        this.codigo = codigo;
        this.custoFixo = custoFixo;
        this.autonomia = autonomia;
    }


    public double calculaCustoKm(){
        return custoFixo * autonomia;
    }
}
