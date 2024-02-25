package com.example.empl4sem2CRUD.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//аннотация для метода  с которыми будет работать аспект
@Retention(RetentionPolicy.RUNTIME) //А мета-аннотация @Retention(RetentionPolicy.RUNTIME) указывает, что аннотация должна быть доступна в рантайме.
@Target(ElementType.METHOD) // чтобы указать, что аннотация применяется только к классам, используется аннотация @Target(ElementType.TYPE)
public @interface TrackUserAction {
}
