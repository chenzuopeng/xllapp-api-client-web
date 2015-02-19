package org.xllapp.api.support;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.ffcs.icity.api.support.BaseApplicationConfig;

/**
 * 此类用于存放应用配置,这些配置可以在运行时通过访问/config进行配置.
 * 
 * 注:支持运行时配置属性的类型：基础类型,String类型.
 * 
 * 例：
 * 
 * public class ApplicationConfig extends BaseApplicationConfig {
 * 
 * @FieldDescription("是否发送事件") private String isFireEvent;
 * 
 *                             public boolean isFireEvent() {{ return
 *                             this.isFireEvent; } }
 *
 * @author dylan.chen Aug 21, 2014
 * 
 */
@Component
@Lazy(false)
public class ApplicationConfig extends BaseApplicationConfig {

}
