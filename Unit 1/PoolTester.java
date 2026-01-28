public class PoolTester {
    public static void main(String[] args) {
        Pool pool = new Pool();
        System.out.println(PoolUtils.generateUsername(pool.getName()));
    }
}
