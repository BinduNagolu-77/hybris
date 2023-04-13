/**
 *
 */
package com.hybris.training.storefront.controllers.cms;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hybris.training.core.model.CustomCMSComponentModel;
import com.hybris.training.storefront.controllers.ControllerConstants;


/**
 * @author bnagolu
 *
 */
@Controller("CustomCMSComponentController")
@Scope("tenant")
@RequestMapping(value = ControllerConstants.Actions.Cms.CustomCMSComponent)
public class CustomCMSComponentController extends AbstractAcceleratorCMSComponentController<CustomCMSComponentModel>

{


	@Override
	protected void fillModel(final HttpServletRequest request, final Model model, final CustomCMSComponentModel component)
	{
		model.addAttribute("offerImageLinks", component.getOfferImageLink());

		model.addAttribute("offerImage", component.getOfferImage());

		model.addAttribute("headerText", component.getHeadrerText());

		model.addAttribute("footerText", component.getFooterText());

	}

}
