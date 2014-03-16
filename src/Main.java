import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.Blog;
import com.tumblr.jumblr.types.User;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.*;

/**
 * Created by moredhel on 16/03/14.
 */
public class Main {
    public static void createAndShowGUI(){
        JFrame frame = new JFrame("HelloWorldSwing");

        //finish initial config of swing gui -----------------------------
        JMenuBar menubar = new JMenuBar();
        JPanel panel = new JPanel();
        //panel.setBounds(10,10,300,10);
        panel.setLayout(null);
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);

        JMenuItem eMenuItem = new JMenuItem("Exit");
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("Exit application");
        eMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        panel.add(menubar);
        menubar.add(file);
        file.add(eMenuItem);
        frame.add(panel);
        //start final config of swing gui --------------------------------
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String args[]){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

        //JumblrClient client = new JumblrClient("IebX9kEVTuetnyjbb0IhmHZd1w23XluqhcFC2pgzife1DQIx74", "4aBInl4FyVruDOfaWOtkdPqlQfrSZ2UleWbBm6Y3Ez0VyEuTQB");
        //client.setToken("NU5pTyiwIFpw7LgYZmI7JP094J47stCXob6HOp6xeeEqlRnGIy", "6u7jRGqpXGO392A1OhaSEmn6pU86KFx4AmdxAfWOQbeCEtsmER");

        //User user = client.user();
        //System.out.println(user.getName());

        //List<Blog> blogs = client.userFollowing();
        //for (Blog blog : blogs) {
          //  System.out.println("\t" + blog.getTitle());
        //}
        //System.out.println(blogs.size());


    }
}
