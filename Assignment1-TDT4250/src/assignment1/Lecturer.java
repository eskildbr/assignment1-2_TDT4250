/**
 */
package assignment1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lecturer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment1.Lecturer#getFullName <em>Full Name</em>}</li>
 *   <li>{@link assignment1.Lecturer#getCourse <em>Course</em>}</li>
 *   <li>{@link assignment1.Lecturer#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link assignment1.Lecturer#getFamilyName <em>Family Name</em>}</li>
 * </ul>
 *
 * @see assignment1.Assignment1Package#getLecturer()
 * @model
 * @generated
 */
public interface Lecturer extends EObject {
	/**
	 * Returns the value of the '<em><b>Full Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Full Name</em>' attribute.
	 * @see #setFullName(String)
	 * @see assignment1.Assignment1Package#getLecturer_FullName()
	 * @model
	 * @generated
	 */
	String getFullName();

	/**
	 * Sets the value of the '{@link assignment1.Lecturer#getFullName <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Full Name</em>' attribute.
	 * @see #getFullName()
	 * @generated
	 */
	void setFullName(String value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference.
	 * @see #setCourse(Course)
	 * @see assignment1.Assignment1Package#getLecturer_Course()
	 * @model containment="true"
	 * @generated
	 */
	Course getCourse();

	/**
	 * Sets the value of the '{@link assignment1.Lecturer#getCourse <em>Course</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' containment reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Course value);

	/**
	 * Returns the value of the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given Name</em>' attribute.
	 * @see assignment1.Assignment1Package#getLecturer_GivenName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	//function fro getting the given name from the full name
	public default String getGivenName() {
		String name = this.getFullName();
		if (name == null) {
			return null;
		}
		int pos = name.lastIndexOf(' ');
		if (pos < 0) {
			return null;
		}
		return name.substring(0, pos).trim();
			
	}
	//function for getting the family name from the full name
	public default String getFamilyName() {
		String name = this.getFullName();
		if (name == null) {
			return null;
		}
		int pos = name.lastIndexOf(' ');
		if (pos < 0) {
			return null;
		}
		return name.substring(pos + 1);
	}

} // Lecturer
