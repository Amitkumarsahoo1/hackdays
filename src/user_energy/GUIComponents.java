package user_energy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import user_energy.*;
/**
 * Created by on 3/30/2016.
 */

public class GUIComponents extends JFrame{
    private JFrame mainFrame;
    private JPanel container, topPanel, middlePanel, bottomPanel;
    private JButton btn;

    Dimension size;
    Insets insets;

    //Top Panel Items : 4 Text Fields, one password field
    JTextField username_field, height_field, expected_average_weight_field, PAL_level_field;
    JPasswordField passwordfield;
    JComboBox physical_activity_level_field, age_group_field;
    JButton login_button;
    JRadioButton male_radio, female_radio;
    JLabel username_label, password_label, height_label, expected_average_weight_label, physical_activity_level_label, PAL_level_label, age_group_label;

    //Middle Panel Items :Textarea
    JTextArea textArea;

    //Bottom Panel Items :Load Data Button, Display Energy Button,clear, Quit
    JButton load_data, display_energy, clear, quit;

    public GUIComponents() {
        prepareGUI();
    }

    public static void main(String[] args) {
        try {
            GUIComponents guiComponents = new GUIComponents();
            guiComponents.addTopPanel();
            guiComponents.addMiddlePanel();
            guiComponents.addBottomPanel();
            guiComponents.buttonActions();
            guiComponents.textFieldDataChange();
            guiComponents.showGUI();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void prepareGUI() {

        mainFrame = new JFrame();//creating instance of JFrame
        //mainFrame.setSize(850,500);//850 width and 500 height
        insets = mainFrame.getInsets();
        mainFrame.setSize(724 + insets.left + insets.right,
                426 + insets.top + insets.bottom);
        mainFrame.setBackground(Color.darkGray);
        mainFrame.setLocation(120, 120);

        container = new JPanel();
        container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
    }

    private void addTopPanel() {

        topPanel = new JPanel();
        insets = topPanel.getInsets();

        container.add(topPanel);
        topPanel.setLayout(null);

        //Creating Labels
        username_label = new JLabel("User Name");
        password_label = new JLabel("Password");
        height_label = new JLabel("Height");
        expected_average_weight_label = new JLabel("Expected Average Weight");
        physical_activity_level_label = new JLabel("Physical Activity Label (PAL)");
        PAL_level_label = new JLabel("PAL level");
        age_group_label = new JLabel("Age Group");

        //Creating JTextFields
        username_field = new JTextField();
        height_field = new JTextField();
        expected_average_weight_field = new JTextField();
        PAL_level_field = new JTextField();

        //Creating password Fields
        passwordfield = new JPasswordField();

        //Creating combo boxes
        physical_activity_level_field = new JComboBox();
        age_group_field = new JComboBox();

        //Creating Login Button
        login_button = new JButton("Login");

        //Creating Radio Buttons
        male_radio = new JRadioButton("Male");
        female_radio = new JRadioButton("Female");

        // Adding Labels
        topPanel.add(username_label);
        topPanel.add(password_label);
        topPanel.add(height_label);
        topPanel.add(expected_average_weight_label);
        topPanel.add(physical_activity_level_label);
        topPanel.add(PAL_level_label);
        topPanel.add(age_group_label);

        //Adding JTextFields
        topPanel.add(username_field);
        topPanel.add(height_field);
        topPanel.add(expected_average_weight_field);
        topPanel.add(PAL_level_field);

        //Adding Password Field
        topPanel.add(passwordfield);

        //Adding Login Button
        topPanel.add(login_button);

        //Adding Radio buttons
        topPanel.add(male_radio);
        topPanel.add(female_radio);

        //Adding combo box
        topPanel.add(physical_activity_level_field);
        topPanel.add(age_group_field);
        //Now Positioning these elements row wise
        //Adding Labels to positions
        // 1. Label Elements and Input Elements in Row 1 : Username , Height and Expected Average Wight (height 20)
        //setBounds (left,top,width of element, height of element)


        size = username_label.getPreferredSize();
        username_label.setBounds(5 + insets.left, 25 + insets.top, size.width, size.height);
        username_field.setBounds(80 + insets.left, 25 + insets.top, 115, 22);

        size = height_label.getPreferredSize();
        height_label.setBounds(333 + insets.left, 25 + insets.top, size.width, size.height);
        height_field.setBounds(377 + insets.left, 25 + insets.left, 80, 22);

        size = expected_average_weight_label.getPreferredSize();
        expected_average_weight_label.setBounds(470 + insets.left, 25 + insets.top, size.width, size.height);
        expected_average_weight_field.setBounds(625 + insets.left, 25 + insets.top, 50, 22);

        // 2. Label Elements and Input Elements in Row 2 : Password , Physical Activity Level and PAL Level (height(70)
        size = password_label.getPreferredSize();
        password_label.setBounds(5 + insets.left, 65 + insets.top, size.width, size.height);
        passwordfield.setBounds(92 + insets.left, 65 + insets.top, 75, 22);

        size = physical_activity_level_label.getPreferredSize();
        physical_activity_level_label.setBounds(200 + insets.left, 70 + insets.top, size.width, size.height);
        physical_activity_level_field.setBounds(370 + insets.left, 70 + insets.top, 95, 22); // This is left

        size = PAL_level_label.getPreferredSize();
        PAL_level_label.setBounds(470 + insets.left, 70 + insets.top, size.width, size.height);
        PAL_level_field.setBounds(535 + insets.left, 70 + insets.top, 80, 22);

        // 3. Label Elements and Input Elements in Row 3 : Login button , Radio Button, age group
        size = login_button.getPreferredSize();
        login_button.setBounds(5 + insets.left, 110 + insets.top, size.width, size.height);

        //Creating a button group for male and femaile
        ButtonGroup bg = new ButtonGroup();
        bg.add(male_radio);
        bg.add(female_radio);

        size = male_radio.getPreferredSize();
        male_radio.setBounds(92 + insets.left, 110 + insets.top, size.width, size.height);

        size = female_radio.getPreferredSize();
        female_radio.setBounds(145 + insets.left, 110 + insets.top, size.width, size.height);

        //Add age group
        size = age_group_label.getPreferredSize();
        age_group_label.setBounds(225 + insets.left, 115 + insets.top, size.width, size.height);
        age_group_field.setBounds(310 + insets.left, 115 + insets.top, 75, 22);

        //topPanel.setBackground(Color.YELLOW);
        topPanel.setPreferredSize(new Dimension(724 + insets.left + insets.right, 190));


    }

    private void addMiddlePanel() {
        middlePanel = new JPanel();

        //creating and adding text area
        textArea = new JTextArea(10, 60);
        middlePanel.add(textArea);
        size = textArea.getPreferredSize();
        textArea.setBounds(20 + insets.left, 20 + insets.top, size.width, size.height);

        middlePanel.setPreferredSize(new Dimension(724 + insets.left + insets.right, 190));
        container.add(middlePanel);
    }

    private void addBottomPanel() {
        bottomPanel = new JPanel();
        //bottomPanel.setBackground(Color.darkGray);

        //creating and adding buttons
        load_data = new JButton("Load Data");
        display_energy = new JButton("Display Energy");
        clear = new JButton("Clear");
        quit = new JButton("Quit");

        bottomPanel.add(load_data);
        bottomPanel.add(display_energy);
        bottomPanel.add(clear);
        bottomPanel.add(quit);

        //Positioning these Items
        size = load_data.getPreferredSize();
        load_data.setBounds(insets.left, 40 + insets.top, size.width, size.height);

        size = display_energy.getPreferredSize();
        display_energy.setBounds(insets.left, 40 + insets.top, size.width, size.height);

        size = clear.getPreferredSize();
        clear.setBounds(insets.left, 40 + insets.top, size.width, size.height);

        size = quit.getPreferredSize();
        quit.setBounds(insets.left, 40 + insets.top, size.width, size.height);



        bottomPanel.setPreferredSize(new Dimension(724 + insets.left + insets.right, 46));
        container.add(bottomPanel);


    }

    String gender_selected = "not_selected";

    private void buttonActions() {

        //Set Buttons to disabled initially
        load_data.setEnabled(false);
        //Add action Listeners to Buttons and their functionality
        login_button.addActionListener(this::actionPerformed);
        load_data.addActionListener(this::actionPerformed);
        display_energy.addActionListener(this::actionPerformed);
        clear.addActionListener(this::actionPerformed);
        quit.addActionListener(this::actionPerformed);

        male_radio.addActionListener(this::actionPerformed);
        female_radio.addActionListener(this::actionPerformed);

        //When Age group is changed, calcilate bmr again!
        age_group_field.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                setExpectedAverageWeight();
            }
        });
        physical_activity_level_field.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                setExpectedAverageWeight();
            }
        });

    }

    private boolean verifyUserFieds() {
        try {
            //Verifying user input fields. username already verified.
            UserEnergyNeeds user_data = new UserEnergyNeeds();
            float height_value = Float.parseFloat(height_field.getText());
            int age_group_value_index = age_group_field.getSelectedIndex();


            if (!user_data.verifyHeightValue(height_value)) { // Cheking if Height value is between range 1.5 to 2.0
                System.out.println("Height out of Bounds");
                JOptionPane.showMessageDialog(null, "Please Enter height between 1.5 - 2.0 rounded off to one decimal place.");
                return false;
            } else if (!user_data.verifyAgeGroup(age_group_value_index)) {
                System.out.println("Age Group Not Selected");
                JOptionPane.showMessageDialog(null, "Select a Valid Age Group");
                return false;
            } else if (!user_data.verifyGenderSelected(gender_selected)) {
                System.out.println("Gender Not Selected");
                JOptionPane.showMessageDialog(null, "Please Select Gender");
                return false;
            }

        } catch (NullPointerException e2) {
            System.out.println("Enter fields" + e2.getMessage());
            return false;
        } catch (NumberFormatException e2) {
            System.out.println("Number format Exception" + e2.getMessage());
            JOptionPane.showMessageDialog(null, "Height is a number Value Field. Please enter height.");
            return false;
        } catch (Exception e2) {
            System.out.println("Exception Occoured" + e2.getMessage());
            return false;
        }
        return true;
    }

    private void actionPerformed(ActionEvent e) {
        if (e.getSource() == login_button) {
            LoginDetails loginDetails = new LoginDetails(username_field.getText(), passwordfield.getPassword());
            if (loginDetails.verifyLoginDetails())
                load_data.setEnabled(true);
            else {
                load_data.setEnabled(false);
                JOptionPane.showMessageDialog(null, "Invalid Login Credentials");
            }
        }
        if (e.getSource() == load_data) {
            System.out.print("Test");
            ReadCSVfile(new File("COIT20256Ass1Data.csv"));
        }
        if (e.getSource() == display_energy) {
            try{
            if (!load_data.isEnabled() )
                JOptionPane.showMessageDialog(null, "Please Load the Data First !");
            else if(loaded_dropdown_data && ((physical_activity_level_field.getSelectedIndex() == -1) || (age_group_field.getSelectedIndex() == -1)))
                JOptionPane.showMessageDialog(null, "Please Select a valid PAL and age group from dropdown");
            else if((physical_activity_level_field.getSelectedIndex()== -1) || (age_group_field.getSelectedIndex() == -1))
                JOptionPane.showMessageDialog(null, "Please Load data by clicking Load Data button!");
            else if (verifyUserFieds()) {
                    //on Click, first set PAL data and then set text field with energy requirement data

                    //Step 1: - set PAL value
                    PALdata paLdata = new PALdata(physical_activity_level_field.getSelectedItem().toString());
                    PAL_level_field.setText(paLdata.getPal().getValue()); // Set PAL value according to PAL Drop down select
                    String PAL_description=null;
                    String pal_value=null;
                    float user_energy=0.0f;

                    textArea.setText(null);
                    //Step 2 : set Text field Value. user_bmr already calculated from onkeylistner , nnow using that bmr to get energy requirements

                    for (Map.Entry<BMRData, ArrayList<PALdata>> entry : energy_set.entrySet()) {
                        BMRData key = entry.getKey();
                        ArrayList<PALdata> pal;
                        String local_key = gender_selected + "-" + age_group_field.getSelectedItem() + "-" + Float.parseFloat(height_field.getText()) + "-" + user_bmr + "-" + eaw;

                        if (key.toString().equals(local_key)) {
                            pal = entry.getValue();

                            PALdata pal2=pal.get(physical_activity_level_field.getSelectedIndex());
                            user_energy=pal2.getEnergy();
                            PAL user_pal_data= pal2.getPal();
                             PAL_description=user_pal_data.getDescription();
                             pal_value=user_pal_data.getValue();
                            System.out.println("Matched - -   " + key.toString() + "-" + pal2.getEnergy()+""+pal.isEmpty());

                        }
                        // do something with key and/or tab
                    }

                    textArea.append(userEnergyNeeds.getUserEnergyForDisplay(userEnergyNeeds.getName(),userEnergyNeeds.getAge_group(),PAL_description,pal_value,userEnergyNeeds.getHeight(),user_energy,eaw));
                    //Now Create a Hashmap key of BMRData type to get Expected Energy
                }
            }catch (NullPointerException e2){
                System.out.println("Exception Handled. User Clicked Display Energy button, without entering User Details "+e2.getMessage());
            }catch(Exception e2){
                System.out.println("Some Exception Occoured when User clicked display button. "+ e2.getMessage());
            }


        }
        if (e.getSource() == male_radio) {
            gender_selected = "Male";
            setExpectedAverageWeight();
        }
        if (e.getSource() == female_radio) {
            gender_selected = "Female";
            setExpectedAverageWeight();
        }
        if (e.getSource() == clear) {
            setTextFieldsNull();
            try {
                age_group_field.setSelectedIndex(-1);
                physical_activity_level_field.setSelectedIndex(-1);
                male_radio.setSelected(false);
                female_radio.setSelected(false);
            } catch (IllegalArgumentException e2) {
                System.out.println("Illegal Argument Exception. Argument Not Valid! This may be because clear is called before the data is loaded. this exception is handled ! No need to worry :)");
            } catch (Exception e3) {
                System.out.println("Exception Occoured while Clear is cliked ");
            }
        }
        if (e.getSource() == quit) {
            System.exit(0);
        }

    }

    private void setTextFieldsNull() {
        textArea.setText(null);
        height_field.setText(null);
        expected_average_weight_field.setText(null);
        PAL_level_field.setText(null);
    }

    private void textFieldDataChange() {
        username_field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                super.keyPressed(ke);
                load_data.setEnabled(false);
            }
        });
        passwordfield.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                super.keyPressed(ke);
                load_data.setEnabled(false);
            }
        });
        height_field.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                expected_average_weight_field.setText("");
                setExpectedAverageWeight();
            }

        });
    }

    float user_bmr = 0.0f;
    String eaw;
    UserEnergyNeeds userEnergyNeeds;
    private void setExpectedAverageWeight() {
        System.out.print("in code- EAW");

        try {

            //Step 2:- Get BMr by matching key from userdata and stored data
            for (Map.Entry<BMRData, Float> entry : bmr_by_user_details.entrySet()) {
                BMRData key = entry.getKey();
                String bmrkey = key.bmr_by_user_details_key();

                String local_key = gender_selected + "-" + age_group_field.getSelectedItem() + "-" + Float.parseFloat(height_field.getText());

                if (bmrkey.equals(local_key)) {
                    user_bmr = entry.getValue();
                    System.out.println("Bmr calculated");
                }
                // do something with key and/or tab
            }

            //Verifying user input fields. username already verified.
            UserEnergyNeeds user_data = new UserEnergyNeeds();
            float height_value = Float.parseFloat(height_field.getText());
            int age_group_value_index = age_group_field.getSelectedIndex();


            if (!user_data.verifyHeightValue(height_value)) { // Cheking if Height value is between range 1.5 to 2.0
                System.out.println("Expected Average Weight Will be calculated when Height Value is Set");
            } else if (!user_data.verifyAgeGroup(age_group_value_index)) {
                System.out.println("Expected Average Weight Will be calculated when Age Group is set");

            } else if (!user_data.verifyGenderSelected(gender_selected)) {
                System.out.println("Expected Average Weight Will be calculated when gender is Selected");
            } else {
                eaw = weight_by_height.get(height_value).toString();

                // Now we have to store user energy details
                /* 1. User- exxpected average weight
                   2. bmr corresponding to age group,gender,height. For this we will iterate through hashmap and match our key from user entered details with all they keys in hashmap. Corresponding value will be picked up.
                   3. PAL data - this is the PAL description, and the energy required by user.
                                    For calculating energy, we have to pass height,weight,age group,pal and bmr as key to get Energy Value
                                    The third step will be done when user clicks display energy button, hence moving the function- to display button click
                 */

                userEnergyNeeds = new UserEnergyNeeds(username_field.getText(),gender_selected,age_group_field.getSelectedItem().toString(),Float.parseFloat(height_field.getText()));
                userEnergyNeeds.setExpected_average_weight(Float.parseFloat(eaw)); // setting expected average weight - Step 1

                expected_average_weight_field.setText(eaw);

            }

        } catch (NumberFormatException e2) {
            System.out.println("Number format Exception" + e2.getMessage());
        } catch (Exception e) {
            System.out.println("Exception Occoured! Handeled " + e.getMessage());
        }
    }

    private String[] OneRow;
    protected Set<String> age_group_list = new HashSet<String>();
    Map<BMRData, ArrayList<PALdata>> energy_set;
    Map<Float, Float> weight_by_height;
    Map<BMRData, Float> bmr_by_user_details;
    boolean loaded_dropdown_data=false;
    String physical_activity_level_array[] = {"bed rest", "very sedentary", "light", "moderate", "heavy", "vigorous"};



    public void ReadCSVfile(File DataFile) {

        ArrayList<PALdata> paLdatas = new ArrayList<PALdata>();

        energy_set = new HashMap<BMRData, ArrayList<PALdata>>();
        weight_by_height = new HashMap<Float, Float>();
        bmr_by_user_details = new HashMap<BMRData, Float>();

        PALdata paldata;
        BMRData bmrkey_energy, bmrkey_bmr;
        EnergyData energy = new EnergyData();
        try {
            BufferedReader brd = new BufferedReader(new FileReader(DataFile));
            int count = 0, pal_count = 0;
            String st;
            while ((st = brd.readLine()) != null) {
                count++;
                if (count > 2) { // We are skipping first two lines of File. It has heading which is not relevant (because we know the positions). Reading Data from third Line
                    OneRow = st.split(",|\\s|;");

                    //Age Group :- Adding Non Duplicates data (via Using Set Data structure) and not including blanks
                    age_group_list.add(OneRow[0]);
                    age_group_list.removeAll(Collections.singleton(null));

                    //Data Structure for Weight by height. We need not worry of duplicate keys, since Hashmap replaces old key-value pair with new key-value pair (if key is duplicate). Here Key-value (i.e. Height -weight) pair has same data for 2 groups and hence repeating.
                    weight_by_height.put(Float.parseFloat(OneRow[1]), Float.parseFloat(OneRow[2]));

                    //Energy Set Data structure
                    //1. Male Data set Group age_group,  height,  weight, gender,  bmr
                    bmrkey_energy = new BMRData(OneRow[0], Float.parseFloat(OneRow[1]), Float.parseFloat(OneRow[2]), "Male", Float.parseFloat(OneRow[3]));
                    for (pal_count = 0; pal_count < 6; pal_count++) { // 6 categories bed rest,very sedentary,light,moderate,heavy,vigorous
                        //Constructor -> description,energy
                        paldata = new PALdata(physical_activity_level_array[pal_count], Float.parseFloat(OneRow[4 + pal_count]));
                        paLdatas.add(paldata);
                    }
                    energy = new EnergyData(bmrkey_energy, paLdatas);
                    energy_set.put(energy.getBmr(), energy.getEnergy_needs_as_per_bmr());
                    paLdatas = new ArrayList<>();
                    //2. Female Data set Group age_group,  height,  weight, gender,  bmr
                    bmrkey_energy = new BMRData(OneRow[0], Float.parseFloat(OneRow[1]), Float.parseFloat(OneRow[2]), "Female", Float.parseFloat(OneRow[10]));
                    for (pal_count = 0; pal_count < 6; pal_count++) { // 6 categories bed rest,very sedentary,light,moderate,heavy,vigorous
                        paldata = new PALdata(physical_activity_level_array[pal_count], Float.parseFloat(OneRow[11 + pal_count]));
                        paLdatas.add(paldata);
                    }
                    energy = new EnergyData(bmrkey_energy, paLdatas);
                    energy_set.put(energy.getBmr(), energy.getEnergy_needs_as_per_bmr());
                    paLdatas = new ArrayList<>();
                    //Height agr group and gender         BMR for Male
                    bmrkey_bmr = new BMRData(Float.parseFloat(OneRow[1]), OneRow[0], "Male");
                    bmr_by_user_details.put(bmrkey_bmr, Float.parseFloat(OneRow[3]));

                    bmrkey_bmr = new BMRData(Float.parseFloat(OneRow[1]), OneRow[0], "Female");
                    bmr_by_user_details.put(bmrkey_bmr, Float.parseFloat(OneRow[10]));
                }
            } // end of while
            String age_group_string_array[] = age_group_list.toArray(new String[0]);
            age_group_field.setModel(new DefaultComboBoxModel(age_group_string_array));
            physical_activity_level_field.setModel(new DefaultComboBoxModel(physical_activity_level_array));
            loaded_dropdown_data=true;

        } // end of try
        catch (FileNotFoundException e) {
            System.out.println("File not found:" + e.getMessage());
            JOptionPane.showMessageDialog(null, "File Not Found to Read Data. Please Recheck !");
        } // end of Catch Exception FileNotFound
        catch (IOException e) {
            System.out.println("Input Output Exception Occoured " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Input Output Exception Occoured!");
        } catch (Exception e) {
            System.out.print("Some Exception Occoured" + e.getMessage());
            JOptionPane.showMessageDialog(null, "Exception Occoured. Please Refer to Logs !");
        }
    }// end of ReadFile method

    private void showGUI() {
        mainFrame.add(container);
        mainFrame.setVisible(true);//making the frame visible
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // EDIT

    }

}
