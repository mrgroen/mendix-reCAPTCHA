// This file was generated by Mendix Business Modeler 5.0.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package recaptcha.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the reCAPTCHA module

	public static String getLogNodeName()
	{
		return (String)Core.getConfiguration().getConstantValue("reCAPTCHA.LogNodeName");
	}

	public static String getSiteverifyURL()
	{
		return (String)Core.getConfiguration().getConstantValue("reCAPTCHA.SiteverifyURL");
	}
}