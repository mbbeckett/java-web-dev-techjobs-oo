package org.launchcode.techjobs_oo.Tests;
import org.launchcode.techjobs_oo.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.*;

public class JobTest {
    Job testJob1;
    Job testJob2;

    @Before
    public void createJobObject(){ testJob1 = new Job();
    testJob2 = new Job();
    }

    @Test
    public void testSettingJobId(){
        assertTrue(testJob1.getId() != testJob2.getId());
        assertEquals(testJob1.getId(), testJob2.getId(), 1);
        assertFalse(testJob1.getId() == 0);
        assertFalse(testJob2.getId() == 1);

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
//        assertTrue(jobTestConstructor.getId() == jobTestConstructor.getId());
//        TODO: TEST EVERY FIELD IN THE CONSTRUCTOR! Test ID field!!!

    }

//for example, if you had a Job instance, you could get the name of the employer this way:
//    // job is an instance of Job
//String employerName = job.getEmployer().getValue();

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
    }
}