public class Numero {
    public static void dividir(int a, int b){
        try{
            int c;
          c = a / b;
            System.out.println(a + " / " + b + " = " + c);
          if (b == 0){
              throw new Exception("Nao eh permitido fazer uma divisao por zero!");
          }
        }catch (Exception e){
            System.out.println("Nao eh possivel dividir por zero");
        }finally {
            System.out.println();
        }
    }
}
