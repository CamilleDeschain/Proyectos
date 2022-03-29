package beans;

import org.apache.logging.log4j.*;

public class HolaMundoAction {

    Logger log = LogManager.getLogger(HolaMundoAction.class);
    private String saludosAtr;

    public String execute(){
        log.info("ejecutando metodo execute desde strut2");
        this.saludosAtr="Saludo desde struts2";
        return "exito";
    }
    public String getSaludosAtr() {
        return saludosAtr;
    }

    public void setSaludosAtr(String saludosAtr) {
        this.saludosAtr = saludosAtr;
    }
    
}
