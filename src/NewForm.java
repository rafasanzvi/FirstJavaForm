import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewForm extends JFrame {
    //The form inputs, labels, inputs and buttons
    private JTextField tfFirstName;
    private JTextField tfLastName;
    private JButton bntOK;
    private JButton btnClear;
    private JLabel IbWelcome;
    private JPanel mainPanel;

    //Constructor
    public NewForm() {
        setContentPane(mainPanel);
        setTitle("Welcome");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        //The listener to button OK
        bntOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = tfFirstName.getText();
                String secondName = tfLastName.getText();
                IbWelcome.setText("Welcome " + firstName + " " + secondName);
            }
        });

        //The listener to button clear
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstName.setText("");
                tfLastName.setText("");
                IbWelcome.setText("");
            }
        });
    }

    public static void main(String[] args) {
        NewForm newForm = new NewForm();
    }
}
