package 자바의_정석.ch11;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx1 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        // prop 에 키와 값(key, value)을 저장한다.
        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        // prop 에 저장된 요소들을 Enumeration 을 이용해서 출력한다.
        Enumeration e = prop.propertyNames();

        while (e.hasMoreElements()){
            String element = (String) e.nextElement();
            System.out.println(element + " = " + prop.getProperty(element));
        }

        System.out.println();
        prop.setProperty("size", "20"); // size 의 값을 20으로 변경한다.
        System.out.println("size = " + prop.getProperty("size"));
        System.out.println("capacity = " + prop.getProperty("capacity", "20"));
        System.out.println("loadfactor = " + prop.getProperty("loadfactor", "0.75"));

        System.out.println(prop); // prop 에 저장된 요소들을 출력한다.
        prop.list(System.out); // prop 에 저장된 요소들을 화면에 출력한다.
    }
}
