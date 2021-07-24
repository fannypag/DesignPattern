public class MainClass {
    public static void main(String[] args) {
        IDuck mallardDuck = new MallardDuck();
        System.out.println("---------MallardDuck---------");
        mallardDuck.fly();
        mallardDuck.quack();

        ITurkey turkey = new RoyalPalmTurkey();
        System.out.println("----------RoyalpalmTurkey----------");
        turkey.gobble();
        turkey.fly();

        IDuck duck = new TurkeyAdapter(turkey);
        System.out.println("---------Turkey---------");
        duck.quack();
        duck.fly();
    }
}
 