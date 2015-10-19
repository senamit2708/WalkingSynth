package com.dobi.walkingsynth;

/**
 * Created by dobi on 17.10.15.
 */
public final class Constants {

    public static final int ACC_MAGNITUDE = 0;
    public static final int ACC_GRAV_DIFF = 1;
    public static final int ACC_ALL = 2;

    public static final int SERIES_COUNT = 3;

    private Constants() {
        //this prevents even the native class from
        //calling this ctor as well :
        throw new AssertionError();
    }
}