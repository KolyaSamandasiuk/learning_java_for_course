package Lesson_4_Udemy;

public class BankAccount {
    int id;
    String name;
    double balance;
}

class BankAccountTest {

    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Kolya";
        MyAccount.balance = 205.5;

        System.out.println("My id: " + MyAccount.id + ". name: " + MyAccount.name + ". balance: " + MyAccount.balance);

        YourAccount.id = 2;
        YourAccount.name = "Maks";
        YourAccount.balance = 185.4;

        HisAccount.id = 3;
        HisAccount.name = "Seraf";
        HisAccount.balance = 1000.7;
    }
}
