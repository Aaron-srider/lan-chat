package fit.wenchao.lanchat.utils;

import java.lang.reflect.Field;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static fit.wenchao.lanchat.utils.stringFormatter.StringFormatter.*;

public class ClassUtils {
    private static Logger log = LoggerFactory.getLogger(ClassUtils.class);

    public static <T> T getFieldValue(Object targetObj, String fieldName, Class<T> expectedFieldType) {
        Field targetField = null;
        Class<?> objClass = targetObj.getClass();
        try {
            targetField = objClass.getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        Class<?> fieldActualClass = targetField.getType();
        if (!expectedFieldType.isAssignableFrom(fieldActualClass)) {
            log.error("Class :{} can not be cast to :{}", fieldActualClass, expectedFieldType);
            throw new RuntimeException(ft("Class :{} can not be cast to :{}", fieldActualClass, expectedFieldType));
        }
        targetField.setAccessible(true);
        T o = null;
        try {
            o = (T) targetField.get(targetObj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return o;
    }
}
