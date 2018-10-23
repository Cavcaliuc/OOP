package lab4;

public class BracketCheck {
        String expression;


        public BracketCheck(String expression) {

            this.expression = expression;
        }

        StackExpression stack1 = new StackExpression();


        public void checkExpression() {

            boolean isBalanced = true;

            for (int i = 0; i < expression.length(); i++) {
                char token = expression.charAt(i);
                if ( token == '(') {
                    stack1.push(token);
                }

                if ( token == ')'){

                    if(!stack1.isEmpty()) {
                        char last = stack1.getLastElement();
                        if (last == '(' && token == ')') {
                            stack1.pop();
                        }else{
                            isBalanced = false;
                        }

                    } else {
                        isBalanced = false;
                    }
                }
            }
            if (!(!stack1.isEmpty() || !isBalanced)) {
                System.out.println("The expression is balanced");
            }else{
                System.out.println("The expression is not balanced");
            }
        }
}
