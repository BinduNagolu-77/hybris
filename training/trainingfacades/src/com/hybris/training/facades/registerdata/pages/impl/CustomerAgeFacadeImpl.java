/**
 *
 */
package com.hybris.training.facades.registerdata.pages.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNullStandardMessage;

import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.user.CustomerModel;

import org.springframework.util.Assert;

import com.hybris.training.facades.registerdata.pages.CustomerAgeFacade;


/**
 * @author BNAGOLU
 *
 */
public class CustomerAgeFacadeImpl extends DefaultCustomerFacade implements CustomerAgeFacade
{
	@Override
	public void updateProfile(final CustomerData customerData) throws DuplicateUidException
	{
		validateDataBeforeUpdate(customerData);

		final String name = getCustomerNameStrategy().getName(customerData.getFirstName(), customerData.getLastName());
		final CustomerModel customer = getCurrentSessionCustomer();
		customer.setOriginalUid(customerData.getDisplayUid());
		customer.setCustomerAge(customerData.getCustomerAge());
		getCustomerAccountService().updateProfile(customer, customerData.getTitleCode(), name, customerData.getUid());
	}

	@Override
	protected void validateDataBeforeUpdate(final CustomerData customerData)
	{
		validateParameterNotNullStandardMessage("customerData", customerData);
		Assert.hasText(customerData.getFirstName(), "The field [FirstName] cannot be empty");
		Assert.hasText(customerData.getLastName(), "The field [LastName] cannot be empty");
		Assert.hasText(customerData.getUid(), "The field [Uid] cannot be empty");
		//Assert.hasText(customerData.getCustomerAge());
	}

}
