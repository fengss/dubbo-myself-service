package cn.coderss.service.user.model;

public class CmsUsermeta {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_usermeta.umeta_id
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    private Long umetaId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_usermeta.user_id
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_usermeta.meta_key
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    private String metaKey;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_usermeta.meta_value
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    private String metaValue;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_usermeta.umeta_id
     *
     * @return the value of cms_usermeta.umeta_id
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    public Long getUmetaId() {
        return umetaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_usermeta.umeta_id
     *
     * @param umetaId the value for cms_usermeta.umeta_id
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    public void setUmetaId(Long umetaId) {
        this.umetaId = umetaId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_usermeta.user_id
     *
     * @return the value of cms_usermeta.user_id
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_usermeta.user_id
     *
     * @param userId the value for cms_usermeta.user_id
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_usermeta.meta_key
     *
     * @return the value of cms_usermeta.meta_key
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    public String getMetaKey() {
        return metaKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_usermeta.meta_key
     *
     * @param metaKey the value for cms_usermeta.meta_key
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_usermeta.meta_value
     *
     * @return the value of cms_usermeta.meta_value
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    public String getMetaValue() {
        return metaValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_usermeta.meta_value
     *
     * @param metaValue the value for cms_usermeta.meta_value
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue;
    }
}