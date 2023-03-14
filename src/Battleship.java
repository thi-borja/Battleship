public class Battleship{

    int[] celulas;
    int acertos = 0;

    public void setPosicoes(int[] celulas) {
        this.celulas = celulas;
    }

    public String checar(String val){
        int valor = Integer.parseInt(val);

        String resultado = "Errou";

        for (int cell : celulas){

            if(valor == cell){
                resultado = "Acertou";
                acertos++;
                break;
            }
        }

        if (acertos == celulas.length){
            resultado = "Derrubou";
        }

        System.out.println(resultado);
        return resultado;
    }
}
