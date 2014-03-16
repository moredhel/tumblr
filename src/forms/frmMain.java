package forms;

import javax.swing.*;

/**
 * Created by moredhel on 16/03/14.
 */
public class frmMain {
    private JPanel panelRoot;
    private JLabel username;
    private JPanel panelNavigation;
    private JPanel PanelSelectedPost;
    private JPanel panelStatus;
    private JPanel panelOverview;
    private JPanel panelPosts;
    private JTree treeNavigation;
    private JTable tablePosts;
    private JEditorPane editorPost;

    public frmMain() {
        editorPost.setEnabled(false);
        editorPost.setContentType("text/html");
        editorPost.setText("<a href='http://google.com'>google</a>");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Tumblr");
        frame.setContentPane(new frmMain().panelRoot);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
