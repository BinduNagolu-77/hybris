/**
 *
 */
package com.hybris.training.storefront.form;

import de.hybris.platform.acceleratorstorefrontcommons.forms.UpdateProfileForm;


/**
 * @author BNAGOLU
 *
 */
public class CustomerProfileForm extends UpdateProfileForm
{
	private int customerAge;

	public int getCustomerAge()
	{
		return customerAge;
	}

	public void setCustomerAge(final int customerAge)
	{
		this.customerAge = customerAge;
	}



}
