public class SingleTonTest {

    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstanse();
        SingleTon singleTon2 = SingleTon.getInstanse();

        System.out.println(singleTon);
        System.out.println(singleTon2);
    }
}
