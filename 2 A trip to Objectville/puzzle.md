## Puzzle (page 44)
###### Answer

```java
public class EchoTestDrive {
  public static void main(String[] args) {
    Echo e1 = new Echo();
    Echo e2 = new Echo();// blank line
    int x = 0;
    while (x < 4) { // blank line
      e1.hello();
      e1.count = e1.count + 1;// blank line
      if (x == 4) { // blank line
        e2.count = e2.count + 1;
      }
      if (x < 5) { // blank line
        e2.count = e2.count + e1.count;
      }
      x = x + 1;
    }
    System.out.println(e2.count);
  }
}

class Echo { // blank line
  int count = 0; // blank line
  void hello() { // blank line
    System.out.println("hello... ");
  }
}
```
