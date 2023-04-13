/**
 *
 */
package com.hybris.training.facades.populators;


import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.converters.Populator;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;


/**
 * @author bnagolu
 *
 */

public class WeightPopulator implements Populator<ProductModel, ProductData>
{


	@Override
	public void populate(final ProductModel source, final ProductData target) throws ConversionException
	{
		// XXX Auto-generated method stub
		target.setWeight(source.getWeight());
		if (source.getResolutionType() != null)
		{
			target.setResolutionType(source.getResolutionType().getCode());

		}
	}




}

