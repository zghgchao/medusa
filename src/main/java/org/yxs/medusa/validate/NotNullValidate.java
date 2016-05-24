package org.yxs.medusa.validate;

import org.yxs.medusa.annotation.NotNull;

/**
 * Created by 一线生 on 2016/5/22.
 *
 */
public class NotNullValidate extends AbstractValidate {

    public boolean validate(Object object) {
        return null != object;
    }

    public void init() {
        NotNull notNull = (NotNull) annotation;
        this.msg = notNull.value();
    }
}
