public class Numero {
    public static void dividir(int a, int b){
        int c = 0;
        try{

          c = a / b;

          if (b == 0){
              throw new Exception("Nao eh permitido fazer uma divisao por zero!");
          }
        }catch (Exception e){
            System.out.println("Nao eh possivel dividir por zero");
        }finally {
            System.out.println(a + " / " + b + " = " + c);
        }
    }
}
