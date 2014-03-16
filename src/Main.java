import classes.Tumblr;
import forms.frmMain;

/**
 * Created by moredhel on 16/03/14.
 */
public class Main {
    public static frmMain main;
    private static Tumblr tumblr;
    public static  void createAndShowGUI(){
        main = new frmMain();
    }

    public static void main(String args[]){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
        //tumblr = new Tumblr();

        //main.setUsername(tumblr.getUsername());


    }
}
