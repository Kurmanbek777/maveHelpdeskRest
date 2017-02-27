package com.test.mavehelpdeskrest;

import com.test.mavehelpdeskrest.Helpdesk;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-27T19:36:19")
@StaticMetamodel(Status.class)
public class Status_ { 

    public static volatile CollectionAttribute<Status, Helpdesk> helpdeskCollection;
    public static volatile SingularAttribute<Status, Integer> id;
    public static volatile SingularAttribute<Status, String> status;

}