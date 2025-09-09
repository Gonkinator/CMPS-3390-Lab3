import javax.swing.*;

public class StudentGUI extends JFrame {
    private JPanel panel1;
    private JList studentList;
    private JPanel studentInput;
    private JLabel labelFIrstName;
    private JTextField inputFirstName;
    private JLabel labelLastName;
    private JTextField inputLastName;
    private JLabel labelStudentID;
    private JTextField inputStudentID;
    private JPanel studentActions;
    private JButton buttonAddStudent;
    private JButton buttonRemoveStudent;

    public StudentGUI(){
        setContentPane(panel1);
        setSize(500, 500 );
        setTitle("Student List");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
