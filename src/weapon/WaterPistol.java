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
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "!\n Последнее, что вы помните, было нажатие на курок маленькой \nигрушки. Вы с трудом выбираетесь из под завалов. Что это было?");
        } else if (!prob(criticalChance) && prob(failChance) && !prob(criticalFailChance)) {
            damage = 0.9 * damageDiapason(basicDamage);
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "!\n Вода начинает кончаться");
        } else if (!prob(criticalChance) && !prob(failChance) && prob(criticalFailChance)) {
            damage = 0;
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "!\n Вы промахнулись, оружие взорвалось у вас в руках, пожизненно\n сделав из вас калеку, на Пустоши начался кризис, крышки потерпели инфляцию, \n все ваши накопления обесценились, родители отказались от вас, напарники \n ушли из отряда, лучевая болезнь обостряется.");
        } else {
            damage = damageDiapason(basicDamage);
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "!");
        }
    }
}
