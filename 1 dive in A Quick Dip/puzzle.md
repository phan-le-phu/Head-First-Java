## puzzle (Page 22)
###### Answer
1. float
2. void
3. public
4. java
5. arrays
6. loop
7. while
8. branch
9. dc
10. compiler
11. variable
12. int
13. ic/it
14. systemoutprint
15. static
16. main
17. method
18. string
19. declare
20. JVM
21. command

## puzzle (Page 23)
###### Answer

```java
class Test {
  public static void main(String[] args) {
    int x = 0;
    int y = 0;
    while (x < 5) {
      // Begin candidate
      y = x - y;
      // End candidate
      System.out.print(x + "" + y + " ");
      x = x + 1;
    }
  }
}

// Output: 00 11 21 32 42

```

```java
class Test {
  public static void main(String[] args) {
    int x = 0;
    int y = 0;
    while (x < 5) {
      // Begin candiate
      y = y + x;
      // End candiate
      System.out.print(x + "" + y + " ");
      x = x + 1;
    }
  }
}

// Output: 00 11 23 35 410

```

```java
class Test {
  public static void main(String[] args) {
    int x = 0;
    int y = 0;
    while (x < 5) {
      // Begin candiate
      y = y + 2;
      if (y > 4) {
        y = y - 1;
      }
      // End candiate
      System.out.print(x + "" + y + " ");
      x = x + 1;
    }
  }
}

// Output: 02 14 25 36 47
```

```java
class Test {
  public static void main(String[] args) {
    int x = 0;
    int y = 0;
    while (x < 5) {
      // Begin candiate
      x = x + 1;
      y = y + x;
      // End candiate
      System.out.print(x + "" + y + " ");
      x = x + 1;
    }
  }
}

// Output: 11 34 59 
```

```java
class Test {
  public static void main(String[] args) {
    int x = 0;
    int y = 0;
    while (x < 5) {
      // Begin candiate
      if (y < 5) {
        x = x + 1;
        if (y < 3) {
          x = x - 1;
        }
      }
      y = y + 2; 
      // End candiate
      System.out.print(x + "" + y + " ");
      x = x + 1;
    }
  }
}

// Output: 02 14 36 48 
```

## puzzle (Page 24)
###### Answer

```java
class PoolPuzzleOne {
  public static void main(String[] args) {
    int x = 0;

    while (x < 4){ // blank line
    System.out.print("a"); // blank line
    if (x < 1) {
      System.out.print(" "); // blank line
    }
    System.out.print("n"); // blank line
    if (x > 1) { // blank line
      System.out.print(" oyster"); // blank line
      x = x + 2; // blank line
    }
    if (x == 1) {
      System.out.print("noys"); // blank line
    }
    if (x < 1) { // blank line
      System.out.print("oise"); // blank line
    }
    System.out.println("");
    x = x + 1; // blank line

    }
  }
}
```

