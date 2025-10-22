package com.serkan;


public class LoopsMain {
    static void main() {

/*
        Overview of loops in Java
        Loops let you run the same block of code multiple times without repeating it manually.
        Java has three core loop types: for, while, and do-while. Each checks conditions at different times and is suited to different situations.
         Below you’ll find practical, well-commented examples (no arrays), explanations of behavior, and sample console outputs.
 */


/*
         For loop
        Description
          Best when you know how many times you want to run the loop.
        - Syntax parts: initialization; condition; update.
 */
 //      Example 1 — simple counting

                // print numbers 1 to 5
                for (int i = 1; i <= 5; i++) {
                    System.out.println("i = " + i);
                }
/*
        Console
        i = 1
        i = 2
        i = 3
        i = 4
        i = 5
 */
/*
        Explanation
        - Initialization runs once (int i = 1).
        - Condition checked before each iteration (i <= 5).
        - Update runs after each iteration (i++).
        - If condition false initially, loop body never runs.
 */

//     Example 2 — for with multiple variables and complex update

                for (int a = 1, b = 10; a <= 5 && b >= 6; a++, b--) {
                    System.out.println("a = " + a + ", b = " + b);
                }
/*
        Console
        a = 1, b = 10
        a = 2, b = 9
        a = 3, b = 8
        a = 4, b = 7
        a = 5, b = 6
 */

/*
        Notes
        - You can declare multiple loop variables separated by commas.
        - Loop stops when any part of the condition becomes false.
 */


 /*
        While loop
        Description
        - Checks the condition before each iteration.
        - Good when the number of iterations is not known in advance and you need to repeat while a condition holds.
  */

 //      Example — reading simulated user input count (no arrays)

                int attempts = 0;
                int maxAttempts = 4;

                // repeat until attempts reaches maxAttempts
                while (attempts < maxAttempts) {
                    attempts++;
                    System.out.println("Attempt number " + attempts);
                }
 /*
        Console
        Attempt number 1
        Attempt number 2
        Attempt number 3
        Attempt number 4
  */


 //       Pitfall — forgetting to update condition
                int x = 0;
                while (x < 3) {
                    System.out.println("x is " + x);
                    // x not changed -> infinite loop
                    break; // shown here to avoid actually infinite behavior
                }
 /*
        Console
        x is 0
  */

 /*
        Notes
        - Always ensure the loop condition will eventually become false (or intentionally break out).
        - Use while for condition-driven repetition.
  */



/*
       Do-while loop
       Description
       - Executes the loop body at least once, then checks the condition.
       - Good for menus or prompts that must run once and then repeat on user choice.
 */
  //     Example — menu simulation

                int choice = 1; // simulate user choosing to continue once then stop

                do {
                    System.out.println("Running the action at least once");
                    // simulate user changing their mind
                    if (choice == 1) {
                        choice = 0; // next loop check will stop
                    }
                } while (choice == 1);
/*
        Console
        Running the action at least once
 */

/*
        Notes
        - Use when you need guaranteed one-time execution before condition check.
 */




 /*
        Nested loops, labeled break and continue
        Nested loops
        - You can place loops inside loops for multi-dimensional behavior (for generating patterns, coordinate grids, etc.).

  */
  //      Example — simple nested loops (no arrays)
        for (int row = 1; row <= 3; row++) {
                    for (int col = 1; col <= 4; col++) {
                        System.out.print("(" + row + "," + col + ") ");
                    }
                    System.out.println(); // new line after each row
                }
 /*
        Console
        (1,1) (1,2) (1,3) (1,4)
        (2,1) (2,2) (2,3) (2,4)
        (3,1) (3,2) (3,3) (3,4)
  */

/*
        Labeled break and continue
        - Labeled break exits an outer loop directly.
        - Labeled continue jumps to next iteration of an outer loop.
 */
 //       Example — labeled break and continue
                outer:
                for (int i = 1; i <= 3; i++) {
                    for (int j = 1; j <= 5; j++) {
                        if (j == 4) {
                            System.out.println("breaking outer when i=" + i + " j=" + j);
                            break outer; // stops both loops
                        }
                        if (j == 2) {
                            System.out.println("skip rest of this inner iteration when j=2");
                            continue; // continues inner loop
                        }
                        System.out.println("i=" + i + " j=" + j);
                    }
                }
 /*
        Console
        i=1 j=1
        skip rest of this inner iteration when j=2
        i=1 j=3
        breaking outer when i=1 j=4
  */
//     - Use labeled control sparingly; overusing labels can make code harder to read.
/*
        Break, continue, and common patterns
        Break
        - Immediately exits the nearest loop (or labeled loop if label used).
        Continue
        - Skips remaining statements in current iteration and proceeds to the next iteration.
 */
//      Common pattern — search until found

                boolean found = false;
                for (int xx = 1; xx <= 10; x++) {
                    if (xx == 7) {
                        found = true;
                        System.out.println("Found 7 at x = " + xx);
                        break;
                    }
                }
                if (!found) {
                    System.out.println("7 not found");
                }
/*
        Console
        Found 7 at x = 7
 */


 //       Common pattern — skip invalids

                for (int n = 1; n <= 10; n++) {
                    if (n % 2 != 0) {
                        continue; // skip odd numbers
                    }
                    System.out.println("even: " + n);
                }
 /*
        Console
        even: 2
        even: 4
        even: 6
        even: 8
        even: 10
  */


/*
        Best practices and performance tips
                - Prefer the simplest loop that suits the problem: for when counting known iterations, while/do-while when condition-driven.
                - Avoid modifying loop variables in multiple places; keep initialization and updates clear.
                - Use break/continue for control but avoid complex nested use that harms readability.
                - Watch for infinite loops (missing update or wrong condition).
        - For heavy loops, minimize work inside the loop (e.g., avoid expensive method calls repeated unnecessarily).
 */



    }
}
