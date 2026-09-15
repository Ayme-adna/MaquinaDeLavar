public class MaquinaDeLavar {

    private EstadosMaquina estado;
    private boolean tampaFechada;

    public MaquinaDeLavar() {
        estado = EstadosMaquina.DESLIGADA;
        tampaFechada = false;
    }

    public void ligar() {
        if (estado == EstadosMaquina.DESLIGADA) {
            estado = EstadosMaquina.LIGADA;
            System.out.println("Máquina ligada.");
        } else {
            System.out.println("A máquina já está ligada.");
        }
    }

    public void desligar() {
        if (estado == EstadosMaquina.DESLIGADA) {
            System.out.println("A máquina já está desligada.");
        } else if (estado == EstadosMaquina.LAVANDO ||
                   estado == EstadosMaquina.CENTRIFUGANDO) {
            System.out.println("Não pode desligar agora.");
        } else {
            estado = EstadosMaquina.DESLIGADA;
            System.out.println("Máquina desligada.");
        }
    }

    public void fecharTampa() {
        tampaFechada = true;
        System.out.println("Tampa fechada.");
    }

    public void abrirTampa() {
        if (estado == EstadosMaquina.LAVANDO ||
            estado == EstadosMaquina.CENTRIFUGANDO) {
            System.out.println("Não pode abrir a tampa agora.");
        } else {
            tampaFechada = false;
            System.out.println("Tampa aberta.");
        }
    }

    public void iniciarLavagem() {
        if (estado == EstadosMaquina.DESLIGADA) {
            System.out.println("A máquina está desligada.");
        } else if (!tampaFechada) {
            System.out.println("Feche a tampa primeiro.");
        } else if (estado == EstadosMaquina.LIGADA) {
            estado = EstadosMaquina.LAVANDO;
            System.out.println("Lavagem iniciada.");
        } else {
            System.out.println("Não pode iniciar a lavagem agora.");
        }
    }

    public void pausarLavagem() {
        if (estado == EstadosMaquina.LAVANDO) {
            estado = EstadosMaquina.PAUSADA;
            System.out.println("Lavagem pausada.");
        } else {
            System.out.println("Não pode pausar agora.");
        }
    }

    public void retomarLavagem() {
        if (estado == EstadosMaquina.PAUSADA) {
            estado = EstadosMaquina.LAVANDO;
            System.out.println("Lavagem retomada.");
        } else {
            System.out.println("A lavagem não está pausada.");
        }
    }

    public void concluirLavagem() {
        if (estado == EstadosMaquina.LAVANDO) {
            estado = EstadosMaquina.CONCLUIDA;
            System.out.println("Lavagem concluída.");
        }
    }

    public void iniciarCentrifugacao() {
        if (estado == EstadosMaquina.CONCLUIDA) {
            estado = EstadosMaquina.CENTRIFUGANDO;
            System.out.println("Centrifugação iniciada.");
        } else {
            System.out.println("Conclua a lavagem primeiro.");
        }
    }

    public void concluirCentrifugacao() {
        if (estado == EstadosMaquina.CENTRIFUGANDO) {
            estado = EstadosMaquina.CONCLUIDA;
            System.out.println("Centrifugação concluída.");
        }
    }
}
