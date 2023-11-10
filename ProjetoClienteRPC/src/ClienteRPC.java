import java.net.URL;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

public class ClienteRPC {

    private XmlRpcClient cliente;
	
    public ClienteRPC(String urlServidor) {
		try {
			//configura o cliente para que ele possa se conectar ao servidor
			XmlRpcClientConfigImpl configuracaoCliente = new XmlRpcClientConfigImpl();
            configuracaoCliente.setServerURL(new URL(urlServidor));
			//seta a configuração no cliente
            cliente = new XmlRpcClient();
            cliente.setConfig(configuracaoCliente);
        } catch (Exception exception) {
            System.err.println("JavaServer: " + exception);
        }
    }

    // Configurando os metodos para serem utilizados.
    // Iniciando com a área do quadrado, onde é passado 1 valor representando o lado.
    // No servidor é realizado o valor * valor
    //Como a chance do resultado final ser double é alto, é necessario tornar as variaveis em Double
    public double areaQuadrado(double x) throws Exception {
        Object[] parametros = new Object[]{Double.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.areaQuadrado", parametros);
        return resultado;
    }

    public double areaTrianguloRetangulo(double x, double y) throws Exception {
        Object[] parametros = new Object[]{Double.valueOf(x), Double.valueOf(y)};
        Double resultado = (Double) cliente.execute("Calc.areaTrianguloRetangulo", parametros);
        return resultado;
    }

    public double areaCircunferencia(double x) throws Exception {
        Object[] parametros = new Object[]{Double.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.areaCircunferencia", parametros);
        return resultado;
    }

    public double areaEsfera(double x) throws Exception {
        Object[] parametros = new Object[]{Double.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.areaEsfera", parametros);
        return resultado;
    }

    public double volumeEsfera(double x) throws Exception {
        Object[] parametros = new Object[]{Double.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.volumeEsfera", parametros);
        return resultado;
    }
    
    public double areaCilindro(double x, double y) throws Exception {
        Object[] parametros = new Object[]{Double.valueOf(x), Double.valueOf(y)};
        Double resultado = (Double) cliente.execute("Calc.areaCilindro", parametros);
        return resultado;
    }
    
    public double volumeCilindro(double x, double y) throws Exception {
        Object[] parametros = new Object[]{Double.valueOf(x), Double.valueOf(y)};
        Double resultado = (Double) cliente.execute("Calc.volumeCilindro", parametros);
        return resultado;
    }

    public double areaCubo(double x) throws Exception {
        Object[] parametros = new Object[]{Double.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.areaCubo", parametros);
        return resultado;
    }
    
    public double volumeCubo(double x) throws Exception {
        Object[] parametros = new Object[]{Double.valueOf(x)};
        Double resultado = (Double) cliente.execute("Calc.volumeCubo", parametros);
        return resultado;
    }
    
}







