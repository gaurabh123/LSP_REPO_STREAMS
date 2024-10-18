package org.howard.edu.lsp.midterm.question3;

/**
 * Driver Class for voting machine. 
 * 
 */
public class VotingMachineDriver {
	
    /**
     * The main method is the entry point of the application.
     * 
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
    	
        VotingMachine vm = new VotingMachine();
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");
        vm.addCandidate("Hogan");
        System.out.println(vm.toString()); 
    }
}

