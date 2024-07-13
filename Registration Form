import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Practical 8 : WAP to prepare registration form of students in which add following 
 * information like student no, name, address, phone no, gender, hobbies, city, college etc. 
 *  and click on submitbutton all information should be display on Applet.
 * @author Kush
 * Division : Q-C
 * Batch : Q-C1
 */
public class AJP_pr8_QC1 extends Applet implements ActionListener {
    // Declare the components
    TextField studentNo, name, address, phoneNo, city, college;
    Checkbox male, female;
    CheckboxGroup genderGroup;
    List hobbies;
    Button submitButton;
    TextArea displayArea;

    public void init() {
        // Set layout
        setLayout(new FlowLayout());

        // Initialize components
        Label studentNoLabel = new Label("Student No:");
        studentNo = new TextField(20);

        Label nameLabel = new Label("Name:");
        name = new TextField(20);

        Label addressLabel = new Label("Address:");
        address = new TextField(20);

        Label phoneNoLabel = new Label("Phone No:");
        phoneNo = new TextField(20);

        Label genderLabel = new Label("Gender:");
        genderGroup = new CheckboxGroup();
        male = new Checkbox("Male", genderGroup, false);
        female = new Checkbox("Female", genderGroup, false);

        Label hobbiesLabel = new Label("Hobbies:");
        hobbies = new List(4, true);
        hobbies.add("Gamming");
        hobbies.add("Codding");
        hobbies.add("Music");

        Label cityLabel = new Label("City:");
        city = new TextField(20);

        Label collegeLabel = new Label("College:");
        college = new TextField(20);

        submitButton = new Button("Submit");
        displayArea = new TextArea(10, 40);

        // Add components to the applet
        add(studentNoLabel);
        add(studentNo);
        add(nameLabel);
        add(name);
        add(addressLabel);
        add(address);
        add(phoneNoLabel);
        add(phoneNo);
        add(genderLabel);
        add(male);
        add(female);
        add(hobbiesLabel);
        add(hobbies);
        add(cityLabel);
        add(city);
        add(collegeLabel);
        add(college);
        add(submitButton);
        add(displayArea);

        // Add action listener to the submit button
        submitButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // Gather all the information and display it in the TextArea
        String studentInfo = "Student No: " + studentNo.getText() + "\n";
        studentInfo += "Name: " + name.getText() + "\n";
        studentInfo += "Address: " + address.getText() + "\n";
        studentInfo += "Phone No: " + phoneNo.getText() + "\n";
        studentInfo += "Gender: " + (male.getState() ? "Male" : "Female") + "\n";
        studentInfo += "Hobbies: ";

        for (String hobby : hobbies.getSelectedItems()) {
            studentInfo += hobby + " ";
        }
        studentInfo += "\n";
        studentInfo += "City: " + city.getText() + "\n";
        studentInfo += "College: " + college.getText() + "\n";

        displayArea.setText(studentInfo);
    }
}
