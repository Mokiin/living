package com.hspedu.common.valid;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.constraints.NotNull;
import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({ METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE })
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {EnumConstraintValidator.class})
public @interface EnumValidate {

    String message() default "{com.hspedu.common.valid.EnumValidate.message}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

    //增加values属性
    int[] values() default {};

    //增加regexp
    String regexp() default "";
}
