package zad5;

public class AdminAuthentication implements Authentication {

    @Override
    public boolean login(String username, String password) {
        return true;
    }

    @Override
    public void logout() {
        System.out.println("Logged out");

    }

    @Override
    public boolean resetPassword(String username, String oldPassword, String newPassword) {
        return true;
    }
}
