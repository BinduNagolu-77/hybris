/**
 *
 */
package com.hybris.training.facades.registerdata.pages.impl;

import de.hybris.platform.core.model.user.CustomerModel;
import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author BNAGOLU
 *
 */
public class CustomerAgeArrtributeFacade
{
	@Autowired
	private UserService userService;

	public UserService getUserService()
	{
		return userService;
	}

	public void setUserService(final UserService userService)
	{
		this.userService = userService;
	}

	public Integer getCustomerAge()
	{

		final UserModel cus = getUserService().getCurrentUser();
		final CustomerModel cus1 = (CustomerModel) cus;

		final Integer customerAge = cus1.getCustomerAge();

		return customerAge;

	}

}
