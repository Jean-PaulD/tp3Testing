/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 *
 * @author 211064084
 */
//https://github.com/boniface/course
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(class = App.class)//App is class name
@WebAppConfiguration
        
public class NewJUnitTest {
    @Autowired
    LecturerRepository repository;
    @Test
    public void testCreate(){
    Lecturer lect = new Lecturer.Builder("Lect 1");
    
    respository.save(lect);
    }
    
    @Test
    public void testUpdate(){
        Lecturer lect = new Lecturer.Builder("Lect 1");
        Lecturer newLect = new Lecturer.Builder(lect.getName());\
        Assert.assertEquals("Lect 1", lect.getName());
        Assert.assertEquals(27, newLect.getAge());
        Assert.assertEquals(23, lect.getAge());
        Assert.assertEquals(new Long(2), lect.getAge());
    }
    public NewJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
