package weapon;

public class WaterPistol extends Weapon {
    public WaterPistol(int basicDamage, int criticalChance, int failChance, int criticalFailChance, String weaponName) {
        super(basicDamage, criticalChance, failChance, criticalFailChance, weaponName);
    }

    @Override
    public void shot() {
        double damage;
        if (prob(criticalChance) && !prob(failChance) && !prob(criticalFailChance)) {
            damage = 9000 * damageDiapason(basicDamage);
            System.out.println("�� �������� " + Math.round(damage) + " ����� �� " + weaponName + "!\n ���������, ��� �� �������, ���� ������� �� ����� ��������� \n�������. �� � ������ ����������� �� ��� �������. ��� ��� ����?");
        } else if (!prob(criticalChance) && prob(failChance) && !prob(criticalFailChance)) {
            damage = 0.9 * damageDiapason(basicDamage);
            System.out.println("�� �������� " + Math.round(damage) + " ����� �� " + weaponName + "!\n ���� �������� ���������");
        } else if (!prob(criticalChance) && !prob(failChance) && prob(criticalFailChance)) {
            damage = 0;
            System.out.println("�� �������� " + Math.round(damage) + " ����� �� " + weaponName + "!\n �� ������������, ������ ���������� � ��� � �����, ����������\n ������ �� ��� ������, �� ������� ������� ������, ������ ��������� ��������, \n ��� ���� ���������� ������������, �������� ���������� �� ���, ��������� \n ���� �� ������, ������� ������� �����������.");
        } else {
            damage = damageDiapason(basicDamage);
            System.out.println("�� �������� " + Math.round(damage) + " ����� �� " + weaponName + "!");
        }
    }
}
