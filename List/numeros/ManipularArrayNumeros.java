


import java.util.List;

public class ManipularArrayNumeros {



    public static int buscarPosicaoNumero(List<Integer> numeros, int i) {
        if (numeros.contains(i)){
            return numeros.indexOf(i);
        }
            return -1;
    }
    public static void adicionarNumero(List<Integer> numeros, int i){
        if (buscarPosicaoNumero(numeros, i) != -1){
            numeros.add(i);
        }else {
            throw new IllegalArgumentException("Numero jah contido na lista");
        }

    }

    public static void removerNumero(List<Integer> numeros, int i) {
        if (buscarPosicaoNumero(numeros, i) != -1){
            numeros.remove(buscarPosicaoNumero(numeros, i));
        }else {
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        }
    }

    public static void substituirNumero(List<Integer> numeros, int numeroSubstituir, int numeroSubstituto) {
        if (numeros.contains(numeroSubstituir)){
            numeros.set(buscarPosicaoNumero(numeros,numeroSubstituir),numeroSubstituto);
        }else {
            numeros.add(numeroSubstituto);
        }
    }
}
