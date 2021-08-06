package domain;

public class ResultObj {

    private final String candidateName;
    private final String candidatePos;

    public ResultObj(String candidateName, int candidatePos){
        this.candidateName = candidateName;
        this.candidatePos = resultUnderBar(candidatePos);
    }

    public String resultUnderBar(int candidatePos) {
        return "_".repeat(Math.max(0, candidatePos));
    }

    public String showCandidateName(){
        return candidateName;
    }

    public String showCandidatePos(){
        return candidatePos;
    }

}
