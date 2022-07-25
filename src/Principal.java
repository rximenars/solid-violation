public class Principal
{
    //Principio Open/closed
    abstract class Envio
    {
        abstract int precio();
        abstract String tiempoDeEnvio();
    }

    //Cada envío extiende la clase abstracta Envio, implementando los métodos abstractos

    class Municipal extends Envio
    {
        @Override
        int precio()
        {
            return 5000;
        }
        String tiempoDeEnvio()
        {
            return "Tiempo envio 12 horas";
        }
    }

    class Intermunicipal extends Envio
    {
        @Override
        int precio()
        {
            return 15000;
        }
        String tiempoDeEnvio()
        {
            return "Tiempo envio 36 horas";
        }
    }

    class Internacional extends Envio
    {
        @Override
        int precio()
        {
            return 25000;
        }
        String tiempoDeEnvio() {
            return "Tiempo envio 90 horas";
        }
    }

    //Si añadimos un nuevo timpo de envío, no será necesario modificar tiempoDeEnvio()

    public void main(String[] args)
    {
        Envio[] arrayEnvio =
        {
                new Municipal(),
                new Intermunicipal(),
                new Internacional()
        };

        imprimirTiempoDeEnvio(arrayEnvio);
    }

    public static void imprimirTiempoDeEnvio(Envio[] arrayEnvio)
    {
        for (Envio Envio : arrayEnvio)
        {
            System.out.println(Envio.tiempoDeEnvio());
        }
    }


}