package iluminacion;

public class LuzInteligente {
    private String IdLuz;
    private int NivelBrillo;
    private boolean Encendido;

    public void setIdLuz(String Idluz) {
        if (Idluz != null && !Idluz.isBlank()) {
            this.IdLuz = Idluz;
        }
    }
    public void setNivelBrillo(int NivelBrillo){
       if (Encendido==true){
           if(NivelBrillo<=100 && NivelBrillo>=0){
               this.NivelBrillo=NivelBrillo;
           }
       }
    }


    public String getIdLuz(){
        return IdLuz;
    }
    public int getNivelBrillo(){
        return NivelBrillo;
    }
    public void Encender(){
        Encendido=true;
    }
    public void Apagar(){
        Encendido=false;
    }
    public void AjustarBrillo(int NuevoNivel){
        NivelBrillo=NuevoNivel;
    }

    public void MostrarEstado(){
        System.out.println("Id de la luz: "+getIdLuz());
        System.out.println("Nivel de brillo: "+getNivelBrillo());
    }
}
