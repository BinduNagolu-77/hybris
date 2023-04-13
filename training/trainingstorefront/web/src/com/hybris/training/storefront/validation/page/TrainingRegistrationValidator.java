/**
 *
 */
package com.hybris.training.storefront.validation.page;

import de.hybris.platform.acceleratorstorefrontcommons.forms.validation.RegistrationValidator;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;

import com.hybris.training.storefront.form.CustomerRegisterForm;


/**
 * @author bnagolu
 *
 */
@Component("trainingRegistrationValidator")
public class TrainingRegistrationValidator extends RegistrationValidator
{

	@Override
	public void validate(final Object object, final Errors errors)
	{
		final CustomerRegisterForm registerForm = (CustomerRegisterForm) object;
		final String titleCode = registerForm.getTitleCode();
		final String firstName = registerForm.getFirstName();
		final String lastName = registerForm.getLastName();
		final String phoneNumber = registerForm.getPhoneNumber();
		final String email = registerForm.getEmail();
		final String pwd = registerForm.getPwd();
		final String checkPwd = registerForm.getCheckPwd();
		final boolean termsCheck = registerForm.isTermsCheck();

		validateTitleCode(errors, titleCode);
		validateName(errors, firstName, "firstName", "register.firstName.invalid");
		validateName(errors, lastName, "lastName", "register.lastName.invalid");

		if (StringUtils.length(firstName) + StringUtils.length(lastName) > 255)
		{
			errors.rejectValue("lastName", "register.name.invalid");
			errors.rejectValue("firstName", "register.name.invalid");
		}

		validateEmail(errors, email);
		validatePassword(errors, pwd);
		comparePasswords(errors, pwd, checkPwd);
		validateTermsAndConditions(errors, termsCheck);
		validatePhoneNumber(errors, phoneNumber);
	}

	/**
	 * @param errors
	 * @param phoneNumber
	 */
	private void validatePhoneNumber(final Errors errors, final String phoneNumber)
	{
		// XXX Auto-generated method stub


		if (StringUtils.isEmpty(phoneNumber))
		{
			errors.rejectValue("phoneNumber", "register.phone.invalid");
		}
		else if (!phoneNumber.matches("\\d{10}") && !phoneNumber.matches("^((\\+){1}91){1}[1-9]{1}[0-9]{9}$"))
		{
			errors.rejectValue("phoneNumber", "register.phone.invalid");
		}
	}


}

