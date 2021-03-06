/**
 * DynamicReports - Free Java reporting library for creating reports dynamically
 *
 * Copyright (C) 2010 - 2012 Ricardo Mariaca
 * http://dynamicreports.sourceforge.net
 *
 * This file is part of DynamicReports.
 *
 * DynamicReports is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DynamicReports is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with DynamicReports. If not, see <http://www.gnu.org/licenses/>.
 */

package net.sf.dynamicreports.report.base.column;

import net.sf.dynamicreports.report.constant.BooleanComponentType;
import net.sf.dynamicreports.report.constant.ComponentDimensionType;
import net.sf.dynamicreports.report.constant.Constants;
import net.sf.dynamicreports.report.definition.column.DRIBooleanColumn;
import net.sf.dynamicreports.report.definition.component.DRIComponent;
import net.sf.dynamicreports.report.definition.expression.DRIExpression;
import net.sf.dynamicreports.report.definition.style.DRIReportStyle;

import org.apache.commons.lang3.Validate;

/**
 * @author Ricardo Mariaca (dynamicreports@gmail.com)
 */
public class DRBooleanColumn extends DRColumn<DRIComponent> implements DRIBooleanColumn {
	private static final long serialVersionUID = Constants.SERIAL_VERSION_UID;

	private Integer width;
	private Integer height;
	private ComponentDimensionType widthType;
	private ComponentDimensionType heightType;
	private DRIExpression<Boolean> valueExpression;
	private BooleanComponentType componentType;
	private Boolean emptyWhenNullValue;
	private Integer imageWidth;
	private Integer imageHeight;
	private DRIReportStyle style;
	private DRIExpression<Boolean> printWhenExpression;

	@Override
	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		if (width != null) {
			Validate.isTrue(width >= 0, "width must be >= 0");
		}
		this.width = width;
	}

	@Override
	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		if (height != null) {
			Validate.isTrue(height >= 0, "height must be >= 0");
		}
		this.height = height;
	}

	@Override
	public ComponentDimensionType getWidthType() {
		return widthType;
	}

	public void setWidthType(ComponentDimensionType widthType) {
		this.widthType = widthType;
	}

	@Override
	public ComponentDimensionType getHeightType() {
		return heightType;
	}

	public void setHeightType(ComponentDimensionType heightType) {
		this.heightType = heightType;
	}

	@Override
	public DRIExpression<Boolean> getValueExpression() {
		return valueExpression;
	}

	public void setValueExpression(DRIExpression<Boolean> valueExpression) {
		Validate.notNull(valueExpression, "valueExpression must not be null");
		this.valueExpression = valueExpression;
	}

	@Override
	public BooleanComponentType getComponentType() {
		return componentType;
	}

	public void setComponentType(BooleanComponentType booleanComponentType) {
		this.componentType = booleanComponentType;
	}

	@Override
	public Boolean getEmptyWhenNullValue() {
		return emptyWhenNullValue;
	}

	public void setEmptyWhenNullValue(Boolean emptyWhenNullValue) {
		this.emptyWhenNullValue = emptyWhenNullValue;
	}

	@Override
	public Integer getImageWidth() {
		return imageWidth;
	}

	public void setImageWidth(Integer imageWidth) {
		if (imageWidth != null) {
			Validate.isTrue(imageWidth >= 0, "imageWidth must be >= 0");
		}
		this.imageWidth = imageWidth;
	}

	@Override
	public Integer getImageHeight() {
		return imageHeight;
	}

	public void setImageHeight(Integer imageHeight) {
		if (imageHeight != null) {
			Validate.isTrue(imageHeight >= 0, "imageHeight must be >= 0");
		}
		this.imageHeight = imageHeight;
	}

	@Override
	public DRIReportStyle getStyle() {
		return style;
	}

	public void setStyle(DRIReportStyle style) {
		this.style = style;
	}

	@Override
	public DRIExpression<Boolean> getPrintWhenExpression() {
		return printWhenExpression;
	}

	public void setPrintWhenExpression(DRIExpression<Boolean> printWhenExpression) {
		this.printWhenExpression = printWhenExpression;
	}

	@Override
	public String getName() {
		return valueExpression.getName();
	}

	@Override
	public Class<Boolean> getValueClass() {
		return Boolean.class;
	}
}
