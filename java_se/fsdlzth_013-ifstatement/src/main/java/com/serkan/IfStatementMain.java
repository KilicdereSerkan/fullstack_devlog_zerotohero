package com.serkan;


public class IfStatementMain {
    static void main() {
        int number = 10;

        // Simple if statement
        if (number > 0) {
            System.out.println("The number is positive.");
        }

        // if-else statement
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // if-else if-else statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Nested if statement
        if (number >= 0) {
            if (number == 0) {
                System.out.println("The number is zero.");
            } else {
                System.out.println("The number is positive.");
            }

         // Tenary Operator
        String result = (number % 2 == 0) ? "The number is even." : "The number is odd."; // ==> Ternary Operator -> ?
        System.out.println(result);
        // it checks if number is even or odd its syntax is (condition) ? value_if_true : value_if_false
        // it is a shorthand way of writing an if-else statement.
        // it is used when you want give back the result of condition directly to a boolean variable.


        }
        /*
            Explanation:
            5. The first if statement checks if the number is greater than 0. If true, it prints "The number is positive."
            6. The second if-else statement checks if the number is even or odd using the modulus operator (%). It prints the corresponding message based on the condition.
            7. The third if-else if-else statement checks if the number is positive, negative, or zero and prints the appropriate message.
            8. The nested if statement checks if the number is non-negative. If true, it further checks if the number is zero or positive and prints the corresponding message.
            9. Overall, the program demonstrates the usage of if statements to make decisions based on conditions and execute different blocks of code accordingly.
            10. The program showcases the flexibility of if statements in handling various scenarios and conditions.
            11. The program effectively uses conditional statements to evaluate the value of the number variable and provide appropriate output based on the conditions.
            12. The program highlights the importance of control flow in programming, allowing for dynamic decision-making based on variable values.
         */

            //--------------------------------------------------------------------------------------

            /*
            if statement Explanation:
            The if statement is a fundamental control flow statement in programming that allows for conditional execution of code blocks based on specified conditions.
            1. The if statement evaluates a boolean expression (condition).
            2. If the condition evaluates to true, the code block within the if statement is executed.
            3. If the condition evaluates to false, the code block is skipped, and the program continues with the next statement after the if block.
            4. The if statement can be followed by optional else if and else clauses to handle multiple conditions and provide alternative code paths.
            5. The else if clause allows for additional conditions to be checked if the previous if condition is false.
            6. The else clause provides a default code block to be executed if all previous conditions are false.
            7. The if statement can be nested within other if statements to create more complex decision-making structures.
            8. The if statement is commonly used for decision-making, branching logic, and controlling the flow of program execution based on dynamic conditions.
            9. Overall, the if statement is a powerful tool for implementing conditional logic in programming, enabling developers to create dynamic and responsive applications.
            10. Keywords:
            - if ==> keyword used to define a conditional statement.
            - else if ==> keyword used to define an additional condition in an if statement.
            - else ==> keyword used to define a default code block in an if statement.
            11. Syntax:
            if (condition) {
                // code to be executed if condition is true
            } else if (anotherCondition) {
                // code to be executed if anotherCondition is true
            } else {
                // code to be executed if all conditions are false
            }
            12. Overall, the if statement is a fundamental construct in programming that allows for conditional execution of code blocks based on specified conditions.

             */

            // --------------------------------------------------------------------------------------
            /*
            else statement Explanation:
            The else statement is a fundamental control flow statement in programming that provides an alternative code block to be executed when the preceding if condition evaluates to false.
            1. The else statement is used in conjunction with an if statement to define a default code path.
            2. When the condition in the if statement evaluates to false, the code block within the else statement is executed.
            3. The else statement does not require a condition, as it serves as a catch-all for cases where the if condition is not met.
            4. The else statement can be combined with else if clauses to handle multiple conditions and provide alternative code paths.
            5. The else statement is commonly used for decision-making, branching logic, and controlling the flow of program execution based on dynamic conditions.
            6. Overall, the else statement is a powerful tool for implementing conditional logic in programming, enabling developers to create dynamic and responsive applications.
            7. Keywords:
            - else ==> keyword used to define a default code block in an if statement.
            8. Syntax:
            if (condition) {
                // code to be executed if condition is true
            } else {
                // code to be executed if condition is false
            }
            9. Overall, the else statement is a fundamental construct in programming that allows for alternative execution of code blocks when preceding conditions are not met.

            10. The else statement enhances the flexibility of conditional statements by providing a means to handle scenarios where specific conditions are not satisfied.
            11. By using the else statement, developers can ensure that their programs can respond appropriately to a wider range of inputs and situations, improving overall robustness and user experience.

             */

            //--------------------------------------------------------------------------------------

            /*
            else if statement Explanation:
            The else if statement is a control flow statement in programming that allows for multiple conditions to be checked sequentially, providing alternative code paths based on the evaluation of those conditions.
            1. The else if statement is used in conjunction with an if statement to define additional conditions to be checked if the previous if condition evaluates to false.
            2. When the condition in the if statement evaluates to false, the program checks the condition in the else if statement.
            3. If the else if condition evaluates to true, the code block within the else if statement is executed.
            4. Multiple else if statements can be chained together to handle a series of conditions.
            5. The else if statement can be followed by an optional else clause to provide a default code path if all previous conditions are false.
            6. The else if statement is commonly used for decision-making, branching logic, and controlling the flow of program execution based on dynamic conditions.
            7. Overall, the else if statement is a powerful tool for implementing complex conditional logic in programming, enabling developers to create dynamic and responsive applications.
            8. Keywords:
            - else if ==> keyword used to define an additional condition in an if statement.
            9. Syntax:
            if (condition) {
                // code to be executed if condition is true
            } else if (anotherCondition) {
                // code to be executed if anotherCondition is true
            } else {
                // code to be executed if all conditions are false
            }
            10. Overall, the else if statement is a fundamental construct in programming that allows for multiple conditional checks and alternative execution of code blocks based on specified conditions.

             */

            //--------------------------------------------------------------------------------------


            /*
            nested if statement Explanation:
            A nested if statement is an if statement that is contained within another if statement, allowing for more complex decision-making structures in programming.
            1. A nested if statement allows for additional conditions to be checked within the code block of an outer if statement.
            2. When the condition in the outer if statement evaluates to true, the program proceeds to evaluate the condition in the nested if statement.
            3. If the nested if condition evaluates to true, the code block within the nested if statement is executed.
            4. Nested if statements can be used to create hierarchical decision-making structures, where multiple levels of conditions are evaluated.
            5. The use of nested if statements can enhance the flexibility and complexity of conditional logic in programming.
            6. However, excessive nesting can lead to reduced code readability and maintainability, so it is important to use nested if statements judiciously.
            7. Overall, nested if statements are a powerful tool for implementing complex conditional logic in programming, enabling developers to create dynamic and responsive applications.
            8. Keywords:
            - if ==> keyword used to define a conditional statement.
            9. Syntax:
            if (outerCondition) {
                if (innerCondition) {
                    // code to be executed if innerCondition is true
                }
            }
            10. Overall, nested if statements are a fundamental construct in programming that allows for hierarchical decision-making and complex conditional logic based on multiple levels of specified conditions.

               // --------------------------------------------------------------------------------------

               /*
            condition Explanation:
            A condition is a boolean expression that evaluates to either true or false, determining the flow of execution in control flow statements such as if statements, loops, and switch statements.
            1. A condition is typically formed using relational operators (e.g., ==, !=, >, <, >=, <=) to compare values or variables.
            2. Conditions can also involve logical operators (e.g., &&, ||, !) to combine multiple boolean expressions.
            3. The evaluation of a condition determines whether a specific code block will be executed or skipped.
            4. Conditions are essential for implementing decision-making and branching logic in programming.
            5. Conditions can be simple, involving a single comparison, or complex, involving multiple comparisons and logical operations.
            6. The use of conditions allows for dynamic behavior in programs, enabling them to respond to different inputs and situations.
            7. Overall, conditions are a fundamental construct in programming that enables developers to create flexible and responsive applications.
            8. Keywords:
            - condition ==> a boolean expression that evaluates to true or false.
            9. Syntax:
            if (condition) {
                // code to be executed if condition is true
            }
            10. Overall, conditions play a crucial role in controlling the flow of execution in programming, allowing for dynamic decision-making based on specified criteria.

                */

            //--------------------------------------------------------------------------------------

            /*
            boolean expression Explanation:
            A boolean expression is an expression that evaluates to a boolean value, which can be either true or false. Boolean expressions are commonly used in control flow statements, such as if statements and loops,
            to determine the flow of execution based on specified conditions.
            1. A boolean expression can be formed using relational operators (e.g., ==, !=, >, <, >=, <=) to compare values or variables.
            2. Boolean expressions can also involve logical operators (e.g., &&, ||, !) to combine multiple boolean expressions.
            3. The evaluation of a boolean expression results in either true or false, which determines whether a specific code block will be executed or skipped.
            4. Boolean expressions are essential for implementing decision-making and branching logic in programming.
            5. Boolean expressions can be simple, involving a single comparison, or complex, involving multiple comparisons and logical operations.
            6. The use of boolean expressions allows for dynamic behavior in programs, enabling them to respond to different inputs and situations.
            7. Overall, boolean expressions are a fundamental construct in programming that enables developers to create flexible and responsive applications.
            8. Keywords:
            - boolean expression ==> an expression that evaluates to true or false.
            9. Syntax:
            if (booleanExpression) {
                // code to be executed if booleanExpression is true
            }
            10. Overall, boolean expressions play a crucial role in controlling the flow of execution in programming, allowing for dynamic decision-making based on specified criteria.

             */

            //--------------------------------------------------------------------------------------



    }
}
