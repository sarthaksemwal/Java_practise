import java.util.Scanner;
 public class TQuiz {

    public static void main(String[] args) {

        int score=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Welcome to the Quiz\n");  
   System.out.println("1. Which country held the 2016 Summer Olympics?");
   System.out.println("\ta) China\n\tb) Ireland\n\tc) Brazil\n\td) Italy\n");
   String one=scan.nextLine();
   if(one.equals("c")){
    score+=5;
   }





   System.out.println("\n2. Which planet is the hottest?");
        System.out.println("\ta) Venus\n\tb) Saturn\n\tc) Mercury\n\td) Mars\n");
        String two=scan.nextLine();
        if(two.equals("a")){
            score+=5;
           }



        System.out.println("\n3. What is the rarest blood type?");
        System.out.println("\ta) O\n\tb) A\n\tc) B\n\td) AB-Negative\n");
        String three=scan.nextLine();
        if(three.equals("d")){
            score+=5;
           }


        System.out.println("\n4. Which one of these characters is friends with Harry Potter?");
        System.out.println("\ta) Ron Weasley\n\tb) Hermione Granger\n\tc) Draco Malfoy\n");
        String four=scan.nextLine();
        if(four.equals("a") || four.equals("b")){
            score+=5;
           }

           System.out.println("Your total score is :" + score);

           if(score>15){
            System.out.println("Wow, you know your stuff!");
           }
           else if(score<15 && score>0 || score==5){
            System.out.println("Not bad!");
           }

           else if(score==0){
            System.out.println("better luck next time.");
           }


           scan.close();

    }
    
}