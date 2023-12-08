package anotacao;

import java.lang.annotation.*;

/**
 * @author pmpedrolima@gmail.com
 *
 */
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface TipoChave {

    String value();
}
