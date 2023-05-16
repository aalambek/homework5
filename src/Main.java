public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHp(700);
        boss.setDefence("Claws");

        System.out.println("Boss : "+boss.getDamage() + " - damage, " + boss.getHp() + " - hp, " + boss.getDefence()+ " - defence ");

        Hero[] heroes = createHeroes();
        for (Hero hero:
             heroes) {
            System.out.println("Heroes health: "+ hero.getHp() + " Heroes damage: "+ hero.getDamage() + " Heroes ability: "+hero.getSuperAbility());
        }

    }

    public static Hero[] createHeroes(){
        Hero spider = new Hero(250, 20, "net");
        Hero fly = new Hero(100, 10, "flyable");
        Hero golem = new Hero(500, 50);
        Hero [] heroes = {spider, fly, golem};
        return heroes;
    }
}