package com.duwei.annotation;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import java.util.Set;

//@SupportedAnnotationTypes("注解的名字")
//@SupportedSourceVersion(SourceVersion.RELEASE_6)
public class Processor extends AbstractProcessor {


    //唯一需要复写的抽象方法
    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
        return false;
    }

    //使用上面的注解代替，推荐不用注解，因为混淆的问题
    @Override
    public Set<String> getSupportedAnnotationTypes() {
        return super.getSupportedAnnotationTypes();
    }

    //使用上面的注解代替，推荐不用注解，因为混淆的问题
    @Override
    public SourceVersion getSupportedSourceVersion() {
        return super.getSupportedSourceVersion();

    }


}
