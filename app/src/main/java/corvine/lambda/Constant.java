package corvine.lambda;

import java.util.function.Function;

public class Constant implements Term {

    public final Function<Double, Double> function;

    public Constant(Function<Double, Double> function) {

        this.function = function;

    }

    public static final Constant IDENTITY = new Constant(x -> x);
}
