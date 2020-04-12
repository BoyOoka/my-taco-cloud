package tacos;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tacos.data.create;
import tacos.data.JdbcIngredientRepository;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class MysqlTest {
	
	@Autowired
	private create cc;
	private JdbcIngredientRepository tt;
	
	@Before
    public void setUp() {
        
    }
	
	@Test
	public void test() {
		cc.create(253, 52353);
	}
	@Test
	public void testfindAll() {
		tt.findAll();
	}
	@Test
	public void testfindById() {
		tt.findById("1");
	}
	@Test
	public void testsave() {
//		tt.save(ingredient);
	}
	
}
