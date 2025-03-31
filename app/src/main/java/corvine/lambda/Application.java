package corvine.lambda;

public class Application implements Term {

    public final Term function;
    public final Term argument;

    public Application(Term function, Term argument) {

        this.function = function;
        this.argument = argument;

    }

}
