package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;

/**
 * 账户的业务层实现类
 * 曾经xml的配置
 * <bean id="accountService" class="com.itheima.service.impl.AccountServiceImpl"
 *          scope="" init-method = "" destroy-method= "" >
 *      <property name="" value="" || ref=""></property>
 * </bean>
 *
 * 用于创建对象的注解
 *      他们的作用就和在xml配置文件中编写一个bean标签实现的功能是一样的
 *      @Component
 *           作用：用于吧当前类对象存入spring容器中
 *           属性：
 *              value：用于指定bean的id。当我们不写时，它的默认值是当前类名，且首字母改小写。
 *      @Controller：表现层
 *      @Service：业务层
 *      @Repository 持久层
 *      以上三个注解他们的作用和属性与component的一模一样。
 *      他们三个是spring框架为我们提供三层使用的注解。使我们的三层对象更加清晰
 * 用于注入数据的注解
 *      他们的作用就和在xml配置文件中写一个property标签实现的功能是一样的
 *      Autowired:
 *          作用：自动按照类型注入，只要容器中有唯一的一个bean对象类型和要注入的变量类型匹配，就可以注入成功
 *                如果ioc容器中没有任何bean的类型和要注入的变量类型匹配，则报错
 *                如果ioc容器中
 *          书写位置：
 *              可以是变量上面，也可以是方法上面
 *          细节：
 *              在使用注解开发时，set方法就不一定需要了
 *      Qualifier:
 *              作用：在按照类中注入的基础上再按名称注入。他在给类成员注入时不能单独使用。
 *              属性：
 *                  value：用于指定bean的id
 *      Resource:
 *              作用：直接按照bean的id注入。可以独立使用。
 *              属性：
 *                  name：用于指定bean的id
 *      以上三个注解都只能注入其他bean类型的数据，而基本类型和String类型无法使用上述注解类型使用。
 *      另外，集合类型的注入只能通过xml来实现。
 *
 *      @Value
 *              作用：用于注入基本类型和String类型的数据
 *              属性：
 *                  value：用于指定数据的值，他可以使用spring中的spel（spring的el表达式）
 *                          SpEL的写法：${表达式}
 * 用于改变作用范围的
 *      他们的作用就和在xml配置文件中使用scope属性实现的功能是一样的
 *      Scope
 *          作用：用指定bean的作用范围
 *          属性：
 *              value：指定范围的取值。常用值：singleton prototype
 * 和生命周期的  了解
 *      他们的作用就和在xml配置文件中使用init-method属性实现的功能是一样的
 *      ProDestroy
 *      PostConstruct
 */
@Service(value = "accountService")
public class AccountServiceImpl implements IAccountService {

//    @Autowired
//    @Qualifier("accountDao2")
    @Resource(name="accountDao2")
    private IAccountDao accountDao;


    public void saveAccount() {
        accountDao.saveAccount();
    }
}
