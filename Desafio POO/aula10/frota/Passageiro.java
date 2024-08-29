
package frota;

public class Passageiro extends Veiculo{
    private int numPortas;
    private int numPassageiro;
    private String opcionais;
    private String corExterna;
    private String corInterna;
    
   
    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public int getNumPassageiro() {
        return numPassageiro;
    }

    public void setNumPassageiro(int numPassageiro) {
        this.numPassageiro = numPassageiro;
    }

    public String getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(String opcionais) {
        this.opcionais = opcionais;
    }

    public String getCorExterna() {
        return corExterna;
    }

    public void setCorExterna(String corExterna) {
        this.corExterna = corExterna;
    }

    public String getCorInterna() {
        return corInterna;
    }

    public void setCorInterna(String corInterna) {
        this.corInterna = corInterna;
    }
    
}

