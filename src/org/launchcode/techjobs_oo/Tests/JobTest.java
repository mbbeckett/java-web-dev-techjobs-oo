package org.launchcode.techjobs_oo.Tests;
import org.launchcode.techjobs_oo.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JobTest {

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

    @Test
    public void testBlankLineBeforeAndAfterJobInfo(){
        Job testJob1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertTrue(testJob1.toString().contains("\n" + "ID: "));
        assertTrue(testJob1.toString().contains(testJob1.getCoreCompetency() + "\n"));
    }

    @Test
    public void testStringLabelToStringMethod(){
        Job testJob1 = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertEquals("\n" + "ID: " + testJob1.getId() +  "\n" +
                "Name: " + testJob1.getName() + "\n" +
                "Employer: "+ testJob1.getEmployer() +"\n" +
                "Location: " + testJob1.getLocation() + "\n" +
                "Position Type: "+ testJob1.getPositionType() +"\n" +
                "Core Competency: " + testJob1.getCoreCompetency() + "\n", testJob1.toString());
    }

////    TODO: write a test for empty fields
    @Test
    public void testToStringMethodWithEmptyFields(){
        Job testJobToString = new Job();
        assertEquals("Data not available", testJobToString.toString());
    }
}