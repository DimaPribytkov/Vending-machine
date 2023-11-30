import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int twixPrice = 100;
        int marsPrice = 70;
        int snickersPrice = 50;
        int bonAqaPrice = 30;

        boolean isCanBuy = false;

        System.out.println("\t\t\t *****Добро пожаловать!*****");
        System.out.println("\t\t ****\tВнесите нужную сумму!\t****");
        int moneyAmount = new Scanner(System.in).nextInt();
        if (moneyAmount >= twixPrice) {
            System.out.println("Вы можете купить твикс!");
            isCanBuy = true;
        }
        if (moneyAmount >= marsPrice) {
            System.out.println("Вы можете купить марс!");
            isCanBuy = true;
        }
        if (moneyAmount >= snickersPrice) {
            System.out.println("Вы можете купить сникерс!");
            isCanBuy = true;
        }
        if (moneyAmount >= bonAqaPrice) {
            System.out.println("Вы можете купить бонАква!");
            isCanBuy = true;
        }
        if (isCanBuy == false){
            System.out.println("У вас недостаточная сумма денег...:-(");
        }

    }

}