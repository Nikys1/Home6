public class Peerson {

        String firstName;
        String secondName;
        CreditCard[] creditCards = new CreditCard[10];


        public Peerson(String firstName, String secondName){
            this.firstName = firstName;
            this.secondName = secondName;
        }

//     Зачисление денег на карту

        public void addMoneyToCard(String number, int money){
            for(int i = 0; i < creditCards.length; i++){
                if (creditCards[i].number == number){
                    creditCards[i].money += money;
                    System.out.println(
                            "На карту **** **** **** ****" + number.split(" ")[3] + " зачисленно. Сумма : " + money
                    );
                    System.out.println("Остаток на карте " + creditCards[i].money);
                }
            }
        }
//    Cписание денег
    public void payMoneyToCard (String number, int money){
            for(int i = 0; i < creditCards.length; i++){
                if(creditCards[i].number == number){
                    creditCards[i].money -= money;
                    System.out.println(
                            "С карты **** **** **** ****" + number.split(" ")[3] + " произошло списание. Остаток на счёте  " + money
                    );
                    System.out.println("Отаток на карте " + creditCards[i].money);
                }
            }
    }


    }


