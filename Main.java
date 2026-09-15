public class Main {

    public static void main(String[] args) {

        MaquinaDeLavar maquina = new MaquinaDeLavar();

        maquina.ligar();
        maquina.fecharTampa();
        maquina.iniciarLavagem();
        maquina.pausarLavagem();
        maquina.retomarLavagem();
        maquina.concluirLavagem();
        maquina.iniciarCentrifugacao();
        maquina.concluirCentrifugacao();
        maquina.desligar();

    }
}
