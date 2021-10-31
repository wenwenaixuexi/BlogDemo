package model;

import org.testng.annotations.AfterTest;

import static org.junit.Assert.*;

/**
 * @program: java16_blogdemo
 * @description
 * @author: wenwen
 * @create: 2021-09-30 16:20
 **/
public class ArticleDaoTest {

    @org.junit.Test
    public void add() {
    }

    @org.junit.Test
    public void selectAll() {
        ArticleDao articleDao = new ArticleDao();
        System.out.println(articleDao.selectAll());
    }

    @AfterTest
    public void selectById() {
    }

    @org.junit.Test
    public void delete() {
    }

    @org.junit.Test
    public void main() {
    }
}