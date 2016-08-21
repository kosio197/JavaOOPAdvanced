package bg.softuni.card.custom_anotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CustomEnumAnnotation {
    String type();

    String category();

    String description();
}
