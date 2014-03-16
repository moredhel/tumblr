package classes;

import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.Blog;

import java.util.List;

/**
 * Created by moredhel on 16/03/14.
 */
public class Tumblr {
    private final client

    public Tumblr(){
        client = new JumblrClient("IebX9kEVTuetnyjbb0IhmHZd1w23XluqhcFC2pgzife1DQIx74", "4aBInl4FyVruDOfaWOtkdPqlQfrSZ2UleWbBm6Y3Ez0VyEuTQB");
        client.setToken("NU5pTyiwIFpw7LgYZmI7JP094J47stCXob6HOp6xeeEqlRnGIy", "6u7jRGqpXGO392A1OhaSEmn6pU86KFx4AmdxAfWOQbeCEtsmER");


        List<Blog> blogs = client.userFollowing();
        for (Blog blog : blogs) {
          System.out.println("\t" + blog.getTitle());
        }
    }
}
