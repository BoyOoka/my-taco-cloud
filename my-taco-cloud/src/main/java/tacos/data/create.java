package tacos.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class create{

    @Autowired
    private JdbcTemplate jdbcTemplate; 
    
    public void create(int name, int age) {
        jdbcTemplate.update("insert into Taco_Order_Tacos(tacoOrder,taco) values (?,?)",name,age);
    }

}