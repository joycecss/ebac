package org.example;

import java.lang.annotation.*;

/**
 *@author joyce.silva
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface Tabela {
    String value();
}
