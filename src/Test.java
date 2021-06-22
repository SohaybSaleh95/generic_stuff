import entities.User;
import services.UserService;

public class Test
{
    public static void main(String[] args)
    {
        UserService lUserService = new UserService();
        lUserService.createEntity(new User());
    }
}
