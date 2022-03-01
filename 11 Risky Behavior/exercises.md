## True or False exercise (Page 348)
###### Answer

1. ~~A try block must be followed by a catch and a finally block.~~
2. ~~If you write a method that might cause a compiler-checked exception, you must wrap that risky code in a try/catch block.~~
3. Catch blocks can be polymorphic.
4. ~~Only 'compiler checked' exceptions can be caugth.
5. If you define a try/catch block, a matching finally block is optional.
6. If you define a try block, you can pair it with a matching catch or finally block, or both.
7. ~~If you write a method that declares that it can throw a compiler -checked exeption, you must also wrap the exception throwing code in a try/catch block.~~
8. The main() method in your program must handle all unhandled exceptions thrown to it.
9. A single try block can have many different catch blocks.
10. ~~A method can only throw one kind of exception.~~
11. A finally block will run regardless of whether an exception is thrown.
12. ~~A finally block can exist without a try block.~~
13. ~~A try block can exist by itself, without a catch block or a finally block.
14. Handling an exception is sometimes referenced to as 'ducking'.
15. ~~The order of catch blocks never matters.
16. A method with a try block and finally block, can optionally decalre the exception.
17. Runetime exceptions must be handld or declared.

## Code Magnets exercise (Page 349)
###### Answer

```java
class MyEx extends Exception {}

public class ExTestDrive {

  static void doRisky(String t) throws MyEx {
    System.out.print("h");

    if ("yes".equals(t)) {
      System.out.print("a");
    } else {
      throw new MyEx();
    }
  }

  public static void main(String[] args) {
    String test = args[0];
    
    System.out.print("t");

    try {
      doRisky(test);
    } catch (MyEx e) {
      System.out.print("r");
      System.out.print("o");
    } finally {
      System.out.print("w");
      System.out.println("s");
    }

  }
}
```

