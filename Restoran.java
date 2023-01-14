public class Restoran {
    public static void main(String[] args) {
        /* Burası bizim restoranımız */
        Asci asci = new Asci();
        Garson garson = new Garson(asci);

        Musteri musteri1 = new Musteri(garson,new PizzaSiparisi());
    }
}