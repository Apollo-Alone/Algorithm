package com.ex.user.model.single;

/**
 * 静态内部类
 */
public class SingleObject {

    private static class SingletonHolder {
        private static final SingleObject INSTANCE = new SingleObject();
    }

    private SingleObject() {
    }

    public static final SingleObject getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
