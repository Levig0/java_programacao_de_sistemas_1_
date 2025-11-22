public class Sistema {
    public static void main(String[] args) {
        Carro carro = new Carro(4);
        Motocicleta moto = new Motocicleta(2);
        Aquatico barco = new Aquatico();
        Aereo aviao = new Aereo();

        carro.locomover();
        carro.acelerar();
        carro.frear();
        moto.locomover();
        moto.acelerar();
        moto.frear();
        barco.atracar();
        barco.desatracar();
        aviao.decolar();
        aviao.aterrisar();
    }
    
}
