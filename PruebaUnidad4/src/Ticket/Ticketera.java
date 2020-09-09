package Ticket;




import java.time.LocalDate;

public class Ticketera {

    public static void main(String[] args) {
        System.out.println("Cargando clientes y vendedor");
        Evento evento = new Evento("Fiesta", 18);

        LocalDate fecha1 = LocalDate.of(1994, 01, 11);
        Cliente cliente = new Cliente("2324", "Fulano1", "Fulano1", fecha1);
        LocalDate fecha2 = LocalDate.of(1994, 01, 11);
        Cliente cliente1 = new Cliente("2526", "Fulano2", "Fulano2", fecha2);
        LocalDate fecha3 = LocalDate.of(1994, 01, 11);
        Cliente cliente2 = new Cliente("2728", "Fulano3", "Fulano3", fecha3);
        LocalDate fecha4 = LocalDate.of(1994, 01, 11);
        Cliente cliente3 = new Cliente("2930", "jesus", "seiler", fecha4);
        LocalDate fecha5 = LocalDate.of(1994, 01, 11);
        Vendedor vendedor = new Vendedor("3132", "Darlex", "Darlex", fecha5);

        evento = venderEntrada(1, cliente, vendedor, evento);
        vendedor.setEntradasNormalesVendidas(vendedor.getEntradasNormalesVendidas() + 1);
        evento = venderEntrada(2, cliente1, vendedor, evento);
        vendedor.setEntradasVipVendidas(vendedor.getEntradasVipVendidas() + 1);
        evento = venderEntrada(1, cliente2, vendedor, evento);
        vendedor.setEntradasNormalesVendidas(vendedor.getEntradasNormalesVendidas() + 1);
        evento = venderEntrada(1, cliente3, vendedor, evento);
        vendedor.setEntradasNormalesVendidas(vendedor.getEntradasNormalesVendidas() + 1);

        evento = usarEntrada(cliente, evento);
        evento.setEnCurso(true);

        evento = usarEntrada(cliente, evento);
        evento = usarEntrada(cliente1, evento);
        evento = usarEntrada(cliente2, evento);
        evento = usarEntrada(cliente, evento);

        evento.setEnCurso(false);
        evento = usarEntrada(cliente, evento);

        System.out.println("El vendedor " + vendedor.getNombre() + " " + vendedor.getApellido() + " ha vendido: ");
        System.out.println(vendedor.getEntradasNormalesVendidas() + " entrada/s normal/es");
        System.out.println(vendedor.getEntradasVipVendidas() + " entrada/s VIP");
    }

    private static Evento venderEntrada(int tipoEntrada, Cliente cliente, Vendedor vendedor, Evento evento) {
        System.out.println("Vendiendo entrada a cliente " + cliente.getNombre() + " " + cliente.getApellido() + " (" + cliente.getRut() + ")");
        Entrada entrada = new Entrada(15000, evento.getEntradas().size() + 1, false, cliente.getRut(), vendedor.getRut());
        EntradaVip entradaVip = new EntradaVip(20000, evento.getEntradas().size() + 1, false, cliente.getRut(), vendedor.getRut());
        if (evento.getEdadMinima() <= cliente.calcularEdad()) {
            if (tipoEntrada == 1) {
                evento.agregarEntrada(entrada);
            } else {
                evento.agregarEntrada(entradaVip);
            }
        } else {
            System.out.println("No se puede vender entrada al cliente, no cumple con la edad minima.");
        }
        return evento;
    }

    private static Evento usarEntrada(Cliente cliente, Evento evento) {
        System.out.println("Usando entrada con cliente " + cliente.getNombre() + " " + cliente.getApellido() + " (" + cliente.getRut() + ")");
        if (!evento.isEnCurso()) {
            System.out.println("El evento no esta en curso.");
        } else {
            boolean entradaExiste = false;
            for (int i = 0; i < evento.getEntradas().size(); i++) {
                Entrada entrada = evento.getEntradas().get(i);
                if (cliente.getRut().equals(entrada.getRutCliente())) {
                    entradaExiste = true;
                    if (entrada.isUtilizada()) {
                        System.out.println("Entrada ya fue usada, no puede pasar.");
                    } else {
                        evento.usarEntrada(i);
                        System.out.println("Entrada encontrada, " + cliente.getNombre() + " puede pasar.");
                    }
                }
            }
            if (!entradaExiste) {
                System.out.println("Entrada no existe.");
            }
        }

        return evento;
    }

}
