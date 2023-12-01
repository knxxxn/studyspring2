package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import static org.springframework.context.annotation.ComponentScan.*;
@Configuration
@ComponentScan(
        basePackages = "hello.core", //이게 없다면 디폴트값은 해탕 패키지의 하위 라이브러리 모두에서 검색
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes =
                Configuration.class))

public class AutoAppConfig {
}
