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
