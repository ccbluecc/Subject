package sit.int202.simple.simpletud;

public class CalcGrade {
    private int score;

    public int getScore() {
        return score;
    }

    public CalcGrade(int score) {
        this.score = score;
    }
    public String getGrade(){
        if (score > 80){
            return "A";
        } else if (score > 70) {
            return "B";
        } else if (score > 60) {
            return "C";
        } else if (score > 50) {
            return "D";
        }else if (score == 0){
            return "I";
        }else
            return "F";
    }
}
