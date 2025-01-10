package nl.gamedata.common;

/**
 * StringUtils.java.
 * <p>
 * Copyright (c) 2024-2024 Delft University of Technology, PO Box 5, 2600 AA, Delft, the Netherlands. All rights reserved. <br>
 * BSD-style license. See <a href="https://github.com/averbraeck/gamedata-common/LICENSE">GameData project License</a>.
 * </p>
 * @author <a href="https://github.com/averbraeck">Alexander Verbraeck</a>
 */
public class StringUtils
{
    /**
     * substring() method that avoids IndexOutOfBoundsException.
     * @param text the text to cap
     * @param length the maximum length in characters
     * @return the potentially capped sting if in case it was longer than length; otherwise the original string
     */
    public static String substring(final String text, final int length)
    {
        if (text.length() <= length)
        {
            return text;
        }
        else
        {
            return text.substring(0, length);
        }
    }
}
