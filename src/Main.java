//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        UserData[] userData = {
                new UserData("Andreyagdfsadfouashdfhasdhfioasdhfihasf ", "123", "123")
        };

        UserData.validateLogin("Andrey", "poadkf", "poadkf");




    }
}