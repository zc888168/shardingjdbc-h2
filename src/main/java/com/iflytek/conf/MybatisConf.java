package com.iflytek.conf;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.transaction.TransactionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.transaction.SpringManagedTransactionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * mybatis的配置
 *
 * @author chaozhang17
 */
@Configuration
@EnableTransactionManagement
public class MybatisConf {

    @Autowired
    private XbDataSource xbDataSource;

    /**
     * 获取sqlFactory
     *
     * @return
     * @throws Exception
     */
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        DataSource dataSource = xbDataSource.getShardingDataSource();
        TransactionFactory transactionFactory = new SpringManagedTransactionFactory();
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
        sqlSessionFactoryBean.setTransactionFactory(transactionFactory);
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        sqlSessionFactoryBean.setConfiguration(configuration);
        configuration.setMapUnderscoreToCamelCase(true);
        return sqlSessionFactoryBean.getObject();

    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    @Bean
    public PlatformTransactionManager annotationDrivenTransactionManager() {

        return new DataSourceTransactionManager(xbDataSource.getShardingDataSource());
    }

}
