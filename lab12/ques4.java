// package assignment.lab12;

import java.awt.*;

/**
 * ques4
 */
public class ques4 extends Frame {

  Label l1, l2, l3;
  TextField t1, t2, t3;
  Button b1, b2;

  ques4() {
    // labels
    l1 = new Label("First Name");
    l2 = new Label("Last Name");
    l3 = new Label("Date of Birth");

    // TextFields
    t1 = new TextField();
    t2 = new TextField();
    t3 = new TextField();

    // Buttons
    b1 = new Button("Submit");
    b2 = new Button("Reset");

    add(l1);
    add(t1);

    add(l2);
    add(t2);

    add(l3);
    add(t3);

    add(b1);
    add(b2);

    setTitle("simple form");
    setSize(400, 200);
    setLayout(new GridLayout(4, 2, 10, 10));
    setVisible(true);
  }

  public static void main(String[] args) {
    new ques4();
  }
}
