package advancedlevel.UseCacheResultAnnotation;

import java.lang.annotation.*;
// Creating custom annotation @CacheResult
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CacheResult {
}


