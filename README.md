Práctica en Java que implementa y compara dos versiones del algoritmo burbuja.

Alumno: Javier de Jesús

método con su descripcion:
`ordenamientoBurbuja(int[] arreglo)`(metodo tradicional: recorre el arreglo completo en cada pasada.) 
`ordenamientoBurbujaMejorado(int[] arreglo)`(metodo mejorada: usa una bandera y se detiene si una pasada no hizo intercambios)

Pruebas        estado inicial    resultado que se espera
1-Desordenado `{5, 3, 8, 1, 2}` `[1, 2, 3, 5, 8]` 
2-Ya ordenado `{1, 2, 3, 4, 5}` `[1, 2, 3, 4, 5]` 
3-Orden inverso `{5, 4, 3, 2, 1}` `[1, 2, 3, 4, 5]` 
4-Elementos repetidos  `{4, 2, 4, 1, 2}` `[1, 2, 2, 4, 4]`

