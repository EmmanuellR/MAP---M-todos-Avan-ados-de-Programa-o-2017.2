package com.danielfireman.courses.map.abstractfactory;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;

/**
 * Good example of the abstract factory.
 * see: https://brizeno.wordpress.com/category/padroes-de-projeto/abstract-factory/
 */
class Good1 {
    interface FabricaDeCarro {
    CarroSedan criarCarroSedan();
    CarroPopular criarCarroPopular();
  }
  class FabricaFiat implements FabricaDeCarro {
    @Override
    public CarroSedan criarCarroSedan() {
        return new Siena();
    }
 
    @Override
    public CarroPopular criarCarroPopular() {
        return new Palio();
    }
  }
  
  class FabricaFord implements FabricaDeCarro {
	  
	    @Override
	    public CarroSedan criarCarroSedan() {
	        return new Fokus();
	    }
	 
	    @Override
	    public CarroPopular criarCarroPopular() {
	        return new Ka();
	    }
	  }
  
  interface CarroPopular {
    void exibirInfoPopular();
  }
  interface CarroSedan {
    void exibirInfoSedan();
  }
  
  class Palio implements CarroPopular {
 
    @Override
    public void exibirInfoPopular() {
        System.out.println("Modelo: Palio\nF�brica: Fiat\nCategoria:Popular");
    }
  }
  class Siena implements CarroSedan {
 
    @Override
    public void exibirInfoSedan() {
        System.out.println("Modelo: Siena\nF�brica: Fiat\nCategoria:Sedan");
    }
    
  }
  
  class Fokus implements CarroSedan {
 	 
      @Override
      public void exibirInfoSedan() {
          System.out.println("Modelo: Fokus\nF�brica: Ford\nCategoria:Sedan");
      } 
  }
  class Ka implements CarroPopular {
     	 
      @Override
      public void exibirInfoPopular() {
           System.out.println("Modelo: Ka\nF�brica: Ford\nCategoria:Popular");
          
      }   
  } 
      
  public static void main(String[] args) {
	Good1 g = new Good1();
	FabricaDeCarro fabrica = g.new FabricaFiat();
	CarroSedan sedan = fabrica.criarCarroSedan();
    CarroPopular popular = fabrica.criarCarroPopular();
    sedan.exibirInfoSedan();
    System.out.println();
    popular.exibirInfoPopular();
    System.out.println();
 
    fabrica = g.new FabricaFord();
    sedan = fabrica.criarCarroSedan();
    popular = fabrica.criarCarroPopular();
    sedan.exibirInfoSedan();
    System.out.println();
    popular.exibirInfoPopular();
  }
}
