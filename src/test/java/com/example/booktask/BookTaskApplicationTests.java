package com.example.booktask;

import com.example.spring.entity.Collections;
import com.example.spring.entity.Tax;
import com.example.spring.entity.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;


class BookTaskApplicationTests {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new ClassPathXmlApplicationContext("application.xml");
    }

    @AfterEach
    void tearDown() {
        context.close();
    }

    @Test
    void task1Test() {
        System.out.println("\ttask1:");
        var user =  context.getBean("userTask1", User.class);
        System.out.println(user);
        assertThat(user.getId()).isNull();
        assertThat(user.getName()).isEqualTo("Matvey");
        assertThat(user.getLogin()).isEqualTo("testlogin1");
        assertThat(user.getPassword()).isEqualTo("testpassword1");
        assertThat(user.getAddress()).isNotNull();
        assertThat(user.getAddress().getStreet()).isEqualTo("Batova");
        assertThat(user.getAddress().getHome()).isEqualTo(29);
    }

    @Test
    void task2Test() {
        System.out.println("\ttask2:");
        var user = context.getBean("userTask2", User.class);
        System.out.println(user);
        assertThat(user.getId()).isNull();
        assertThat(user.getName()).isNull();
        assertThat(user.getPassword()).isNull();
        assertThat(user.getAddress()).isNull();
        assertThat(user.getLogin()).isEqualTo("testlogin2");
    }

    @Test
    void task3Test() {
        System.out.println("\ttask3:");
        var user = context.getBean("userTask3", User.class);
        System.out.println(user);
        assertThat(user.getId()).isEqualTo(1);
        assertThat(user.getName()).isEqualTo("Ihor");
        assertThat(user.getLogin()).isEqualTo("nontest");
        assertThat(user.getPassword()).isEqualTo("nonpassword");
        assertThat(user.getAddress()).isNull();
    }

    @Test
    void task4Test() {
        System.out.println("\ttask4:");
        var collections = context.getBean("collectionsTask4", Collections.class);
        System.out.println(collections);
        assertThat(collections.getList()).containsExactlyInAnyOrder("USA", "Ukraine","Belarus");
        assertThat(collections.getSet()).containsExactlyInAnyOrder("Google", "Mazila","Opera");
        assertThat(collections.getMap()).containsKeys("USA", "Ukraine","Belarus");
        assertThat(collections.getMap()).containsValues(1L, 2L, 3L);
        assertThat(collections.getProperties()).containsEntry("name", "Maks");
        assertThat(collections.getProperties()).containsEntry("login", "Maks123");
    }

    @Test
    void task5Test() {
        System.out.println("\ttask5:");
        var user = context.getBean("userTask5", User.class);
        System.out.println(user);
        assertThat(user.getId()).isNull();
        assertThat(user.getName()).isEqualTo("Michail");
        assertThat(user.getLogin()).isNull();
        assertThat(user.getPassword()).isNull();
        assertThat(user.getAddress()).isNull();
    }

    @Test
    void task6Test() {
        System.out.println("\ttask6:");
        var tax = context.getBean("taxTask6", Tax.class);
        System.out.println(tax);
        assertThat(tax.getIncome()).isNotNull();
        assertThat(tax.getPension()).isNotNull();
        assertThat(tax.getTotal()).isEqualTo(tax.getIncome() + tax.getPension());
        assertThat(tax.getIsNormal()).isEqualTo(tax.getTotal() < 250);
    }

}
