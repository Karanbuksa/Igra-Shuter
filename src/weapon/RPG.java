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
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "! На месте падения заряда образовался кратор, напоминающий \nлунный, а в небо поднимается ядерный гриб. Вы смутно припоминаете надпись \n\"Экспериментальное оружие\" над ящиком, где брали снаряды.");
        } else if (!prob(criticalChance) && prob(failChance) && !prob(criticalFailChance)) {
            damage = 0.5 * damageDiapason(basicDamage);
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "! Порох промок...");
        } else if (!prob(criticalChance) && !prob(failChance) && prob(criticalFailChance)) {
            damage = 0;
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "! Вы промахнулись, оружие взорвалось у вас в руках, пожизненно\n сделав из вас калеку, на Пустоши начался кризис, крышки потерпели инфляцию, \n все ваши накопления обесценились, родители отказались от вас, напарники \n ушли из отряда, лучевая болезнь обостряется.");
        } else {
            damage = damageDiapason(basicDamage);
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "!");
        }
    }
}
