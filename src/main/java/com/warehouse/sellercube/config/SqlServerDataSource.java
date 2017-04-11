package com.warehouse.sellercube.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Created by Administrator on 2017/4/11.
 */
@Configuration
@MapperScan(basePackages = SqlServerDataSource.PACKAGE, sqlSessionFactoryRef = "adsSqlSessionFactory")
public class SqlServerDataSource {
    static final String PACKAGE = "com.warehouse.sellercube.server.*.sqlserver.mapper";
    private final static String mapperLocations = "classpath*:com/warehouse/sellercube/server/*/map/sqlserver/*Mapper.xml";
    private final static String aliasesPackage = "com.warehouse.sellercube.server.*.sqlserver.entity";

    @Value("${sqlserver_url}")
    private String dbUrl;
    @Value("${sqlserver_username}")
    private String dbUser;
    @Value("${sqlserver_password}")
    private String dbPassword;

    @Bean(name = "sqlserverDataSource")
    public DataSource rdsDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        dataSource.setUrl(dbUrl);
        dataSource.setUsername(dbUser);
        dataSource.setPassword(dbPassword);
        return dataSource;
    }

    @Bean(name = "adsTransactionManager")
    public DataSourceTransactionManager rdsTransactionManager() {
        return new DataSourceTransactionManager(rdsDataSource());
    }

    @Bean(name = "adsSqlSessionFactory")
    public SqlSessionFactory rdsSqlSessionFactory(@Qualifier("sqlserverDataSource") DataSource rdsDataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(rdsDataSource);
        sessionFactory.setTypeAliasesPackage(aliasesPackage);
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sessionFactory.setMapperLocations(resolver.getResources(mapperLocations));
        return sessionFactory.getObject();
    }
}
