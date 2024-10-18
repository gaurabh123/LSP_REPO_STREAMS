package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class VotingMachine {
	private Map<String, Candidate> allCandidates;
	
	/**
     * Constructs a VotingMachine.
     * 
     */
    public VotingMachine() {
    	allCandidates = new HashMap<>();
    }
    
    /**
     * Adds a candidate with the specified name to the list.
     *
     * @param name the name of the candidate
     */
    public void addCandidate(String name) {
        if (!allCandidates.containsKey(name)) {
        	allCandidates.put(name, new Candidate(name));
        }
    }
    
    /**
     * Casts a vote to the candidate with the specified name.
     *
     * @param name the name of the candidate
     */
    public void castVote(String name) {
        Candidate candidate = allCandidates.get(name);
        if (candidate != null) {
            candidate.increaseVote();
        }
    }
    
    /**
     * String to represent the vote for candidate. 
     *
     * @return a string representation of the voting results
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        
        for (Candidate candidate : allCandidates.values()) {
            result.append(candidate.getCandiateName()).append(": ").append(candidate.getCandidateVotes()).append(" votes\n");
        }
        return result.toString();
    }
}
