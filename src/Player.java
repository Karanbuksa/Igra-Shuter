import weapon.Weapon;

class Player {
    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{
                // TODO заполнить слоты оружием
                new weapon.MachineGun(35, 50, 23, 9, "автомата"),
                new weapon.Pistol(15, 40, 15, 7, "пистолета"),
                new weapon.RPG(150, 10, 35, 27, "РПГ"),
                new weapon.Slingshot(4, 10, 8, 1, "рогатки"),
                new weapon.WaterPistol(2, 3, 12, 6, "водяного пистолета")
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot >= weaponSlots.length || slot <= -1) {
            System.out.println("Введён неверный слот оружия, попробуйте ещё раз");
            return;
        }


        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}