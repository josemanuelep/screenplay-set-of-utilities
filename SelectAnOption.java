public class SelectAnOption implements Interaction {
    private Target lista;
    private String opcion;

    public SelectAnOption(Target lista, String opcion) {
        this.lista = lista;
        this.opcion = opcion;
    }

    public static GoOverAll list(Target lista, String opcion){
        return new GoOverAll(lista,opcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listObject = lista.resolveAllFor(actor);
  
        for (int i=0; i<listObject.size(); i++){
          
            if (listObject.get(i).getTextValue().trim().contains(opcion)){
                Scroll.to(listObject.get(i));
                listObject.get(i).click();
                break;
                
            }
        }
    }
}
