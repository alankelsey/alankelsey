//Alan Kelsey
//alankelsey@u.boisestate.edu
//
//app to demonstrate that grade.java works
//

public class GradeApp
{

    public static void main(String [] args)
    {
        Grade aaron = new Grade();
         
        aaron.setExamScore(180, 200);
        aaron.setHomeworkScore(437, 500);
        System.out.println(aaron.getLetterGrade());
        
        Grade bob = new Grade();        
        bob.setExamScore(72, 80);
        bob.setHomeworkScore(320, 340);
        System.out.println(bob.getLetterGrade());

        Grade christy = new Grade();
        christy.setExamScore(270, 310);
        christy.setHomeworkScore(834, 900);
        System.out.println(christy.getLetterGrade());
        
    }
}
