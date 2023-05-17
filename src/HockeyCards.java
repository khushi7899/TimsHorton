public class HockeyCards implements TimsMerch{
    @Override
    public double getprice() {
        return 50;
    }

    @Override
    public String getfeatures() {
        return ("Hockey Card worth $50");
    }

    public String toString(){
        return ("\nName: Hockey Card\nFeatures: "+getfeatures()+"\nPrice: $"+getprice());
    }
}
