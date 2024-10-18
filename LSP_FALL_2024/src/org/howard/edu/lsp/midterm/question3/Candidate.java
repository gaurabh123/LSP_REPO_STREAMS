package org.howard.edu.lsp.midterm.question3;

/**
 * The Candidate class represents a candidate with a name and number of votes.
 * 
 */
public class Candidate {
	
	private String candiateName;
    private int candidateVotes;
    
    /**
     * Constructor for the candidate class. 
     *
     * @param candiateName the name of the candidate
     */
    public Candidate(String candiateName) {
        this.candiateName = candiateName;
        this.candidateVotes = 0;
    }

	public String getCandiateName() {
		return candiateName;
	}

	public void setCandiateName(String candiateName) {
		this.candiateName = candiateName;
	}

	public int getCandidateVotes() {
		return candidateVotes;
	}

	public void setCandidateVotes(int candidateVotes) {
		this.candidateVotes = candidateVotes;
	}
	
	/**
	 * Increments the number of votes by one.
	 */
    public void increaseVote() {
    	candidateVotes++;
    }
    
}
