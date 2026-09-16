import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MaquinaDeLavar maquina = new MaquinaDeLavar();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- PAINEL DA MÁQUINA DE LAVAR ---");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Abrir Tampa");
            System.out.println("4 - Fechar Tampa");
            System.out.println("5 - Iniciar Lavagem");
            System.out.println("6 - Pausar Lavagem");
            System.out.println("7 - Retomar Lavagem");
            System.out.println("8 - Concluir Lavagem (Avançar etapa)");
            System.out.println("9 - Iniciar Centrifugação");
            System.out.println("10 - Concluir Centrifugação (Avançar etapa)");
            System.out.println("0 - Sair do Programa");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            System.out.println(); // Linha em branco para organizar a leitura

            switch (opcao) {
                case 1: maquina.ligar(); break;
                case 2: maquina.desligar(); break;
                case 3: maquina.abrirTampa(); break;
                case 4: maquina.fecharTampa(); break;
                case 5: maquina.iniciarLavagem(); break;
                case 6: maquina.pausarLavagem(); break;
                case 7: maquina.retomarLavagem(); break;
                case 8: maquina.concluirLavagem(); break;
                case 9: maquina.iniciarCentrifugacao(); break;
                case 10: maquina.concluirCentrifugacao(); break;
                case 0: System.out.println("Encerrando o sistema..."); break;
                default: System.out.println("Opção inválida!"); break;
            }
        }

        scanner.close();
    }
}
