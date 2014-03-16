package classes;

import com.tumblr.jumblr.JumblrClient;
import com.tumblr.jumblr.types.Blog;

import java.util.List;

/**
 * Created by moredhel on 16/03/14.
 */
public class Tumblr {
    public final JumblrClient user;
    private String username;

    public Tumblr(){
        user = new JumblrClient("IebX9kEVTuetnyjbb0IhmHZd1w23XluqhcFC2pgzife1DQIx74", "4aBInl4FyVruDOfaWOtkdPqlQfrSZ2UleWbBm6Y3Ez0VyEuTQB");
        user.setToken("NU5pTyiwIFpw7LgYZmI7JP094J47stCXob6HOp6xeeEqlRnGIy", "6u7jRGqpXGO392A1OhaSEmn6pU86KFx4AmdxAfWOQbeCEtsmER");
    }
    public String getUsername() {
        if(username == null) {username = user.user().getName();}
        return username;

    }
}
