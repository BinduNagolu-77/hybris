/**
 *
 */
package com.hybris.training.facades.registerdata.pages;

import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.commerceservices.customer.DuplicateUidException;


/**
 * @author BNAGOLU
 *
 */
public interface CustomerAgeFacade
{
	public void updateProfile(final CustomerData customerData) throws DuplicateUidException;

}
