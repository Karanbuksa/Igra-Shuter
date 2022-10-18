package weapon;

public class Slingshot extends Weapon {
    public Slingshot(int basicDamage, int criticalChance, int failChance, int criticalFailChance, String weaponName) {
        super(basicDamage, criticalChance, failChance, criticalFailChance, weaponName);
    }

    @Override
    public void shot() {
        double damage;
        if (prob(criticalChance) && !prob(failChance) && !prob(criticalFailChance)) {
            damage = 2 * damageDiapason(basicDamage);
            System.out.println("�� ���������� ������������� ��������, ��� �������, ��� �� " + weaponName + " �� \n������ ����� ���� ���� �� ����. �� �������� " + Math.round(damage) + " ����� �� " + weaponName + "!");
        } else if (!prob(criticalChance) && prob(failChance) && !prob(criticalFailChance)) {
            damage = 0.7 * damageDiapason(basicDamage);
            System.out.println("�� �������� " + Math.round(damage) + " ����� �� " + weaponName + "!\n ����� ������.");
        } else if (!prob(criticalChance) && !prob(failChance) && prob(criticalFailChance)) {
            damage = 0;
            System.out.println("�� �������� " + Math.round(damage) + " ����� �� " + weaponName + "!\n �� ������������, ������ ���������� � ��� � �����, ����������\n ������ �� ��� ������, �� ������� ������� ������, ������ ��������� ��������, \n ��� ���� ���������� ������������, �������� ���������� �� ���, ��������� \n ���� �� ������, ������� ������� �����������.");
        } else {
            damage = damageDiapason(basicDamage);
            System.out.println("�� �������� " + Math.round(damage) + " ����� �� " + weaponName + "!");
        }
    }
}
