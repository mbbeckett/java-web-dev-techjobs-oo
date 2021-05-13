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
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job jobTestConstructor = new Job("Product Tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"), 1);
        assertEquals("ACME", jobTestConstructor.getEmployer().getValue());
    }
}