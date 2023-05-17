public class Coffee implements TimsConsumables {
    @Override
    public int getcalories() {
        return 90;
    }

    @Override
    public double getprice() {
        return 4;
    }

    public String toString() {
        return ("\nName: Coffee\nCalories: " + getcalories() + "\nPrice: $" + getprice());
    }
}
