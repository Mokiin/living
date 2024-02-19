package com.hspedu.common.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;
import java.util.Set;


public class EnumConstraintValidator implements ConstraintValidator<EnumValidate, Integer> {

    //定义一个set集合,用于收集EnumValidate传入的values
    private Set<Integer> set = new HashSet<>();
    //private String regexp = "";

    @Override
    public void initialize(EnumValidate constraintAnnotation) {
        //这里我们测试一下,看看是否能够得到注解传入的values
        //通过注解获取values ,我们讲解java基础的时候，反射讲过
        int[] values = constraintAnnotation.values();
        for (int value : values) {
            //System.out.println("EnumValidate注解指定values =" + value);
            set.add(value);
        }
        //regexp = constraintAnnotation.regexp();
    }

    //如果返回true表示验证成功-通过
    //返回false，表示验证失败-没有通过
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {
        //System.out.println("表单传入的value-" + value);
        return set.contains(value);

        //return value.toString().matches(regexp);
    }
}
