import co.com.choucair.certification.linkedin.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

import static co.com.choucair.certification.linkedin.util.Constants.INDEX_0;

public class GenericLogin implements Task {

    private List<User> users;
    private Target INPUT_USERNAME;
    private Target INPUT_PASSWORD;
    private Target BUTTON_LOGIN;

    public GenericLogin(List<User> users, Target INPUT_USERNAME, Target INPUT_PASSWORD, Target BUTTON_LOGIN) {
        this.users = users;
        this.INPUT_USERNAME = INPUT_USERNAME;
        this.INPUT_PASSWORD = INPUT_PASSWORD;
        this.BUTTON_LOGIN = BUTTON_LOGIN;
    }

    public static GenericLogin inThePage(List<User> users, Target INPUT_USERNAME, Target INPUT_PASSWORD, Target BUTTON_LOGIN) {
        return Tasks.instrumented(GenericLogin.class, users, INPUT_USERNAME, INPUT_PASSWORD, BUTTON_LOGIN);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue((users.get(INDEX_0).getUsername())).into(INPUT_USERNAME),
                Enter.theValue((users.get(INDEX_0).getPassword())).into(INPUT_PASSWORD),
                Click.on(BUTTON_LOGIN)
        );
    }
}
