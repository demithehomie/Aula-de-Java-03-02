class BalancoTrimestral {
// 15000  - 23000 - 17000
    int gastosJaneiro;
    int gastosFevereiro;
    int gastosMarco;
  

    public BalancoTrimestral(int gastosJaneiro,int gastosFevereiro,int gastosMarco ){

        this.gastosJaneiro = gastosJaneiro;
        this.gastosFevereiro = gastosFevereiro;
        this.gastosMarco = gastosMarco;
    }

    public void gastosJaneiro(){
        System.out.println("Gasto de Janeiro: R$ " + gastosJaneiro );
        System.out.println("Gasto de Fevereiro: R$ " + gastosFevereiro );
        System.out.println("Gasto de Março: R$ " + gastosMarco );
    }
   
    public static void main(String[] args) {
        
        BalancoTrimestral balancoTrimestral = new BalancoTrimestral(15000, 23300, 27000);
        balancoTrimestral.gastosJaneiro();
        
       
    }
}