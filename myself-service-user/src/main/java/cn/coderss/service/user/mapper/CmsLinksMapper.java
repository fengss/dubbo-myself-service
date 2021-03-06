package cn.coderss.service.user.mapper;

import cn.coderss.service.user.model.CmsLinks;
import cn.coderss.service.user.model.CmsLinksExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsLinksMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_links
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int countByExample(CmsLinksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_links
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int deleteByExample(CmsLinksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_links
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int deleteByPrimaryKey(Long linkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_links
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int insert(CmsLinks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_links
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int insertSelective(CmsLinks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_links
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    List<CmsLinks> selectByExampleWithBLOBs(CmsLinksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_links
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    List<CmsLinks> selectByExample(CmsLinksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_links
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    CmsLinks selectByPrimaryKey(Long linkId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_links
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByExampleSelective(@Param("record") CmsLinks record, @Param("example") CmsLinksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_links
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") CmsLinks record, @Param("example") CmsLinksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_links
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByExample(@Param("record") CmsLinks record, @Param("example") CmsLinksExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_links
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByPrimaryKeySelective(CmsLinks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_links
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(CmsLinks record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_links
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByPrimaryKey(CmsLinks record);
}