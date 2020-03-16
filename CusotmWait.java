import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.awaitility.Awaitility;

import java.util.concurrent.TimeUnit;

import static co.com.choucair.reto.util.TiempoUtilidad.succesfulCondition;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CusotmWait implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            Awaitility.await().forever().pollInterval(8000, TimeUnit.MILLISECONDS).until(succesfulCondition());
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static CusotmWait aMoment() {
        return instrumented(TiempoDeEspera.class);
    }
}
