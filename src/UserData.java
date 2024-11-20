public class UserData {

    String login;
    String password;
    String ConfimPassword;

    public UserData(String login, String password, String confimPassword) {
        this.login = login;
        this.password = password;
        this.ConfimPassword = confimPassword;

    }

    private static boolean isValidPassword(String password) {
        return password.matches("^[a-zA-Z0-9_]{1,20}$");
    }

    public static void validateLogin(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException, PasswordMismatchException {
        try {
            if (login.length() > 20 || !isValidLogin(login)) {
                throw new WrongLoginException("Логин должен быть длиной не более 20 символов и содержать только латинские буквы, цифры и подчеркивание..");
            }
            if (password.length() > 20 || !isValidPassword(password)) {
                throw new WrongPasswordException("Пароль должен быть длиной не более 20 символов и содержать только латинские буквы, цифры и подчеркивание.");
            }
            if (!password.equals(confirmPassword)) {
                throw new PasswordMismatchException("Пароли не совпадают.");
            }
        } catch (WrongLoginException | WrongPasswordException | PasswordMismatchException e) {
            throw e;
        }
    }

    private static boolean isValidLogin(String login) {
        return login.matches("^[a-zA-Z0-9_]{1,20}$");
    }


}
