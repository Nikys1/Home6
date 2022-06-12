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
            if(people[i] = null && c == 1){
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

}
