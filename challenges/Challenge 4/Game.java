import java.util.Random;
import java.util.Scanner;


public class Game {


public static String computerChoice(){
        Random random = new Random();
        int randomNumber=random.nextInt(3);
        if(randomNumber==0){
            return "rock";
        }
        else if(randomNumber==1){
            return "scissors";
        }
        else {
            return "paper";
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors in lowercase.");
        System.out.println("Are you ready? Write 'yes' if you are");
        String choicec=scan.nextLine();
        if(choicec.equals("yes") || choicec.equals("YES") || choicec.equals("YES")){

            System.out.println("Great!");
            System.out.println(" rock - paper - scissors, shoot");
            String choice=scan.nextLine();
            String computerChoice = computerChoice(); 
            System.out.println("You choose"+ choice);
            System.out.println("Computer choose "+ computerChoice);
            if(choice.equals("rock")&& computerChoice.equals("rock")){
                System.out.println("Tie");
            }

            if(choice.equals("rock")&& computerChoice.equals("paper")){
                System.out.println("You loose");
            }

            if(choice.equals("rock")&& computerChoice.equals("scissors")){
                System.out.println(" You Win");
            }

            if(choice.equals("paper")&& computerChoice.equals("paper")){
                System.out.println("Tie");
            }

            if(choice.equals("paper")&& computerChoice.equals("scissors")){
                System.out.println("You loose");
            }

            if(choice.equals("paper")&& computerChoice.equals("rock")){
                System.out.println(" You Win");
            }

            if(choice.equals("scissors")&& computerChoice.equals("scissors")){
                System.out.println("Tie");
            }

            if(choice.equals("scissors")&& computerChoice.equals("rock")){
                System.out.println("You loose");
            }

            if(choice.equals("scissors")&& computerChoice.equals("paper")){
                System.out.println(" You Win");
            }


        

        }
        else{
            System.out.println("Okay see you next time !");
        }
        scan.close();
    }
    
}
