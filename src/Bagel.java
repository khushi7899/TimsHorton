public class Bagel implements TimsConsumables{
    @Override
    public int getcalories() {
        return 150;
    }

    @Override
    public double getprice() {
        return 2.50;
    }
    public String toString(){
        return ("\nName: Bagel\nCalories: "+getcalories()+"\nPrice: $"+getprice());
    }
}
