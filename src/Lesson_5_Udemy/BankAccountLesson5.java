package Lesson_5_Udemy;

public class BankAccountLesson5 {
    int id;
    String name;
    double balance;


int PopolnenieScheta(int summaPopolnenia) {
    balance+=summaPopolnenia;
    return summaPopolnenia;
}

    int SyatieScheta(int summaSnyatiya) {
        balance-=summaSnyatiya;
        return summaSnyatiya;
    }
}

class BankAccountTestLesson5 {

    public static void main(String[] args) {

        BankAccountLesson5 MyAccount = new BankAccountLesson5();
        BankAccountLesson5 YourAccount = new BankAccountLesson5();
        BankAccountLesson5 HisAccount = new BankAccountLesson5();

        MyAccount.id = 1;
        MyAccount.name = "Kolya";
        MyAccount.balance = 205.5;
        MyAccount.PopolnenieScheta(100);
        System.out.println("My id: " + MyAccount.id + ". name: " + MyAccount.name + ". balance: " + MyAccount.balance);
        MyAccount.SyatieScheta(305);
        System.out.println("My id: " + MyAccount.id + ". name: " + MyAccount.name + ". balance: " + MyAccount.balance);

        YourAccount.id = 2;
        YourAccount.name = "Maks";
        YourAccount.balance = 185.4;
        YourAccount.PopolnenieScheta(200);
        System.out.println("ID: " + YourAccount.id + " Name: " + YourAccount.name + " Balance: " + YourAccount.balance);
        YourAccount.SyatieScheta(380);
        System.out.println("ID: " + YourAccount.id + " Name: " + YourAccount.name + " Balance: " + YourAccount.balance);

        HisAccount.id = 3;
        HisAccount.name = "Seraf";
        HisAccount.balance = 1000.7;
        HisAccount.PopolnenieScheta(300);
        System.out.println("ID: " + HisAccount.id + " Name: " + HisAccount.name + " Balance: " + HisAccount.balance);
        HisAccount.SyatieScheta(1300);
        System.out.println("ID: " + HisAccount.id + " Name: " + HisAccount.name + " Balance: " + HisAccount.balance);

    }
}
