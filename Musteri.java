public class Musteri {
    // Bu sınıf Command Design Pattern'in Client yapısıdır.
    Garson garson;
    Siparis siparis;
    public Musteri(Garson _garson, Siparis _siparis){
        siparisVer(_garson, _siparis);
    }

    public void siparisVer(Garson _garson, Siparis _siparis){
        garson = _garson;
        siparis = _siparis;
        garson.siparisAl(siparis);
    }
}


