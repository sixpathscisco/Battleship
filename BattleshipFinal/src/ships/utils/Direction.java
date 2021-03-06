package ships.utils;

import ships.utils.exceptions.DirectionException;

public enum Direction {
    HORIZONTAL,
    VERTICAL;

    public static Direction decode(char c) throws DirectionException {
        if (c == 'h' || c == 'H') return HORIZONTAL;
        else if (c == 'v' || c == 'V') return VERTICAL;
        else throw new DirectionException("The character '"+c+"' cannot be converted in one direction");
    }

    public static Direction decode(String str) throws DirectionException {
        if (str.toLowerCase().equals("horizontal")) return HORIZONTAL;
        else if (str.toLowerCase().equals("vertical")) return VERTICAL;
        else throw new DirectionException("The string '"+str+"' cannot be converted in one direction");
    }
}
