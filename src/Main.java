import java.util.ArrayList;
public class Main {

        public static void main(String[] args) {

            try {
                ArrayList<secoPollo>plato1= new ArrayList<secoPollo>();
                ArrayList<fanesca>plato2 = new ArrayList<fanesca>();
                ArrayList<majadoVerde>plato3 = new ArrayList<majadoVerde>();


                plato1.add(new secoPollo("Seco de Pollo","Quito" , 1980, "Pollo"));
                plato2.add(new fanesca("Fanesca", "Quito", 2000, "Bacalao",5));
                plato3.add(new majadoVerde("Majado Verde", "Quito", 2001, "Verde",3,"Pinton"));


                System.out.println("\n\t ---DATOS SECO DE POLLO---");
                System.out.println("Nombre del Plato: "+ plato1.get(0).getNomplato());
                System.out.println("Ciudad Origen: "+ plato1.get(0).getCiuOrigen());
                System.out.println("Año origen: "+ plato1.get(0).getAnioOrigen());
                System.out.println("Ingrediente Principal: "+ plato1.get(0).getIngrePrin());



                System.out.println("\n\t ---DATOS FANESCA---");
                System.out.println("Nombre del Plato: "+ plato2.get(0).getNomplato());
                System.out.println("Ciudad Origen: "+ plato2.get(0).getCiuOrigen());
                System.out.println("Año origen: "+ plato2.get(0).getAnioOrigen());
                System.out.println("Ingrediente Principal: "+ plato2.get(0).getIngrePrin());
                System.out.println("Numero Ingredientes: "+ plato2.get(0).getNumIngre());

                System.out.println("\n\t ---DATOS MAJADO DE VERDE---");
                System.out.println("Nombre del Plato: "+ plato3.get(0).getNomplato());
                System.out.println("Ciudad Origen: "+ plato3.get(0).getCiuOrigen());
                System.out.println("Año origen: "+ plato3.get(0).getAnioOrigen());
                System.out.println("Ingrediente Principal: "+ plato3.get(0).getIngrePrin());
                System.out.println("Numero Ingredientes: "+ plato3.get(0).getNumIngre());
                System.out.println("Tipo de Verde: "+ plato3.get(0).getTipoVerde());


            }catch (Exception ex){
                System.out.println("\n\t\tSe ha producido un error \n");
            }
        }
}
