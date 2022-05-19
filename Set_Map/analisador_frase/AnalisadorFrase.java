

import java.util.Locale;
import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String,Integer> contagemPalavras(String letra){
            TreeMap<String,Integer> map = new TreeMap<>();

            letra = letra.replace("?","");
            letra = letra.replace(".","");
            letra = letra.replace("!","");

            String[] contagem = letra.split(" ");

            int qtdPalavras = 0;

             for (int i =0; i < contagem.length;i++){
                for (int j = 0; j < contagem.length;j++){
                    if (contagem[i].equalsIgnoreCase(contagem[j])){
                        qtdPalavras++;
                    }
                }
                map.put(contagem[i].toLowerCase(),qtdPalavras );
                qtdPalavras = 0;
             }
        return map;
    }
}
