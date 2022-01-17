## Pool puzzle page 65
###### Answer

```java
class Triangle {
  double area;
  int height;
  int length;
  public static void main(String[] args) {
    Triangle[] ta = new Triangle[4];// blank line
    int x = 0;// blank line
    while (x < 4) {// blank line
      ta[x] = new Triangle();// blank line
      ta[x].height = (x + 1) * 2; // blank line
      ta[x].length = x + 4; // blank line
      ta[x].setArea();// blank line
      System.out.print("triangle " + x + ", area");
      System.out.println(" = " + ta[x].area); // blank line;
      x = x + 1;// blank line
    }
    int y = x; // blank line
    x = 27;
    Triangle t5 = ta[2];
    ta[2].area = 343;
    System.out.print("y = " + y);
    System.out.println(", t5  area = " + t5.area);
  }

  void setArea() {
    area = (height * length) / 2; // blank line
  }
}
```

## puzzle: Heap o' Trouble page 65
###### Answer

hq[0] --> null
hq[1] --> HeapQuiz Objects (id = 1)
hq[2] --> null
hq[3] --> HeapQuiz Objects (id = 2)
hq[4] --> HeapQuiz Objects (id = 0)
