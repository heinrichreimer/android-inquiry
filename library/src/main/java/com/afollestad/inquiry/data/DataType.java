package com.afollestad.inquiry.data;

/**
 * @author Aidan Follestad (afollestad)
 */
public enum DataType {
    /**
     * The value is a signed integer, stored in 1, 2, 3, 4, 6, or 8 bytes depending on the magnitude of the value.
     */
    INTEGER("INTEGER"),
    /**
     * Convenience method for those who don't have a lot of SQLite knowledge. Booleans are actually just
     * a 0 or 1 integer value.
     */
    BOOLEAN("INTEGER"),
    /**
     * The value is a floating point value, stored as an 8-byte IEEE floating point number.
     * <p/>
     * Translates to a float or double in Java.
     */
    REAL("REAL"),
    /**
     * The value is a text string, stored using the database encoding (UTF-8, UTF-16BE or UTF-16LE).
     * <p/>
     * Translates to a String in Java.
     */
    TEXT("TEXT"),
    /**
     * The value is a blob of data, stored exactly as it was input.
     * <p/>
     * Translates to byte[] in Java.
     */
    BLOB("BLOB");

    private final String mValue;

    DataType(String value) {
        mValue = value;
    }

    public final String getValue() {
        return mValue;
    }
}
