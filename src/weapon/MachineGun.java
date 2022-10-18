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
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "! Внезапно оружие выдало резкую очередь, звук походит на \nленточный пулемёт. Странно, но дуло не разорвало...");
        } else if (!prob(criticalChance) && prob(failChance) && !prob(criticalFailChance)) {
            damage = 0.4 * damageDiapason(basicDamage);
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "! В левую сторону из автомата выпрыгивает длинная пружина.\n Так вот что гремело, как погремушка при ходьбе.");
        } else if (!prob(criticalChance) && !prob(failChance) && prob(criticalFailChance)) {
            damage = 0;
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "! Вы промахнулись, оружие взорвалось у вас в руках, пожизненно\n сделав из вас калеку, на Пустоши начался кризис, крышки потерпели инфляцию, \n все ваши накопления обесценились, родители отказались от вас, напарники \n ушли из отряда, лучевая болезнь обостряется.");
        } else {
            damage = damageDiapason(basicDamage);
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "!");
        }
    }
}
