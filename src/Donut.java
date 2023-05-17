public class Donut implements TimsConsumables {
    @Override
    public int getcalories() {
        return 200;
    }

    @Override
    public double getprice() {
        return 3.25;
    }

    public String toString() {
        return ("\nName: Donut\nCalories: " + getcalories() + "\nPrice: $" + getprice());
    }
}
