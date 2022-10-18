package weapon;

public class MachineGun extends Weapon {

    public MachineGun(int basicDamage, int criticalChance, int failChance, int criticalFailChance, String weaponName) {
        super(basicDamage, criticalChance, failChance, criticalFailChance, weaponName);
    }

    @Override
    public void shot() {
        double damage;
        if (prob(criticalChance) && !prob(failChance) && !prob(criticalFailChance)) {
            damage = 1.3 * damageDiapason(basicDamage);
            System.out.println("�� �������� " + Math.round(damage) + " ����� �� " + weaponName + "! �������� ������ ������ ������ �������, ���� ������� �� \n��������� ������. �������, �� ���� �� ���������...");
        } else if (!prob(criticalChance) && prob(failChance) && !prob(criticalFailChance)) {
            damage = 0.4 * damageDiapason(basicDamage);
            System.out.println("�� �������� " + Math.round(damage) + " ����� �� " + weaponName + "! � ����� ������� �� �������� ����������� ������� �������.\n ��� ��� ��� �������, ��� ���������� ��� ������.");
        } else if (!prob(criticalChance) && !prob(failChance) && prob(criticalFailChance)) {
            damage = 0;
            System.out.println("�� �������� " + Math.round(damage) + " ����� �� " + weaponName + "! �� ������������, ������ ���������� � ��� � �����, ����������\n ������ �� ��� ������, �� ������� ������� ������, ������ ��������� ��������, \n ��� ���� ���������� ������������, �������� ���������� �� ���, ��������� \n ���� �� ������, ������� ������� �����������.");
        } else {
            damage = damageDiapason(basicDamage);
            System.out.println("�� �������� " + Math.round(damage) + " ����� �� " + weaponName + "!");
        }
    }
}
