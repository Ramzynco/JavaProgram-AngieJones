---
description: >-
  This Java Cheat Sheet can be useful. Since Java is renowned for its pre-built
  classes and libraries, keeping track of them can occasionally be challenging.
  So, here is the Core Java cheat sheet.
---

# Java

{% tabs %}
{% tab title="Terminology" %}

{% endtab %}

{% tab title="Basics" %}
&#x20;

#### Primitive Data Types

A primitive data type specifies the size and type of variable values, and it has no additional methods.

There are eight primitive data types in Java |

| Data Type | Size    | Description                                                                       |
| --------- | ------- | --------------------------------------------------------------------------------- |
| `byte`    | 1 byte  | Stores whole numbers from -128 to 127                                             |
| `short`   | 2 bytes | Stores whole numbers from -32,768 to 32,767                                       |
| `int`     | 4 bytes | Stores whole numbers from -2,147,483,648 to 2,147,483,647                         |
| `long`    | 8 bytes | Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| `float`   | 4 bytes | Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits           |
| `double`  | 8 bytes | Stores fractional numbers. Sufficient for storing 15 decimal digits               |
| `boolean` | 1 bit   | Stores true or false values                                                       |
| `char`    | 2 bytes | Stores a single character/letter or ASCII values                                  |

##

&#x20;**Java User Input (Scanner)**

The `Scanner` class is used to get user input, and it is found in the `java.util` package.

To use the `Scanner` class, create an object of the class and use any of the available methods found in the `Scanner` class documentation. In our example, we will use the `nextLine()` method, which is used to read Strings:

| Method          | Description                           |
| --------------- | ------------------------------------- |
| `nextBoolean()` | Reads a `boolean` value from the user |
| `nextByte()`    | Reads a `byte` value from the user    |
| `nextDouble()`  | Reads a `double` value from the user  |
| `nextFloat()`   | Reads a `float` value from the user   |
| `nextInt()`     | Reads a `int` value from the user     |
| `nextLine()`    | Reads a `String` value from the user  |
| `nextLong()`    | Reads a `long` value from the user    |
| `nextShort()`   | Reads a `short` value from the user   |
{% endtab %}

{% tab title="Untitled" %}

{% endtab %}

{% tab title="Variables" %}
#### Useful String Methods

The String class in Java provides a number of useful methods:&#x20;

* startsWith(“a”)&#x20;
* endsWith(“a”)&#x20;
* length()&#x20;

{% code overflow="wrap" lineNumbers="true" %}
```java
package Strings;

public class TextLength {
        public static void main(String[] args) {
            // Change the test in betwen " " to play around. // Try also by adding Spaces
            String textYouEntered = "JavaWithRamzy";
            System.out.println("Great! we just practiced how to find the length of a text and the length is - : " + textYouEntered .length());
        }
}
```
{% endcode %}

* indexOf(“a”)&#x20;
*
* replace(“a”, “b”)&#x20;
* toUpperCase()&#x20;
* toLowerCase()&#x20;

{% code overflow="wrap" lineNumbers="true" %}
```java
package Strings;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        String textYouEnter = "now look at that! you did it again!!";
        System.out.println(textYouEnter.toUpperCase());
        System.out.println(textYouEnter.toLowerCase());
    }
}
```
{% endcode %}

Strings are immutable, which means once we initialize them, their value cannot be changed. All methods that modify a string (like toUpperCase) return a new string object. The original string remains unaffected.



#### Strings - Special Characters

Because strings must be written within quotes, Java will misunderstand this string, and generate an error: \
The solution to avoid this problem, is to use the **backslash escape character**.

