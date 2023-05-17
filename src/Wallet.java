public class Wallet extends Payments{
   public static double wall=100;

   double rembal(){
       return (Payments.total);

    }
   double balance(){
       if(Payments.process==true) {
           wall = wall - rembal();
           System.out.println("Charges : " + rembal());

       }
       return(wall);
   }


}
