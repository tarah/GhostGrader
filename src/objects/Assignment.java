package objects;

import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
/**
 * Object representing an assignment for a course
 * 
 * @author Jesse W. Milburn
 * @date 01 October, 2013
 */
public class Assignment {
    private String name;
    private int worth;
    private Map<String, Double> grades = new HashMap<String, Double>();
    
    /**
     * Creates an Assignment object
     * 
     * @param an	Name of the assignment
     * @param val	Maximum point value of the assignment
     */
    public Assignment(String an, int val) {
        name = an;
        worth = val;
    }
    
    /**
     * Sets a name to the name field
     * 
     * @param an	Sets the name of the assignment
     */
    public void setName(String an) {
    	name = an;    	
    }
    
    /**
     * Sets the maximum point value for the assignment
     * 
     * @param val	Maximum point value of the assignment
     */
    public void setWorth(int val) {
    	worth = val;
    }
    
    /**
     * Fetches the name field of the assignment
     * 
     * @return		The title of the assignment
     */
    public String getName() {
        return name;
    }
    
    /**
     * Fetches the maximum point value for the assignment
     * 
     * @return		Maximum point value of the assignment
     */
    public int getWorth() {
        return worth;
    }
    
    /**
     * Sets the grade for the student by the students pseudo name
     * 
     * @param pseudoName	The pseudo name of the student
     * @param grade			The score the student is being assigned for the assignment
     * @return				The previous value associated to the key.
     */
    public Double setGrade(String pseudoName, Double grade) {
    	return grades.put(pseudoName, grade);
    }
    
    /**
     * Gets the grade for the requested student
     * 
     * @param pseudoName	The pseudo name of the student
     * @return				Double value representing the students grade. Returns
     * 						null if the mapping is empty, or if the pseudo name 
     * 						does not exist as a key.
     */
    public Double getGrade(String pseudoName) {
    	return grades.get(pseudoName);
    }
    
    /**
     * Gets a collection of all the values in the grades HashMap
     * Useful for dealing with statistical analysis
     * 
     * @return		Collection of values in the grades HashMap
     */
    public Collection<Double> getAllGrades() {
    	return grades.values();
    }
    
    public Double getClassAssignmentAverage{
        assignmentGradeSum = 0;
        for(Double grade : grades.values()){
            assignmentGradeSum += grade;
        }
        
        return (assignmentGradeSum / assignment.getWorth()) /
    }
    
}
