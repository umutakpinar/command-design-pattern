public class PizzaSiparisi implements Siparis{
    //Siparis sınıfından türetilmiş bir sınıftır. (ICommand'dan türetilmiş bir Command yapısıdır.)

    @Override
    public void execute(Asci asci) {
        // Aşçının pizza yapma metodunu çalıştıran kodlar.
        asci.pizzaYap();
    }
}


