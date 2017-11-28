package com.example;



import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.autoconfig.domain.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class AutoconfigApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AutoconfigApplication.class, args);
	
//		int count = context.getBeanDefinitionCount();
//        System.out.println("Beans的个数：" + count);
//        String[] names = context.getBeanDefinitionNames();
//        for (String name : names) {
//               System.out.print(name);
//               System.out.print("->");
//               Object bean = context.getBean(name);
//               System.out.println(bean.getClass().getName());
//        }
        
      //  DataSource dataSourse = (DataSource) context.getBean("dataSource");
		
        Person person = new Person("AAA",20);
        System.out.println(person);
		ObjectMapper mapper = context.getBean(ObjectMapper.class);
	    System.out.println(mapper);
//	    
//	    Person  me = new Person();
//	      me.setAge(47);
//	      me.setName("邱张华");
//	      try {
//	             System.out.println(mapper.writeValueAsString(me));
//	      } catch (JsonProcessingException e) {
//	             // TODO Auto-generated catch block
//	             e.printStackTrace();
//	      }
//	      
//	      String json = "{\"name\":\"Daniel\",\"age\":22}";
//	      
//	      try {
//	             Person p2 = mapper.readValue(json, Person.class);
//	             System.out.println(p2);
//	      } catch (IOException e) {
//	             // TODO Auto-generated catch block
//	             e.printStackTrace();
//	      }
		
	}
}
