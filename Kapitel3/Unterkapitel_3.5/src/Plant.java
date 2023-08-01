public class Plant {

    private float sizeInCm;

    protected void grow(float cm) {
        if (cm > 0)
            sizeInCm += cm;
    }

    public void water(int liter) {
        grow(liter * 0.1f);
    }

}