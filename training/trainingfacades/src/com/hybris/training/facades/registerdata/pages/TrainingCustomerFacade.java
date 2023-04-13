/**
 *
 */
package com.hybris.training.facades.registerdata.pages;

import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;
import de.hybris.platform.servicelayer.exceptions.UnknownIdentifierException;

/**
 * @author bnagolu
 *
 */
public interface TrainingCustomerFacade
{
	void register(RegisterData registerData) throws DuplicateUidException, UnknownIdentifierException, IllegalArgumentException;
}
