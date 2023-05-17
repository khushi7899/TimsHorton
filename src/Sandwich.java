public class Sandwich implements TimsConsumables{
    @Override
    public int getcalories() {
        return 300;
    }

    @Override
    public double getprice() {
        return 5.65;
    }
    public String toString(){
        return ("\nName: Sandwich\nCalories: "+getcalories()+"\nPrice: $"+getprice());
    }
}
