import java.util.Random;
import java.util.Scanner;

public class stonePaperScissor
{

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);
        int user_inp = user.nextInt(3);
        Random Comp=new Random();
        int Computer=Comp.nextInt(3);
        String comp_move;
        if (Computer==0){
            comp_move=" : Rock";
        }
        else if (Computer==1){
            comp_move=" : Paper";
        }
        else {
            comp_move=" : Scissor";
        }
        switch (user_inp){
            case 0:{
                System.out.println("You :Rock");
                System.out.println("VS");
                System.out.println("Computer"+comp_move);
                break;
            }
            case 1:{
                System.out.println("You :Paper");
                System.out.println("VS");
                System.out.println("Computer"+comp_move);
                break;
            }
            case 2:{
                System.out.println("You :Scissor");
                System.out.println("VS");
                System.out.println("Computer"+comp_move);
                break;
            }
        }
        if(Computer==user_inp){
            System.out.println("DRAW");
        } else if (user_inp==0&&Computer==2||user_inp==1&&Computer==0) {
            System.out.println("You Won");

        }
        else {
            System.out.println("Computer Won");
        }
    }
}
