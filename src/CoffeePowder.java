public class CoffeePowder implements TimsMerch {
    @Override
    public double getprice() {
        return 40;
    }

    @Override
    public String getfeatures() {
        return ("Verona Coffee Powder");
    }

    public String toString(){
        return ("\nName: Coffee Powder\nFeatures: "+getfeatures()+"\nPrice: $"+getprice());
    }
}
