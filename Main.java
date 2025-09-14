public class Main {
    public static void main(String[] args) {

        Pizza p = new Pizza.Builder()
                .setSize("Large")
                .setCheese("Mozzarella")
                .setTopping("Pepperoni")
                .setExtraSauce(true)
                .build();

        System.out.println(p);

    }
}
