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
            System.out.println("Вы чувствуете благословение Артемиды, вам кажется, что из " + weaponName + " вы \nможете сбить даже муху на лету. Вы наносите " + Math.round(damage) + " урона из " + weaponName + "!");
        } else if (!prob(criticalChance) && prob(failChance) && !prob(criticalFailChance)) {
            damage = 0.7 * damageDiapason(basicDamage);
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "!\n Плечо устало.");
        } else if (!prob(criticalChance) && !prob(failChance) && prob(criticalFailChance)) {
            damage = 0;
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "!\n Вы промахнулись, оружие взорвалось у вас в руках, пожизненно\n сделав из вас калеку, на Пустоши начался кризис, крышки потерпели инфляцию, \n все ваши накопления обесценились, родители отказались от вас, напарники \n ушли из отряда, лучевая болезнь обостряется.");
        } else {
            damage = damageDiapason(basicDamage);
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "!");
        }
    }
}
