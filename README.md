# Groovy Null Handling Bug

This repository demonstrates a common issue in Groovy: unexpected behavior when null values are passed to a function without explicit null checks.  The `calculate` function in `bug.groovy` returns 0 if either `a` or `b` is null. While this might seem harmless, it can lead to unexpected results and logical errors in more complex scenarios.  The solution in `bugSolution.groovy` demonstrates how to properly handle null values using explicit checks, and provides alternative approaches to avoid returning a potentially misleading 0 value. 

## How to Reproduce

1. Clone the repository.
2. Run `bug.groovy`. Observe the output, and note the unexpected result when a null value is passed.
3. Run `bugSolution.groovy`. Notice how the improved function handles null values correctly. 