The backslash (`\`) escape character turns special characters into string characters:

|  Escape character | Result | Description  |
| ----------------- | ------ | ------------ |
| \\'               | '      | Single quote |
| \\"               | "      | Double quote |
| \\\\              | \\     | Backslash    |



{% hint style="info" %}
For a deeper understanding refer this section from [W3 Schools](https://www.w3schools.com/java/java\_strings.asp)
{% endhint %}

{% hint style="success" %}
CheckPoint | Test your Knowledge with these [6 Exercises](https://github.com/Ramzynco/JavaWithRamzy/tree/main/letsAbsorbTheSyntax/strings)

* [ ] [FindingTheCharacter.java](https://github.com/Ramzynco/JavaWithRamzy/blob/main/letsAbsorbTheSyntax/strings/FindingTheCharacter.java)
* [ ] [TextLength.java](https://github.com/Ramzynco/JavaWithRamzy/blob/main/letsAbsorbTheSyntax/strings/TextLength.java)
* [ ] [UpperAndLowerCase.java](https://github.com/Ramzynco/JavaWithRamzy/blob/main/letsAbsorbTheSyntax/strings/UpperAndLowerCase.java)
{% endhint %}
{% endtab %}

{% tab title="Structures" %}


| Operator | Meaning               |
| -------- | --------------------- |
| `a = b`  | Equality              |
| `a ≠ b`  | Inequality            |
| `a > b`  | Greater than          |
| `a < b`  | Less than             |
| `a ≥ b`  | Greater than or equal |
| `a ≤ b`  | Less than or equal    |

\
Boolean operators are like magic words that help you make decisions in your code. \
\
There are three main boolean operators in Java: `&&`, `||`, and `!`.\


The `&&` operator means "and". You use it when you want both things to be true. For example:

```typescript
typescriptCopy codeint number = 8;
boolean isGreaterThan5 = number > 5;
boolean isLessThan10 = number < 10;

if (isGreaterThan5 && isLessThan10) {
    System.out.println("The number is greater than 5 and less than 10!");
}
```

In this case, the message "The number is greater than 5 and less than 10!" will be printed on the screen because both `isGreaterThan5` and `isLessThan10` are `true`.

\
The `||` operator means "or". You use it when you want at least one of the things to be true. For example:

```typescript
typescriptCopy codeint number = 8;
boolean isGreaterThan5 = number > 5;
boolean isLessThan10 = number < 10;

if (isGreaterThan5 || isLessThan10) {
    System.out.println("The number is either greater than 5 or less than 10!");
}
```

In this case, the message "The number is either greater than 5 or less than 10!" will be printed on the screen because `isGreaterThan5` is `true`.

\
The `!` operator means "not". You use it when you want to negate a boolean value. For example:

```typescript
typescriptCopy codeint number = 8;
boolean isGreaterThan5 = number > 5;

if (!isGreaterThan5) {
    System.out.println("The number is not greater than 5!");
}
```

In this case, the message "The number is not greater than 5!" will not be printed on the screen because `isGreaterThan5` is `true`.

\
\
The following tables summarises the boolean operators:

**NOT**

The veracity of the statement is reversed.

| NOT | Statement | Result |
| --- | --------- | ------ |
| !   | true      | false  |
| !   | false     | true   |

**AND**

If two statements are joined using _and_, the compound statement is true only if both parts are true.

| Statement 1 | AND | Statement 2 | Result |
| ----------- | --- | ----------- | ------ |
| true        | &&  | true        | true   |
| true        | &&  | false       | false  |
| false       | &&  | true        | false  |
| false       | &&  | false       | false  |

**OR**

If two statements are joined using _or_, the compound statement is true if any part is true.

| Statement 1 | OR   | Statement 2 | Result |
| ----------- | ---- | ----------- | ------ |
| true        | \|\| | true        | true   |
| true        | \|\| | false       | true   |
| false       | \|\| | true        | true   |
| false       | \|\| | false       | false  |

The code exemplifies the usage of boolean operators.

{% file src="../.gitbook/assets/Boolean-Java.pdf" %}
{% endtab %}

{% tab title="Methods" %}
Here's a simple example of how you can call a class in the main method and create an object from the class to call a method:

```java
class ExampleClass {
  void methodToCall() {
    System.out.println("This is a method in the ExampleClass");
  }
}

public class Main {
  public static void main(String[] args) {
    ExampleClass exampleObject = new ExampleClass();
    exampleObject.methodToCall();
  }
}
```

In this example, we have a class named `ExampleClass` which has a method named `methodToCall`. In the main method, we create an object of the `ExampleClass` using the `new` operator and store it in a variable `exampleObject`. Finally, we call the `methodToCall` method on the `exampleObject` using the dot (`.`) operator.

Here's how the output of the program would look like:

```java
This is a method in the ExampleClassja
```



#### Imagine you have a toy box and inside that toy box, you have many toys. Each toy has its own name and it can do different things, like singing a song or flashing light.

Now, you want to play with one of the toys in your toy box. To do that, you need to take that toy out of the toy box and make it ready to play with. This process is similar to creating an object from a class and calling a method on that object.

In computer programming, the toy box is like a class, the toys inside it are like methods, and taking a toy out of the box and making it ready to play is like creating an object from a class.

Here's the simple example code to make it clear:

```java
class ToyBox {
  void play() {
    System.out.println("Playing with the toy!");
  }
}

public class Main {
  public static void main(String[] args) {
    ToyBox myToy = new ToyBox(); //taking a toy out of the toy box and making it ready to play
    myToy.play(); // playing with the toy
  }
}
```

When you run the program, it will display the message "Playing with the toy!" on the screen, just like you played with the toy in your toy box.

I hope this helps to understand the concept of calling a class in the main method and creating an object from the class to call a method.



Let's break down the example code I gave earlier:

```csharp
class ToyBox {
  void play() {
    System.out.println("Playing with the toy!");
  }
}
```

The first line `class ToyBox` defines the beginning of a class, and the name of the class is `ToyBox`.

The next line `void play()` defines a method named `play` in the `ToyBox` class. The keyword `void` is the return type of the method, which means that this method doesn't return any value. The code inside the curly braces `{}` is the body of the method, and it contains a single line of code that prints the message "Playing with the toy!".

Now, let's look at the main method:

```typescript
public class Main {
  public static void main(String[] args) {
    ToyBox myToy = new ToyBox();
    myToy.play();
  }
}
```

The first line `public class Main` defines the beginning of the `Main` class. The keyword `public` makes the class accessible from other classes.

The next line `public static void main(String[] args)` defines the main method, which is the entry point of the Java program. The keyword `public` makes the method accessible from other classes, the keyword `static` means that this method belongs to the class and can be called without creating an object, and the keyword `void` is the return type of the method. The method takes an array of `String` arguments and it is accessible through the `args` parameter.

In the body of the main method, we have two lines of code:

```scss
ToyBox myToy = new ToyBox();
myToy.play();
```

The first line `ToyBox myToy = new ToyBox();` creates an object of the `ToyBox` class and assigns it to the variable `myToy`. The keyword `new` is used to create an object, and `ToyBox` is the name of the class that we want to create an object from.

The second line `myToy.play();` calls the `play` method on the `myToy` object. We use the dot (`.`) operator to access the `play` method of the `myToy` object.

So, when you run the program, it will create an object of the `ToyBox` class, call the `play` method on that object, and display the message "Playing with the toy!" on the screen.
{% endtab %}

{% tab title="Objects" %}
Arrays are a simple data structure for storing lots of similar items. They exist in all programming languages, and are used as the basis for most other data structures. On their own, Arrays can be used to solve many interesting problems. Arrays come up very often in interview problems, and so being a guru with them is a must!\


After completing this [Explore Card](https://leetcode.com/explore/featured/card/fun-with-arrays/) on Arrays, you will understand:

* What an Array is.
* Basic properties of Arrays.
* Implementing basic Array operations.
* Simple programming techniques with Arrays.\

{% endtab %}

{% tab title="Arrays" %}

{% endtab %}

{% tab title="Text Processing " %}

{% endtab %}
{% endtabs %}
