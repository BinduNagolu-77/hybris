/**
 *
 */
package com.hybris.training.storefront.form;

import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;

import java.util.Date;


/**
 * @author bnagolu
 *
 */
public class CustomerRegisterForm extends RegisterForm
{
	private String phoneNumber;

	private Date dateOfBirth;

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public void setPhoneNumber(final String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public Date getDateOfBirth()
	{
		return dateOfBirth;
	}

	public void setDateOfBirth(final Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}




}
