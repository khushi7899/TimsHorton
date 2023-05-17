public class Mugs implements TimsMerch{

    @Override
    public double getprice() {
        return 20;
    }

    @Override
    public String getfeatures() {
        return "Beautiful red Mug";
    }
    public String toString(){
        return ("\nName: Mug\nFeatures: "+getfeatures()+"\nPrice: $"+getprice());
    }
}
