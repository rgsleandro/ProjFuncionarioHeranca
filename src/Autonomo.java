
public class Autonomo extends Funcionario{
    public double totvendas;
    public double percvendas;
    
    public double Calcsal(){
        return this.totvendas*100/this.percvendas;
    }
         
}
