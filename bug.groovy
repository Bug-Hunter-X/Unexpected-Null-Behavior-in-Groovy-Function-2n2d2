```groovy
def calculate(a, b) {
  if (a == null || b == null) {
    return 0 //This will cause unexpected behavior if a or b is null
  }
  return a + b
}

println calculate(5, 3) // Output: 8
println calculate(null, 3) // Output: 0, unexpected if you didn't intend to handle nulls this way
```