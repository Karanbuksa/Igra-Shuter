package weapon;

public class Pistol extends Weapon {
    public Pistol(int basicDamage, int criticalChance, int failChance, int criticalFailChance, String weaponName) {
        super(basicDamage, criticalChance, failChance, criticalFailChance, weaponName);
    }

    @Override
    public void shot() {
        double damage;
        if (prob(criticalChance) && !prob(failChance) && !prob(criticalFailChance)) {
            damage = 1.5 * damageDiapason(basicDamage);
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "! Вместо малых отверстий противник обнаруживает в себе дыры,\n как будто насквозь прошёл теннисный мяч.");
        } else if (!prob(criticalChance) && prob(failChance) && !prob(criticalFailChance)) {
            damage = 0.5 * damageDiapason(basicDamage);
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "! Во время выстрела пистолет резко дёргается у вас в руке от\n отдачи и ломает вам палец, вылетая из руки. Вы ловко подхватываете\n его свободной рукой.");
        } else if (!prob(criticalChance) && !prob(failChance) && prob(criticalFailChance)) {
            damage = 0;
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "! Вы промахнулись, оружие взорвалось у вас в руках, пожизненно\n сделав из вас калеку, на Пустоши начался кризис, крышки потерпели инфляцию, \n все ваши накопления обесценились, родители отказались от вас, напарники \n ушли из отряда, лучевая болезнь обостряется.");
        } else {
            damage = damageDiapason(basicDamage);
            System.out.println("Вы наносите " + Math.round(damage) + " урона из " + weaponName + "!");
        }

    }
}
