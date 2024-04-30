
public class Mensalista extends Funcionario {
    
    public double salbruto;
    public double desconto;
    
    public double Calcsal(){
        return this.salbruto-this.desconto;
    }
}
