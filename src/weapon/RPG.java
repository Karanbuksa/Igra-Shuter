package weapon;

public class RPG extends Weapon {
    public RPG(int basicDamage, int criticalChance, int failChance, int criticalFailChance, String weaponName) {
        super(basicDamage, criticalChance, failChance, criticalFailChance, weaponName);
    }

    @Override
    public void shot() {
        double damage;
        if (prob(criticalChance) && !prob(failChance) && !prob(criticalFailChance)) {
            damage = 8 * damageDiapason(basicDamage);
            System.out.println("�� �������� " + Math.round(damage) + " ����� �� " + weaponName + "! �� ����� ������� ������ ����������� ������, ������������ \n������, � � ���� ����������� ������� ����. �� ������ ������������ ������� \n\"����������������� ������\" ��� ������, ��� ����� �������.");
        } else if (!prob(criticalChance) && prob(failChance) && !prob(criticalFailChance)) {
            damage = 0.5 * damageDiapason(basicDamage);
            System.out.println("�� �������� " + Math.round(damage) + " ����� �� " + weaponName + "! ����� ������...");
        } else if (!prob(criticalChance) && !prob(failChance) && prob(criticalFailChance)) {
            damage = 0;
            System.out.println("�� �������� " + Math.round(damage) + " ����� �� " + weaponName + "! �� ������������, ������ ���������� � ��� � �����, ����������\n ������ �� ��� ������, �� ������� ������� ������, ������ ��������� ��������, \n ��� ���� ���������� ������������, �������� ���������� �� ���, ��������� \n ���� �� ������, ������� ������� �����������.");
        } else {
            damage = damageDiapason(basicDamage);
            System.out.println("�� �������� " + Math.round(damage) + " ����� �� " + weaponName + "!");
        }
    }
}
