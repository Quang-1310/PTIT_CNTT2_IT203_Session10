package BTTH;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Payable card = new  CreditCard("Phạm Tiến Hưng", "CC001", "1234567891234157", "123", 5000);
        Payable wallet = new EWallet("Hoàng Minh Quang", "EW001", "0987654321", 2000);

        ((CreditCard) card).validate();
        ((EWallet) wallet).validate();


        card.pay(1000);

        wallet.pay(600);


        Payable rewardPoints = new Payable() {
            private int points = 10000;

            @Override
            public void pay(double amount) {
                int requiredPoints = (int) amount;

                if (requiredPoints > points) {
                    System.out.println("Không đủ điểm thưởng để thanh toán");
                } else {
                    points -= requiredPoints;
                    System.out.println("Thanh toán " + amount +
                            " bằng điểm thưởng thành công");
                    System.out.println("Điểm còn lại: " + points);
                }
            }
        };

        rewardPoints.pay(300);
    }
}
