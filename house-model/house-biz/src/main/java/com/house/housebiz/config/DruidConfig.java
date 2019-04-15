package com.house.housebiz.config;

import com.alibaba.druid.filter.Filter;
import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.google.common.collect.Lists;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DruidConfig {
    @ConfigurationProperties(prefix="spring.druid")
    @Bean(initMethod = "init",destroyMethod = "close")
    public DruidDataSource dataSource(){
        DruidDataSource dataSource=new DruidDataSource();
        // 数据库连接池配置慢日志功能
        dataSource.setProxyFilters(Lists.newArrayList(statFilter()));
        return dataSource;
    }
    @Bean
    public Filter statFilter(){
        StatFilter filter=new StatFilter();
        //  超过五秒算慢查询
        filter.setSlowSqlMillis(1);
        //  是否打印慢日志sql
        filter.setLogSlowSql(true);
        //   是否合并慢日志sql
        filter.setMergeSql(true);
        return filter;
    }
    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
    }

}
