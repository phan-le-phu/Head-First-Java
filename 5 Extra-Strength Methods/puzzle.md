## puzzle: JavaCross (page 120)
###### Answer

1. implement
2. pre
3. method
4. for
5. operator
6. expression/extreme
7. intialize
8. loop
9. set
10. return
11. pseudocode
12. decrement
13. cast
14. iteration
15. api
16. java.io
17. element
18. variable
19. arg
20. java.lang
21. virtual
22. integer
23. post
24. math
25. boolean
26. run
27. one
28. parseInt
29. break

## Mixed Messages (page 121)
###### Answer

```java
class MixFor5 {
  public static void main(String[] args) {
    int x = 0;
    int y = 30;
    for (int outer = 0; outer < 3; outer++) {
      for (int inter = 4; inter > 1; inter--) {
        // begin candidate code
        x = x + 3;
        // end candidate code
        y = y - 2;
        if (x == 6) {
          break;
        }
        x = x + 3;
      }
      y = y - 2;
    }
    System.out.println(x + " " + y);
  }
}
// Output: 54 6
```

```java
class MixFor5 {
  public static void main(String[] args) {
    int x = 0;
    int y = 30;
    for (int outer = 0; outer < 3; outer++) {
      for (int inter = 4; inter > 1; inter--) {
        // begin candidate code
        x = x + 6;
        // end candidate code
        y = y - 2;
        if (x == 6) {
          break;
        }
        x = x + 3;
      }
      y = y - 2;
    }
    System.out.println(x + " " + y);
  }
}
// Output: 60 10
```

```java
class MixFor5 {
  public static void main(String[] args) {
    int x = 0;
    int y = 30;
    for (int outer = 0; outer < 3; outer++) {
      for (int inter = 4; inter > 1; inter--) {
        // begin candidate code
        x = x + 2;
        // end candidate code
        y = y - 2;
        if (x == 6) {
          break;
        }
        x = x + 3;
      }
      y = y - 2;
    }
    System.out.println(x + " " + y);
  }
}
// Ouput: 45 6
```

```java
class MixFor5 {
  public static void main(String[] args) {
    int x = 0;
    int y = 30;
    for (int outer = 0; outer < 3; outer++) {
      for (int inter = 4; inter > 1; inter--) {
        // begin candidate code
        x++;
        // end candidate code
        y = y - 2;
        if (x == 6) {
          break;
        }
        x = x + 3;
      }
      y = y - 2;
    }
    System.out.println(x + " " + y);
  }
}
// Ouput: 36 6
```

```java
class MixFor5 {
  public static void main(String[] args) {
    int x = 0;
    int y = 30;
    for (int outer = 0; outer < 3; outer++) {
      for (int inter = 4; inter > 1; inter--) {
        // begin candidate code
        x--;
        // end candidate code
        y = y - 2;
        if (x == 6) {
          break;
        }
        x = x + 3;
      }
      y = y - 2;
    }
    System.out.println(x + " " + y);
  }
}
// Ouput: 18 6
```

```java
class MixFor5 {
  public static void main(String[] args) {
    int x = 0;
    int y = 30;
    for (int outer = 0; outer < 3; outer++) {
      for (int inter = 4; inter > 1; inter--) {
        // begin candidate code
        x = x + 0;
        // end candidate code
        y = y - 2;
        if (x == 6) {
          break;
        }
        x = x + 3;
      }
      y = y - 2;
    }
    System.out.println(x + " " + y);
  }
}
// Ouput: 6 14
```
