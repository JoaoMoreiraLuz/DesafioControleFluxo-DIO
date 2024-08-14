import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro parâmetro em numero: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro em numero: ");
        int parametroDois = terminal.nextInt();

            try {
                contar(parametroUm, parametroDois);
            } catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
            }
        }
        

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if(parametroUm>parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            int contagem = parametroDois - parametroUm;

            for(int numeroAtual=0; numeroAtual < contagem; numeroAtual++) {
                System.out.println("Imprimindo número: " + (numeroAtual+1));
            }
        }
    }
}

