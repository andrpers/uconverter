/*
 * Copyright (c) 2017 Dimitrijs Fedotovs
 * This software may be modified and distributed under the terms of the MIT license.
 * See the LICENSE file for details.
 */

package guru.bug.uconverter.format;

import guru.bug.uconverter.model.Converter;
import guru.bug.uconverter.model.Formatter;

/**
 * @author Dimitrijs Fedotovs <a href="http://www.bug.guru">www.bug.guru</a>
 * @version 1.0
 * @since 1.0
 */
public class BasicFormatter implements Formatter {

    @Override
    public String format(double value, Converter converter) {
        return String.format("%.2f %s", value, converter.getUnitAbbr());
    }
}
