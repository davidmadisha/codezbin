package org.project6.tokens;

import org.project6.mainClasses.Stack;
import org.project6.mainClasses.Token;

/**
 * @author Amin Meyghani
 * @version Feb.19.2011 Data Structures project 6
 * @purpose This class represents an exponent token whose handle method
 *          describes how it should be processed according to the rules defined
 *          in the converter class.
 */
public class Exponent extends Operator implements Token {

	public Exponent(String read) {
		super(read);
	}

	public String toString() {
		return "+";
	}

	public String handle(Stack s) {
		toBeAppended = checkCases(s);
		s.push(readToken);
		return toBeAppended;
	}

}