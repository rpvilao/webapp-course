package com.edera.samples.webapp2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Application base configuration.
 *
 * @author Rui Vilao (rui.vilao@ed-era.com)
 */
@Configuration
@Import({MvcConfig.class})
public class BaseConfig {
}
