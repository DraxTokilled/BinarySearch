import java.io.*;
import java.util.*;

public class BusquedaBinariaFile {

    public static int busquedaBinaria(int arr[], int x) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] < x)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) throws Exception {

        // Leer archivo entrada.txt
        BufferedReader br = new BufferedReader(new FileReader("entrada.txt"));
        List<Integer> list = new ArrayList<>();

        String linea;
        while ((linea = br.readLine()) != null) {
            list.add(Integer.parseInt(linea.trim()));
        }
        br.close();

        // Convertir a arreglo
        int[] arr = list.stream().mapToInt(i -> i).toArray();

        // Ordenar arreglo
        Arrays.sort(arr);

        // Número a buscar
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número a buscar: ");
        int buscar = sc.nextInt();

        // Ejecutar búsqueda
        int pos = busquedaBinaria(arr, buscar);

        // Guardar salida
        PrintWriter pw = new PrintWriter("salida_busqueda.txt");
        pw.println("Arreglo ordenado: " + Arrays.toString(arr));
        pw.println("Buscando: " + buscar);
        pw.println("Resultado:");
        if (pos >= 0)
            pw.println("El número está en la posición: " + pos);
        else
            pw.println("Número NO encontrado.");

        pw.close();

        System.out.println("Búsqueda completada. Revisa 'salida_busqueda.txt'");
    }
}
