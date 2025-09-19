package Main;

import Adapter.*;
import Bridge.*;
import Composite.*;
import Decorator.*;
import Facade.*;
import Proxy.*;
import Flyweight.*;

import java.util.Random;


public class Main {
    public static void main(String[] args) {


        //Ejercicio 1 – Adapter
        System.out.println("\n------------------------------------------------------------------------------------------------");
        ClienteImpresora cliente = new ClienteImpresora();
        cliente.imprimir("documento.pdf");
        cliente.imprimir("texto.txt");
        cliente.imprimir("imagen.jpg");

        // Crear instancias con Sms
        Mensaje alertaSms = new Alerta(new Sms());
        Mensaje recordatorioSms = new Recordatorio(new Sms());
        Mensaje promocionSms = new Promocion(new Sms());

        // Crear instancias con Email
        Mensaje alertaEmail = new Alerta(new Email());
        Mensaje recordatorioEmail = new Recordatorio(new Email());
        Mensaje promocionEmail = new Promocion(new Email());

        // Enviar mensajes
        alertaSms.enviarMensaje();
        recordatorioSms.enviarMensaje();
        promocionSms.enviarMensaje();
        alertaEmail.enviarMensaje();
        recordatorioEmail.enviarMensaje();
        promocionEmail.enviarMensaje();
        System.out.println("------------------------------------------------------------------------------------------------\n");


        //Ejercicio 3 – Decorator
        System.out.println("\n------------------------------------------------------------------------------------------------");
        // Básico + Descarga Offline
        Plan basicoConDescarga = new PlanDescargaOffline(new PlanBasico());

        // Básico + HD
        Plan basicoHD = new PlanHD(new PlanBasico());

        // Básico + UltraHD
        Plan basicoUltraHD = new PlanUltraHD(new PlanBasico());

        // Básico + HD + Descarga
        Plan basicoHDConDescarga = new PlanDescargaOffline(new PlanHD(new PlanBasico()));

        // Básico + UltraHD + Descarga
        Plan basicoUltraHDConDescarga = new PlanDescargaOffline(new PlanUltraHD(new PlanBasico()));
        //Se imprimen los planes con una funcion declarada mas abajo
        System.out.println("--- Combinaciones decoradas desde PlanBasico ---");
        imprimir(basicoConDescarga);
        imprimir(basicoHD);
        imprimir(basicoUltraHD);
        imprimir(basicoHDConDescarga);
        imprimir(basicoUltraHDConDescarga);
        System.out.println("------------------------------------------------------------------------------------------------\n");



        //Ejercicio 4 – Facade
        System.out.println("\n------------------------------------------------------------------------------------------------");
        Articulo a1  = new Articulo("+Atun 100g", 1200.0f);
        Articulo a2  = new Articulo("+Fideos 250g",               950.0f);
        Articulo a3  = new Articulo("+Aceite de Girasol 500ml",  3500.0f);
        Articulo a4  = new Articulo("+Leche descremada 1L",                780.0f);
        Articulo a5  = new Articulo("+Dulce de leche LaSerenisima 300g",            850.0f);
        Articulo a6  = new Articulo("+Queso Mantecoso 300g",     2100.0f);
        Articulo a7  = new Articulo("+Coca-Cola 3L",           1300.0f);
        Articulo a8  = new Articulo("+Yerba Canarias 1kg",         4200.0f);
        Articulo a9  = new Articulo("+Azúcar 1kg",              900.0f);
        Articulo a10 = new Articulo("+Premezcla Brownie 200g",          870.0f);

        CompraFacade compra1 = new CompraFacade();
        compra1.comprar("Chacras de Coria", "MasterCard-Débito",a1,a2,a3,a4,a5,a6,a7,a8,a9,a10);
        System.out.println("------------------------------------------------------------------------------------------------\n");


        System.out.println("\n------------------------------------------------------------------------------------------------");
        //Ejercicio 5 – Flyweight
        FabricaDeArboles fabrica = new FabricaDeArboles();
        Random random = new Random();

        String[] tipos = {"Pino","Roble","Sauce"};
        String[] colores = {"Verde","Marrón"};
        String[] texturas = {"Suave","Áspera"};

        // Ejemplo manual
        Arbol pino = fabrica.obtenerArbol("Pino","Verde","Suave");
        pino.dibujar(10, 20);

        Arbol roble = fabrica.obtenerArbol("Roble","Marrón","Áspera");
        roble.dibujar(50, 100);

        // Simulación masiva
        int cantidad = 1_000_000;
        for (int i = 0; i < cantidad; i++) {
            String tipo = tipos[random.nextInt(tipos.length)];
            String color = colores[random.nextInt(colores.length)];
            String textura = texturas[random.nextInt(texturas.length)];

            Arbol arbol = fabrica.obtenerArbol(tipo,color,textura);
            // arbol.dibujar(random.nextInt(1000), random.nextInt(1000)); // opcional
        }
        System.out.println("Objetos únicos creados: " + fabrica.getCantidadArboles());
        System.out.println("------------------------------------------------------------------------------------------------\n");


        System.out.println("\n------------------------------------------------------------------------------------------------");
        //Ejercicio 6 – Proxy
        //Creo los proxys y intento leerlos con distintos usuarios
        ArchivoProxy file1Proxy = new ArchivoProxy("Mati","archivo.pdf");
        file1Proxy.leerArchivo();
        ArchivoProxy file1Proxy2 = new ArchivoProxy("Barchi","archivo2.pdf");
        file1Proxy2.leerArchivo();
        System.out.println("------------------------------------------------------------------------------------------------\n");

        System.out.println("\n------------------------------------------------------------------------------------------------");
        //Ejercicio 7 – Composite
        // Platos
        Plato hamburguesa = new Plato("Hamburguesa");
        Plato empanadas = new Plato("Empanadas");
        Plato mila = new Plato("Mila");
        Plato asado = new Plato("Asado");
        Plato pancho = new Plato("Pancho");

        // Promos
        Promo promocionSabado = new Promo("PromoSabado");
        promocionSabado.addPlato(asado);
        promocionSabado.addPlato(mila);
        promocionSabado.addPlato(empanadas);

        Promo promocionDomingo = new Promo("PromoDomingo");
        promocionDomingo.addPlato(asado);
        promocionDomingo.addPlato(hamburguesa);
        promocionDomingo.addPlato(mila);

        promocionDomingo.pedir(3);
        Promo promoFamiliar = new Promo("PromoFamiliar");
        promoFamiliar.addPlato(promocionSabado);
        promoFamiliar.addPlato(promocionDomingo);
        promoFamiliar.pedir(1);
        System.out.println("------------------------------------------------------------------------------------------------ \n");

    }
    private static void imprimir(Plan plan) {
        System.out.println(plan.nombrePlan() + " - $" + plan.precioPlan());
    }
}