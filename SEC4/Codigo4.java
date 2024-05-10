/*
David Ortiz Campos
3 Las variables, constantes y mètodos tienen nombres claros y dan contexto
4 El programa cuenta con una secuencia lógica
4 Se refactorizó código
4  El programa aplica las mejores prácticas y estándares en su código
3 El programa se ejecuta correctamente
 */
package com.generation;

import java.util.Objects;
import java.util.Scanner;


public class Codigo4 {

        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
            String j1 = s.nextLine();

            System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
            String j2 = s.nextLine();
            s.close();
            if (Objects.equals(j1.toLowerCase(), j2.toLowerCase())) {
                System.out.println("Empate");
            } else {
                int g = 2;
            }
                if (j2.equals("piedra")j2.equals("papel")j2.equals("tijeras")) {
                    switch(j1.toLowerCase()) {
                        case "piedra":
                            if (j2.equals("tijeras")) {
                                g = 1;
                                System.out.println("Gana el jugador " + g);;
                            } else{
                                System.out.println("Gana el jugador " + g);
                            }
                            break;
                        case "papel":
                            if (j2.equals("piedra")) {
                                g = 1;
                                System.out.println("Gana el jugador " + g);
                            } else {
                                System.out.println("Gana el jugador " + g);
                            }
                            break;
                        case "tijeras":
                            if (j2.equals("papel")) {
                                g = 1;
                                System.out.println("Gana el jugador " + g);
                            } else {
                                System.out.println("Gana el jugador " + g);
                            }
                            break;
                            default:
                                System.out.println("Ingresa un valor valido");
                                break;
                        }
                    } else {
                        System.out.println("Ingresa un valor valido");
                    }
            }
        }