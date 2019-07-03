//Alan Kelsey
//alankelsey@u.boisestate.edu
//
//simulated Magic Ball

import java.util.Random;

public class EightBall
{
   public static int m_currentAnswer = 0;
       
    //calls random answer
    public static void shake()
    {
        Random shake = new Random();
        int randomValue = shake.nextInt(20) + 1;
      
        m_currentAnswer = randomValue;
                     
    }

    //converts random in to string answer
    public static  String num2answer(int num)
    {
        if (num == 1)
           return "It is certain";
        else if (num == 2)
            return "It is decidedly so";
        else if (num == 3)
            return "Without a doubt";
        else if (num == 4)
            return "Yes - definitely";
        else if (num == 5)
            return "You may rely on it";
        else if (num == 6)
            return "As I see it, yes";
        else if (num == 7)
            return "Most Likely";
        else if (num == 8)
            return "Outlook good";
        else if (num == 9)
            return "Yes";
        else if (num == 10)
            return "Signs point to yes";
        else if (num == 11)
            return "Reply hazy, try again";
        else if (num == 12)
            return "Ask again later";
        else if (num == 13)
            return "Better not tell you now";
        else if (num == 14)
            return "Cannot predict now";
        else if (num == 15)
            return "Concentrate and ask again";
        else if (num == 16)
            return "Don't count on it";
        else if (num == 17)
            return "My reply is no";
        else if (num == 18)
            return "My sources say no";
        else if (num == 19)
            return "Outlook not so good";
        else if (num == 20)
            return "Very doubtful";
        else
            return "invlaid index";
        }

        // just returns the current answer
        public static String getAnswer()
        {
          return num2answer(m_currentAnswer); 
        }

        //prints the current answer
        public static void printAnswer()
        {
            System.out.println(getAnswer());
        }
    
}
