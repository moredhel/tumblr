import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.Blog;
import com.tumblr.jumblr.types.User;
import forms.frmMain;

/**
 * Created by moredhel on 16/03/14.
 */
public class Main {
    public static frmMain main;
    public static  void createAndShowGUI(){
        main = new frmMain();
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
