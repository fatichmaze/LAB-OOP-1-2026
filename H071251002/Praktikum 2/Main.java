public class Main {
    public static void main(String[] args) {
        Case c1 = new Case("Kasus Pembunuhan");
        Case c2 = new Case("Kasus Pencurian");

        Detective conan = new Detective("Conan", 95, c1);
        Detective kogoro = new Detective("Kogoro", 90, c2);

        conan.solveCase();
        kogoro.solveCase();

        kogoro.compareSkill(conan);
    }
}