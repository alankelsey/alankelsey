//Alan kelsey
//alankelsey@u.boisestate.edu
//

public class Grade
{
    //Instance variables
    int examPointsEarned;
    int examPointsPossible;
    int homeworkPointsEarned;
    int homeworkPointsPossible;
    public String Letter;

    //Setter  method for exams
    public void setExamScore(int pointEarn, int pointPoss)
    {
        examPointsPossible = pointPoss;
        examPointsEarned = pointEarn;
    }
    
    //setter method for homework
    public void setHomeworkScore(int pointEarn, int pointPoss)
    {
        homeworkPointsPossible = pointPoss;
        homeworkPointsEarned = pointEarn;

    }

    //getter mehtod for exam
    public double getExamPercentage()
    {
       double numerator = examPointsEarned;
       double denominator = examPointsPossible; 
       double examPercent = (double) numerator / denominator;
       return examPercent;
    }
    

    //getter mehtod for homework
    public double getHomeworkPercentage()
    {
        double numerator = homeworkPointsEarned;
        double denominator = homeworkPointsPossible;
        double homeworkPercent = (double)numerator / denominator;
        return homeworkPercent;
    }
    
    //method converts to letter grade from percentage
    public String getLetterGrade()
    {
        double examPercent = getExamPercentage();
        double homeworkPercent = getHomeworkPercentage();
        double percent = (((0.5 * (examPercent)) + (0.5 * (homeworkPercent))) * 100 );
        String letter;

        //begin letter logic
        if ((percent >= 93))
             letter = "A";
        else if ((percent >= 90) && (percent < 93))
            letter = "A-";
        else if ((percent >= 88) && (percent < 90))
            letter = "B+";
        else if ((percent >= 83) && (percent < 88))
            letter = "B";
        else if ((percent >= 80) && (percent < 83))
            letter = "B-";
        else if ((percent >= 78) && (percent < 80))
            letter = "C+";
        else if ((percent >= 73) && (percent < 78))
            letter = "C";
        else if ((percent >= 70) && (percent < 73))
            letter = "C-";
        else if ((percent >= 68) && (percent < 70))
            letter = "D+";
        else if ((percent >= 60) && (percent < 68))
            letter = "D";
        else if ((percent >= 55) && (percent < 60))
            letter = "D-";
        else if ((percent < 55))
            letter = "F";
        else
        {
            letter = "Error with percentage";
        }
        return letter;    

    }
    
    //method creates grade report
    public String printGradeReport( )
    {
        String gradeReport;
        gradeReport = getLetterGrade();
        return gradeReport;

    }



    
}//End Grade class
