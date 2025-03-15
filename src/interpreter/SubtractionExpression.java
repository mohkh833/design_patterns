package interpreter;

public class SubtractionExpression implements Expression{
    private Expression left, right;

    public SubtractionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret() - right.interpret();
    }
}
