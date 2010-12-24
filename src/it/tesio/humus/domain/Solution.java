package it.tesio.humus.domain;

import java.util.Enumeration;

/**
 * A solution
 * @author Giacomo Tesio
 */
public interface Solution {
	
	/**
	 * Return the identifier of the solution
	 * @return
	 */
	SolutionIdentifier getIdentifier();
	
	/**
	 * Return the title of the solution
	 * @return
	 */
	String getTitle();
	
	/**
	 * Return a description of the solution
	 * @return
	 */
	String getDescription();
	
	/**
	 * Return the list of problems this solution would solve.
	 * @return
	 */
	Enumeration<ProblemIdentifier> getTargetProblems();
}
