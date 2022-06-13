import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

public class Bank {
    String name;

    public Bank(String name){
        this.name = name;
    }

    Peerson[] people = new Peerson[100];


//  Создание кредитной карты

    public CreditCard createCreditCard(Peerson peerson){
        int c = 1;
        for (int i = 0; i < people.length; i++){
            if(people[i] = null){
                c++;
                people[i] = peerson;
            }
        }
        CreditCard creditCard = new CreditCard(peerson.firstName.toUpperCase(), peerson.secondName.toUpperCase(), this);
        creditCard.month = LocalDate.now().getMonth().getValue();
        creditCard.year = LocalDate.now().getYear();
        Random random = new Random();
        creditCard.cvc = random.nextInt(899) + 100;
        creditCard.pin = random.nextInt(8999) + 1000;
        creditCard.number = generateCardNumber();

        return creditCard;
    }

//   Генерирование рандомного номера карты
     public String generateCardNumber(){
        Random rand = new Random();
        int a0 = rand.nextInt(8999) + 1000;
        int a1 = rand.nextInt(8999) + 1000;
        int a2 = rand.nextInt(8999) + 1000;
        int a3 = rand.nextInt(8999) + 1000;
        return a0 + " " + a1 + " " + a2 + " " + a3;
     }

//    Вывод всех клиентов банка

    public void getListPersonInBank(){
        System.out.println("Банк" + this.name);
        for (int i = 0; i < people.length; i++) {
            Peerson peerson = people[i];
            if (peerson == null)
                continue;
            for (int j = 0; j < peerson.creditCards.length; j++){
                CreditCard creditCard = peerson.creditCards[j];
                if (creditCard == null)
                    continue;
                System.out.println("Пользователь" + peerson.firstName + " " + peerson.secondName + " держит карту с " +
                        "номером :" + creditCard.number);
            }
            System.out.println();
        }
    }
}
