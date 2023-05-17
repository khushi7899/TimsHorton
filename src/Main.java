import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TimsItems[] timsItems = new TimsItems[100];
        int choice, ordercounter;
        choice = 1;
        ordercounter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Tim Hortons");
        while (choice==1||choice==2) {
            System.out.println("Enter \n1. Merchandise\n2. Consumables\n3. Checkout");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("\n\n1. Mug\n2. Coffee Powder\n3. Gift Card\n4. Hockey Card");
                    choice = sc.nextInt();
                    if (choice == 1) {
                        Mugs mugs = new Mugs();
                        System.out.println(mugs);
                        System.out.println("1. Order this\n2. Choose again\n");
                        choice = sc.nextInt();
                        if (choice == 1)
                            timsItems[ordercounter++] = mugs;
                    }
                    else if (choice == 2) {
                        CoffeePowder coffeePowder = new CoffeePowder();
                        System.out.println(coffeePowder.toString());
                        System.out.println("1. Order this\n2. Choose again\n");
                        choice = sc.nextInt();
                        if (choice == 1)
                            timsItems[ordercounter++] = coffeePowder;
                    }
                    else if (choice == 3) {
                        GiftCards giftCards = new GiftCards();
                        System.out.println(giftCards.toString());
                        System.out.println("1. Order this\n2. Choose again\n");
                        choice = sc.nextInt();
                        if (choice == 1)
                            timsItems[ordercounter++] = giftCards;

                    }
                    else if (choice == 4) {
                        HockeyCards hockeyCards=new HockeyCards();
                        System.out.println(hockeyCards.toString());
                        System.out.println("1. Order this\n2. Choose again\n");
                        choice = sc.nextInt();
                        if (choice == 1)
                            timsItems[ordercounter++] = hockeyCards;
                    }
                    break;
                case 2:
                    System.out.println("\n\n1. Donut\n2. Bagel\n3. Coffee\n4. Wrap\n5. Sandwich");
                    choice = sc.nextInt();
                    if (choice == 1) {
                    Donut donut=new Donut();
                    System.out.println(donut.toString());
                    System.out.println("1. Order this\n2. Choose again\n");
                    choice = sc.nextInt();
                    if (choice == 1)
                        timsItems[ordercounter++] = donut;
                    }
                    else if (choice == 2) {
                        Bagel bagel=new Bagel();
                        System.out.println(bagel.toString());
                        System.out.println("1. Order this\n2. Choose again\n");
                        choice = sc.nextInt();
                        if (choice == 1)
                            timsItems[ordercounter++] = bagel;
                    }
                    else if (choice == 3) {
                        Coffee coffee = new Coffee();
                        System.out.println(coffee.toString());
                        System.out.println("1. Order this\n2. Choose again\n");
                        choice = sc.nextInt();
                        if (choice == 1)
                            timsItems[ordercounter++] = coffee;
                    }
                    else if (choice == 4) {
                        Wrap wrap=new Wrap();
                        System.out.println(wrap.toString());
                        System.out.println("1. Order this\n2. Choose again\n");
                        choice = sc.nextInt();
                        if (choice == 1)
                            timsItems[ordercounter++] = wrap;
                    }
                    else if (choice == 5) {
                        Sandwich sandwich=new Sandwich();
                        System.out.println(sandwich.toString());
                        System.out.println("1. Order this\n2. Choose again\n");
                        choice = sc.nextInt();
                        if (choice == 1)
                            timsItems[ordercounter++] = sandwich;
                    }
                    break;
                case 3:
                    int items=ordercounter;
                    System.out.println("**********************\n\nTotal Items ordered: "+items+"\n\n**********************");
                    for (int i = 0; i <items ; i++) {
                        System.out.println("**********************");
                        System.out.println(timsItems[i].toString());
                    }
                    Payments payments=new Payments();
                    System.out.println("\n\n**********************\nTotal payment : "+payments.payment(timsItems, items)+"\n**********************");
                    Wallet wallet=new Wallet();
                    if(Payments.total > Wallet.wall)
                    System.out.println("Insufficient funds");
                    System.out.println("Balance : "+wallet.balance());
                    System.out.println("Proceeding with payment now ");
                    System.out.println("**********************");
                    System.out.println("Please enter your card no. : ");
                    Card ob=new Card();
                    ob.cardno=sc.next();
                    System.out.println("Please enter your date of birth in dd/mm format : ");
                    ob.date=sc.next();
                    System.out.println("Please enter your pin no. : ");
                    ob.pin=sc.nextInt();
                    payments.check(ob.cardno, ob.date, ob.pin);
                    System.out.println("**********************");
                    if(Payments.process==true) {
                        System.out.println("Transaction successful");
                    }
                    else{ System.out.println("Transaction failed");}
                    System.out.println("**********************");
                    break;
                default:
                    System.out.println("Invalid Input\nPlease try again");
            }
        }

    }
}