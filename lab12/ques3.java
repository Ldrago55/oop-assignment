// package assignment.lab12;

import java.awt.*;

/**
 * ques3
 */
public class ques3 {

  public static void main(String[] args) {
    Frame f = new Frame("radio button");

    CheckboxGroup group = new CheckboxGroup();
    Checkbox male = new Checkbox("male", group, false);
    Checkbox female = new Checkbox("female", group, false);

    f.add(male);
    f.add(female);

    f.setSize(400, 200);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
  }
}
