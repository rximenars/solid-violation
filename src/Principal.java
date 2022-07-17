public class Principal {

  public static void main(String[] args) {
    Envio[] envios = {
        new Envio("Municipal",5000),
        new Envio("Intermunicipal",15000),
        new Envio("Internacional",25000)
    };
    imprimirTiempoDeEnvio(envios);
    imprimirTiempoDeEnvio(envios);
  }

  public static void imprimirTiempoDeEnvio(Envio[] envios){
    for (Envio coche : envios) {
      if(coche.tipo.equals("Municipal")) System.out.println("Tiempo envio 12 horas");
      if(coche.tipo.equals("Intermunicipal")) System.out.println("Tiempo envio 36 horas");
      if(coche.tipo.equals("Internacional")) System.out.println("Tiempo envio 90 horas");
    }
  }
}
