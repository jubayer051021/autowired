package com.jubayerBjit.learningspringframework.Model.Config;

import com.jubayerBjit.learningspringframework.Model.Implementation.MobileProcessor;
import com.jubayerBjit.learningspringframework.Model.Implementation.Samsung;
import com.jubayerBjit.learningspringframework.Model.Implementation.SnapDragoan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public Samsung getPhone(){
        return new Samsung();
    }
    @Bean
    public MobileProcessor getProcessor(){
        return new SnapDragoan();
    }
}
