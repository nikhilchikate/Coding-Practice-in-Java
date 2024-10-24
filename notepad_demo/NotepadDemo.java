package notepad_demo;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

class NotepadDemo {
    public static void main(String args[]) {
        SampleFrame sf = new SampleFrame("Our Own Notepad");
        sf.setSize(1000, 800);
        sf.setVisible(true);
    }
}

class Prac1 extends WindowAdapter {
    SampleFrame sf;

    Prac1(SampleFrame sf) {
        this.sf = sf;
    }

    public void windowClosing(WindowEvent we) {
        sf.setVisible(false);
        sf.dispose();
    }
}

class SampleDialog extends Dialog implements ActionListener {
    SampleFrame sf;
    Label l;
    Button b;

    SampleDialog(SampleFrame sf, String title, boolean mode) {
        super(sf, title, mode);
        setLayout(new FlowLayout());
        this.sf = sf;
        l = new Label("Press button to close...");
        b = new Button("close");
        add(l);
        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        dispose();
    }
}

class MyFont extends Dialog implements ActionListener {
    SampleFrame sf;
    Label fontname, fontstyle, fontsize;
    Button b;

    MyFont(SampleFrame sf, String title, boolean mode) {
        super(sf, title, mode);
        setLayout(new FlowLayout());
        this.sf = sf;
        fontname = new Label("Font");
        fontstyle = new Label("Font Style");
        fontsize = new Label("Font Size");
        add(fontname);
        Choice fontchoice = new Choice();
        String str[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
            fontchoice.add(str[i]);
        }
        add(fontchoice);
        add(fontstyle);
        Choice fontstylechoice = new Choice();
        fontstylechoice.add("Regular");
        fontstylechoice.add("Italic");
        fontstylechoice.add("Bold");
        add(fontstylechoice);
        add(fontsize);
        Choice fontsizechoice = new Choice();
        fontsizechoice.add("10");
        fontsizechoice.add("14");
        fontsizechoice.add("18");
        add(fontsizechoice);
        b = new Button("close");

        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        dispose();
    }

}


//****************************
class FindDialog extends Dialog implements ActionListener {
    SampleFrame sf;
    Label fontname, fontstyle, fontsize;
    Button b;
    String text1;

    FindDialog(SampleFrame sf, String title) {
        super(sf, title);
        setLayout(new FlowLayout());
        this.sf = sf;
        this.text1 = title;

        //Container content = getContentPane();
        //content.setLayout(new BorderLayout());
        fText = new JTextField(10);
        mCase = new JCheckBox("Match Case");
        fButton = new JButton("Find Next");
        cButton = new JButton("Close");
        JPanel pane1 = new JPanel();
        pane1.add(new JLabel("Find : "));
        pane1.add(fText);
        pane1.add(mCase);
        add(pane1);
        //content.add(pane1, BorderLayout.CENTER);
        JPanel pane2 = new JPanel();
        pane2.setLayout(new GridLayout(1, 2));
        pane2.add(fButton);
        pane2.add(cButton);
        add(pane2);
        //content.add(pane2, BorderLayout.SOUTH);
        addListener();

        setSize(700, 700);
    }

    public void initToZero() {
        init = 0;
    }

    public void actionPerformed(ActionEvent ae) {
        dispose();
    }


    private void addListener() {
        mCase.addActionListener(new
                                        ActionListener() {
                                            public void actionPerformed(ActionEvent e) {
                                                if (mCase.isSelected())
                                                    caseSensitive = true;
                                                else
                                                    caseSensitive = false;
                                            }
                                        });
        fButton.addActionListener(new
                                          ActionListener() {
                                              public void actionPerformed(ActionEvent e) {
                                                  String sText = fText.getText();
                                                  if (sText != null) {
                                                      String tSearch = text.getText();
                                                      int size = tSearch.length();
                                                      boolean endOfSearch = false;
                                                      while (!endOfSearch) {
                                                          int index = 0;
                                                          if (caseSensitive)
                                                              index = tSearch.indexOf(sText, init);
                                                          else
                                                              index = tSearch.toLowerCase().indexOf(sText.toLowerCase(), init);
                                                          if (index != -1) {
                                                              endOfSearch = true;
                                                              text.select(index, index + sText.length());
                                                              init = text.getCaretPosition();
                                                          } else {
                                                              endOfSearch = true;
                                                              JOptionPane.showMessageDialog(sf, "\"" + sText + "\"" + " not found ");
                                                          }
                                                      }
                                                  }
                                              }
                                          });

        cButton.addActionListener(new
                                          ActionListener() {
                                              public void actionPerformed(ActionEvent e) {
                                                  setVisible(false);
                                              }
                                          });
    }

    // index to search from
    private int init;
    // The text area
    private JTextArea text;
    // The text to search for
    private JTextField fText;
    // Perform case sensitive search or not
    private JCheckBox mCase;
    // The find button
    private JButton fButton;
    // The close button
    private JButton cButton;
    // Is this case sensitive search
    private boolean caseSensitive;
}

