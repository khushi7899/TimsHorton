public class Wrap implements TimsConsumables{
    @Override
    public int getcalories() {
        return 450;
    }

    @Override
    public double getprice() {
        return 7.25;
    }
    public String toString(){
        return ("\nName: Wrap\nCalories: "+getcalories()+"\nPrice: $"+getprice());
    }
}
