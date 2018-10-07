package com.caveofprogramming.designpatterns.mvcdemo.tests;

import com.caveofprogramming.designpatterns.mvcdemo.model.MySQLDAOFactory;
import com.caveofprogramming.designpatterns.mvcdemo.model.Database;
import com.caveofprogramming.designpatterns.mvcdemo.model.Person;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class mySQLPersonDAOTests {

    @BeforeEach
    void setUp() throws Exception {
        System.out.println("Setup!");
        Database.getInstance().connect();
       // mySQLPersonDAO dao = MySQLDAOFactory.getPersonDAO();
        //dao.deleteAll();
    }

    @AfterEach
    void tearDown() throws Exception{
        System.out.println("TearDown!");
        Database.getInstance().disconnect();
    }

    @Test
    public void test() {
        int value = 7;
        value += 2;

        assertEquals(9, value, "Check that arithmetic works in Java!");
    }

    @Test
    public void testCreate() throws SQLException {
       /* mySQLPersonDAO dao = MySQLDAOFactory.getPersonDAO();
        Person person1 = new Person("Bob", "letmein");
        Person person2 = new Person("Sue", "hello");
        dao.addPerson(person1);
        dao.addPerson(person2);

        List<Person> people = dao.getPeople();
        assertEquals(2, people.size(), "Should be two people in DB");
        assertEquals(person1, people.get(0), "These two people should be the same");
        assertEquals(person2, people.get(1), "These two people should be the same");*/
    }
}