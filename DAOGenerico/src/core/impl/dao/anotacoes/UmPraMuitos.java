package core.impl.dao.anotacoes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import core.impl.dao.anotacoes.enumeracoes.CascadeType;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UmPraMuitos {
	
	CascadeType cascade();
	boolean removerOrfao() default false;
	String mappedBy() default "";
	

}
