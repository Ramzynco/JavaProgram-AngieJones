# Java String in Reverse

```java
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
    
    if (isSolution(A)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

    public static boolean isSolution(String A) {
    int n = A.length();
    for (int i = 0; i < n / 2; i++) {
      if (A.charAt(i) != A.charAt(n - i - 1)) {
        return false;
      }
    }
    return true;
    }
}

```

This code checks if a word is a palindrome, which is a word that reads the same forwards and backwards.

Here's what each part of the code does:

* `if (isPalindrome(input))`: This line checks if the word is a palindrome by calling a method named `isPalindrome` and passing in the word as an argument.
* `System.out.println("Yes");`: If the word is a palindrome, this line prints "Yes" on the screen.
* `} else {`: If the word is not a palindrome, the code will skip the previous line and run the code inside this `else` statement.
* `System.out.println("No");`: This line prints "No" on the screen, which means the word is not a palindrome.
* `}`: This closes the `if` statement.

The `isPalindrome` method takes in a word as an argument and returns `true` if the word is a palindrome and `false` if it's not.

* `int n = input.length();`: This line creates a variable named `n` and stores the length of the word in it.
* `for (int i = 0; i < n / 2; i++)`: This line creates a loop that will run as many times as there are letters in half of the word. The loop starts at `0` and stops when `i` is equal to half the length of the word.
* `if (input.charAt(i) != input.charAt(n - i - 1))`: This line checks if the letter at position `i` is different from the letter at position `n - i - 1`. If they're different, the word is not a palindrome, so the method returns `false`.
* `return false;`: This line returns `false` if the letters are different.
* `return true;`: This line is outside the loop and returns `true` if the loop has finished running and all the letters matched up, which means the word is a palindrome.

#### Explains more in depth&#x20;

```java
if (input.charAt(i) != input.charAt(n - i - 1)):
```

the line `if (input.charAt(i) != input.charAt(n - i - 1))` is checking if the current letter in the word is equal to its corresponding letter in the reverse of the word.

Here's what's happening step by step:

1. `input.charAt(i)`: This gets the '`i'`th letter in the word. For example, if `input` is the word "hello" and `i` is `2`, this line gets the letter "l".
2. `input.charAt(n - i - 1)`: This gets the letter that corresponds to the '`i'`th letter in the reverse of the word.

* `n` is the length of the word.
* `- i - 1` is used to calculate the index of the corresponding letter in the reverse of the word.
* So, if `input` is the word "hello" and `i` is `2`, `n - i - 1` is `5 - 2 - 1`, which is `2`. The letter at position `2` in the reverse of the word "hello" is "l".

3. `!=`: The `!=` operator checks if two values are not equal.
4. `if (input.charAt(i) != input.charAt(n - i - 1))`: This line checks if the letter at position `i` in the word is not equal to its corresponding letter in the reverse of the word.

If the letters are different, the word is not a palindrome, so the method returns `false`. If all the letters match up, then the word is a palindrome and the method returns `true`.

