package com.warehouse.sellercube.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by chenjing on 2017/4/11.
 */
@Configuration
@MapperScan(basePackages = MySqlDataSource.PACKAGE, sqlSessionFactoryRef = "rdsSqlSessionFactory")
public class MySqlDataSource {
    static final String PACKAGE = "com.warehouse.sellercube.server.*.mysql.mapper";
    private final static String mapperLocations = "classpath*:com/warehouse/sellercube/server/*/map/mysql/*Mapper.xml";
    private final static String aliasesPackage = "com.warehouse.sellercube.server.*.mysql.entity";

    @Value("${mysql_url}")
    private String dbUrl;
    @Value("${mysql_username}")
    private String dbUser;
    @Value("${mysql_password}")
    private String dbPassword;

    @Bean(name = "mysqlDataSource")
    @Primary
    public DataSource rdsDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUser);
        dataSource.setPassword(dbPassword);
        return dataSource;
    }

    @Bean(name = "rdsTransactionManager")
    @Primary
    public DataSourceTransactionManager rdsTransactionManager() {
        return new DataSourceTransactionManager(rdsDataSource());
    }

    @Bean(name = "rdsSqlSessionFactory")
    @Primary
    public SqlSessionFactory rdsSqlSessionFactory(@Qualifier("mysqlDataSource") DataSource rdsDataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(rdsDataSource);
        sessionFactory.setTypeAliasesPackage(aliasesPackage);
        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        //设置xml扫描路径
        sessionFactory.setMapperLocations(resolver.getResources(mapperLocations));
        return sessionFactory.getObject();
    }
}
