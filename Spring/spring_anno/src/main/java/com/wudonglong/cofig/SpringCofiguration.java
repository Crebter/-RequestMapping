package com.wudonglong.cofig;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

//标志该类是Spring的核心配置类
@Configuration
//配置组件扫描
@ComponentScan("com.wudonglong")
//总配置
@Import({DataSourceConfiguration.class})
    public class SpringCofiguration {



    }
