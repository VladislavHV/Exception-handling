public class Main {
    //Напишите статический метод, который принимает на вход три параметра: login, password и confirmPassword.

    public static void Person(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        /*
        Параметр Login содержит в себе только латинские буквы, цифры и знак подчеркивания.
        Например, java_skypro_go. У параметра login есть ограничение по длине – он должен быть равен или меньше
        20 символов. Если login длиннее 20 символов или содержит в себе недопустимые символы, то необходимо выбросить
        исключение – WrongLoginException.
        */

        if (login == null || login.length() > 20 || !login.matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongLoginException("Параметр должен быть равен или меньше 20 символов, параметр не должен быть пустым");
        }

        /*
        Параметр Password содержит в себе только латинские буквы, цифры и знак подчеркивания.
        Например, D_1hWiKjjP_9. Если password длиннее 20 символов или содержит в себе недопустимые символы,
        то необходимо выбросить исключение – WrongPasswordException.
        */

        if (password == null || password.length() > 20  || !login.matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongPasswordException("Параметр должен быть равен или меньше 20 символов, параметр не должен быть пустым");
        }

        /*
        Параметры password и confirmPassword должны быть равны. Если это требование не соблюдается,
        то нужно выбросить WrongPasswordException.
         */

        if (password == null || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

    public static void main(String[] args) {
        //Для обработки исключений используйте multi-catch block.

        /*
        Метод ничего не должен возвращать, если значения параметров подходят под ограничения,
        или бросать исключение, если условия не выполняются.
         */

        try {
            Person("Login_123", "password_123", "password_123");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ввудите логин и пароль");
        } finally {
            System.out.println("Программа завершена.");
        }

        //При вызове метода необходимо обработать потенциальные исключения.

    }
}
