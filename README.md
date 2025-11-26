# BusquedaBinariaFile.java

Este programa implementa la búsqueda binaria sobre un arreglo de números leído desde un archivo, ordena el arreglo y busca un número que el usuario introduce por teclado. La salida se guarda en un archivo de texto.

## ¿Cómo funciona?

1. **Lectura del archivo**  
   El programa lee un archivo llamado `entrada.txt` en el mismo directorio. Cada línea debe contener un número entero.

2. **Conversión y ordenamiento**
   - Se convierten las líneas del archivo en un arreglo de enteros.
   - Se ordena el arreglo utilizando `Arrays.sort()`.

3. **Entrada del usuario**
   - El usuario debe introducir por consola el número que desea buscar.

4. **Búsqueda binaria**
   - El método `busquedaBinaria` recibe el arreglo ordenado y el número a buscar.
   - Devuelve la posición del número en el arreglo si existe, o `-1` si no se encuentra.

5. **Salida**
   - Se genera un archivo `salida_busqueda.txt` con el arreglo ordenado, el número que se buscó y el resultado de la búsqueda (posición o mensaje de no encontrado).

6. **Mensaje final**
   - Se avisa al usuario por consola que la búsqueda fue completada y que revise el archivo de salida.

## Uso

1. Coloca tus números enteros, uno por línea, en un archivo llamado `entrada.txt`:
    ```
    8
    1
    7
    3
    5
    ```

2. Ejecuta el programa. Por ejemplo:
    ```
    java BusquedaBinariaFile
    ```
    Te pedirá que ingreses el número a buscar:
    ```
    Ingresa el número a buscar: 7
    ```

3. Revisa el archivo generado:  
   - `salida_busqueda.txt`

## Ejemplo de salida

Supón que `entrada.txt` contiene:
```
8
1
7
3
5
```

El usuario ingresa `3` como número a buscar.

`salida_busqueda.txt` contendrá:
```
Arreglo ordenado: [1, 3, 5, 7, 8]
Buscando: 3
Resultado:
El número está en la posición: 1
```

Si el número no se encuentra (por ejemplo, el usuario ingresa `9`):
```
Arreglo ordenado: [1, 3, 5, 7, 8]
Buscando: 9
Resultado:
Número NO encontrado.
```

## Notas

- Todos los archivos (`entrada.txt` y `salida_busqueda.txt`) se manejan en el mismo directorio donde está el programa.
- El programa asume que `entrada.txt` contiene solo números válidos.
- El índice de posición reportado empieza en 0 (estilo Java).

---
**Autor:** [DraxTokilled](https://github.com/DraxTokilled)





