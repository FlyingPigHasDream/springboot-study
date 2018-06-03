package spring4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * 扫包隔离一个bean
 * @author rainyday
 * @createTime 2018/6/3.
 */
@ComponentScan(basePackages = "spring4",excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = DogConfig.class ))
@Configuration
public class AnnotationScan {
}
