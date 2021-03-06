package cn.coderss.service.user.mapper;

import cn.coderss.service.user.model.CmsUsermeta;
import cn.coderss.service.user.model.CmsUsermetaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsUsermetaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_usermeta
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int countByExample(CmsUsermetaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_usermeta
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int deleteByExample(CmsUsermetaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_usermeta
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int deleteByPrimaryKey(Long umetaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_usermeta
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int insert(CmsUsermeta record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_usermeta
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int insertSelective(CmsUsermeta record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_usermeta
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    List<CmsUsermeta> selectByExampleWithBLOBs(CmsUsermetaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_usermeta
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    List<CmsUsermeta> selectByExample(CmsUsermetaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_usermeta
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    CmsUsermeta selectByPrimaryKey(Long umetaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_usermeta
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByExampleSelective(@Param("record") CmsUsermeta record, @Param("example") CmsUsermetaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_usermeta
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") CmsUsermeta record, @Param("example") CmsUsermetaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_usermeta
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByExample(@Param("record") CmsUsermeta record, @Param("example") CmsUsermetaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_usermeta
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByPrimaryKeySelective(CmsUsermeta record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_usermeta
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(CmsUsermeta record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_usermeta
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByPrimaryKey(CmsUsermeta record);
}