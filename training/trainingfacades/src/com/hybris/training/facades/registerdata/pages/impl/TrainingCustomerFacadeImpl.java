/**
 *
 */
package com.hybris.training.facades.registerdata.pages.impl;

import static de.hybris.platform.servicelayer.util.ServicesUtil.validateParameterNotNullStandardMessage;

import de.hybris.platform.commercefacades.customer.impl.DefaultCustomerFacade;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.core.model.user.CustomerModel;

import org.springframework.util.Assert;

import com.hybris.training.facades.registerdata.pages.TrainingCustomerFacade;


/**
 * @author bnagolu
 *
 */
public class TrainingCustomerFacadeImpl extends DefaultCustomerFacade implements TrainingCustomerFacade
{
	@Override
	public void register(final RegisterData registerData) throws DuplicateUidException
	{
		validateParameterNotNullStandardMessage("registerData", registerData);
		Assert.hasText(registerData.getFirstName(), "The field [FirstName] cannot be empty");
		Assert.hasText(registerData.getLastName(), "The field [LastName] cannot be empty");
		Assert.hasText(registerData.getLogin(), "The field [Login] cannot be empty");
		Assert.hasText(registerData.getPhoneNumber(), "The field [Phone Number] cannot be empty");

		final CustomerModel newCustomer = getModelService().create(CustomerModel.class);
		newCustomer.setPhone(registerData.getPhoneNumber());
		newCustomer.setDateOfBirth(registerData.getDateOfBirth());
		setCommonPropertiesForRegister(registerData, newCustomer);
		getCustomerAccountService().register(newCustomer, registerData.getPassword());
	}

}
