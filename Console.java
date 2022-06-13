public class Console {
    public static void main(String[] args) {
        Peerson lesha = new Peerson("Lesh","Linkevich");

        String number = lesha.creditCards[0].number;
        lesha.addMoneyToCard(number,100);
        lesha.payMoneyToCard(number,45);



    }
}
