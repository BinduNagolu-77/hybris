/**
 *
 */
package com.hybris.training.facades.populators;

import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.commerceservices.search.resultdata.SearchResultValueData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import org.apache.commons.lang3.StringUtils;


/**
 * @author BNAGOLU
 *
 */
public class WeightPlp implements Populator<SearchResultValueData, ProductData>
{

	@Override
	public void populate(final SearchResultValueData source, final ProductData target) throws ConversionException
	{
		// XXX Auto-generated method stub
		final String weight = (String) source.getValues().get("weight");
		if (StringUtils.isNoneEmpty(weight))
		{
			target.setWeight(weight);
		}

	}

}
