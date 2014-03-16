package forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 * Created by moredhel on 16/03/14.
 * the main gui for the program
 */
public class frmMain {
    JFrame frame = new JFrame("HelloWorldSwing");
    JLabel username = new JLabel("loading...");

    public frmMain() {
        initialise();
    }
    /*
     * initialises the main gui with a menu and sets the basic panel layout
     */
    private void initialise() {
        //initialise menuPanel
        JPanel menuPanel = new JPanel();
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu view = new JMenu("View");
        JMenuItem fileExit = new JMenuItem("Exit");
        final JCheckBoxMenuItem showStatusBar = new JCheckBoxMenuItem("Show StatusBar");

        //initialise statusPanel
        final JPanel statusPanel = new JPanel();

        //configure menuPanel
        menuPanel.setBounds(10, 10, 300, 10);
        file.setMnemonic(KeyEvent.VK_F);
        fileExit.setMnemonic(KeyEvent.VK_E);
        fileExit.setToolTipText("Exit application");
        fileExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        showStatusBar.setSelected(true);
        showStatusBar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(showStatusBar.isSelected()){
                    statusPanel.setVisible(true);
                }else {
                    statusPanel.setVisible(false);
                }
            }
        });
        menuPanel.add(menuBar);
        menuBar.add(file);
        menuBar.add(view);
        file.add(fileExit);
        view.add(showStatusBar);
        menuPanel.validate();


        //config statusPanel
        statusPanel.setBounds(0,10,300,10);
        statusPanel.add(username);

        //adding panels to frame
        frame.add(menuPanel, BorderLayout.NORTH);
        frame.add(statusPanel, BorderLayout.SOUTH);
        //start final config of swing gui --------------------------------
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void setUsername(String username) {
        this.username.setText(username);
    }
}
