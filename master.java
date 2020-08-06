import java.io.*;
import java.util.Random;
public class master{

    public static void main(String[] args)throws IOException{

        System.out.println("Who are you?");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println("Hello, "+str+"!");
        Random r = new Random();
        int coin = r.nextInt(2);
        int head=0;
        int tail=0;
        String hf;
        System.out.println("Tossing a coin");
        for(int i=1;i<4;i++){
	    coin = (int)(Math.random() * 2);
            if (coin == 0){
                hf = "Heads";
                head++;
            }
            else if (coin ==1){
                hf = "Tails";
                tail++;
            }
            System.out.println("Round "+i+":"+coin);

        }
        System.out.println("Heads: "+head+", Tails: "+tail);
        if(head>tail)
            System.out.println(str +" won!");
        else
            System.out.println(str +" lost!");
    }
}