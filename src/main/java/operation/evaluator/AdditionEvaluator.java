package operation.evaluator;

import operation.Operation;

public class AdditionEvaluator extends AbstractOperationEvaluator {

    @Override
    public Integer evaluate(Operation operation, Integer[] operands) {
        return operands[0] + operands[1];
    }

}
