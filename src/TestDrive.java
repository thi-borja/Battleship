public class TestDrive {
    public static void main(String[] args) {
        Battleship bat = new Battleship();

        int[] localizacao = {4,5,6};
        bat.setPosicoes(localizacao);
        String chute = "5";
        String resultado = bat.checar(chute);
    }
}
