public class TurkeyAdapter implements IDuck {
    private ITurkey turkey;

    public TurkeyAdapter(ITurkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
    	for (int i = 0; i < 5; i++) {
        turkey.fly();
    	}
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
