package com.imagine.dragons.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: map 缓存实现
 * @Param:
 * @return:
 * @author: dkb
 * @time: 2020/1/9 13:55
 */
public class MapCache {
    private static final int DEFAULT_CACHES = 1024;

    private static final MapCache INS = new MapCache();

    /**
     * @description:单例模式 保存缓存
     * @Param: []
     * @return: com.imagine.dragons.util.MapCache
     * @author: dkb
     * @time: 2020/1/9 13:56
     */
    public static MapCache single() {
        return INS;
    }

    private Map<String, CacheObject> cachePool;

    public MapCache() {
        this(DEFAULT_CACHES);
    }

    //初始化缓存容器 并设置最大缓存数量
    public MapCache(int cacheCount) {
        cachePool = new ConcurrentHashMap<>(cacheCount);
    }

    /**
     * @description:新建缓存对象
     * @Param: []
     * @return: com.imagine.dragons.util.MapCache
     * @author: dkb
     * @time: 2020/1/9 14:00
     */
    /**
     * @param key
     * @param value
     * @param expired
     * @description: 设置一个缓存并带过期时间
     * @return: void
     * @author: dkb
     * @time: 2020/1/9 14:21
     */
    public void set(String key, Object value, long expired) {
        expired = expired > 0 ? System.currentTimeMillis() / 1000 + expired : expired;
        CacheObject cacheObject = new CacheObject(key, value, expired);
        cachePool.put(key, cacheObject);
    }

    /**
     * @param key
     * @param field
     * @param value
     * @description: 设置一个缓存不带过期时间
     * @return: void
     * @author: dkb
     * @time: 2020/1/9 14:31
     */
    public void hset(String key, String field, Object value) {
        this.hset(key, field, value, -1);
    }

    /**
     * @param key     缓存 key
     * @param field   缓存field
     * @param value   缓存value
     * @param expired 过期时间 单位秒
     * @description: 设置一个哈希缓存并带过期时间
     * @return: void
     * @author: dkb
     * @time: 2020/1/9 14:29
     */
    public void hset(String key, String field, Object value, long expired) {
        key = key + ":" + field;
        expired = expired > 0 ? System.currentTimeMillis() / 1000 + expired : expired;
        CacheObject cacheObject = new CacheObject(key, value, expired);
        cachePool.put(key, cacheObject);
    }
    public <T> T hget(String key,String field){
        key=key+":"+field;
        return this.get(key);
    }
    /**
     * @description:
     * 读取一个缓存
     * @param key
     * @return: T
     * @author: dkb
     * @time: 2020/1/9 14:49
     */
    public <T> T get(String key){
        CacheObject cacheObject=cachePool.get(key);
        if(null!=cacheObject){
            long cur=System.currentTimeMillis()/1000;
            if(cacheObject.getExpired()<0||cacheObject.getExpired()>cur){
                Object result=cacheObject.getValue();
                return (T)result;
            }
        }
        return null;
    }

    static class CacheObject {
        private String key;
        private Object value;
        private long expired;

        public CacheObject(String key, Object value, long expired) {
            this.key = key;
            this.value = value;
            this.expired = expired;
        }

        public String getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public long getExpired() {
            return expired;
        }
    }
}
