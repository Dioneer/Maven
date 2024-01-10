package Pegas;

import java.util.Optional;

public class UserDao {
    public Optional<User> findById(Long id){
        User user = new User();
        user.setName("Ivan");
        return Optional.of(user);
    }
}
