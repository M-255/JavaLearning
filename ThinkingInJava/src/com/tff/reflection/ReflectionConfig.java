package com.tff.reflection;
/*
 * @author 马战川
 * @date 2018/12/25 11:21
 * @description 反射方法的其它使用之---通过反射运行配置文件内容
 */

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author 马战川
 * @version 1.0
 * @description 我们利用反射和配置文件，可以使：应用程序更新时，对源码无需进行任何修改
 *              我们只需要将新类发送给客户端，并修改配置文件即可
 *
 * @className ReflectionConfig
 * @date 2018/12/25 11:21
 */
@SuppressWarnings("unchecked")
public class ReflectionConfig {
    public static void main(String[] args) throws Exception {
        //通过反射获取Class对象
        Class stuClazz = Class.forName(getValue("className"));
        //2获取show()方法
        Method showMethod = stuClazz.getMethod(getValue("methodName"));
        //3.调用show()方法
        showMethod.invoke(stuClazz.getConstructor().newInstance());
    }

    //此方法接收一个key，在配置文件中获取相应的value
    private static String getValue(String key) throws IOException {
        Properties properties = new Properties();//获取配置文件的对象
        FileReader fr = new FileReader("./ThinkingInJava/src/com/tff/reflection/config.properties");//获取输入流
        properties.load(fr);//将流加载到配置文件对象中
        fr.close();
        return properties.getProperty(key);//返回根据key获取的value值
    }
}
