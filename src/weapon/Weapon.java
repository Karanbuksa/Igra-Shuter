package weapon;

public abstract class Weapon {

    protected int basicDamage;
    protected int criticalChance;
    protected int failChance;
    protected int criticalFailChance;
    protected String weaponName;

    public Weapon(int basicDamage, int criticalChance, int failChance, int criticalFailChance, String weaponName) {
        this.basicDamage = basicDamage;
        this.criticalChance = criticalChance;
        this.failChance = failChance;
        this.criticalFailChance = criticalFailChance;
        this.weaponName = weaponName;

    }

    public void shot() {
        double damage;
        if (prob(criticalChance) && !prob(failChance) && !prob(criticalFailChance)) {
            damage = 1.5 * damageDiapason(basicDamage);
            System.out.println("Nice shot!");
        } else if (!prob(criticalChance) && prob(failChance) && !prob(criticalFailChance)) {
            damage = 0.5 * damageDiapason(basicDamage);
            System.out.println("Pathetic");
        } else if (!prob(criticalChance) && !prob(failChance) && prob(criticalFailChance)) {
            damage = 0;
            System.out.println("Oof");
        } else {
            damage = damageDiapason(basicDamage);
            System.out.println("Вы наносите " + Math.round(damage) + " урона!");
        }

    }

    protected static boolean prob(int percents) {
        return Math.random() < percents / 100.;
    }

    public double damageDiapason(int basicDamage) {
        return (Math.random() + 0.5) * basicDamage;
    }
}
