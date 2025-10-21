package com.serkan;

public class Expressions {
    static void main() {
        // An expression is a combination of operands and operators that evaluates to a single value. also returns value of method is an expression.
        int a = 10;
        int b = 3;
        // Example of an arithmetic expression
        int sum = a + b; // 'a + b' is an expression that evaluates to 13
        System.out.println("Sum: " + sum); // 13

        // Example of a relational expression
        boolean isGreater = a > b; // 'a > b' is an expression that evaluates to true
        System.out.println("Is a greater than b? " + isGreater); // true

        // Example of a logical expression
        boolean logicalExpr = (a > b) && (b < 5); // '(a > b) && (b < 5)' evaluates to true
        System.out.println("Logical Expression Result: " + logicalExpr); // true

        /*
        expressions can be simple or complex:
        1. Simple Expressions: Consist of a single operand or a single operation (e.g., a variable, a constant, or a single arithmetic operation).
        example: int x = 5; or int y = a + b;

        2. Complex Expressions: Involve multiple operands and operators, often combining different types of operations (e.g., arithmetic, relational, and logical operations).
        example: boolean result = (a + b > 10) && (b < 5);

        3. Nested Expressions: Expressions that contain other expressions within them, often using parentheses to define the order of evaluation.
        example: int z = (a * (b + 2)) - 5;

        4. Side Effects: Some expressions may have side effects, such as modifying a variable's value during evaluation (e.g., using assignment operators).
        5. Evaluation Order: The order in which expressions are evaluated is determined by operator precedence and associativity rules.
        6. Type of Expressions: Expressions can evaluate to different data types, such as integers, booleans, or strings, depending on the operands and operators used.
        7. Expression Statements: In Java, expressions can be used as statements, where the result of the expression is not used, but the expression itself is executed (e.g., method calls).
        8. Expression Trees: In more advanced programming concepts, expressions can be represented as trees, where each node represents an operator and its children represent the operands.
        9. Short-Circuit Evaluation: In logical expressions, evaluation may stop as soon as the result is determined (e.g., in an AND operation, if the first operand is false, the second operand is not evaluated).
        10. Expression Optimization: Compilers may optimize expressions for better performance, such as simplifying constant expressions at compile time.
        11. Lambda Expressions: In Java, lambda expressions provide a way to create anonymous functions, allowing for functional programming techniques.
        12. Ternary Expressions: The ternary operator (?:) allows for concise conditional expressions, returning one of two values based on a boolean condition.
        13. Expression Evaluation: The process of computing the value of an expression based on the current values of its operands.
        14. Expression Contexts: Expressions can be used in various contexts, such as in  assignments, method arguments, or control flow statements.
        15. Expression Language: Some frameworks and libraries provide their own expression languages for evaluating expressions in specific contexts (e.g., JSP EL, OGNL).
        16. Expression Parsing: The process of analyzing and interpreting expressions, often used in compilers and interpreters to convert expressions into executable code.
        17. Expression Builders: Libraries or tools that help construct complex expressions programmatically, often used in query building or dynamic code generation.
        18. Expression Evaluation Order: Understanding how expressions are evaluated, especially in complex expressions with multiple operators and operands.
        19. Expression Side Effects: Recognizing when expressions may have side effects, such as modifying state or performing I/O operations during evaluation.


         */
    }
}
