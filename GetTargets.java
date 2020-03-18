public class GetTargets {
    public static final Target INPUT_SEARCH = Target.the("").located(By.id("downshift-0-input"));


    public static Target getTargetByName(String name){
        return Target.the("").located(By.name(name));
    }
    public static Target getTargetByid(String id){
        return Target.the("").located(By.id("z"+id));
    }
}
