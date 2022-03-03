## Who Am I (page 394)
###### Answer

I got the whole GUI, in my hands: frame <br>
Every event type has one of these: source event, event listener <br>
The listener's key method: actionPerformed, controlChange <br>
This method gives JFrame its size: setSize <br>
You add code to this method but never call it: actionPerformed, controllchange, event handler <br>
When the user actually does something, it's an: event <br>
Most of these are event sources: button, check box, text field, ... <br>
I carry data back to the listener: event object <br>
An addXxxListener() method says an object is an: event source <br>
How a listener signs up: addXxxListener <br>
The method where all the graphics code goes: paintComponent <br>
I'm typically bound to an intance: inner instance <br>
The 'g' in (Graphics g), is really of class: Graphics2d <br>
The method that gets paintComponent rolling: repaint <br>
The package where most of the Swinger reside: javax.swing <br>

## Be the Compiler
###### Answer

```java
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class InnerButton {
  JFrame frame;
  JButton b;

  public static void main(String[] args) {
    InnerButton gui = new InnerButton();
    gui.go();
  }

  public void go() {
    frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    b = new JButton("A");
    b.addActionListener(new Blistener());

    frame.getContentPane().add(BorderLayout.SOUTH, b);
    frame.setSize(200, 100);
    frame.setVisible(true);
  }

  class Blistener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      if (b.getText().equals("A")) {
        b.setText("B");
      } else {
        b.setText("A");
      }
    }
  }
}
```




