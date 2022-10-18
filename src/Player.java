import weapon.Weapon;

class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                // TODO ��������� ����� �������
                new weapon.MachineGun(35, 50, 23, 9, "��������"),
                new weapon.Pistol(15, 40, 15, 7, "���������"),
                new weapon.RPG(150, 10, 35, 27, "���"),
                new weapon.Slingshot(4, 10, 8, 1, "�������"),
                new weapon.WaterPistol(2, 3, 12, 6, "�������� ���������")
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot >= weaponSlots.length || slot <= -1) {
            System.out.println("����� �������� ���� ������, ���������� ��� ���");
            return;
        }


        // �������� ������ �� ���������� �����
        Weapon weapon = weaponSlots[slot];
        // �����!
        weapon.shot();
    }
}