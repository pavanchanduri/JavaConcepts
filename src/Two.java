public class Two extends One{

    public void testTwo() {
        System.out.println("testTwo");
    }

    @Override
    public void testOne() {
        System.out.println("testOne but in Class Two");
    }
}
