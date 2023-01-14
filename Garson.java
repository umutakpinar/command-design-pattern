public class Garson {
    // Bu sınıf Command Design Pattern'in Invoker yapısıdır.
    Siparis siparis;
    Asci asci;

    public Garson(Asci _asci){
        asci = _asci;
    }

    public void siparisAl(Siparis siparis){
        this.siparis = siparis;
        siparis.execute(this.asci);
    }
}


