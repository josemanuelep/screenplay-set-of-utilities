# Screenplay pattern 
## Set of utilities and helps

* Funtions
* Iteractios with the pure webDriver
* Examples and code snnipets to make easy the automation with webDriver
* gradle commands

As well, two files with the configuration of pipelines as .json 

## Usefull comands 

### To run a specific runner associated to a feature test

- `gradle clean test --tests runnerName aggregate --info`

### To create Scenario outline in cucumber
```
  @CreditoNuevoSalud
  Esquema del escenario: Crear una solicitud de crédito para Salud y que esta sea aprobada
    Cuando diligencia los datos necesarios de la solicitud de crédito para salud
      | tipoCredito   | puntoVenta   | subCategoria   | valorProducto   | valorCuota   | tipoDocumento   | cedula   | ocupacion   | ocupacionSoi   | profesion   | cambioProducto   | nuevaSubCategoria   | nuevoValorProducto   | promocion   |
      | <tipoCredito> | <puntoVenta> | <subCategoria> | <valorProducto> | <valorCuota> | <tipoDocumento> | <cedula> | <ocupacion> | <ocupacionSoi> | <profesion> | <cambioProducto> | <nuevaSubCategoria> | <nuevoValorProducto> | <promocion> |
    Entonces la solicitud debe ser desembolsada

    Ejemplos:
      | tipoCredito  | puntoVenta                       | subCategoria | valorProducto | valorCuota | tipoDocumento     | cedula   | ocupacion     | ocupacionSoi | profesion | cambioProducto | nuevaSubCategoria | nuevoValorProducto | promocion |

```

