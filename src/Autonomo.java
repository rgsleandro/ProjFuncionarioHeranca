
public class Autonomo extends Funcionario{
    public double totvendas;
    public double percvendas;
    
    public double Calcsal(){
        return (this.percvendas/100)*this.totvendas;
    }
         
}
