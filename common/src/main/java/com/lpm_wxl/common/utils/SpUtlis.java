package com.lpm_wxl.common.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.lpm_wxl.common.constant.Common_Constant;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import androidx.annotation.NonNull;

public class SpUtlis {
    
    private static SharedPreferences sp = ContextUtils.getAppContext().getSharedPreferences(Common_Constant.SP_NAME, Context.MODE_PRIVATE);
    

    /**
     * SP中写入String
     *
     * @param key 键
     * @param value 值
     */
    public static void put(@NonNull final String key, @NonNull final String value) {
        sp.edit().putString(key, value).apply();
    }

    /**
     * SP中读取String
     *
     * @param key 键
     * @return 存在返回对应值，不存在返回默认值{@code ""}
     */
    public static String getString(@NonNull final String key) {
        return getString(key, "");
    }

    /**
     * SP中读取String
     *
     * @param key 键
     * @param defaultValue 默认值
     * @return 存在返回对应值，不存在返回默认值{@code defaultValue}
     */
    public static String getString(@NonNull final String key, @NonNull final String defaultValue) {
        return sp.getString(key, defaultValue);
    }

    /**
     * SP中写入int
     *
     * @param key 键
     * @param value 值
     */
    public static void put(@NonNull final String key, final int value) {
        sp.edit().putInt(key, value).apply();
    }

    /**
     * SP中读取int
     *
     * @param key 键
     * @return 存在返回对应值，不存在返回默认值-1
     */
    public static int getInt(@NonNull final String key) {
        return getInt(key, -1);
    }

    /**
     * SP中读取int
     *
     * @param key 键
     * @param defaultValue 默认值
     * @return 存在返回对应值，不存在返回默认值{@code defaultValue}
     */
    public static int getInt(@NonNull final String key, final int defaultValue) {
        return sp.getInt(key, defaultValue);
    }

    /**
     * SP中写入long
     *
     * @param key 键
     * @param value 值
     */
    public static void put(@NonNull final String key, final long value) {
        sp.edit().putLong(key, value).apply();
    }

    /**
     * SP中读取long
     *
     * @param key 键
     * @return 存在返回对应值，不存在返回默认值-1
     */
    public static long getLong(@NonNull final String key) {
        return getLong(key, -1L);
    }

    /**
     * SP中读取long
     *
     * @param key 键
     * @param defaultValue 默认值
     * @return 存在返回对应值，不存在返回默认值{@code defaultValue}
     */
    public static long getLong(@NonNull final String key, final long defaultValue) {
        return sp.getLong(key, defaultValue);
    }

    /**
     * SP中写入float
     *
     * @param key 键
     * @param value 值
     */
    public static void put(@NonNull final String key, final float value) {
        sp.edit().putFloat(key, value).apply();
    }

    /**
     * SP中读取float
     *
     * @param key 键
     * @return 存在返回对应值，不存在返回默认值-1
     */
    public static float getFloat(@NonNull final String key) {
        return getFloat(key, -1f);
    }

    /**
     * SP中读取float
     *
     * @param key 键
     * @param defaultValue 默认值
     * @return 存在返回对应值，不存在返回默认值{@code defaultValue}
     */
    public static float getFloat(@NonNull final String key, final float defaultValue) {
        return sp.getFloat(key, defaultValue);
    }

    /**
     * SP中写入boolean
     *
     * @param key 键
     * @param value 值
     */
    public static void put(@NonNull final String key, final boolean value) {
        sp.edit().putBoolean(key, value).apply();
    }

    /**
     * SP中读取boolean
     *
     * @param key 键
     * @return 存在返回对应值，不存在返回默认值{@code false}
     */
    public static boolean getBoolean(@NonNull final String key) {
        return getBoolean(key, false);
    }

    /**
     * SP中读取boolean
     *
     * @param key 键
     * @param defaultValue 默认值
     * @return 存在返回对应值，不存在返回默认值{@code defaultValue}
     */
    public static boolean getBoolean(@NonNull final String key, final boolean defaultValue) {
        return sp.getBoolean(key, defaultValue);
    }

    /**
     * SP中写入String集合
     *
     * @param key 键
     * @param values 值
     */
    public static void put(@NonNull final String key, @NonNull final Set<String> values) {
        sp.edit().putStringSet(key, values).apply();
    }

    /**
     * SP中读取StringSet
     *
     * @param key 键
     * @return 存在返回对应值，不存在返回默认值{@code Collections.<String>emptySet()}
     */
    public static Set<String> getStringSet(@NonNull final String key) {
        return getStringSet(key, Collections.<String>emptySet());
    }

    /**
     * SP中读取StringSet
     *
     * @param key 键
     * @param defaultValue 默认值
     * @return 存在返回对应值，不存在返回默认值{@code defaultValue}
     */
    public static Set<String> getStringSet(@NonNull final String key, @NonNull final Set<String> defaultValue) {
        return sp.getStringSet(key, defaultValue);
    }






    /**
     * SP中清除所有数据
     */
    public static void clear() {
        sp.edit().clear().apply();
    }


}
