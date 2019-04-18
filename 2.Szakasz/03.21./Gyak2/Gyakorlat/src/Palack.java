public class Palack extends Hulladek implements Ujrahasznosíthato{

    public Palack(String leiras) {
        super("uveg");
        setLeiras(leiras);
    }

    @Override
    public void ujrahasznosit() {
        System.out.println(getAlapanyag());
    }

    @Override
    public void megsemmisit() {
        super.megsemmisit();
        ujrahasznosit();
    }
}
