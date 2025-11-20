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
        BufferedReader br = new BufferedReader(new FileReader("entrada.txt"));
        List<Integer> list = new ArrayList<>();

        String linea;
        while ((linea = br.readLine()) != null) {
            list.add(Integer.parseInt(linea));
        }
        br.close();

        int[] arr = list.stream().mapToInt(i -> i).toArray();

        Arrays.sort(arr);

        int buscar = 50; // <-- cambia este número

        int pos = busquedaBinaria(arr, buscar);

        PrintWriter pw = new PrintWriter("salida_busqueda.txt");
        pw.println("Posición: " + pos);
        pw.close();

        System.out.println("Búsqueda completada.");
    }
}

