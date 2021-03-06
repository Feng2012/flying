package com.flying.framework.annotation;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({TYPE, METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Handler(handler="com.flying.framework.service.impl.DaoUpdateHandler")
public @interface DaoUpdate {
	Position position() default Position.after_body;
	String sql() default "";
	String entity() default "";
	enum Position{
		before_body, after_body, none_body
	}
}
