/** 
 *  Generated by OpenJPA MetaModel Generator Tool.
**/

package com.x.okr.entity;

import com.x.base.core.entity.SliceJpaObject_;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;

@javax.persistence.metamodel.StaticMetamodel
(value=com.x.okr.entity.OkrWorkAuthorizeRecord.class)
@javax.annotation.Generated
(value="org.apache.openjpa.persistence.meta.AnnotationProcessor6",date="Sun Dec 23 11:59:37 CST 2018")
public class OkrWorkAuthorizeRecord_ extends SliceJpaObject_  {
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,String> centerId;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,String> centerTitle;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,Date> delegateDateTime;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,String> delegateDateTimeStr;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,Integer> delegateLevel;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,String> delegateOpinion;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,String> delegatorIdentity;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,String> delegatorName;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,String> delegatorTopUnitName;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,String> delegatorUnitName;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,String> id;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,String> status;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,Date> takebackDateTime;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,String> targetIdentity;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,String> targetName;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,String> targetTopUnitName;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,String> targetUnitName;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,String> title;
    public static volatile SingularAttribute<OkrWorkAuthorizeRecord,String> workId;
}
