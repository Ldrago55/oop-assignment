// package assignment.lab12;

import java.awt.*;

/**
 * ques2
 */
public class ques2 {

  public static void main(String[] args) {
    Frame f = new Frame("Different colored text");

    Label lbl1 = new Label("hello");
    lbl1.setForeground(Color.RED);
    Label lbl2 = new Label("hello");
    lbl2.setForeground(Color.GREEN);
    Label lbl3 = new Label("hello");
    lbl3.setForeground(Color.BLUE);

    f.add(lbl1);
    f.add(lbl2);
    f.add(lbl3);

    f.setSize(400, 200);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
  }
}
