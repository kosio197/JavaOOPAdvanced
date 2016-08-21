package bg.softuni.InfernoInfinity.custom_class_annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CustomClassAnnotation {

    String author();

    String Revision();

    String Description();

    String Reviewers();
}
