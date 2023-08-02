public class Grader {
    public char findGrade(int numberGrade) {
        if(numberGrade < 0 ) {
            throw new IllegalArgumentException("number grade can not found");
        }
        else if(numberGrade <60) {
            return
             'F';
             } 
        else if(numberGrade <70) {
            return 'D';
        }

        else if(numberGrade <80) {
            return 'C';
         }

        else if(numberGrade <90) {
            return 'B';
         }
         
        else  {
            return 'A';
         }

        }
}

