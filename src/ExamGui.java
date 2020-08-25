import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExamGui {

    private static ExamAnswer answer = new ExamAnswer();
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }


        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
            c.fill = GridBagConstraints.HORIZONTAL;
        }

        //1
        JLabel label1 = new JLabel("Enter last 3 digit of Student Id: ");
        if (shouldWeightX) {
            c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 0;
        pane.add(label1, c);

        JTextField textField1 = new JTextField("001",10);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 0;
        pane.add(textField1, c);


        //3
        JLabel label2 = new JLabel("Question 1(a): ");
        if (shouldWeightX) {
            c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(label2, c);

        JTextField textField2 = new JTextField("172",10);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 2;
        pane.add(textField2, c);

        //4
        JLabel label3 = new JLabel("Question 1(b): ");
        if (shouldWeightX) {
            c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 3;
        pane.add(label3, c);

        JTextField textField3 = new JTextField("10",10);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 3;
        pane.add(textField3, c);

        //5
        JLabel label4 = new JLabel("Question 2(a): ");
        if (shouldWeightX) {
            c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 4;
        pane.add(label4, c);

        JTextField textField4 = new JTextField("10",50);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 4;
        pane.add(textField4, c);

        //6
        JLabel label5 = new JLabel("Question 2(b): ");
        if (shouldWeightX) {
            c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 5;
        pane.add(label5, c);

        JTextField textField5 = new JTextField("10,12",50);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 5;
        pane.add(textField5, c);

        //7
        JLabel label6 = new JLabel("Question 3(a): ");
        if (shouldWeightX) {
            c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 6;
        pane.add(label6, c);

        JTextField textField6 = new JTextField("0",30);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 6;
        pane.add(textField6, c);

        //8
        JLabel label7 = new JLabel("Question 3(b): ");
        if (shouldWeightX) {
            c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 7;
        pane.add(label7, c);

        JTextField textField7 = new JTextField("0",10);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 7;
        pane.add(textField7, c);

        //9
        JLabel label8 = new JLabel("Question 4: ");
        if (shouldWeightX) {
            c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
        c.gridy = 8;
        pane.add(label8, c);

        JTextField textField8 = new JTextField("0",10);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 8;
        pane.add(textField8, c);

        //2
        JButton button = new JButton("Submit");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 1;
        c.gridy = 1;
        pane.add(button, c);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input = textField1.getText();//id
                int id = Integer.parseInt(input);
                answer.setId(id);
                answer.process();
                textField2.setText(answer.getOne_a());
                textField3.setText(answer.getOne_b());
                textField4.setText(answer.getTwo_a());
                textField5.setText(answer.getTwo_b());
                textField6.setText(answer.getThree_a());
                textField7.setText(answer.getThree_b());
                textField8.setText(answer.getFour());
            }
        });

    }

    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Exam Evaluation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);

        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
