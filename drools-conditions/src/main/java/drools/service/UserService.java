package drools.service;

import drools.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by serhii on 30.11.14.
 */
@Service
public class UserService {

    private List<User> users = new ArrayList<User>();

    @PostConstruct
    private void initUsers(){
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("name" + i);
            user.setSurname("surname" + i);
            users.add(user);
        }
    }

    public User getRandomUser(){
        Collections.shuffle(users);
        return users.get(0);
    }
}
