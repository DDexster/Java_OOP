package hwJavaOOP.hwRange;

/**
 * Created by ddexster on 16.08.16.
 */
public class RangeRunner {
    public static void main(String[] args) {
        Range<Integer> integerRange = new Range<>(30, 40);
        System.out.println(integerRange);

        Range<Long> range = new Range<>(10L, 56L);
        System.out.println(range);

        Range<Double> doubleRange = new Range<>(45D, 80D);
        System.out.println(doubleRange);

        Range<Float> floatRange = new Range<>(34F, 67F);
        System.out.println(floatRange);

    }
}
