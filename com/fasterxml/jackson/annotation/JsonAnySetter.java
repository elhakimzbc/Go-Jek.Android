package com.fasterxml.jackson.annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@JacksonAnnotation
@Retention(RetentionPolicy.RUNTIME)
@Target({java.lang.annotation.ElementType.ANNOTATION_TYPE, java.lang.annotation.ElementType.METHOD})
public @interface JsonAnySetter {}


/* Location:              /Users/michael/Downloads/dex2jar-2.0/GO_JEK.jar!/com/fasterxml/jackson/annotation/JsonAnySetter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */