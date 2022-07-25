public class Envio
{
    //Principio de Responsabilidad única
        String tipo;
        int precio;

        Envio(String tipo, int precio)
        {
            this.tipo = tipo;
            this.precio = precio;
        }

        String getTipoEnvio()
        {
            return this.tipo;
        }

        int getPrecioEnvio()
        {
            return this.precio;
        }
}

class GuardarEnvioDB
    {
        //Creamos una clase adicional para separar las responsabilidades de la clase
        void guardarEnvioDB (Envio Envio) {}
    }
