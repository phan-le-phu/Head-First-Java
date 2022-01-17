## Page 90
###### Answer

```java
public class Mix4 {
  int counter = 0;
  public static void main(String[] args) {
    int count = 0;
    Mix4[] m4a = new Mix4[20];
    int x = 0;
    while (x < 9){ // blank line
      m4a[x] = new Mix4();
      m4a[x].counter = m4a[x].counter + 1;
      count = count + 1;
      count = count + m4a[x].mybeNew(x);
      x = x + 1;
    } 
    System.out.println(count + " " + m4a[1].counter);
  }

  public int mybeNew(int index) {
    if (index < 5) { // blank line
      Mix4 m4 = new Mix4();
      m4.counter = m4.counter + 1;
      return 1;
    }
    return 0;
  }
}
// Output: 14 1
```
```java
public class Mix4 {
  int counter = 0;
  public static void main(String[] args) {
    int count = 0;
    Mix4[] m4a = new Mix4[20];
    int x = 0;
    while (x < 20){ // blank line
      m4a[x] = new Mix4();
      m4a[x].counter = m4a[x].counter + 1;
      count = count + 1;
      count = count + m4a[x].mybeNew(x);
      x = x + 1;
    } 
    System.out.println(count + " " + m4a[1].counter);
  }

  public int mybeNew(int index) {
    if (index < 5) { // blank line
      Mix4 m4 = new Mix4();
      m4.counter = m4.counter + 1;
      return 1;
    }
    return 0;
  }
}
// Output: 25 1
```

```java
public class Mix4 {
  int counter = 0;
  public static void main(String[] args) {
    int count = 0;
    Mix4[] m4a = new Mix4[20];
    int x = 0;
    while (x < 7){ // blank line
      m4a[x] = new Mix4();
      m4a[x].counter = m4a[x].counter + 1;
      count = count + 1;
      count = count + m4a[x].mybeNew(x);
      x = x + 1;
    } 
    System.out.println(count + " " + m4a[1].counter);
  }

  public int mybeNew(int index) {
    if (index < 7) { // blank line
      Mix4 m4 = new Mix4();
      m4.counter = m4.counter + 1;
      return 1;
    }
    return 0;
  }
}
// Output: 14 1
```

```java
public class Mix4 {
  int counter = 0;
  public static void main(String[] args) {
    int count = 0;
    Mix4[] m4a = new Mix4[20];
    int x = 0;
    while (x < 19){ // blank line
      m4a[x] = new Mix4();
      m4a[x].counter = m4a[x].counter + 1;
      count = count + 1;
      count = count + m4a[x].mybeNew(x);
      x = x + 1;
    } 
    System.out.println(count + " " + m4a[1].counter);
  }

  public int mybeNew(int index) {
    if (index < 1) { // blank line
      Mix4 m4 = new Mix4();
      m4.counter = m4.counter + 1;
      return 1;
    }
    return 0;
  }
}
// Output: 20 1
```

## Page 91
###### Answer

```java
public class Puzzle4 {
  public static void main(String[] args) {
    Puzzle4b[] obs = new Puzzle4b[6];// blank line
    int y = 1;
    int x = 0;
    int result = 0;
    while (x < 6) {
      obs[x] = new Puzzle4b();// blank line
      obs[x].ivar = y;// blakn line
      y = y * 10;
      x = x + 1;// blank line
    }
    x = 6;
    while (x > 0) {
      x = x - 1;// blank line
      result = result + obs[x].doStuff(x); // blank line
    }
    System.out.println("result " + result);
  }
}

class Puzzle4b { // blank line
  int ivar;
  public int doStuff(int factor) {// blank line
    if (ivar > 100) {
      return ivar * factor; // blank line
    } else {
      return ivar * (5 - factor);// blank line
    }
  }
}
```
