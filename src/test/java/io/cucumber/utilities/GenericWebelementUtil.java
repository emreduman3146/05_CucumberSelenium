package io.cucumber.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Map;

public interface GenericWebelementUtil
{

/*
try {
            userHomePage.updateLocator("filtre","xpath","*[@class='fltr-item-text' and text()='Kadın']");
        } catch (Exception e) {
            e.printStackTrace();
        }

 */


    default void updateLocator(String elementAdi, String locatorTipi, String newXpath) throws Exception {
        Field field = this.getClass().getDeclaredField(elementAdi);
        FindBy findBy = field.getAnnotation(FindBy.class);

        // Get the current proxy handler
        InvocationHandler handler = Proxy.getInvocationHandler(findBy);

        // Create a new Annotation with updated values
        FindBy updatedFindBy = new FindBy() {
            @Override
            public Class<? extends Annotation> annotationType() {
                return findBy.annotationType();
            }

            @Override
            public String xpath() {
                return newXpath;
            }

            @Override
            public How how() {
                return null;
            }

            @Override
            public String using() {
                return null;
            }

            @Override
            public String id() {
                return null;
            }

            @Override
            public String name() {
                return null;
            }

            @Override
            public String className() {
                return null;
            }

            @Override
            public String css() {
                return null;
            }

            @Override
            public String tagName() {
                return null;
            }

            @Override
            public String linkText() {
                return null;
            }

            @Override
            public String partialLinkText() {
                return null;
            }


        };

        // Replace the values in the handler
        Field valueField = handler.getClass().getDeclaredField("memberValues");
        valueField.setAccessible(true);
        Map<String, Object> memberValues = (Map<String, Object>) valueField.get(handler);
        memberValues.put(locatorTipi, newXpath);

        // Create a new proxy instance with updated values
        FindBy proxy = (FindBy) Proxy.newProxyInstance(
                findBy.getClass().getClassLoader(),
                new Class[] { FindBy.class },
                handler
        );
        field.set(this, proxy);
    }

}
