package com.jonmid.tallerasynctask.Parser;

import com.jonmid.tallerasynctask.Models.Post;
import com.jonmid.tallerasynctask.Models.User;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by software on 19/04/2017.
 */

public class Json {

    public static List<User> getData(String content) throws Exception {
        JSONArray myArray = new JSONArray(content);
        List<User> myPost = new ArrayList<>();

        for (int i=0; i<myArray.length(); i++){
            JSONObject item = myArray.getJSONObject(i);

            User user = new User();
            user.setName(item.getString("name"));
            user.setUsername(item.getString("username"));
            user.setEmail(item.getString("email"));

            myPost.add(user);
        }

        return myPost;
    }
}
