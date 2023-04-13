/**
 *
 */
package com.hybris.training.core.search.solrfacetsearch.provider.impl;

import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.solrfacetsearch.config.IndexConfig;
import de.hybris.platform.solrfacetsearch.config.IndexedProperty;
import de.hybris.platform.solrfacetsearch.config.exceptions.FieldValueProviderException;
import de.hybris.platform.solrfacetsearch.provider.FieldNameProvider;
import de.hybris.platform.solrfacetsearch.provider.FieldValue;
import de.hybris.platform.solrfacetsearch.provider.FieldValueProvider;
import de.hybris.platform.solrfacetsearch.provider.impl.AbstractPropertyFieldValueProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



/**
 * @author BNAGOLU
 *
 */
public class UpperCaseValueProvider extends AbstractPropertyFieldValueProvider implements FieldValueProvider
{


	private FieldNameProvider fieldNameProvider;

	public String ramSize(final ProductModel model)
	{
		final String value = model.getWeight();

		if (value != null)
		{
			return value.toUpperCase();

		}
		else
		{
			return null;
		}

	}

	@Override
	public Collection<FieldValue> getFieldValues(final IndexConfig arg0, final IndexedProperty indexedProperty, final Object model)
			throws FieldValueProviderException
	{
		// XXX Auto-generated method stub
		final ProductModel product = (ProductModel) model;

		final String value = ramSize(product);


		if (value == null)
		{
			return Collections.emptyList();
		}



		if (value != null && !value.isEmpty())
		{

			final Collection<FieldValue> fieldValues = new ArrayList<FieldValue>();
			fieldValues.addAll(createFieldValue(value, indexedProperty));
			return fieldValues;
		}
		return null;
	}

	protected List<FieldValue> createFieldValue(final String ramSize, final IndexedProperty indexedProperty)
	{
		final List<FieldValue> fieldValues = new ArrayList<FieldValue>();

		final Collection<String> fieldNames = fieldNameProvider.getFieldNames(indexedProperty, null);
		for (final String fieldName : fieldNames)
		{
			fieldValues.add(new FieldValue(fieldName, ramSize));
		}
		return fieldValues;
	}

	public void setFieldNameProvider(final FieldNameProvider fieldNameProvider)
	{
		this.fieldNameProvider = fieldNameProvider;
	}

}
