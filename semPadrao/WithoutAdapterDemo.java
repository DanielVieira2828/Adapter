public class WithoutAdapterDemo {
    public static void main(String[] args) {
        SimpleAdapteeWithoutAdapter adaptee = new SimpleAdapteeWithoutAdapter();

        // O cliente precisa saber sobre o método específico da classe SimpleAdapteeWithoutAdapter
        adaptee.specificRequest();
    }
}