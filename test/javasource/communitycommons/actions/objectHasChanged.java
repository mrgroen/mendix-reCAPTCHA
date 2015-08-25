// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package communitycommons.actions;

import com.mendix.systemwideinterfaces.core.IMendixObject;
import communitycommons.ORM;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * Returns true if at least one member (including owned associations) of this object has changed.
 */
public class objectHasChanged extends CustomJavaAction<Boolean>
{
	private IMendixObject item;

	public objectHasChanged(IContext context, IMendixObject item)
	{
		super(context);
		this.item = item;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		return ORM.objectHasChanged(item);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "objectHasChanged";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
