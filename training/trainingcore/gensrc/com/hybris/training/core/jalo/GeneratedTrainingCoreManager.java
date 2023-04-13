/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 13-Apr-2023, 10:25:53 AM                    ---
 * ----------------------------------------------------------------
 */
package com.hybris.training.core.jalo;

import com.hybris.training.core.constants.TrainingCoreConstants;
import com.hybris.training.core.jalo.ApparelProduct;
import com.hybris.training.core.jalo.ApparelSizeVariantProduct;
import com.hybris.training.core.jalo.ApparelStyleVariantProduct;
import com.hybris.training.core.jalo.CustomCMSComponent;
import com.hybris.training.core.jalo.ElectronicsColorVariantProduct;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>TrainingCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTrainingCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("weight", AttributeMode.INITIAL);
		tmp.put("resolutionType", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("phone", AttributeMode.INITIAL);
		tmp.put("dateOfBirth", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public CustomCMSComponent createCustomCMSComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.CUSTOMCMSCOMPONENT );
			return (CustomCMSComponent)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CustomCMSComponent : "+e.getMessage(), 0 );
		}
	}
	
	public CustomCMSComponent createCustomCMSComponent(final Map attributeValues)
	{
		return createCustomCMSComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TrainingCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.dateOfBirth</code> attribute.
	 * @return the dateOfBirth - Date of Birth.
	 */
	public Date getDateOfBirth(final SessionContext ctx, final Customer item)
	{
		return (Date)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.DATEOFBIRTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.dateOfBirth</code> attribute.
	 * @return the dateOfBirth - Date of Birth.
	 */
	public Date getDateOfBirth(final Customer item)
	{
		return getDateOfBirth( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth - Date of Birth.
	 */
	public void setDateOfBirth(final SessionContext ctx, final Customer item, final Date value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.DATEOFBIRTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.dateOfBirth</code> attribute. 
	 * @param value the dateOfBirth - Date of Birth.
	 */
	public void setDateOfBirth(final Customer item, final Date value)
	{
		setDateOfBirth( getSession().getSessionContext(), item, value );
	}
	
	@Override
	public String getName()
	{
		return TrainingCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.phone</code> attribute.
	 * @return the phone - Mobile Number.
	 */
	public String getPhone(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Customer.PHONE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.phone</code> attribute.
	 * @return the phone - Mobile Number.
	 */
	public String getPhone(final Customer item)
	{
		return getPhone( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.phone</code> attribute. 
	 * @param value the phone - Mobile Number.
	 */
	public void setPhone(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Customer.PHONE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.phone</code> attribute. 
	 * @param value the phone - Mobile Number.
	 */
	public void setPhone(final Customer item, final String value)
	{
		setPhone( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.resolutionType</code> attribute.
	 * @return the resolutionType - resolution field added to product table
	 */
	public EnumerationValue getResolutionType(final SessionContext ctx, final Product item)
	{
		return (EnumerationValue)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.RESOLUTIONTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.resolutionType</code> attribute.
	 * @return the resolutionType - resolution field added to product table
	 */
	public EnumerationValue getResolutionType(final Product item)
	{
		return getResolutionType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.resolutionType</code> attribute. 
	 * @param value the resolutionType - resolution field added to product table
	 */
	public void setResolutionType(final SessionContext ctx, final Product item, final EnumerationValue value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.RESOLUTIONTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.resolutionType</code> attribute. 
	 * @param value the resolutionType - resolution field added to product table
	 */
	public void setResolutionType(final Product item, final EnumerationValue value)
	{
		setResolutionType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.weight</code> attribute.
	 * @return the weight - Weight of the product.
	 */
	public String getWeight(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, TrainingCoreConstants.Attributes.Product.WEIGHT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.weight</code> attribute.
	 * @return the weight - Weight of the product.
	 */
	public String getWeight(final Product item)
	{
		return getWeight( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.weight</code> attribute. 
	 * @param value the weight - Weight of the product.
	 */
	public void setWeight(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, TrainingCoreConstants.Attributes.Product.WEIGHT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.weight</code> attribute. 
	 * @param value the weight - Weight of the product.
	 */
	public void setWeight(final Product item, final String value)
	{
		setWeight( getSession().getSessionContext(), item, value );
	}
	
}
