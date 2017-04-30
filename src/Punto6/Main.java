package Punto6;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Persona> persona = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Veterinaria> veterinaria = new ArrayList<>();

        java.util.Scanner teclado
                = new java.util.Scanner(System.in);

        System.out.println("Registro Veterinaria: ");

        boolean newv = true;
        do {
            System.out.println("Datos de la veterinaria: ");
            System.out.println("Nombre: ");
            String nombreVet = teclado.next();
            Veterinaria vet = new Veterinaria(nombreVet);

            boolean newp = true;
            do {
                System.out.println("Datos del cliente: ");
                System.out.println("Nombre: ");
                String nombre = teclado.next();
                System.out.println("Identidad: ");
                String id = teclado.next();
                Persona cliente = new Persona(nombre, id);

                boolean newm = true;
                ArrayList<Mascota> mascotaV = new ArrayList<>();
                do {
                    System.out.println("Datos de la mascota: ");
                    System.out.println("Nombre: ");
                    String nombreMascota = teclado.next();
                    System.out.println("Identificación: ");
                    String idMascota = teclado.next();
                    System.out.println("Color de pelaje: ");
                    String colorPelaje = teclado.next();
                    System.out.println("Tipo de mascota: ");
                    String tipoMascota = teclado.next();
                    switch (tipoMascota) {
                        case "Gato":
                            boolean is = true;
                            System.out.println("Es cazador ");
                            System.out.println("1. Si ");
                            System.out.println("2. No ");
                            int isC = teclado.nextInt();
                            if (isC == 2) {
                                is = false;
                            }
                            Gato gato = new Gato(is, idMascota, nombreMascota, colorPelaje);
                            mascotaV.add(gato);
                            break;
                        case "Perro":
                            System.out.println("Raza:");
                            String raza = teclado.next();
                            Perro perro = new Perro(raza, idMascota, nombreMascota, colorPelaje);
                            mascotaV.add(perro);
                            break;
                        case "Hamster":
                            System.out.println("Peso:");
                            double peso = teclado.nextDouble();
                            Hamster hamster = new Hamster(peso, idMascota, nombreMascota, colorPelaje);
                            mascotaV.add(hamster);
                            break;
                        default:
                            System.out.println("El tipo de mascota ingresado no existe ");
                            break;
                    }
                    cliente.setMascota(mascotaV);
                    System.out.println("Deseea registrar una nueva mascota de " + cliente + " : ");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    int m = teclado.nextInt();
                    if (m == 2) {
                        newm = false;
                    }
                } while (newm);
                vet.setMascota(mascotaV);
                persona.add(cliente);

                System.out.println("Deseea registrar un nuevo cliente: ");
                System.out.println("1. Si");
                System.out.println("2. No");
                int p = teclado.nextInt();
                if (p == 2) {
                    newp = false;
                }
            } while (newp);
            veterinaria.add(vet);
            System.out.println("Deseea registrar una nueva veterinaria: ");
            System.out.println("1. Si");
            System.out.println("2. No");
            int v = teclado.nextInt();
            if (v == 2) {
                newv = false;
            }
        } while (newv);

        System.out.println("Informacion: ");
        System.out.println("1. Informacion de una veterinaria ");
        System.out.println("2. Mostrar todas las mascotas registradas ");
        System.out.println("3. Informacion de las mascotas de un cliente ");
        int buscarInf = teclado.nextInt();
        switch (buscarInf) {
            case 1:
                System.out.println("Nombre de la veterinaria solicitada: ");
                String infV = teclado.next();
                Veterinaria vet = null;

                for (Veterinaria v : veterinaria) {
                    if (v.getNombre().equals(infV)) {
                        vet = v;
                    }
                }
                if (vet != null) {
                    System.out.println("1. Eliminar mascota ");
                    System.out.println("2. Mostrar mascotas por tipo ");
                    System.out.println("3. Mostrar mascotas ");
                    int inf = teclado.nextInt();

                    switch (inf) {
                        case 1:
                            System.out.println("Mascota que deseea eliminar: ");
                            String eliminar = teclado.next();

                            Mascota mascotaBusqueda = vet.buscarMascota(eliminar);
                            if (mascotaBusqueda != null) {
                                vet.eliminarMascota(mascotaBusqueda);
                            } else {
                                System.out.println("Esta mascota no se encuentra registrada ");
                            }
                            break;
                        case 2:
                            System.out.println("Tipo de mascota: ");
                            String mostrarTipo = teclado.next();
                            vet.mostrarPorTipo(mostrarTipo);

                            break;
                        case 3:
                            leerMascotas(vet);
                            break;
                    }
                } else {
                    System.out.println("La veterinaria ingresada no existe ");
                }

            case 2:
                for (Veterinaria Veterinarias : veterinaria) {
                    Veterinarias.mostrarMascotasVet();
                }
                break;

            case 3:
                System.out.println("Nombre del cliente: ");
                String dueno = teclado.next();
                System.out.println("Nombre de la veterinaria: ");
                String buscarNombreV = teclado.next();
                Veterinaria duenoV = null;

                for (Veterinaria v : veterinaria) {
                    if (v.getNombre().equals(buscarNombreV)) {
                        duenoV = v;
                    }
                }
                if (duenoV != null) {
                    personaVet(duenoV, dueno);
                    break;

                } else {
                    System.out.println("La veterinaria ingresada no existe");
                }
        }
    }

    public static void leerMascotas(Veterinaria v) {
        System.out.println("Mascotas: ");
        v.mostrarMascotasVet();
    }

    public static void personaVet(Veterinaria v, String n) {
        for (Persona p : persona) {
            if (p.getNombre().equals(n)) {
                p.mostrarMascota();
            } else {
                System.out.println(n + "no tiene mascotas registradas en la veterinaria");
            }
        }
    }
}
