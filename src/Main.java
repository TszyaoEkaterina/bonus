public class Main {
    public static void main(String[] args) {
        int initial = 100;
        int add = 1100;
        int percent = add > 1000 ? 1 : 0;
        int bonus = add * percent / 100;
        int total = initial + add + bonus;
        System.out.println("бонус:" + bonus + " рублей, итоговая сумма на счету:" + total + " рублей");
    }
}
