/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.bbs.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.bbs.entity.BBSSubjectInfo.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Sun Dec 23 11:58:33 CST 2018")
public class BBSSubjectInfo_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<BBSSubjectInfo,String> acceptReplyId;
    public static volatile ListAttribute<BBSSubjectInfo,String> attachmentList;
    public static volatile SingularAttribute<BBSSubjectInfo,String> auditorName;
    public static volatile SingularAttribute<BBSSubjectInfo,String> bBSIndexSetterName;
    public static volatile SingularAttribute<BBSSubjectInfo,Date> bBSIndexSetterTime;
    public static volatile SingularAttribute<BBSSubjectInfo,String> creatorName;
    public static volatile SingularAttribute<BBSSubjectInfo,String> forumId;
    public static volatile SingularAttribute<BBSSubjectInfo,String> forumIndexSetterName;
    public static volatile SingularAttribute<BBSSubjectInfo,Date> forumIndexSetterTime;
    public static volatile SingularAttribute<BBSSubjectInfo,String> forumName;
    public static volatile SingularAttribute<BBSSubjectInfo,String> hostIp;
    public static volatile SingularAttribute<BBSSubjectInfo,Long> hot;
    public static volatile SingularAttribute<BBSSubjectInfo,String> id;
    public static volatile SingularAttribute<BBSSubjectInfo,Boolean> isCompleted;
    public static volatile SingularAttribute<BBSSubjectInfo,Boolean> isCreamSubject;
    public static volatile SingularAttribute<BBSSubjectInfo,Boolean> isOriginalSubject;
    public static volatile SingularAttribute<BBSSubjectInfo,Boolean> isRecommendSubject;
    public static volatile SingularAttribute<BBSSubjectInfo,Boolean> isTopSubject;
    public static volatile SingularAttribute<BBSSubjectInfo,String> latestReplyId;
    public static volatile SingularAttribute<BBSSubjectInfo,Date> latestReplyTime;
    public static volatile SingularAttribute<BBSSubjectInfo,String> latestReplyUser;
    public static volatile SingularAttribute<BBSSubjectInfo,String> machineName;
    public static volatile SingularAttribute<BBSSubjectInfo,String> mainSectionId;
    public static volatile SingularAttribute<BBSSubjectInfo,String> mainSectionName;
    public static volatile SingularAttribute<BBSSubjectInfo,Integer> orderNumber;
    public static volatile SingularAttribute<BBSSubjectInfo,String> originalSetterName;
    public static volatile SingularAttribute<BBSSubjectInfo,Date> originalSetterTime;
    public static volatile SingularAttribute<BBSSubjectInfo,String> picId;
    public static volatile SingularAttribute<BBSSubjectInfo,Date> recommendTime;
    public static volatile SingularAttribute<BBSSubjectInfo,Boolean> recommendToBBSIndex;
    public static volatile SingularAttribute<BBSSubjectInfo,Boolean> recommendToForumIndex;
    public static volatile SingularAttribute<BBSSubjectInfo,String> recommendorName;
    public static volatile SingularAttribute<BBSSubjectInfo,Long> replyTotal;
    public static volatile SingularAttribute<BBSSubjectInfo,String> screamSetterName;
    public static volatile SingularAttribute<BBSSubjectInfo,Date> screamSetterTime;
    public static volatile SingularAttribute<BBSSubjectInfo,String> sectionId;
    public static volatile SingularAttribute<BBSSubjectInfo,String> sectionName;
    public static volatile SingularAttribute<BBSSubjectInfo,Boolean> stopReply;
    public static volatile SingularAttribute<BBSSubjectInfo,String> subjectAuditStatus;
    public static volatile SingularAttribute<BBSSubjectInfo,String> subjectStatus;
    public static volatile SingularAttribute<BBSSubjectInfo,String> summary;
    public static volatile SingularAttribute<BBSSubjectInfo,String> systemType;
    public static volatile SingularAttribute<BBSSubjectInfo,String> title;
    public static volatile SingularAttribute<BBSSubjectInfo,Boolean> topToBBS;
    public static volatile SingularAttribute<BBSSubjectInfo,Boolean> topToForum;
    public static volatile SingularAttribute<BBSSubjectInfo,Boolean> topToMainSection;
    public static volatile SingularAttribute<BBSSubjectInfo,Boolean> topToSection;
    public static volatile SingularAttribute<BBSSubjectInfo,String> type;
    public static volatile SingularAttribute<BBSSubjectInfo,String> typeCategory;
    public static volatile SingularAttribute<BBSSubjectInfo,Long> viewTotal;
    public static volatile SingularAttribute<BBSSubjectInfo,Date> voteLimitTime;
    public static volatile SingularAttribute<BBSSubjectInfo,Boolean> votePersonVisible;
    public static volatile SingularAttribute<BBSSubjectInfo,Boolean> voteResultVisible;
}
