package veicoli;

public class UsaOfficina{
    public static void main(String[] args){
        Officina officina = new Officina();
        Vettura v = new Vettura("F4CT0R1O","Fiat","Panda","utilitaria");
        System.out.println(officina.ripara(v));
        v.setGuasto(true);
        System.out.println(officina.ripara(v));
    }
}