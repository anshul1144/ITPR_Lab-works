package com.knmodicollege.collegemanagement;

import com.knmodicollege.collegemanagement.DAO.CourseDAO;

import com.knmodicollege.collegemanagement.DAO.impl.CourseDaoImpl;
import com.knmodicollege.collegemanagement.model.Course;
import com.knmodicollege.collegemanagement.util.DataBaseUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //to create tables if not exists
    	DataBaseUtil.createTables();
    	/*---- Creating course data ---*/
    	Course courseData = new Course("course107","Core Java", "programming in Java", 90, 20, 60);
    	CourseDAO cdi = new CourseDaoImpl();
    	
    	/*--- inserting course into the table -----*/
    	int rows = cdi.save(courseData);
    	if(rows > 0)
    	{
    		System.out.println("Data Inserted");
    	}
    	else
    	{
    		System.out.println("Unable to insert data");
    	}
    }
}
