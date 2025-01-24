package zad5;

public class TestAuthentication {
    public static void main(String[] args)
    {
        UserAuthentication user = new UserAuthentication();
        System.out.println(user.login("Pawliszek228", "sfu74tb3o9d"));
        System.out.println(user.resetPassword("Pawliszek228", "sfu74tb3o9d", "hellow_world"));
        user.logout();


        AdminAuthentication admin = new AdminAuthentication();
        System.out.println(admin.login("NiePawliszek228", "hellow_world"));
        System.out.println(admin.resetPassword("NiePawliszek228", "hellow_world", "sfu74tb3o9d"));
        admin.logout();

    }
}
