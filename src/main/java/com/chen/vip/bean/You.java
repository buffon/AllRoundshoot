package com.chen.vip.bean;

/**
 * User: harry.chen
 * Date: 13-12-19
 * Time: 下午4:32
 */
public class You {
    public enum Type {
        Man(1), Women(0);

        private int value;

        Type(int value) {
            this.value = value;
        }
    }
}
