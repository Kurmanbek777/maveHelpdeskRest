package com.test.mavehelpdeskrest;

import com.test.mavehelpdeskrest.Department;
import com.test.mavehelpdeskrest.Employee;
import com.test.mavehelpdeskrest.Severity;
import com.test.mavehelpdeskrest.Status;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-02-27T19:36:19")
@StaticMetamodel(Helpdesk.class)
public class Helpdesk_ { 

    public static volatile SingularAttribute<Helpdesk, String> lName;
    public static volatile SingularAttribute<Helpdesk, String> fName;
    public static volatile SingularAttribute<Helpdesk, String> comments;
    public static volatile SingularAttribute<Helpdesk, Status> statusID;
    public static volatile SingularAttribute<Helpdesk, Department> departmentID;
    public static volatile SingularAttribute<Helpdesk, Employee> employeeID;
    public static volatile SingularAttribute<Helpdesk, Integer> id;
    public static volatile SingularAttribute<Helpdesk, Severity> severityID;
    public static volatile SingularAttribute<Helpdesk, String> email;

}