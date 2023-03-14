import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int contador = 0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        Battleship battle = new Battleship();
        int aleatorio = (int) (Math.random()*5);

        int[] localizacoes = {aleatorio, aleatorio+1, aleatorio+2};
        battle.setPosicoes(localizacoes);
        boolean vivo = true;

        while (vivo == true) {
            String chute = r.readLine();
            String resultado = battle.checar(chute);

            contador++;
            if (resultado.equals("Derrubou")) {
                vivo = false;
            }

        }

        System.out.println("Você venceu em: " + contador + " tentativas.");
    }
}

