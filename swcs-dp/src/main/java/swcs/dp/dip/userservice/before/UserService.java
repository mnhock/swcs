package swcs.dp.dip.userservice.before;

public class UserService {

    private final UserRepository userRepository;

    public UserService() {
        this.userRepository = new UserRepositoryHibernate();
    }
}