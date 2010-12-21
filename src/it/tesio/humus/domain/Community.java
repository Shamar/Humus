package it.tesio.humus.domain;

import java.util.Date;
import java.util.Enumeration;

public interface Community {
	
	/**
	 * Community identifier
	 * @return Identifier of the community
	 */
	CommunityIdentifier getIdentifier();

	/**
	 * Name of the community
	 * @return Name of the community
	 */
	String getName();
	
	/**
	 * Return the community's description
	 * @return
	 */
	String getDescription();
	
	/**
	 * Set the description of the community
	 * @param description Description to use
	 */
	void setDescription(String description);

	/**
	 * Date of creation
	 * @return
	 */
	Date getCreationDate();
	
	/**
	 * Add a new member to the community (if not already joined)
	 * @param member Person to join
	 */
	void recieve(Person member);
	
	/**
	 * Remove the member from the community (actually flagging it as removed)
	 * @param member Person to remove
	 */
	void reject(Person member);

	/**
	 * Pose a problem to the community
	 * 
	 * @param author Author of the problem. The only one who can mark it as solved.
	 * @param title Short description of the problem
	 * @param description Full description of the problem
	 * @return
	 */
	Problem pose(Person author, String title, String description);
	
	/**
	 * Propose a solution to the target problem.
	 * 
	 * @param solution Solution to be evaluated from the community
	 * @param targetProblem Problem
	 */
	void propose(Solution solution, Problem targetProblem);
	
	/**
	 * Find a problem by identifier.
	 * @param problemId Indentifier to search
	 * @return The problem found or null if no such a problem has been posed.
	 */
	Problem findProblem(ProblemIdentifier problemId);
	
	/**
	 * Search for a problem with a title similar to the provided one.
	 * @param titlePattern
	 * @return Enumeration of problems.
	 */
	Enumeration<ProblemIdentifier> findProblems(String titlePattern);
}
