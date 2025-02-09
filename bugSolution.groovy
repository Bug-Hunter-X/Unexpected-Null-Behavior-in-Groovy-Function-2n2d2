```groovy
def calculate(a, b) {
  if (a == null || b == null) {
    throw new IllegalArgumentException("Null values not allowed.") //Explicitly throw exception for better error handling 
  }
  return a + b
}

println calculate(5, 3) // Output: 8

try {
  println calculate(null, 3) // Throws exception, clearly indicating the error
} catch (IllegalArgumentException e) {
  println "Error: " + e.message
}

//Alternative implementation using elvis operator
def calculate2(a, b) {
  (a ?: 0) + (b ?: 0) //using the Elvis operator for better readability and null handling
}

println calculate2(5,3) //Output: 8
println calculate2(null,3) //Output: 3
println calculate2(null, null) //Output: 0
```