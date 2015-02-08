package com.edera.samples.webapp1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * MVC Configuration.
 *
 * @author Rui Vilao (rui.vilao@ed-era.com)
 */
@Configuration
@ComponentScan("com.edera")
@EnableWebMvc
public class MvcConfig {
}
