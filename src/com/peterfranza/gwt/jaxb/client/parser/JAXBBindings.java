package com.peterfranza.gwt.jaxb.client.parser;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface JAXBBindings {
	Class<?> value();
	Class<?>[] objects() default {};	
}
