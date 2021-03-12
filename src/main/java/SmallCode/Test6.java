package SmallCode;

import java.util.ArrayList;

/**
 * 服务架构：springcloudalibaba(nacos+sentinel+seata)+springboot
 * 数据库： mysql
 * 缓存：redis
 * 文档数据库：elasticsearch mongodb
 * 框架：mybatis-plus
 * 服务器：docker   jekins
 * 对象存储：OSS
 * 网关：nginx   springcloud-gateway
 * 消息队列：rabbitmq  kafka
 * 日志性能监控: elasticsearch+kafka+logstash+kibana+filebat   普罗米修斯  skewalking
 * 分库分表：sharding-sphere
 */
public class Test6 {
    public static void main(String[] args) {
        for (int t = 0;t<=20;t++){
            System.out.printf("t的%d,%d\n",t,f(t));
        }

    }
    public static long f(long i){
        if((i==0)||(i==1)){
            return i;
        }else{
            return f(i-1)+f(i-2);
        }
    }
}
