/*
 * Copyright (C) 2007-2022 Crafter Software Corporation. All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.craftercms.commons.validation.validators.impl;

import org.craftercms.commons.validation.annotations.param.ValidateIntegerParam;
import org.craftercms.commons.validation.validators.AnnotationBasedValidatorFactory;
import org.craftercms.commons.validation.validators.Validator;

import static org.apache.commons.lang.StringUtils.defaultIfEmpty;

public class IntegerParamValidatorFactory implements AnnotationBasedValidatorFactory<ValidateIntegerParam, Integer> {

    @Override
    public Validator<Integer> getValidator(ValidateIntegerParam annotation, String paramName) {
        IntegerValidator validator = new IntegerValidator(defaultIfEmpty(annotation.name(), paramName));
        validator.setNotNull(annotation.notNull());
        validator.setMinValue(annotation.minValue());
        validator.setMaxValue(annotation.maxValue());

        return validator;
    }

}
