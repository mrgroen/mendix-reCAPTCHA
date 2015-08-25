// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package restservices.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class Cookie
{
	private final IMendixObject cookieMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "RestServices.Cookie";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Value("Value"),
		MaxAgeSeconds("MaxAgeSeconds"),
		Path("Path"),
		Domain("Domain"),
		HttpOnly("HttpOnly");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public Cookie(IContext context)
	{
		this(context, Core.instantiate(context, "RestServices.Cookie"));
	}

	protected Cookie(IContext context, IMendixObject cookieMendixObject)
	{
		if (cookieMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("RestServices.Cookie", cookieMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a RestServices.Cookie");

		this.cookieMendixObject = cookieMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Cookie.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static restservices.proxies.Cookie initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return restservices.proxies.Cookie.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static restservices.proxies.Cookie initialize(IContext context, IMendixObject mendixObject)
	{
		return new restservices.proxies.Cookie(context, mendixObject);
	}

	public static restservices.proxies.Cookie load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return restservices.proxies.Cookie.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Name
	 */
	public final String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final String getName(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(IContext context, String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Value
	 */
	public final String getValue()
	{
		return getValue(getContext());
	}

	/**
	 * @param context
	 * @return value of Value
	 */
	public final String getValue(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Value.toString());
	}

	/**
	 * Set value of Value
	 * @param value
	 */
	public final void setValue(String value)
	{
		setValue(getContext(), value);
	}

	/**
	 * Set value of Value
	 * @param context
	 * @param value
	 */
	public final void setValue(IContext context, String value)
	{
		getMendixObject().setValue(context, MemberNames.Value.toString(), value);
	}

	/**
	 * @return value of MaxAgeSeconds
	 */
	public final Integer getMaxAgeSeconds()
	{
		return getMaxAgeSeconds(getContext());
	}

	/**
	 * @param context
	 * @return value of MaxAgeSeconds
	 */
	public final Integer getMaxAgeSeconds(IContext context)
	{
		return (Integer) getMendixObject().getValue(context, MemberNames.MaxAgeSeconds.toString());
	}

	/**
	 * Set value of MaxAgeSeconds
	 * @param maxageseconds
	 */
	public final void setMaxAgeSeconds(Integer maxageseconds)
	{
		setMaxAgeSeconds(getContext(), maxageseconds);
	}

	/**
	 * Set value of MaxAgeSeconds
	 * @param context
	 * @param maxageseconds
	 */
	public final void setMaxAgeSeconds(IContext context, Integer maxageseconds)
	{
		getMendixObject().setValue(context, MemberNames.MaxAgeSeconds.toString(), maxageseconds);
	}

	/**
	 * @return value of Path
	 */
	public final String getPath()
	{
		return getPath(getContext());
	}

	/**
	 * @param context
	 * @return value of Path
	 */
	public final String getPath(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Path.toString());
	}

	/**
	 * Set value of Path
	 * @param path
	 */
	public final void setPath(String path)
	{
		setPath(getContext(), path);
	}

	/**
	 * Set value of Path
	 * @param context
	 * @param path
	 */
	public final void setPath(IContext context, String path)
	{
		getMendixObject().setValue(context, MemberNames.Path.toString(), path);
	}

	/**
	 * @return value of Domain
	 */
	public final String getDomain()
	{
		return getDomain(getContext());
	}

	/**
	 * @param context
	 * @return value of Domain
	 */
	public final String getDomain(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.Domain.toString());
	}

	/**
	 * Set value of Domain
	 * @param domain
	 */
	public final void setDomain(String domain)
	{
		setDomain(getContext(), domain);
	}

	/**
	 * Set value of Domain
	 * @param context
	 * @param domain
	 */
	public final void setDomain(IContext context, String domain)
	{
		getMendixObject().setValue(context, MemberNames.Domain.toString(), domain);
	}

	/**
	 * @return value of HttpOnly
	 */
	public final Boolean getHttpOnly()
	{
		return getHttpOnly(getContext());
	}

	/**
	 * @param context
	 * @return value of HttpOnly
	 */
	public final Boolean getHttpOnly(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.HttpOnly.toString());
	}

	/**
	 * Set value of HttpOnly
	 * @param httponly
	 */
	public final void setHttpOnly(Boolean httponly)
	{
		setHttpOnly(getContext(), httponly);
	}

	/**
	 * Set value of HttpOnly
	 * @param context
	 * @param httponly
	 */
	public final void setHttpOnly(IContext context, Boolean httponly)
	{
		getMendixObject().setValue(context, MemberNames.HttpOnly.toString(), httponly);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return cookieMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final restservices.proxies.Cookie that = (restservices.proxies.Cookie) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "RestServices.Cookie";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
