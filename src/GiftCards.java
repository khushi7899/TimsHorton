public class GiftCards implements TimsMerch{
    @Override
    public double getprice() {
        return 30;
    }

    @Override
    public String getfeatures() {
        return ("gift card worth $30");
    }

    public String toString(){
        return ("\nName: GiftCards\nFeatures: "+getfeatures()+"\nPrice: $"+getprice());
    }
}
