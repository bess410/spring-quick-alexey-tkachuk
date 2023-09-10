package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        var context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        var bean = context.getBean(Parrot.class);

        System.out.println(bean.getName());
    }
}
