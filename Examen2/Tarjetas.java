import java.lang.annotation.Retention;
public class Tarjetas {
    int N_Card;
    int Nip;
    int cvv;
    int credito;
     String type_Card;
    public Tarjetas(int N_Card, int Nip,int cvv, int credito, String type_Card){
        this.N_Card = N_Card;
        this.Nip = Nip;
        this.cvv = cvv;
        this.credito = credito;
        this.type_Card = type_Card;
    }
    public int getN_Card(){
        return N_Card;
    }
    public int getNip(){
        return Nip;
    }
    public int getCVV(){
        return cvv;
    }
    public int getCredito(){
        return credito;
    }
    public String getType(){
        return type_Card;
    }
}
