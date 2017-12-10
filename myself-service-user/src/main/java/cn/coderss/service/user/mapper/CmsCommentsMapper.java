package cn.coderss.service.user.mapper;

import cn.coderss.service.user.model.CmsComments;
import cn.coderss.service.user.model.CmsCommentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmsCommentsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comments
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int countByExample(CmsCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comments
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int deleteByExample(CmsCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comments
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int deleteByPrimaryKey(Long commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comments
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int insert(CmsComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comments
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int insertSelective(CmsComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comments
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    List<CmsComments> selectByExampleWithBLOBs(CmsCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comments
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    List<CmsComments> selectByExample(CmsCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comments
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    CmsComments selectByPrimaryKey(Long commentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comments
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByExampleSelective(@Param("record") CmsComments record, @Param("example") CmsCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comments
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") CmsComments record, @Param("example") CmsCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comments
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByExample(@Param("record") CmsComments record, @Param("example") CmsCommentsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comments
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByPrimaryKeySelective(CmsComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comments
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(CmsComments record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_comments
     *
     * @mbggenerated Thu Nov 02 09:25:49 CST 2017
     */
    int updateByPrimaryKey(CmsComments record);
}