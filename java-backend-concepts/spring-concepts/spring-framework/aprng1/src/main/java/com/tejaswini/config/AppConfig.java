package com.tejaswini.config;

import com.tejaswini.Alien;
import com.tejaswini.Computer;
import com.tejaswini.Desktop;
import com.tejaswini.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.tejaswini")
public class AppConfig {

//    @Bean(name = "comp1")
//    @Bean
//    @Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    public Alien alien(@Autowired Computer comp) {
//    public Alien alien(@Qualifier("desktop") Computer comp) {
//    public Alien alien(Computer comp) {
//        Alien obj = new Alien();
//        obj.setAge(25);
//        obj.setComp(comp);
//        return obj;
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }

}
