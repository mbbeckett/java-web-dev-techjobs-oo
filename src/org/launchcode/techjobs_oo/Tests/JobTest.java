package org.launchcode.techjobs_oo.Tests;
import org.launchcode.techjobs_oo.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class JobTest {
//    Job testJob1;
//    Job testJob2;

//    @Before
////    public void createJobObject(){ testJob1 = new Job();
////    testJob2 = new Job(); }
//    public void createJobObjectTest(){
//        Job testJob1 = new Job();
//        Job testJob2 = new Job();
//    }

    @Test
    public void testSettingJobId(){
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertTrue(testJob1.getId() != testJob2.getId());
        assertEquals(testJob1.getId(), testJob2.getId(), 1);
        assertFalse(testJob1.getId() == 0);
        assertFalse(testJob2.getId() == 0);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job jobTestConstructor = new Job(
                "Product Tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality Control"),
                new CoreCompetency("Persistence"));
        assertEquals("ACME", jobTestConstructor.getEmployer().getValue());
        assertEquals("Product Tester", jobTestConstructor.getName());
        assertEquals("Desert", jobTestConstructor.getLocation().getValue());
        assertEquals("Quality Control", jobTestConstructor.getPositionType().getValue());
        assertEquals("Persistence", jobTestConstructor.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        Job jobTestEquality1 = new Job("Product Tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        Job jobTestEquality2 = new Job("Product Tester",
                new Employer("ACME"),
                new Location("Desert"),
                new PositionType("Quality control"),
                new CoreCompetency("Persistence"));
        assertFalse(jobTestEquality1.getId() == jobTestEquality2.getId());
        assertFalse(jobTestEquality1.equals(jobTestEquality2));

    }

////TODO: write a test that returns a string that contains a blank link before and after the job information
    @Test
    public void testBlankLineBeforeAndAfterJobInfo(){
        Job testJob1 = new Job();

        assertEquals("\n" + "ID: " + testJob1.getId() +"\n" +
                "Name: " +  testJob1.getName() + "\n" +
                "Employer: " + testJob1.getEmployer() + "\n" +
                "Location: " + testJob1.getLocation() + "\n" +
                "Position Type: " + testJob1.getPositionType() +  "\n" +
                "Core Competency: " +  testJob1.getCoreCompetency() + "\n", testJob1.toString());
    }

////    TODO: string should contain a label for each field, data stored in corresponding field on its own line.
//    @Test
//    public void testStringLabelToStringMethod(){
//        assertEquals("\n" + "ID: " + testJob1.getId() +  "\n" +
//                "Name: " + testJob1.getName() + "\n" +
//                "Employer: "+ testJob1.getEmployer() +"\n" +
//                "Location: " + testJob1.getLocation() + "\n" +
//                "Position Type: "+ testJob1.getPositionType() +"\n" +
//                "Core Competency: " + testJob1.getCoreCompetency() + "\n", testJob1.toString());
//    }
//
////    TODO: write a test for empty fields
//    @Test
//    public void testToStringMethodWithEmptyFields(){
//        Job testJobToString = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
//        assertEquals("Data not available", testJobToString.toString());
//        assertTrue(testJobToString.toString().equals("Data not available"));
//    }
}