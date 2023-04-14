/**
 *
 */
package com.hybris.training.core.dynamicattribute;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.servicelayer.model.attribute.AbstractDynamicAttributeHandler;

import java.util.Calendar;
import java.util.Date;


/**
 * @author bnagolu
 *
 */
public class CustomerAgeHandler extends AbstractDynamicAttributeHandler<Integer, CustomerModel>
{
	@Override
	public Integer get(final CustomerModel model)
	{
		int customerAge = 0;
		try
		{
			final Date dateOfBirth = model.getDateOfBirth();
			final Calendar cal = Calendar.getInstance();
			cal.setTime(dateOfBirth);
			final int birthYear = cal.get(Calendar.YEAR);
			final int currentYear = Calendar.getInstance().get(Calendar.YEAR);
			customerAge = currentYear - birthYear;
		}
		catch (final Exception e)
		{
			e.printStackTrace();
		}
		return customerAge;
	}

}
