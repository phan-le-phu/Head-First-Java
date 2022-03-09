import java.util.*;


public class ShortMountains {
  LinkedList<Mountain> mtn = new LinkedList<Mountain>();

  class NameCompare implements Comparator<Mountain> {
    public int compare(Mountain one, Mountain two) {
      return one.name.compareTo(two.name);
    }
  }

  class HeightCompare implements Comparator<Mountain> {
    public int compare(Mountain one, Mountain two) {
      return (two.height - one.height);
    }
  }

  public static void main(String[] args) {
    new ShortMountains().go();
  }

  public void go() {

    this.mtn.add(new Mountain("Longs", 14255));
    this.mtn.add(new Mountain("Elbert", 14433));
    this.mtn.add(new Mountain("Maroon", 14156));
    this.mtn.add(new Mountain("Castle", 14265));

    System.out.println("as entered:\n" + mtn);
    NameCompare nc = new NameCompare();
    Collections.sort(mtn, nc);
    System.out.println("by name:\n" + mtn);

    HeightCompare hc = new HeightCompare();
    Collections.sort(mtn, hc);
    System.out.println("by height:\n" + mtn);
    

  }

}

class Mountain {
  String name;
  int height;

  public Mountain(String n, int h) {
    this.name = n;
    this.height = h;
  }

  public String toString() {
    return name + " " + height;
  }
}
