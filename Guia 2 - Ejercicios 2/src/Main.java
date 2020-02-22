import java.util.Scanner;
public class Main {
	static Scanner tec = new Scanner (System.in);
	public static void main(String[] args) {
		
		int opc;
		
		do {
			System.out.println("Bienvenido");
			System.out.println("En este programa se desarrollaran los ejercicios propuestos para la Guia n°2");
			System.out.println("1 - Conversión de medidas");
			System.out.println("2 - Área sombreada");
			System.out.println("3 - Tranporte");
			System.out.println("4 - Impuesto");
			System.out.println("5 - Restaurante");
			
			opc = tec.nextInt();
			
		}while (opc>5);
		
		switch(opc) {
		
		
		
		    case 1: 
		    			
		    			char P='P',C='C',L='L',Y='Y',medida;
		    			float valor,p,c,l,y;
		    			System.out.println("Ingrese la medida en la que se encuentra su valor");
		    			System.out.println("Ingrese P para pies");
		    			System.out.println("Ingrese C para centimentros");
		    			System.out.println("Ingrese L para leguas");
		    			System.out.println("Ingrese Y para yardas");
		    			System.out.println("La letra a ingresar debe ser en Mayúscula");
		    		    medida = tec.next().charAt(0);
		    		    
		    		    System.out.println("Ingrese el valor a convertir");
		    		    valor = tec.nextFloat();
		    	        
		    		    
		    		   if(medida==P) {
		    		        
		    			   p = valor*1/0.0833f;
		    			   System.out.println("Resultado de Pies a Pulgadas = "+ p +" In" );
		    			   
		    		    }else { if(medida==C) {
		    		    	
		    		    	c = valor * 1/2.54f;
		    		    	System.out.println("Resultado de Centimetros a Pulgadas = "+ c + " In");
		    		    
		    		    }else { if (medida==L) {
		    		    	
		    		    	l = valor *190080.02f/1;
		    		    	System.out.println("Resultado de Leguas a Pulgadas = "+ l + " In");
		    		    	
		    		    }else { if (medida==Y) {
		    		    	
		    		    	y = valor * 36/1;
		    		    	System.out.println("Resultado de yardas a Pulgadas = "+ y + " In");
		    		    	
		    		    }else {
		    		    	System.out.println("Ingrese una medida valida");
		    		    }
		    		    }
		    		    }
		    		    }
		    		    
		    		    break;
		    		    
		    		    
		    		    
		    		    
		    case 2:
		    			 
		    			float l2,r,as,areaci,diag,areacu;
		    				
		    		    System.out.println("Ingrese el valor del radio de la figura");
		    		    r = tec.nextFloat();
		    		        
		    		    diag=r*2;
		    		    l2=(float) Math.sqrt(Math.pow(diag,2)/2);
		    		        
		    		    areaci=(float) (Math.PI*(Math.pow(r,2)));
		    		    areacu=l2*l2;
		    		    as=areaci-areacu;
		    		        		
		    		    System.out.println("El lado del cuadrado es = "+l2);
		    		    System.out.println("El area sombreada es = "+as);
		    		        
		    		        break;
		    		        
		    		        
		    		        
		    		        
		    		        
		   case 3: 
		    			   

		    	       int n;
		    		   double p3,viajes,pasaje,pasajet,propietario,propietariot;
		    				
		    		   pasaje = 10000;
		    		   propietario = 2000;
		    				
		    		   System.out.println("ingrese la capacidad maxima de pasajeros");
		    		   n = tec.nextInt();
		    				
		    		   System.out.println("Ingrese número de personas a transportar");
		    		   p3 = tec.nextInt();
		    				
		    		   if(n>=p3) {
		    
		    			  viajes = 1;
		    			  
		    		   }else {
		    			   
		    			 //se aproxima el resultado al valor siguiente.
		    			  viajes =Math.ceil(p3/n);
		    					
		    				}
		    		         
		    			  pasajet=pasaje*p3;
		    		      propietariot= propietario * viajes;
		    				   
		    		  System.out.println("Total de viajes a realizar ="+viajes);
		    		  System.out.println("Total pago de pasajeros = "+ pasajet);
		    		  System.out.println("Total a pagar al propietario ="+ propietariot);
		    			  
		    		  break;
		    			   
		    			   
		    			   
		    			   
		    case 4:
		    			     
		    		 int v,pb,imp;	
		    				
		    		do {
		    			System.out.println(" Ingrese el tipo de Vehiculo");
		    			System.out.println("1 - Camioneta");
		    			System.out.println("2 - Automovil");
		    			v = tec.nextInt();
		    			}while (v>2);
		    				
		    			System.out.println("Ingrese precio bruto");
		    			pb = tec.nextInt();
		    				
		    		if(v==1){
		    					
		    		  if(pb<80) {
		    						
		    		     System.out.println("Valor de Impuesto = 0");
		    			 System.out.println("Precio neto = "+pb);
		    						
		    		  }else {
		    						
		    			 imp = pb/2;
		    			 System.out.println("Valor de Impuesto = "+imp);
		    			 System.out.println("Precio neto ="+(pb+imp));
		    					}		
		    					
		    		}else {
		    					
		    		if(pb < 20) {
		    					    
		    		   System.out.println("Valor de impuesto = 5");
		    		   System.out.println("Precio neto = "+(pb+5));
		    						
		    		 } 
		    		 if(pb>=20 && pb<40) {
		    						
		    		   imp = pb/5;
		    		   System.out.println("Valor impuesto = "+imp);
		    		   System.out.println("Precio neto = "+(pb+imp));
		    						
		    		 }else {
		    		 				
		    			System.out.println("Valor impuesto = 9");
		    		    System.out.println("Precio neto = "+(pb+9));
		    					 }  			  
		   		              }
		    			break;
		    				
		    				
		    				
		    				
		    case 5:
		    		        
		    		int opc5,tc,totalnov=0,totalv=0;
		    		float total=0;
		    		do {
		    		 do {
		    			System.out.println("Ingrese el numero correspondiente al tipo de comida a elegir");
		    			System.out.println("1 - Vegetariana");
		    			System.out.println("2 - No Vegetariana");
		    			System.out.println("3 - Rapida");
		    			opc5 = tec.nextInt();
		    			}while(opc5>3);
		    		 
		    	  switch (opc5) {
		    					
		    					
		    	 case 1 :
		    						
		    		do { 
		    		    System.out.println("Comida Vegetariana = ");
		    		    System.out.println("1 - Sopas vegetales = 10,000");
		    			System.out.println("2 - Ensalada = 25,000");
		    			System.out.println("3 - Jugo = 5,000");
		    			tc = tec.nextInt();
		    			}while(tc>3);
		    					
		    		if(tc==1) {
		    						  
		    			totalv=totalv +10000;
		    						  
		    		}else if(tc==2) {
		    						  
		    			totalv = totalv+25000;
		    						  
		    		 }else if(tc==3) {
		    						  
		    		    totalv = totalv + 5000;
		    		}
		    		break;
		    						
		    						
		    	case 2:
		    						 
		    		 do {
		    			System.out.println("Comida No Vegetariana = ");
		    			System.out.println("1 - Bandeja de Carne = 30,000");
		    			System.out.println("2 - Bandeja de Pollo = 28,000");
		    			tc = tec.nextInt();
		    			}while(tc>3);
		    						 
		    		if(tc==1){
		    							  
		    		  totalnov=totalnov +30000;
		    							  
		    	   }else if(tc==2) {
		    							  
		    		 totalnov = totalnov+28000;
		    							  
		    		}
		    		break;	 
		    						
		    							
		    	 case 3: 
		    						 
		    		 do {
		    		    System.out.println("Comida Rapida = ");
		    		    System.out.println("1 - Perro Caliente = 5000");
		    			System.out.println("2 - Hamburguesa = 7000");
		    			tc = tec.nextInt();
		    			}while(tc>3);
		    		if(tc==1) {
		    							  
		    			 totalnov=totalnov +5000;
		    							  
		    		}else if(tc==2) {
		    							  
		    			 totalnov = totalnov+7000;
		    							  
		    	   }
		    		break;	 
		    			
		    	   }
		    	        System.out.println("Desea agregar algo mas?");
		    			System.out.println("0 = Si");
		    		    System.out.println("1 = No");
		    		    opc5 = tec.nextInt();
		    				
		    	   }while(opc5==0);
		    		        		
		    	   //El descuento del 20% se hara cuando en la compra se halle un plato vegetariano.
		    	 //El descuento del 10% se hará cuando en la compra se no se encuentre un plato vegetariano.
		    				
		    		 if(totalv>0) {
		    					
		    			total=totalv+totalnov;
		    		    total=total+(total*0.19f);
		    		    total = total-(total*0.20f);
		    					
		    	  }else {
		    					
		    			total=totalnov;
		    			total=total+(total*0.19f);
		    		    total = total-(total*0.10f);
		    			}

		    	        System.out.println("Total a pagar = "+total);

		              break;
		}
	}
	}


	


