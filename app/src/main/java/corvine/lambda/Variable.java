package corvine.lambda;

public class Variable implements Term {

    public final String name;
    public final Term definition;

    public Variable (String name, Term definition) {

        this.name = name;
        this.definition = definition;

    }
}
