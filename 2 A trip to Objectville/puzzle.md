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

## Puzzle (page 45)
###### Answer

I am compiled from a .java file: class
My instance varible values can be different from my buddys' value: Object
I behave like a template: class
I like to do stuff: method, object
I can have many methods: class, object
I represent 'state': instance varible
I have behaviors: class, object
I am located in objects: method, instance variable
I live on the heap: object
I am used to create object instances: class
My state can change: object, instance variable
I declare methods: class
I can change at runtime: object, instance variable

