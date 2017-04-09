package pattern.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pattern.Application;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by cha45 on 2017-04-09.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class IteratorServiceTest {
    @Autowired
    private IteratorService iteratorService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void findAllBookName() throws Exception {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("1"));
        bookShelf.appendBook(new Book("2"));
        bookShelf.appendBook(new Book("3"));
        bookShelf.appendBook(new Book("4"));
        bookShelf.appendBook(new Book("5"));

        List<String> result = iteratorService.findAllBookName(bookShelf);

        assertThat(result.get(0), is("1"));
        assertThat(result.get(1), is("2"));
        assertThat(result.get(2), is("3"));
        assertThat(result.get(3), is("4"));
        assertThat(result.get(4), is("5"));
    }

}