//************************


class SampleFrame extends Frame implements ActionListener, ItemListener {
    MenuItem new1, open, save, exit, cut, copy, paste, find, saveas, Font, Status_Bar;
    CheckboxMenuItem s, sb;
    TextArea t;
    String msg = "";
    String copyText = "";

    SampleFrame(String title) {
        super(title);
        MenuBar mb = new MenuBar();
        setMenuBar(mb);

        Menu f = new Menu("File");
        new1 = new MenuItem("New");
        open = new MenuItem("Open");
        save = new MenuItem("Save");
        saveas = new MenuItem("Save As");
        exit = new MenuItem("Exit");
        f.add(new1);
        f.add(open);
        f.add(save);
        f.add(saveas);
        f.add(exit);

        mb.add(f);

        Menu e = new Menu("Edit");
        cut = new MenuItem("Cut");
        copy = new MenuItem("Copy");
        paste = new MenuItem("Paste");
        find = new MenuItem("Find");
        s = new CheckboxMenuItem("Special");
        e.add(cut);
        e.add(copy);
        e.add(paste);
        e.add(find);
        //e.add(s);
        mb.add(e);

        Menu fr = new Menu("Format");
        Font = new MenuItem("Font...");
        fr.add(Font);
        mb.add(fr);

        Menu v = new Menu("View");
        sb = new CheckboxMenuItem("Status_Bar");
        v.add(sb);
        mb.add(v);

        t = new TextArea();
        add(t);


        find.addActionListener(this);
        new1.addActionListener(this);
        exit.addActionListener(this);
        open.addActionListener(this);
        s.addItemListener(this);
        saveas.addActionListener(this);
        save.addActionListener(this);
        addWindowListener(new Prac1(this));
        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        Font.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {

        String msg = (String) ae.getActionCommand();
        System.out.println(msg);
        if (msg.equals("New")) {
			/*System.out.println("You clicked on New");
			SampleDialog sd=new SampleDialog(this,"This is our Dialog",true);
			sd.setSize(600,300);
			sd.setVisible(true);*/
            msg = "";
            t.setText(msg);
        }
        if (msg.equals("Exit")) {
            System.exit(0);
        }
        if (msg.equals("Open")) {
            msg = "";
            System.out.println("You clicked on Open");
            FileDialog fd = new FileDialog(this, "Our FileDialog", FileDialog.LOAD);
            fd.setVisible(true);
            String path = fd.getDirectory() + "" + fd.getFile();
            System.out.println(path);
            try {
                int x;
                FileInputStream fin = new FileInputStream(path);
                while ((x = fin.read()) != -1) {
                    msg = msg + (char) x;
                }
                fin.close();
                t.setText(msg);
            } catch (Exception e) {
                System.out.println("problem in opening file..." + e);
            }
        }
        if (msg.equals("Save")) {
            msg = "";
            System.out.println("You clicked on Save");
            FileDialog fd = new FileDialog(this, "Our FileDialog", FileDialog.SAVE);
            fd.setVisible(true);
            String path = fd.getDirectory() + "" + fd.getFile();
            System.out.println(path);
            try {
                FileOutputStream fout = new FileOutputStream(path);
                fout.write(t.getText().getBytes());
                fout.close();
            } catch (Exception e) {
                System.out.println("problem in saving file..." + e);
            }

        }
        if (msg.equals("Save As")) {
            msg = "";
            System.out.println("You clicked on Save As");
            FileDialog fd = new FileDialog(this, "Our FileDialog", FileDialog.SAVE);
            fd.setVisible(true);
            String path = fd.getDirectory() + "" + fd.getFile();
            System.out.println(path);
            try {
                FileOutputStream fout = new FileOutputStream(path);
                fout.write(t.getText().getBytes());
                fout.close();
            } catch (Exception e) {
                System.out.println("problem in saving file..." + e);
            }

        }
        if (msg.equals("Copy")) {
            copyText = t.getSelectedText();
            System.out.println(copyText);
        }
        if (msg.equals("Cut")) {
            copyText = t.getSelectedText();
            if (t.getSelectedText() != null) {
                int begin = t.getSelectionStart();
                int end = t.getSelectionEnd();
                t.replaceRange("", begin, end);
            }
            System.out.println(copyText);
        }
        if (msg.equals("Paste")) {
            //int pos=t.getCaretPosition();
            //System.out.println("position:"+pos);
            t.insert(copyText, t.getCaretPosition());
        }
        if (msg.equals("Font...")) {
            MyFont mf = new MyFont(this, "This is our font window", true);
            mf.setSize(700, 400);
            mf.setVisible(true);

        }
        if (msg.equals("Find")) {
            copyText = t.getSelectedText();
            FindDialog fw = new FindDialog(this, copyText);
            fw.setSize(700, 400);
            fw.setVisible(true);

        }
    }

    public void itemStateChanged(ItemEvent ie) {
        System.out.println("status of special:" + s.getState());
    }
}
