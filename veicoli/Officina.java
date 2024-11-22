package veicoli;

public class Officina{
    public int ripara(Veicolo v){
        if v.isGuasto{
            v.setGuasto(false);
            if (v instanceOf Motociclo){
                return 200;
            }else return 500;
        }else return 20;
    }

    public Officina(){
        
    }
}