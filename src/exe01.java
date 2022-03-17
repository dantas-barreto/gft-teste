
public class exe01 {

    public static void main(String[] args) throws Exception{

        int[] numTeste = new int[] {15485448, 2195498, 12, 98716549, 1654891};

       for (int num : numTeste) {
           int x = num;

           int inv = 0;

           while (x != 0) {
               int aux = x % 10;
               inv = inv * 10 + aux;
               x = x / 10;
           }
           System.out.println(inv);
       }
    }
}
