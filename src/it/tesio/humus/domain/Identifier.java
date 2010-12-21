/**
 * 
 */
package it.tesio.humus.domain;

/**
 * Base class for identifiers.
 * 
 * @author Giacomo Tesio
 */
public abstract class Identifier {

	/**
	 * Return a human readable representation of the identifier.
	 */
	public abstract String toString();
	
	/**
	 * Return a representation of the identifier compatible with an URI segment specification.
	 * {@link http://tools.ietf.org/html/rfc3986#section-3.3}
	 * @return A string that can be contained in a URI segment.
	 */
	public abstract String toURISegment();
	
	public boolean equals(Object other) {
		if(other instanceof Identifier)
			return equals((Identifier)other);
		return false;
	}
	
	public abstract boolean equals(Identifier other);
}
