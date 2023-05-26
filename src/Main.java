public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        float ticketPrice = 1000F;
        float bonusMile = 20F;
        float totalBonus = ticketPrice / bonusMile ;
        int finalBonus = (int) totalBonus;
        System.out.println(finalBonus);
    }
}