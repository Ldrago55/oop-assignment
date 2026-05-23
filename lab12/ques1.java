// package assignment.lab12;

import java.awt.*;

/**
 * ques1
 */
public class ques1 {

  public static void main(String[] args) {
    Frame f = new Frame("Three Buttons");

    Button b1 = new Button("Button1");
    Button b2 = new Button("Button2");
    Button b3 = new Button("Button3");
    b1.setBounds(50, 80, 80, 30);
    b2.setBounds(150, 80, 80, 30);
    b3.setBounds(250, 80, 80, 30);

    f.add(b1);
    f.add(b2);
    f.add(b3);

    f.setSize(400, 200);
    f.setLayout(null);
    f.setVisible(true);
  }
}
