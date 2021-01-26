package Functional;

import java.math.BigInteger;

public abstract class Operator {
    public abstract BigInteger compute(BigInteger... values);
}

class Plus extends Operator {
    @Override
    public BigInteger compute(BigInteger... values) {
        return values[0].add(values[1]);
    }
}

class Minus extends Operator {
    @Override
    public BigInteger compute(BigInteger... values) {
        return values[0].min(values[1]);
    }
}

class Multiply extends Operator {
    @Override
    public BigInteger compute(BigInteger... values) {
        return values[0].multiply(values[1]);
    }
}

class Divide extends Operator {
    @Override
    public BigInteger compute(BigInteger... values) {
        return values[0].divide(values[1]);
    }
}
