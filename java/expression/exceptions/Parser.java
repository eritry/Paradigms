package expression.exceptions;
import expression.expressions.TripleExpression;
/**
 * @author Georgiy Korneev (kgeorgiy@kgeorgiy.info)
 */
public interface Parser<T> {
    TripleExpression<T> parse(String expression) throws ParseException;
}
