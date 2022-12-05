public class Cliente extends Tarjetas{
     String Name_C;
     int dia;
     int mes;
     int año;
     int compra;
    public Cliente(int N_Card, int Nip,int cvv, int credito, String type_Card,String Name_C,int dia,int mes,int año,int compra) {
        super(N_Card,Nip,cvv, credito, type_Card);
        this.Name_C = Name_C;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.compra = compra;

        if(dia!=dia){
            System.out.println("error no activacion");
        }else{
            System.out.println("Cumple requsito");
        }
        if(mes!=mes){
            System.out.println("error no activacion");
        }else{
            System.out.println("Cumple requsito");
        }
        if(año!=año){
            System.out.println("error no activacion");
        }else{
            System.out.println("Cumple requsito");
            System.out.println("Tarjeta Activada");
 
        }


           
    }
    public String getName() {
        return Name_C;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAño() {
        return año;
    }
    public int getCompra() {
        return compra;
    }
    public void Cliente1(){
        //card
        System.out.println("N_Card: "+getN_Card()+" Nip: "+getNip()+" getcvv: "+getCVV()+" Credito"+getCredito()+" Type Card: "+getType()+" Cliente "+getName()+" dia "+getDia()+" mes "+getMes()+" año "+getAño()+" objetoCompra "+getCompra());
        //en este partado si cambia mos la condicon nip  del lado derecho imprimira la el error por ejemplo cambiar ala a lago distitno del nip creado al objeto
        if(Nip==Nip){
  //limite de creito este es menor al credito indicada no deja hacer la operacion
            if(credito>compra){
                int resta=credito-compra;
                System.out.println("saldo disponivle actual "+resta+" Cargo ala Tarjeta: "+getCompra());

               }
               else{
                System.out.println("saldo insuficiente");
               }
        }else{
            System.out.println("error introduce el nip");
        }

}
}