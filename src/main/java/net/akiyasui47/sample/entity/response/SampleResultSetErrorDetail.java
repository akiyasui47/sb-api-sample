package net.akiyasui47.sample.entity.response;

/**
 * @author akiyasui47
 */
public class SampleResultSetErrorDetail {

    /**
     * key
     */
    private String key;

    /**
     * value
     */
    private String value;

    /**
     * setKey
     *
     * @param key key name.
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * getKey
     *
     * @return
     */
    public String getKey() {
        return this.key;
    }

    /**
     * setValue
     *
     * @param value a value.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * getValue
     *
     * @return
     */
    public String getValue() {
        return value;
    }
}
