package org.mahoo.framework;

import org.mahoo.framework.helper.BeanHelper;
import org.mahoo.framework.helper.ClassHelper;
import org.mahoo.framework.helper.ControllerHelper;
import org.mahoo.framework.helper.IocHelper;
import org.mahoo.framework.util.ClassUtil;

/**
 *
 */
public final class HelperLoader {
    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName());
        }
    }
}
