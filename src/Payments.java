import static java.lang.String.valueOf;

public class Payments extends Card{
    public static double total;
    public static boolean process=false;

    Card[] cd=new Card[5];

    public Payments() {
        super();
        cd[0] = new Card("006475429877", "0708", 7899);

        cd[1] = new Card("006475498517", "2507", 2597);

        cd[2] = new Card("009815263029", "2102", 2174);

        cd[3] = new Card("009815844621", "1808", 1874);

    }

    public double payment(TimsItems tm[], int items)
    {

        for(int i=0;i<items;i++)
        {
            total= tm[i].getprice() + total;
        }
        return total;
    }

void check(String cardno, String date, int pin){
        for (int i = 0; i <=3 ; i++) {
            if (process == false) {
                if ((valueOf(this.cd[i].cardno).equals(cardno)) && ((valueOf(this.cd[i].date)).equals(date)) && (this.cd[i].pin == pin))
                    process = true;
                else
                    process = false;
            }
        }

}
}
