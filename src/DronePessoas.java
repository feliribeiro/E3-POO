public class DronePessoas extends Drone {
 private int qtdMaxPessoas;

 public DronePessoas(int codigo, double custoFixo, double autonomia, int qtdMaxPessoas) {
    super(codigo, custoFixo, autonomia);
    this.qtdMaxPessoas = qtdMaxPessoas;
 }
}
