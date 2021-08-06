package domain;

public class ResultObj {

    private final String candidateName;
    private final String candidatePos;

    public ResultObj(String candidateName, int candidatePos){
        this.candidateName = candidateName;
        this.candidatePos = resultUnderBar(candidatePos);
    }

    private String resultUnderBar(int candidatePos) {
        return "_".repeat(candidatePos);
    }

    public String showCandidateName(){
        return candidateName;
    }

    public String showCandidatePos(){
        return candidatePos;
    }

}
