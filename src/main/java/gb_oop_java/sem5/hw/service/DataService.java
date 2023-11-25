package gb_oop_java.sem5.hw.service;

import gb_oop_java.sem5.hw.model.User;

import java.util.List;

public interface DataService {
    User create(User user);
    List<User> read();
}
